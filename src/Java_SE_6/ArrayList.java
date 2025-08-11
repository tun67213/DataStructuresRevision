package Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with ArrayList for Java SE 6.
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
	private int size;		// Used to track the number of elements currently in this ArrayList
	private int capacity; 	// Used to track the number of elements the current array can hold
	private E[] array;		// Used to keep track of the values currently in this ArrayList
	
	/**
	 * @code Constructs an empty list with an initial capacity of ten.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList()
	{
		this.size = 0;
		this.capacity = 10;
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @param c Collection of values to initialize this ArrayList with
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator. If the collection is empty, this constructor will call the basic constructor instead.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to initialize this ArrayList with");
		}
		this.size = 0;
		if(c.isEmpty())
		{
			this.capacity = 10;
		}
		else
		{
			this.capacity = c.size() + c.size() / 2;
		}
		this.array = (E[]) new Object[this.capacity];
		Iterator<? extends E> iterator = c.iterator();
		while(iterator.hasNext())
		{
			this.array[this.size] = iterator.next();
			this.size++;
		}
	}

	/**
	 * @param initialCapacity the capacity to create this ArrayList with
	 * @throws IllegalArgumentException if the provided index is less than 0
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity)
	{
		this.size = 0;
		this.capacity = initialCapacity;
		if(initialCapacity < 0)
		{
			throw new IllegalArgumentException("You MUST provide a non-negative initial capacity");
		}
		else if(initialCapacity <= 1)
		{
			System.out.println("Initial Capacity too small.... Setting capacity to 10...");
			this.capacity = 10;
		}
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @code This is a helper method that will ensure that this ArrayList has enough space so that the code does not break.
	 */
	@SuppressWarnings("unchecked")
	private void ensureCapacity()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param e the value to add to the end of this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has been successfully added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to add the specified value into this list
	 * @param element the value to add to this list
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to add to the end of this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return a shallow copy of this ArrayList instance
	 */
	@Override
	public Object clone()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the existence of
	 * @return true if the provided Object is non-null and contained in this ArrayList, false otherwise
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to find the existence of
	 * @throws NullPointerException if no collection is provided
	 * @return true if the provided collection is empty or all values in the provided collection are contained in this list, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to compare with this list for equality
	 * @return true if this list matches the provided Object, false otherwise
	 * @code Compares the specified object with this list for equality/
	 */
	@Override
	public boolean equals(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specific location in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return an iterator over the elements in this list
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return a list iterator over the elements in this list
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location from which to create this list iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list, starting at the specified index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param fromIndex the location (inclusive of which) to remove values from
	 * @param toIndex the location (exclusive of which) to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to remove
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes values in this list that are contained in the specified collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param c Collection of values to retain
	 * @throws NullPointerException if no collection is provided
	 * @return true if thi slist has been structurally modified, false otherwise
	 * @code Retains only values in this list that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified location
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until which to create this subList
	 * @throws IndexOutOfBoundsException if either or both indices is/are out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return an array containing all of the elements in this list
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param a an array of type T whose runtime must be mimicked for the returning array
	 * @throws NullPointerException if no array is provided or the variable provided is null
	 * @return an array containing all of the elements in this list in the correct order
	 * @code Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return a String representation of this ArrayList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
}
