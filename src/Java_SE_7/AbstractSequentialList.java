package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with Abstract Sequential List for Java SE 7.
 * @implNote None of the methods in this class will be implemented. Please feel free to implement them at your own interest if necessary.
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
	 * @code Inserts the specified element at the specified position in this list (optional operation).
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Will not be implemented.");
	}

	/**
	 * @code Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Will not be implemented.");
	}

	/**
	 * @code Returns the element at the specified position in this list.
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Will not be implemented.");
	}

	/**
	 * @code Returns an iterator over the elements in this list (in proper sequence).
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Will not be implemented.");
	}

	/**
	 * @code Returns a list iterator over the elements in this list (in proper sequence).
	 */
	@Override
	public abstract ListIterator<E> listIterator();

	/**
	 * @code Removes the element at the specified position in this list (optional operation).
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Will not be implemented.");
	}

	/**
	 * @code Replaces the element at the specified position in this list with the specified element (optional operation).
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Will not be implemented.");
	}
}
