package src.Java_SE_10;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
	// The number of times this list has been structurally modified.
	protected int modCount;

	/**
	 * @code Sole constructor.
	 */
	protected AbstractList()
	{

	}

	/**
	 * @param index the location at which to add the provided value
	 * @param element the value to be added to the specified location
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{

	}

	/**
	 * @param e the value to append to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the value is successfully added, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to start adding values from this Collection
	 * @param c Collection of values to add to this List, starting from the specified index
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return false if the provided Collection is empty, otherwise true after adding all the elements from the provided Collection
	 * @code Inserts all of the elements in the specified collection into this list at the specified position
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param o the Object to compare with this AbstractList for equality
	 * @return true if the Object is an exact match, false if null or not exact
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public abstract E get(int index);

	/**
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the  first occurrence of the specified value, or -1 if the value is null or not found
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified value, or -1 if the value is null or not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location from which the list iterator must start
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported.");
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
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param fromIndex the location (inclusive of which) to from which to remove values from
	 * @param toIndex the location (exclusive of which) until which to remove until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param fromIndex the location from which to create the subList
	 * @param toIndex the location until which to create the subList
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported.");
	}
}
