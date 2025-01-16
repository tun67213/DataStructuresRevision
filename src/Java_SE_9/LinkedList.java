package src.Java_SE_9;

import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class implements the methods associated with LinkedList for Java SE 9.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code This added class will be used to create the Nodes that manage this LinkedList
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

	// The following are the local variables to be used ONLY in this class
	private int size;
	private Node<E> head;
	private Node<E> tail;

	/**
	 * @code Constructs an empty list.
	 */
	public LinkedList()
	{
		this.size = 0;
		head = null;
		tail = null;
	}

	/**
	 * @param c Collection of values to initialize this LinkedList with
	 * @throws NullPointerException if the provided Collection contains any null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to initialize this LinkedList with");
		}
		this.size = 0;
		this.head = null;
		this.tail = null;
		if(!c.isEmpty())
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
	}

	/**
	 * @param e the value to be added to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added to this LinkedList
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to the end of this LinkedList");
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
	 * @param index the location at which to add the specified element to this LinkedList
	 * @param element the value to be added to the specified index in this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a value to add to the specified index in this LinkedList");
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
		else
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
		this.size++;
	}

	/**
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or if the provided Collection contains null values
	 * @return true if all the values have been successfully added to the end of this LinkedList, false if the provided Collection is empty
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add into this LinkedList");
		}
		if(c.isEmpty())
		{
			return false;
		}
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
		return true;
	}

	/**
	 * @param index the location at which to start adding values from the provided Collection into this LinkedList
	 * @param c Collection of values to add to this LinkedList
	 * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or the provided Collection contains null values
	 * @return true if all the values have been successfully added to this LinkedList, starting from the specified index
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add into this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		Iterator<? extends E> iterator = c.iterator();
		if(head == null || index == this.size)
		{
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
		else
		{
			E[] values = (E[]) c.toArray();
			if(index == 0)
			{
				for(int i = values.length - 1; i >= 0; i--)
				{
					Node<E> newNode = new Node<>(values[i]);
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
					Node<E> newNode = new Node<>(iterator.next());
					newNode.next = current.next;
					newNode.previous = current;
					current.next.previous = newNode;
					current.next = newNode;
					this.size++;
				}
			}
		}
		return true;
	}

	/**
	 * @param e the value to add to the beginning of this LinkedList
	 * @throws NullPointerException if no value is provided
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
	 * @param e the value to add to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * d@code Appends the specified element to the end of this list.
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
	 * @code Removes all the elements from this list.
	 */
	@Override
	public void clear()
	{
		this.size = 0;
		head = null;
		tail = null;
	}

	/**
	 * @return a shallow copy of this LinkedList
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
	 * @param o the Object to find the existence of in this LinkedList
	 * @return true if this list contains the specified element, false if provided Object is null or not found
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
	 * @param c Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no Collection variable is provided
	 * @return false if the Collection contains null values or cannot find a value in this ArrayList
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to check for existence");
		}
		if(c.isEmpty())
		{
			return true;
		}
		if(c.contains(null))
		{
			return false;
		}
		for(Node<E> current = head; current != null; current = current.next)
		{
			if(!c.contains(current.data))
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
		return new Iterator<>()
		{
			private Node<E> current = tail;

			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				for(Node<E> update = current; update != null; update = update.previous)
				{
					action.accept(update.data);
				}
			}

			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			@Override
			public E next()
			{
				if(!hasNext())
				{
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				E value = current.data;
				current = current.previous;
				return value;
			}
		};
	}

	/**
	 * @return the head (first element) of this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 */
	@Override
	public E element()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		return head.data;
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specified index in this LinkedList
	 * @implNote This method uses a for-loop that ONLY iterates from the front of the LinkedList in order to avoid computational overhead.
	 */
	@Override
	public E get(int index)
	{
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		Node<E> current = head;
		for(int i = 0; i < index; i++)
		{
			current = current.next;
		}
		return current.data;
	}

	/**
	 * @return the first element in this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 */
	@Override
	public E getFirst()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		return head.data;
	}

	/**
	 * @return the last element in this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 */
	@Override
	public E getLast()
	{
		if(tail == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		return tail.data;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the provided Object or -1 if the provided Object is null or not found
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an iterator over the elements in this LinkedList in sequential order
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return true if this LinkedList contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @return the location of the last occurrence of the provided Object or -1 if the provided Object is null or not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a list iterator over the elements in this list (in sequential order)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start iterating from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in sequential order), starting at the specified index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if the provided value is 'null'
	 * @return true if the value is successfully added to this LinkedList
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if the provided value is 'null'
	 * @return true if the value is successfully added to this LinkedList
	 * @code Inserts the specified element at the front of this list.
	 */
	@Override
	public boolean offerFirst(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if the provided value is 'null'
	 * @return true if the value is successfully added to this LinkedList
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
	 * @return the first element of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E peekFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the last element of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E peekLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously at head or null if this LinkedList is empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E poll()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously at head or null if this LinkedList is empty
	 * @code Retrieves and removes the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously at tail or null if this LinkedList is empty
	 * @code Retrieves and removes the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously at head
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to be pushed onto the stack represented by this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously at head
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
	 * @return the value previously at the provided index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is 'null' or could not be found in this LinkedList, true if found and removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously at the top of this LinkedList
	 * @code Removes and returns the first element from this list.
	 */
	@Override
	public E removeFirst()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is null or could not be found in this List, true if found and removed
	 * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeFirstOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the value in the Node previously at the bottom of this LinkedList
	 * @code Removes and returns the last element from this list.
	 */
	@Override
	public E removeLast()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the last occurrence of
	 * @return false if the provided Object is null or could not be found in this List, true if found and removed
	 * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeLastOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value is provided
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
	@Override
	public Spliterator<E> spliterator()
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
	 * @param a an array of type T to copy values from this LinkedList into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array of type T with values from this ArrayList copied into it
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
