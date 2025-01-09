package src.Java_SE_8;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code Interface that implements an Abstract List
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
	/**
	 * Tracks the number of times this list has been 'structurally modified'.
	 */
	protected int modCount;

	/**
	 * @code Sole constructor.
	 */
	protected AbstractList()
	{

	}

	/**
	 * @param e the value to be added to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if this List has been modified
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to add the specified value
	 * @param element the value to add to the specified location
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if no index is provided
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start adding values from
	 * @param c Collection of values to add, starting from the specified index
	 * @throws NullPointerException if no Collection is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this List has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
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
	 * @param o the Object to compare with this List for equality
	 * @throws NullPointerException if no Object is provided
	 * @return true if the provided Object is equal to this, false otherwise
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to retrieve a value from
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @throws NullPointerException if no Object is provided
	 * @return the location of the first occurrence of the provided Object or -1 if not found
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @throws NullPointerException if no Object is provided
	 * @return the location of the last occurrence of the provided Object or -1 if not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start the list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in this list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
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
	 * @param fromIndex the location, inclusive of which, to remove from
	 * @param toIndex the location, exclusive of which, to remove until
	 * @throws IndexOutOfBoundsException if either is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for at the specified location
	 * @throws NullPointerException if no replacement value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified location
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the location (inclusive of which) to start creating the subList
	 * @param toIndex the location (exclusive of which) to create a subList until
	 * @throws IndexOutOfBoundsException if either is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
