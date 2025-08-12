package Java_SE_6;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with LinkedList for Java SE 6.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code Class creates way to manage this LinkedList.
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

	// The following private variables will manage this LinkedList class
	private int size;		// Used to track the number of elements in this LinkedList
	private Node<E> head;	// Used to track the beginning of this LinkedList
	private Node<E> tail;	// Used to track the end of this LinkedList

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
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null values to initialize this LinkedList with");
		}
		this.size = 0;
		head = null;
		tail = null;
		Node<E> newNode;
		if(!c.isEmpty())
		{
			Iterator<? extends E> iterator = c.iterator();
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
	}

	/**
	 * @param e the value to be added to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has been successfully added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to add the specified value into this list
	 * @param element the value to add to this list
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to add to the end of this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param e the value to add to the beginning of this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param e the value to add to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return a shallow copy of this LinkedList
	 */
	@Override
	public Object clone()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the existence of in this list
	 * @return true if this list contains the specified element, false if the provided element is null or not contained in this list
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if all the values in the provided collection are non-null and contained in this list, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to compare with this list for equality
	 * @return true if this list matches the provided Object, false otherwise
	 * @code Compares the specified object with this list for equality/
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return an iterator over the elements in this list in reverse sequential order
	 */
	@Override
	public Iterator<E> descendingIterator()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the head (first element) of this list
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E element()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the first element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	@Override
	public E getFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the last element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	@Override
	public E getLast()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return an iterator over the elements in this list
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return a list iterator over the elements in this list
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location from which to create this list iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list, starting at the specified index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param e the value to add to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param e the value to be added to the beginning of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the front of this list.
	 */
	@Override
	public boolean offerFirst(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param e the value to be added to the end of thi slist
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public boolean offerLast(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the head (first element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E peek()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the first element of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E peekFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the last element of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E peekLast()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the value previously the head (first element) of this list, or null if this list is empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E poll()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the value previously the head (first element) of this list, or null if this list is empty
	 * @code Retrieves and removes the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the value previously the tail (last element) of this list, or null if this list is empty
	 * @code Retrieves and removes the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollLast()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the value previously at the top of the stack
	 * @throws NoSuchElementException if this list is empty
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param e the value to be added to the top of the stack
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the value previously at the top of this stack
	 * @throws NoSuchElementException if this list is empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E remove()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
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
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the first element from this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Removes and returns the first element from this list.
	 */
	@Override
	public E removeFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find and remove
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeFirstOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the last element from this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Removes and returns the last element from this list.
	 */
	@Override
	public E removeLast()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find and remove
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeLastOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param fromIndex the location (inclusive of which) to remove values from
	 * @param toIndex the location (exclusive of which) to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to remove
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes values in this list that are contained in the specified collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to retain
	 * @throws NullPointerException if no collection is provided
	 * @return true if thi slist has been structurally modified, false otherwise
	 * @code Retains only values in this list that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified location
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until which to create this subList
	 * @throws IndexOutOfBoundsException if either or both indices is/are out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return an array containing all of the elements in this list
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param a an array of type T whose runtime must be mimicked for the returning array
	 * @throws NullPointerException if no array is provided or the variable provided is null
	 * @return an array containing all of the elements in this list in the correct order
	 * @code Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return a String representation of this ArrayList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
}
