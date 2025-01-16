package src.Java_SE_9;

/**
 * @param <E> Generic variable for this class
 * @code This class implements the methods involved with AbstractList for Java SE 9
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
	// This variable keeps track of the number of times this list has been structurally modified
	protected int modCount;

	/**
	 * @code Sole constructor.
	 */
	protected AbstractList()
	{

	}

	/**
	 * @param index the location at which to add the specified element
	 * @param element the value to be added to the specified index
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param e the value to be added to the end of this List
	 * @throws NullPointerException if no value is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to start adding values from this Collection
	 * @param c Collection of values to add to this List, starting at the specified index
	 * @throws NullPointerException if the provided Collection is null or contains any null values
	 * @return true if this List has been structurally modified, false if the provided Collection is empty
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @code Removes all the elements from this list.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param o the Object to compare with for equality
	 * @return false if the provided Object is null or doesn't match, true if it matches
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to retrieve values from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specified index
	 */
	@Override
	public abstract E get(int index);

	/**
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param o the Object to find the location of the first occurrence of
	 * @return the location of the first occurrence of the provided Object, or -1 if the provided Object is null or not found
	 * @code Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @return the location of the last occurrence of the provided Object or -1 if the provided Object is null or not found
	 * @code Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to start this list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location from which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param fromIndex the location from which to remove values
	 * @param toIndex the location until which to remove values
	 * @throws IndexOutOfBoundsException if either of the provided indices is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to substitute a value
	 * @param element the replacement value
	 * @throws NullPointerException if no element is provided or the provided element is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param fromIndex the location, inclusive of which, to create the subList from
	 * @param toIndex the location, exclusive of which, to create the subList until
	 * @throws IndexOutOfBoundsException if either of the provided indices is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater then toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported");
	}
}
