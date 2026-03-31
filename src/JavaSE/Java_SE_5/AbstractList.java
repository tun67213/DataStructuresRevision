package Java_SE_5;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This interface implements AbstractList for Java SE 5.
 * @implNote None of the methods here will be implemented. Implement at own will.
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
	protected int modCount;		// The number of times this list has been structurally modified.

	/**
	 * @code Sole constructor.
	 */
	protected AbstractList()
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param o the element to add to this list
	 * @return true if the value has been successfully added
	 * @code Appends the specified element to the end of this List (optional operation).
	 */
	@Override
	public boolean add(E o)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location at which to add a value
	 * @param element the value to add to the specified location
	 * @code Inserts the specified element at the specified position in this list (optional operation).
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add to this list
	 * @return true if the values have been added, false if the provided collection is empty
	 * @code Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @code Removes all of the elements from this collection (optional operation).
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param o the Object to compare this list with
	 * @return true if the specified Object is equal to this list, false otherwise
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location at which to retrieve a value from
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
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the provided Object or -1 if not found
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the provided Object or -1 if not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @return an iterator of the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location from which to create this iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator of the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location at which to remove a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this list
	 * @code Removes the element at the specified position in this list (optional operation).
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param fromIndex the location to start removing values from
	 * @param toIndex the location until which to remove values
	 * @code Removes the element at the specified position in this list (optional operation).
	 */
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location at which to set a value
	 * @param element the replacement value for the specified location
	 * @return the value previously at the specified location
	 * @code Replaces the element at the specified position in this list with the specified element (optional operation).
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param fromIndex the location from which to create this sub-view
	 * @param toIndex the location until which to create this sub-view
	 * @return a view of the portion of this list between fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}
}
