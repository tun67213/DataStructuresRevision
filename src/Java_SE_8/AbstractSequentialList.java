package src.Java_SE_8;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code Interface that implements an Abstract Sequential List
 */
public abstract class AbstractSequentialList<E> extends AbstractList<E>
{
	/**
	 * @code Sole constructor.
	 */
	protected AbstractSequentialList()
	{

	}

	/**
	 * @param index the location at which to add a value
	 * @param element the value to add to the specified index
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{

	}

	/**
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add, starting at the specified index
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this List has been modified, false otherwise
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start creating this list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public abstract ListIterator<E> listIterator(int index);

	/**
	 * @param index the location from which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
