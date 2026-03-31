package Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with Abstract List for Java SE 6.
 * @implNote None of the methods in this class will be implemented. Please feel free to implement them at your own interest if necessary.
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
	protected int modCount; // Counts the number of times this list has been structurally modified

	/**
	 * @code Sole constructor.
	 */
	protected AbstractList()
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param e the value to add to this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has successfully been added
	 * @code Appends the specified element to the end of this list (optional operation).
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param index the location at which to add a value
	 * @param element the value to add
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list (optional operation).
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @code Removes all of the elements from this list (optional operation).
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param o the Object to compare with this list for equality
	 * @return true if they are equal, false otherwise
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param index the location at which to retrieve a value from this list
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in thi slist
	 */
	@Override
	public abstract E get(int index);

	/**
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the specified Object cannot be found
	 * @code Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the specified Object cannot be found
	 * @code Returns the index of the last occurrence of the specified element int his list, or -1 if this list does not contain the element.
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param index the location from which to create this list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator of the elements in this list (in proper sequence), starting at the specified position in this list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param index the location from which to remove a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list (optional operation).
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param fromIndex the location, inclusive of which, to start removing values
	 * @param toIndex the location, exclusive of which, to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element (optional operation).
	 */
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}

	/**
	 * @param fromIndex the location, inclusive of which, to create this new list from
	 * @param toIndex the location, exclusive of which, to create this new list until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported. Feel free to implement at own interest.");
	}
}
