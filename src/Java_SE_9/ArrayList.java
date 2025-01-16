package src.Java_SE_9;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable fo this class
 * @code This class implements the methods associated with ArrayList for Java SE 9.
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
	/**
	 * @code Constructs an empty list with an initial capacity of ten.
	 */
	public ArrayList()
	{

	}

	/**
	 * @param initialCapacity the initial capacity to create this ArrayList with
	 * @throws IllegalArgumentException if the provided initial capacity is negative
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	public ArrayList(int initialCapacity)
	{

	}

	/**
	 * @param c Collection of values to initialize this ArrayList with
	 * @throws NullPointerException if the provided Collection is null
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public ArrayList(Collection<? extends E> c)
	{

	}

	/**
	 * @param e the value to be added to this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to add the specified value
	 * @param element the value ot be added to the specified index in this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to add to the end of this ArrayList
	 * @throws NullPointerException if the provided Collection variable is null or the provided Collection contains null values
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start adding the values from the provided Collection
	 * @param c Collection of values to add to this ArrayList, starting at the specified index
	 * @throws NullPointerException if no Collection variable is provided or the provided variable is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a shallow copy of this ArrayList instance
	 */
	@Override
	public Object clone()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the existence of
	 * @return true if this list contains the specified element, false if the provided Object is null or not found
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no Collection variable is provided
	 * @return true if this collection contains all of the elements in the specified collection
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to compare with this list for equality
	 * @throws NullPointerException if no Object is provided
	 * @return true if the provided Object is an exact match
	 * @code Compares the specified object with this collection for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the hash code value for this collection
	 */
	@Override
	public int hashCode()
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
	 * @return an iterator over the elements in this collection
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
