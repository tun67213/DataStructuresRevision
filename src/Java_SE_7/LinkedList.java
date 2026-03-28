package Java_SE_7;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with LinkedList for Java SE 7.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code The following internal class is a structure used to maintain this linked list
	 */
	private class Node<E>
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

	/**
	 * @code Constructs an empty list.
	 */
	public LinkedList()
	{

	}

	/**
	 * @param c Collection of values to initialize this linked list with
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{

	}

	/**
	 * @param e the value to be added to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has successfully been added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to add the specific value
	 * @param element the value to be added to this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param e the value to be added
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param e the value to be added
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a shallow copy of this LinkedList
	 */
	@Override
	public Object clone()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the value to find the existence of
	 * @return true if this list contains the value, false otherwise
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to find the existence of
	 * @throws NullPointerException if no collection is provided
	 * @return true if all the values in the collection are non-null and contained in this list, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	@Override
	public Iterator<E> descendingIterator()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the head (first element) of this list
	 * @throws NoSuchElementException if this list is empty
	 */
	@Override
	public E element()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to compare with this list
	 * @return true if the hash code for this list matches the hash code for the provided Object, false otherwise
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location from which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the first element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	@Override
	public E getFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the last element in this list
	 * @throws NoSuchElementException if this list is empty
	 */
	@Override
	public E getLast()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the index of the first occurrence of the provided Object or -1 if the Object is not contained in this list
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return an iterator over the elements in this list in sequential order
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the index of the last occurrence of the provided Object or -1 if the Object is not contained in this list
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a list-iterator over the elements in this list
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to create this list-iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param e the element to add to this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has successfully been added
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param e the element to add to the front of this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the front of this list.
	 */
	@Override
	public boolean offerFirst(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param e the element to add to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public boolean offerLast(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the head (first element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E peek()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the first element of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E peekFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the last element of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E peekLast()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the previous head for this list or null if the list is initially empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E poll()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the previous head for this list or null if the list is empty
	 * @code Retrieves and removes the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the previous tail for this list or null if this list is empty
	 * @code Retrieves and removes the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollLast()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the value previously at the top of the stack, or null if this list is empty
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param e the value to push onto the top of the stack represented by this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the value previously at the top of this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E remove()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to remove a value from this list
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the value previously the first element of this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Removes and returns the first element from this list.
	 */
	@Override
	public E removeFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeFirstOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the value previously the last element of this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Removes and returns the last element from this list.
	 */
	@Override
	public E removeLast()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeLastOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to remove if contained in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to keep if found in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified location in this list
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return an array containing all of the elements in this list
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param a an array of type T[] whose runtime we must mimic
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 * @throws NullPointerException if no array is provided
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a String representation of this LinkedList that is readable to the human eye
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
