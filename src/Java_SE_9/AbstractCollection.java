package src.Java_SE_9;

/**
 * @param <E> Generic variable for this class
 * @code This class implements the methods involved with AbstractCollection for Java SE 9
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
	 * @param e the value to be contained in this collection
	 * @return true if the value has been successfully added
	 * @code Ensures that this collection contains the specified element.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to add to the end of this Collection
	 * @return true if this Collection has been modified, false otherwise
	 * @code Adds all of the elements in the specified collection to this collection.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @code Removes all of the elements from this collection.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @return false if the provided Object is null or the provided Object is not found, true if the provided Object is found
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return true if the provided Collection is empty or all the values are contained in this Collection, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return true if this collection contains no elements
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an iterator over the elements contained in this Collection
	 */
	@Override
	public abstract Iterator<E> iterator();

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is null or not found, true if this Collection has been modified
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to remove if found in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return false if the provided Collection is empty, true if this Collection has been modified
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to keep if found in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this Collection has been modified, false otherwise
	 * @code Unlike removeAll(), if the provided Collection is empty, instead of returning false, the method will empty this Collection, and return true. Otherwise, it will search for all values contained in the provided Collection, and remove everything else.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
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
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a an array of type T into which to copy all the values of this Abstract Collection
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this Collection accommodated into it
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a String representation of this Collection that is more readable to the naked eye
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
