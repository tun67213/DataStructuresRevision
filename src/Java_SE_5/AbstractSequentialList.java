package Java_SE_5;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This interface implements AbstractSequentialList for Java SE 5.
 * @implNote None of the methods here will be implemented. Implement at own will.
 */
public abstract class AbstractSequentialList<E> extends AbstractList<E>
{
	/**
	 * @code Sole constructor.
	 */
	protected AbstractSequentialList()
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
	 * @param index the location from which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @return an iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location at which to start creating this list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public abstract ListIterator<E> listIterator(int index);

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index before substitution
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported. Implement at own interest.");
	}
}
