package src.Java_SE_8;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code Interface that implements an Abstract Collection
 */
public abstract class AbstractCollection<E> implements Collection<E>
{
	/**
	 * @param e the value to be added to the end of this Collection
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added to this Collection
	 * @code Ensures that this collection contains the specified element.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to add to the end of this Collection
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @return true if this Collection has been modified
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
	 * @throws NullPointerException if no Object is provided
	 * @return true if this Collection contains the specified Object, false otherwise
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no Collection variable is provided
	 * @return true if this Collection contains all the Objects in the specified Collection, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return true if this collection contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an iterator over the elements contained in this collection
	 */
	@Override
	public abstract Iterator<E> iterator();

	/**
	 * @param o the Object to find and remove the first occurrence of, if found
	 * @throws NullPointerException if no Object is provided
	 * @return true if this Collection has been modified in any way, false otherwise
	 * @code Removes a single instance of the specified element from this collection, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to remove if found in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this Collection has been modified, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
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
	 * @code Retains only the elements in this collection that are contained in the specified collection.
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
	 * @return an array containing all the elements in this collection
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a an array with elements of type T to copy values into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array of type T with values from this Collection
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a string representation of this collection
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
