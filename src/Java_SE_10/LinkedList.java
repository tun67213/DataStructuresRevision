package src.Java_SE_10;

import java.util.NoSuchElementException;
import java.util.Spliterator;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
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
	 * @throws NullPointerException if the provided variable is null or the provided Collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to initialize this LinkedList with");
		}
		this.size = 0;
		head = null;
		tail = null;
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

	/**
	 * @param index the location at which to add the specified element
	 * @param element the value to be added to the specified location
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide an element to add to this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		Node<E> newNode = new Node<>(element);
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else if(index == 0)
		{
			head.previous = newNode;
			newNode.next = head;
			head = head.previous;
		}
		else if(index == this.size)
		{
			tail.next = newNode;
			newNode.previous = tail;
			tail = tail.next;
		}
		else if(index < this.size / 2)
		{
			Node<E> current = head;
			for(int i = 0; i < index - 1; i++)
			{
				current = current.next;
			}
			newNode.next = current.next;
			newNode.previous = current;
			current.next.previous = newNode;
			current.next = newNode;
		}
		else
		{
			Node<E> current = tail;
			for(int i = this.size - 1; i > index; i--)
			{
				current = current.previous;
			}
			newNode.next = current.next;
			newNode.previous = current;
			current.next.previous = newNode;
			current.next = newNode;
		}
		this.size++;
	}

	/**
	 * @param e the value to be added to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value provided was successfully added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to this LinkedList");
		}
		Node<E> newNode = new Node<>(e);
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
		return true;
	}

	/**
	 * @param index the location from which to start adding values into this Collection
	 * @param c Collection of values to add to this LinkedList, starting at the specified index
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to add to this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		Node<E> newNode = null;
		E[] values = (E[]) c.toArray();
		if(head == null || index == this.size)
		{
			while(iterator.hasNext())
			{
				newNode = new Node<>(iterator.next());
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
				newNode = new Node<>(values[i]);
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
			while(iterator.hasNext())
			{
				newNode = new Node<>(iterator.next());
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
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to add to this LinkedList");
		}
		Iterator<? extends E> iterator = c.iterator();
		Node<E> newNode = null;
		while(iterator.hasNext())
		{
			newNode = new Node<>(iterator.next());
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
		return true;
	}

	/**
	 * @param e the value to be added to the beginning of this LinkedList
	 * @throws NullPointerException if no value was provided or the provided value was 'null'
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to this LinkedList");
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
	 * @throws NullPointerException if no value was provided or the provided value was 'null'
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a shallow copy of this LinkedList
	 */
	@Override
	public Object clone()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the existence of in this LinkedList
	 * @return false if the provided Object is null or not found, true if found
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this LinkedList
	 * @throws NullPointerException if no Collection of values is provided
	 * @return false if any value in the Collection is null or not found, true if the provided Collection is empty or all values are found
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
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
	 * @return the head (first element) of this list
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E element()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location from which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
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
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the provided Object, or -1 if the Object is null or not found
	 */
	@Override
	public int indexOf(Object o)
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
	 * @return an iterator over the elements in this list (in sequential order)
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the provided Object, or -1 if the Object is null or not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a list-iterator of the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location from which to create the list iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list-iterator of the elements in this list (in proper sequence), starting from the provided index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to offer to this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has been successfully added
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to offer to this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if this value has been successfully added
	 * @code Inserts the specified element at the front of this list.
	 */
	@Override
	public boolean offerFirst(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to offer to this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if this value has been successfully added
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public boolean offerLast(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the head (first element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E peek()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the head (first element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list
	 */
	@Override
	public E peekFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the tail (last element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the tail (last element) of this list
	 */
	@Override
	public E peekLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the previous head (first element) of this list or null if this list is empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E poll()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the previous head (first element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the previous tail (last element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value previously at the top of the stack
	 * @throws NoSuchElementException if the stack represented by this LinkedList is empty
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be pushed onto the stack
	 * @throws NullPointerException if no value is provided
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously defined as head
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
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is 'null' or not found, true if found and removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value previously defined as head
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
	 * @return false if the provided Object is null or not found, true if found and removed
	 * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeFirstOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value previously defined as tail
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
	 * @return false if the provided Object is null or not found, true if found and removed
	 * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeLastOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a late-binding and fail-fast Spliterator over the elements in this list
	 */
	public Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an array over the elements in this list in proper sequence (from first to last element)
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a an array of type T[] to copy values from this LinkedList into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a String representation of this LinkedList that is readable to the user
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
