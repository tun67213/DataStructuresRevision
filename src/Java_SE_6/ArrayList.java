package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
	private int size;
	private int capacity;
	private E[] array;
	
	/**
	 * @code Constructs an empty list with an initial capacity of 10.
	 */
	public ArrayList()
	{

	}

	/**
	 * @param c Collection of values to initialize this ArrayList with
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public ArrayList(Collection<? extends E> c)
	{

	}

	/**
	 * @param initialCapacity the initial capacity to initialize this ArrayList with
	 * @throws IllegalArgumentException if the provided capacity is less than or equal to 0
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	public ArrayList(int initialCapacity)
	{

	}

	/**
	 * @code This method ensures that the array representing this ArrayList has enough space, and if necessary, allocates more storage for this ArrayList.
	 */
	private void ensureCapacity()
	{

	}

	/**
	 * @param e the value to be added to the end of this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has successfully been added (no return if method failed, because an exception will be thrown)
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to add a value
	 * @param element the value to be added to the specified index
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
	 * @throws NullPointerException if no Collection is provided, the provided Collection is defined as 'null' or the provided Collection contains null values
	 * @return true if this ArrayList has been modified, false otherwise (i.e. the provided Collection is empty)
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start adding values into this ArrayList
	 * @param c Collection of values to add into this ArrayList, starting at the specified index
	 * @throws NullPointerException if no Collection is provided, the provided Collection is defined as 'null' or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been modified, false otherwise (i.e. the provided Collection is empty)
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
	 * @param o the Object ot find the existence of in this ArrayList
	 * @return false if the provided Object is 'null' or not found, true if found
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no Collection is provided or the provided Collection variable is 'null'
	 * @return false if a value in the provided Collection is 'null' or not found in this ArrayList, true if empty or all values are found
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to compare with for equality
	 * @return false if the provided Object is null or not equal, true if exactly equal
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the provided index in this ArrayList
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the first occurrence of
	 * @return -1 if the provided value is null or not found, or the location of the first occurrence of the provided Object
	 * @code Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @return -1 if the provided value is null or not found, or the location of teh last occurrence of the provided Object
	 * @code Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to remove a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index in this ArrayList
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return false if the provided Object is null or not found, true if found and removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to remove if found in this ArrayList
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Removes all elements in this ArrayList that are contained in the provided Collection. The method returns true if at least one value has been modified, returning false if the provided Collection is empty.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the location at which to start removing values from
	 * @param toIndex the location from which to remove values until
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to keep if found in this ArrayList
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Removes any elements not contained in the provided Collection. Empties the ArrayList if the provided Collection is empty.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified element
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code  Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until which to create this subList
	 * @throws IndexOutOfBoundsException if either of these indices is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a the array of type T into which to copy values into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this array allocated into it
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a String representation of this ArrayList Object that is more readable to the user
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
