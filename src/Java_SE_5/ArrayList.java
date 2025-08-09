package Java_SE_5;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This interface implements ArrayList for Java SE 5.
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
	// Private variables that will manage this ArrayList
	private int size;
	private int capacity;
	private E[] array;

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
	 * @throws NullPointerException if no collection is provided, the provided collection is defined as null, or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to initialize this ArrayList with");
		}
		this.size = 0;
		this.capacity = 10;
		if(!(c.isEmpty()))
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
	 * @param initialCapacity The capacity to initialize this ArrayList with
	 * @throws IllegalArgumentException if the provided capacity is less than or equal to 1
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity)
	{
		if(initialCapacity < 1)
		{
			throw new IllegalArgumentException("You MUST provide a non-negative non-zero value as the initial capacity");
		}
		if(initialCapacity == 1)
		{
			throw new IllegalArgumentException("For this class, it is recommended to have the initial capacity as at least 2, as it allows for expansion.");
		}
		this.size = 0;
		this.capacity = initialCapacity;
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @code This private method ensures that this array managing this ArrayList has enough space, allocating space if necessary.
	 */
	@SuppressWarnings("unchecked")
	private void ensureCapacity()
	{
		if(this.size == this.capacity)
		{
			int newCapacity = this.capacity + this.capacity / 2;
			E[] newArray = (E[]) new Object[newCapacity];
			System.arraycopy(this.array, 0, newArray, 0, this.size);
			this.capacity = newCapacity;
			this.array = newArray;
		}
	}

	/**
	 * @param o the value to be added to the end of this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has successfully been added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this ArrayList");
		}
		ensureCapacity();
		this.array[this.size] = o;
		this.size++;
		return true;
	}

	/**
	 * @param index the location at which to add a value into this ArrayList
	 * @param element the value to be added to the specified location in this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this ArrayList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		ensureCapacity();
		for(int i = this.size; i > index; i--)
		{
			this.array[i] = this.array[i - 1];
		}
		this.array[index] = element;
		this.size++;
	}

	/**
	 * @param c Collection of values to add to the end of this ArrayList
	 * @throws NullPointerException if no collection variable is provided, the provided collection variable is defined as null, or the provided collection contains null values
	 * @return true if the provided collection's values are added, false if the provided collection is empty
	 * @code Appends all of the elements in the specified Collection to the end of this list, in the order that they are returned by the specified Collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this ArrayList");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		while(iterator.hasNext())
		{
			ensureCapacity();
			this.array[this.size] = iterator.next();
			this.size++;
		}
		return true;
	}

	/**
	 * @param index the location at which to start adding values from this collection into
	 * @param c Collection of values to add to this ArrayList, starting at the specified index
	 * @throws NullPointerException if no collection is provided, the provided collection variable is defined as null, or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if the provided collection's values are added, false if the provided collection is empty
	 * @code Inserts all of the elements in the specified Collection into this list, starting at the specified position.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to be added to this ArrayList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		E[] values = (E[]) c.toArray();
		for(int i = values.length - 1; i >= 0; i--)
		{
			ensureCapacity();
			for(int j = this.size; j > index; j--)
			{
				this.array[j] = this.array[j - 1];
			}
			this.array[index] = values[i];
			this.size++;
		}
		return true;
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void clear()
	{
		this.size = 0;
		this.capacity = 10;
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @return a shallow copy of this ArrayList instance
	 */
	@Override
	public Object clone()
	{
		ArrayList<E> list = new ArrayList<>();
		for(int i = 0; i < this.size; i++)
		{
			list.add(this.array[i]);
		}
		return list;
	}

	/**
	 * @param elem the Object to find the existence of
	 * @return true if the provided Object is non-null and found, false if null or not found in this ArrayList
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object elem)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no collection is provided or the provided collection variable is defined as null
	 * @return true if the provided collection is empty or all values in the collection are contained in this ArrayList, false if the collection contains null values or values not contained in this ArrayList
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to retrieve a value from this ArrayList
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param elem the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the provided Object is null or not contained in this ArrayList
	 * @code Searches for the first occurrence of the given argument, testing for equality using the equals method.
	 */
	@Override
	public int indexOf(Object elem)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an iterator over the elements in this LinkedLIst
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return true if this ArrayList instance is empty, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param elem the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the provided Object is null or not contained in this ArrayList
	 * @code Searches for the last occurrence of the given argument, testing for equality using the equals method.
	 */
	@Override
	public int lastIndexOf(Object elem)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to remove a value from this ArrayList
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index before removal
	 * @code Removes te element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return true if the provided Object is non-null, contained in this ArrayList, and removed, false if the provided Object is null and/or not found in this ArrayList
	 * @code Removes a single instance of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the location (inclusive of which) to start removing a value from
	 * @param toIndex the location (exclusive of which) to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this List all of the elements whose index is between fromIndex, inclusive and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to remove if contained in this ArrayList
	 * @throws NullPointerException if no collection variable is provided or the provided variable is defined as null
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Removes from this ArrayList all the elements that are contained in the specified collection (optional operation).
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to retain if contained in this list
	 * @throws NullPointerException if no collection variable is provided or the provided variable is defined as null
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection (optional operation).
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to perform a replacement
	 * @param element the replacement value for the specified location
	 * @throws IllegalArgumentException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this ArrayList
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the number of elements in this ArrayList
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an array containing all of the elements in this list in the correct order
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a an array of type T whose runtime must be mimicked for the returning array
	 * @throws NullPointerException if no array is provided or the variable provided is null
	 * @return an array containing all of the elements in this list in the correct order
	 * @code Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array.
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @code Trims the capacity of this ArrayList instance to be the list's current size.
	 * @throws UnsupportedOperationException if this ArrayList's capacity is less than or equal to 1
	 */
	public void trimToSize()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a String representation of this ArrayList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
