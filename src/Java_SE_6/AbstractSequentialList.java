package Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with Abstract Sequential List for Java SE 6.
 * @implNote None of the methods in this class will be implemented. Please feel free to implement them at your own interest if necessary.
 */
public abstract class AbstractSequentialList<E> extends AbstractList<E>
{
	/**
	 * @code Sole constructor.
	 */
	protected AbstractSequentialList()
	{
		throw new UnsupportedOperationException("This constructor will not be implemented. Implement at own interest.");
	}

	/**
	 * @param index the location at which to add a value
	 * @param element the value to add to the specified location
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Insert the specified element at the specified position in the list (optional operation).
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("This method will not be implemented. Implement at own interest.");
	}

	/**
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add into this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this list was structurally modified, false otherwise
	 * @code Insert all elements in the specified collection at the specified position in the list (optional operation).
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("This method will not be implemented. Implement at own interest.");
	}

	/**
	 * @param index the location from which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("This method will not be implemented. Implement at own interest.");
	}

	/**
	 * @return an iterator that repeats the elements in this list in appropriate order
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("This method will not be implemented. Implement at own interest.");
	}

	/**
	 * @param index the location from which to create this list-iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator that repeatedly processes the elements in this list in the appropriate order
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("This method will not be implemented. Implement at own interest.");
	}

	/**
	 * @param index the location at which to remove a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes an element at a specified position in the list (optional operation).
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("This method will not be implemented. Implement at own interest.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided location is out of bounds
	 * @return the value previously at the specified location
	 * @code Replace the element at the specified position in the list with the specified element (optional operation).
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("This method will not be implemented. Implement at own interest.");	
	}
}
