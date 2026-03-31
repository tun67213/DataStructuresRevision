package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with Abstract List for Java SE 7.
 * @implNote None of the methods in this class will be implemented. Please feel free to implement them at your own interest if necessary.
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
	/**
	 * @code Counts the number of times this list has been "structurally" modified.
	 */
	protected int modCount;

	/**
	 * @code Sole constructor.
	 */
	protected AbstractList()
	{

	}

	/**
	 * @code Appends the specified element to the end of this list (optional operation).
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Inserts the specified element at the specified position in this list (optional operation).
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Removes all of the elements from this list (optional operation).
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns the element at the specified position in this list.
	 */
	@Override
	public abstract E get(int index);

	/**
	 * @code Returns the hash code value for this list.
	 */
	@Override
	public int hashCode()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns an iterator over the elements in this list in proper sequence.
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns a list iterator over the elements in this list (in proper sequence).
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Removes the element at the specified position in this list (optional operation).
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Replaces the element at the specified position in this list with the specified element (optional operation).
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}

	/**
	 * @code Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Will not be implemented. Implement at own discretion.");
	}
}
