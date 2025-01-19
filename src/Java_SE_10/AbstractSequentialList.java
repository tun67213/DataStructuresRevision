package src.Java_SE_10;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @implNote There are no implementations in this class. Those interested, feel free to take a leap at implementing this.
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
	 * @param element the value to be added to the specified element
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to start adding values into this List
	 * @param c Collection of values to add to this List
	 * @code Inserts all of the elements in the specified collection into this list at the specified position
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @return an iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to create the list from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public abstract ListIterator<E> listIterator(int index);

	/**
	 * @param index the location from which to remove a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value is specified
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported");
	}
}
