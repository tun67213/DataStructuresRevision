package Java_SE_5;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This interface implements LinkedList for Java SE 5.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Queue<E>, Cloneable, Serializable
{
	/**
	 * @code Constructs an empty list.
	 */
	public LinkedList()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to initialize this LinkedList with
	 * @throws NullPointerException if no collection is provided, the provided variable is defined as null, or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the element to add to the end of this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is 'null'
	 * @return true if the provided element has been successfully added into this LinkedList
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to add the specified value
	 * @param element the value to be added to the specified location in this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no collection is provided, the provided variable is defined as null, or the provided collection contains null values
	 * @return true if this LinkedList has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to start adding values into this LinkedList
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided, the provided collection variable is defined as null, or the provided collection contains null values
	 * @return true if all values from the provided collection are added to this list, false if the provided collection is empty
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the element to add to the beginning of this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @code Inserts the given element at the beginning of this list.
	 */
	public void addFirst(E o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the element to add to the end of this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @code Inserts the given element at the beginning of this list.
	 */
	public void addLast(E o)
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
	 * @param o the Object to find the existence of in this LinkedList
	 * @return true if the provided Object is non-null and found, false if null or not found in this LinkedList
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to find the existence of in this LinkedList
	 * @throws NullPointerException if no collection is provided, the provided variable is defined as null, or the provided collection contains null values
	 * @return true if all the values in the provided collection are contained in this LinkedList, false if the provided collection contains null values or values not contained in this LinkedList
	 * @code Returns true if this list contains all the elements in the specified element.
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the head (first element) of this LinkedList
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E element()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the first element of this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Returns the first element in this list.
	 */
	public E getFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the last element of this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Returns the last element in this list.
	 */
	public E getLast()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the first occurrence of the provided Object, or -1 if the provided Object is null or not found in this LinkedList
	 * @code Returns the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return an iterator over the elements in this LinkedLIst
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return true if the provided LinkedList is empty, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the last occurrence of the provided Object, or -1 if the provided Object is null or not found in this LinkedLIst
	 * @code Returns the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a list-iterator of the elements in this list
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location from which to create this LinkedList from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to add to the end of this LinkedList
	 * @throws NullPointerException if no Object is provided or the provided Object is null
	 * @return true if the provided Object is successfully added, false otherwise
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E o)
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
	 * @return the value previously the head (first element) of this list
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E poll()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the value previously the head (first element) of this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 */
	@Override
	public E remove()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to remove a value from this list
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this list
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to remove the first occurrence of
	 * @return true if the provided Object is non-null, contained in this LinkedLIst, and removed, false if null or not found in this LinkedList
	 * @code Removes the first occurrence of the specified element in this list.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the value previously the first element of this LinkedList
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Removes and returns the first element from this list.
	 */
	public E removeFirst()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the value previously the last element of this LinkedList
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Removes and returns the last element from this list.
	 */
	public E removeLast()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to remove if contained in this LinkedList
	 * @throws NullPointerException if no collection is provided
	 * @return true if this LinkedList has been structurally modified, false otherwise
	 * @code Removes from this LinkedList any value that is contained in the provided collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to retain if contained in this LinkedList
	 * @throws NullPointerException if no collection is provided
	 * @return true if this LinkedList has been structurally modified, false otherwise
	 * @code Retains in this LinkedList any value that is contained in the provided collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the provided index
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this LinkedList
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
	 * @return an array containing all of the elements in this list in correct order
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param a an array of type T into which to copy values from this LinkedList into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this list in the correct order
	 * @code Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array.
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a String representation of this LinkedList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
