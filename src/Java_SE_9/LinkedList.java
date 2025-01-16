package src.Java_SE_9;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class implements the methods associated with LinkedList for Java SE 9.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code Constructs an empty list.
	 */
	public LinkedList()
	{

	}

	/**
	 * @param c Collection of values to initialize this LinkedList with
	 * @throws NullPointerException if the provided Collection contains any null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{

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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to add to the beginning of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to add to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * d@code Appends the specified element to the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @code Removes all the elements from this list.
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
	 * @return true if this list contains the specified element, false if provided Object is null or not found
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no Collection variable is provided
	 * @return false if the Collection contains null values or cannot find a value in this ArrayList
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
	 * @return the value at the specified index in this LinkedList
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
	 * @return the location of the first occurrence of the provided Object or -1 if the provided Object is null or not found
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
