package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with ArrayList for Java SE 6.
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
	// Define variables that will manage this ArrayList
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
	 * @throws NullPointerException if the provided variable is null
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("Please provide a non-null collection of non-null elements");
		}
		if(c.isEmpty())
		{
			this.size = 0;
			this.capacity = 10;
			this.array = (E[]) new Object[this.capacity];
		}
		else
		{
			Iterator<? extends E> iterator = c.iterator();
			this.size = 0;
			this.capacity = c.size() + c.size() / 2;
			this.array = (E[]) new Object[this.capacity];
			while(iterator.hasNext())
			{
				this.array[size] = iterator.next();
				size++;
			}
		}
	}

	/**
	 * @param initialCapacity the capacity to set as the initial capacity for this ArrayList
	 * @throws IllegalArgumentException if the provided index is not appropriate
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity)
	{
		if(initialCapacity <= 0)
		{
			throw new IllegalArgumentException("Capacity must be greater than 0.");
		}
		this.size = 0;
		this.capacity = initialCapacity;
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @code Checks if the array handling this ArrayList has enough space. If not, it creates a new array, copies old values over, and reassigns with more capacity.
	 */
	@SuppressWarnings("unchecked")
	private void ensureCapacity()
	{
		if(this.size == this.capacity)
		{
			int newCapacity = 1;
			if(this.capacity > 1)
			{
				newCapacity = this.capacity + this.capacity / 2;
			}
			else
			{
				newCapacity++;
			}
			E[] newArray = (E[]) new Object[newCapacity];
			System.arraycopy(this.array, 0, newArray, 0, this.size);
			this.capacity = newCapacity;
			this.array = newArray;
		}
	}

	/**
	 * @param e the value to be added to this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has successfully been added
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to add the specified value
	 * @param element the value to add to the specified location
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values whose values to add at the end of this list
	 * @throws NullPointerException if no collection is provided or the collection contains null values
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to start adding values
	 * @param c Collection of values to add into this list
	 * @throws NullPointerException if no collection is provided or the collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a shallow copy of this ArrayList instance
	 */
	@Override
	public Object clone()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return true if this list contains the specified element, false otherwise
	 */
	@Override
	public boolean contains(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to find the existence of
	 * @throws NullPointerException if no collection is provided
	 * @return true if all values in the provided collection are contained in this list, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location from which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided location is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
	 */
	@Override
	public int indexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location from which to create this iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location from which to remove a value
	 * @return the value previously at the specified index before removal
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param o the Object to remove the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to remove
	 * @return true if this list has been structurally modified, false otherwise
	 * @throws NullPointerException if no collection is provided
	 * @code Removes from this list all of its elements that are contained in the specified collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param fromIndex the location (inclusive of which) to remove values from
	 * @param toIndex the location (exclusive of which) to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param c Collection of values to keep if found in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param fromIndex the location (inclusive of which) to create this view
	 * @param toIndex the location (exclusive of which) to create this view
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param a an array of type T[] whose runtime we must mimic
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 * @throws NullPointerException if no array is provided
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @code Trims the capacity of this ArrayList instance to be the list's current size.
	 */
	public void trimToSize()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a String version of this ArrayList that is readable to the human eye
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
