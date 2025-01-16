package src.Java_SE_9;

/**
 * @param <E> Generic variable for this class
 * @code This class implements the methods involved with AbstractSequentialList for Java SE 9
 */
public abstract class AbstractSequentialList<E> extends AbstractList<E>
{
	/**
	 * @code Sole constructor
	 */
	protected AbstractSequentialList()
	{

	}

	/**
	 * @param index the location at which to add the value
	 * @param element the value to be added to the specified index
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to start adding the values in the provided Collection
	 * @param c Collection of values to add to this List, starting at the specified index
	 * @throws NullPointerException if the provided Collection variable is null or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this List has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return an iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index location from which to create this ListIterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list
	 */
	@Override
	public abstract ListIterator<E> listIterator(int index);

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Removes the element at the specified position in this list and returns it to the user.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported.");
	}
}
