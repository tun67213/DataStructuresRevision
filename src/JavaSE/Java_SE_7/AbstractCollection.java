package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with Abstract Collection for Java SE 7.
 * @implNote None of the methods in this class will be implemented. Feel free to implement it at your own interest.
 */
public abstract class AbstractCollection<E> implements Collection<E>
{
	/**
	 * @code Sole constructor.
	 */
	protected AbstractCollection()
	{

	}

	/**
	 * @code Ensures that this collection contains the specified element (optional operation).
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Adds all of the elements in the specified collection to this collection (optional operation).
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Removes all of the elements from this collection (optional operation).
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns true if this collection contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns true if this collection contains all of the elements in the specified collection.
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns true if this collection contains no elements.
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns an iterator over the elements contained in this collection.
	 */
	@Override
	public abstract Iterator<E> iterator();

	/**
	 * @code Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Removes all of this collection's elements that are also contained in the specified collection (optional operation).
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Retains only the elements in this collection that are contained in the specified collection (optional operation).
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns the number of elements in this collection.
	 */
	@Override
	public abstract int size();

	/**
	 * @code Returns an array containing all of the elements in this collection.
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns a string representation of this collection.
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}
}
