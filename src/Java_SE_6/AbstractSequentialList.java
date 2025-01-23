package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public abstract class AbstractSequentialList<E> extends AbstractList<E>
{
	/**
	 * @code Sole constructor.
	 */
	public AbstractSequentialList()
	{

	}

	/**
	 * @param index the location in this list to add a value
	 * @param element the value to be added
	 * @throws NullPointerException if no element is provided or the provided element is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to start adding values from the provided Collection
	 * @param c Collection of values to add starting at the specified index
	 * @throws NullPointerException if no Collection is provided, the provided Collection is 'null', or contains values that are 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this List has been modified, false otherwise
	 * @code  Inserts all of the elements in the specified collection into this list at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specified index
	 * @code Returns the element at the specified position in this list.
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
	 * @param index the location at which to create this List Iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public abstract ListIterator<E> listIterator(int index);

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index before removal
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param index the location at which to set a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported.");
	}
}
