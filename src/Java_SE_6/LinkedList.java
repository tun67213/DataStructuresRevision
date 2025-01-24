package src.Java_SE_6;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code This internal class will be used to create Nodes that will reference other Nodes recursively, to create a chained LinkedList
	 */
	private static class Node<E>
	{
		private Node<E> previous;
		private E data;
		private Node<E> next;

		public Node(E value)
		{
			this.previous = null;
			this.data = value;
			this.next = null;
		}
	}

	private int size;
	private Node<E> head;
	private Node<E> tail;

	/**
	 * @code Constructs an empty list.
	 */
	public LinkedList()
	{
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	/**
	 * @param c Collection of values to initialize this LinkedList with
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains values that are 'null'
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to initialize this LinkedList with");
		}
		this.size = 0;
		head = null;
		tail = null;
		if(!c.isEmpty())
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				Node<E> newNode = new Node<>(iterator.next());
				if(tail == null)
				{
					head = newNode;
					tail = newNode;
				}
				else
				{
					tail.next = newNode;
					newNode.previous = tail;
					tail = tail.next;
				}
				this.size++;
			}
		}
	}

	/**
	 * @param e the value to be added ot the end of this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has successfully been added to the end of this ArrayList
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
		}
		Node<E> newNode = new Node<>(e);
		if(tail == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.previous = tail;
			tail = tail.next;
		}
		this.size++;
		return true;
	}

	/**
	 * @param index the location at which to add a value
	 * @param element the value to be added to the specified index in this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a value to add to this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		Node<E> newNode = new Node<>(element);
		Node<E> current = head;
		for(int i = 0; i < index - 1; i++)
		{
			current = current.next;
		}
		newNode.next = current.next;
		newNode.previous = current;
		current.next.previous = newNode;
		current.next = newNode;
		this.size++;
	}

	/**
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no Collection is provided, the provided Collection is null, or the provided Collection contains null values
	 * @return true if the all the values in the provided Collection have been added (i.e. this LinkedList has been modified), false if the provided Collection is empty
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to add to this LinkedList");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		Node<E> newNode;
		while(iterator.hasNext())
		{
			newNode = new Node<>(iterator.next());
			if(tail == null)
			{
				head = newNode;
				tail = newNode;
			}
			else
			{
				tail.next = newNode;
				newNode.previous = tail;
				tail = tail.next;
			}
			this.size++;
		}
		return true;
	}

	/**
	 * @param index the location at which to start adding values from this Collection into this LinkedList
	 * @param c Collection of values to add to this LinkedList, starting at the provided index, in the order returned by this Collection's iterator
	 * @throws NullPointerException if no Collection variable is provided, the provided variable is defined as 'null' or the provided Collection contains null values
	 * @return true if this Collection has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null elements to add to this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		E[] values = (E[]) c.toArray();
		if(head == null || index == this.size)
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				Node<E> newNode = new Node<>(iterator.next());
				if(head == null)
				{
					head = newNode;
					tail = newNode;
				}
				else
				{
					tail.next = newNode;
					newNode.previous = tail;
					tail = tail.next;
				}
				this.size++;
			}
		}
		else if(index == 0)
		{
			for(int i = values.length - 1; i >= 0; i--)
			{
				Node<E> newNode = new Node<>(values[i]);
				head.previous = newNode;
				newNode.next = head;
				head = head.previous;
				this.size++;
			}
		}
		else
		{
			Node<E> current = head;
			for(int i = 0; i < index - 1; i++)
			{
				current = current.next;
			}
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				Node<E> newNode = new Node<>(iterator.next());
				newNode.next = current.next;
				newNode.previous = current;
				current.next.previous = newNode;
				current.next = newNode;
				current = current.next;
				this.size++;
			}
		}
		return true;
	}

	/**
	 * @param e the value to be added to the beginning of this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
		}
		Node<E> newNode = new Node<>(e);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			head.previous = newNode;
			newNode.next = head;
			head = head.previous;
		}
		this.size++;
	}

	/**
	 * @param e the value to be added to the end of this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
		}
		Node<E> newNode = new Node<>(e);
		if(tail == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.previous = tail;
			tail = tail.next;
		}
		this.size++;
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		this.size = 0;
		head = null;
		tail = null;
	}

	/**
	 * @return a shallow clone of this LinkedList
	 */
	@Override
	public Object clone()
	{
		LinkedList<E> list = new LinkedList<>();
		for(Node<E> current = head; current != null; current = current.next)
		{
			list.add(current.data);
		}
		return list;
	}

	/**
	 * @return the hash code value for this ArrayList
	 */
	@Override
	public int hashCode()
	{
		int hashCode = 1;
		for(Node<E> current = head; current != null; current = current.next)
		{
			hashCode = 31 * hashCode + current.data.hashCode();
		}
		return hashCode;
	}

	/**
	 * @param o the Object to find the existence of in this LinkedList
	 * @return false if the provided Object is null or not found, true if not null and found
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			return false;
		}
		Node<E> current = head;
		while(current != null && !(current.data.equals(o)))
		{
			current = current.next;
		}
		return current != null;
	}

	/**
	 * @param c Collection of values to find the existence of in this LinkedList
	 * @throws NullPointerException if no Collection is provided or the provided Collection variable is 'null'
	 * @return false if the Collection contains null values or has a value not contained in this LinkedList, true if the Collection is empty or all values are found in this LinkedList
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to find the existence of in this LinkedList");
		}
		if(c.isEmpty())
		{
			return true;
		}
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext())
		{
			Node<E> current = head;
			while(current != null && !(current.data.equals(iterator.next())))
			{
				current = current.next;
			}
			if(current == null)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	@Override
	public Iterator<E> descendingIterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node defined as head
	 * @throws NoSuchElementException if this LinkedList is empty
	 */
	@Override
	public E element()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specified index in this ArrayList
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the first element in this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 */
	@Override
	public E getFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the last element in this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 */
	@Override
	public E getLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the first occurrence of
	 * @return the location of the first occurrence of the provided Object, or -1 if the provided Object is 'null' or not found
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an iterator over the elements in this list (from first to last element)
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return true if this LinkedList is empty, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @return the location of the last occurrence of the provided Object, or -1 if the provided Object is 'null' or not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a list-iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start this list-iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list-iterator over the elements in this list (in proper sequence), starting at the specified position in this List
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added as the tail of this LinkedList
	 */
	@Override
	public boolean offer(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added as the head of this LinkedList
	 */
	@Override
	public boolean offerFirst(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added as the tail of this LinkedList
	 */
	@Override
	public boolean offerLast(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the head (first element) of this LinkedList or null if this LinkedList is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E peek()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the head (first element) of this LinkedList or null if this LinkedList is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E peekFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the tail (last element) of this LinkedList or null if this LinkedList is empty
	 * @code Retrieves, but does not remove, the tail (last element) of this list.
	 */
	@Override
	public E peekLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value previously at head (first element) of this list or null if this LinkedList is empty
	 */
	@Override
	public E poll()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value previously at head (first element) of this list or null if this LinkedList is empty
	 */
	@Override
	public E pollFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value previously at tail (first element) of this list or null if this LinkedList is empty
	 */
	@Override
	public E pollLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value previously at the head of the stack represented by this LinkedList
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be added to the top of the stack represented by this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is 'null'
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously defined as head before removal
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E remove()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specified index in this List
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided index is 'null' or not found, true if found and removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously defined as head
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Removes and returns the first element from this list.
	 */
	@Override
	public E removeFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is null or not found
	 * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeFirstOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously defined as tail
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Removes and returns the last element from this list.
	 */
	@Override
	public E removeLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the last occurrence of
	 * @return false if the provided Object is null or not found
	 * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeLastOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to remove if found in this LinkedList
	 * @throws NullPointerException if the provided Collection variable is null
	 * @return false if the provided Collection is empty, true if this LinkedList has been modified
	 * @code Removes any values in this LinkedList that are found in the provided Collection. Returns true if at least one value has been removed, false otherwise.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to keep if found in this LinkedList
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Removes any elements not contained in the provided Collection. Empties the LinkedList if the provided Collection is empty.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this LinkedList
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the number of elements in this ArrayList
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until which to create this subList
	 * @throws IndexOutOfBoundsException if either of these indices is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a an array of type T into which to copy values from this LinkedList into
	 * @throws NullPointerException if no array is provided or the provided array is initialized to 'null'
	 * @return the provided array of type T with values from this LinkedList copied into it
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a String representation of this LinkedList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
