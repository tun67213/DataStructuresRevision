package src.Java_SE_10;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
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
	 * @param e the value to be added to this Collection
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 * @code Ensures that this collection contains the specified element.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param c Collection of values to add to this Collection
	 * @throws NullPointerException if no Collection is provided, the provided Collection variable is null or contains null values
	 * @return true if this Collection has been modified
	 * @code Adds all of the elements in the specified collection to this collection.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @code Removes all of the elements from this collection
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @return false if the Object is 'null' or not found, true if found
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return false if a value in the Collection is null or not found, true if all are found
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return true if this collection contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return an iterator over the elements contained in this collection
	 */
	@Override
	public abstract Iterator<E> iterator();

	/**
	 * @param o the Object to remove the first occurrence of
	 * @return true if a non-null Object has been found and removed, false if an Object is 'null' or not found
	 * @code Removes a single instance of the specified element from this collection, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param c Collection of values to remove if found in this Collection
	 * @throws NullPointerException if no Object is provided
	 * @return true if at least one value has been removed from this Collection, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param c Collection of values to keep if found in this Collection
	 * @throws NullPointerException if no Object is provided
	 * @return true if at least one value has been removed from this Collection (i.e., this Collection has changed), false otherwise
	 * @code Retains only the elements in this collection that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return an array containing all of the elements in this collection
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @param a an array of type T into which to copy values into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this Collection copied into it
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return a String representation of this collection
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported.");
	}
}
