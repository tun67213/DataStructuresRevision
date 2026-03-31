package Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with Abstract Collection for Java SE 6.
 * @implNote None of the methods in this class will be implemented. Feel free to implement it at your own interest.
 */
public abstract class AbstractCollection<E> implements Collection<E>
{
	/**
	 * @code Sole constructor.
	 */
	protected AbstractCollection()
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @param e the value to be added
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value was successfully added
	 * @code Ensures that this collection contains the specified element (optional operation).
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @param c Collection of values to add to the end of this collection
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @return true if this collection has been structurally modified, false if this collection is empty
	 * @code Adds all of the elements in the specified collection to this collection (optional operation).
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @code Removes all of the elements from this collection (optional operation).
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @param o the Object to find the existence of in this collection
	 * @return true if the provided object is contained in this collection, false otherwise
	 * @code Returns true if this collection contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @param c Collection of values to find the existence of in this collection
	 * @throws NullPointerException if no collection is provided
	 * @return true if this collection contains all of the elements in the specified collection, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @return true if this collection contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @return an iterator over the elements contained in this collection
	 */
	@Override
	public abstract Iterator<E> iterator();

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return true if this collection has been structurally modified, false otherwise
	 * @code Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @param c Collection of values to remove if contained in this collection
	 * @throws NullPointerException if no collection is provided
	 * @return true if this collection has been modified, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection (optional operation).
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @param c Collection of values to retain if contained in this collection
	 * @throws NullPointerException if no collection is provided
	 * @return true if this collection has been modified, false otherwise
	 * @code Retains only the elements in this collection that are contained in the specified collection (optional operation).
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @return the number of elements in this collection
	 */
	@Override
	public abstract int size();

	/**
	 * @return an array containing all of the elements in this collection
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @param a an array of type T whose runtime the returning array must mimic
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this collection
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}

	/**
	 * @return a string representation of this collection
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented. Implement at own interest.");
	}
}
