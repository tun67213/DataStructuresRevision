package Java_SE_6;

import java.util.NoSuchElementException;

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
	 * @param e the value to add to the end of this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has been successfully added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to add to this ArrayList");
		}
		ensureCapacity();
		this.array[this.size] = e;
		this.size++;
		return true;
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
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to add to this Arraylist");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		ensureCapacity();
		if(index == this.size)
		{
			this.array[this.size] = element;
		}
		else
		{
			for(int i = this.size; i > index; i--)
			{
				this.array[i] = this.array[i - 1];
			}
			this.array[index] = element;
		}
		this.size++;
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
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add to this ArrayList");
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
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add to this list");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		if(c.isEmpty())
		{
			return false;
		}
		E[] values = (E[]) c.toArray();
		if(index == this.size)
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				ensureCapacity();
				this.array[this.size] = iterator.next();
				this.size++;
			}
		}
		else
		{
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
	 * @param o the Object to find the existence of
	 * @return true if the provided Object is non-null and contained in this ArrayList, false otherwise
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			return false;
		}
		int index = 0;
		while(index < this.size && !(this.array[index].equals(o)))
		{
			index++;
		}
		return index < this.size;
	}

	/**
	 * @param c Collection of values to find the existence of
	 * @throws NullPointerException if no collection is provided
	 * @return true if the provided collection is empty or all values in the provided collection are contained in this list, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to find the existence of");
		}
		if(c.isEmpty())
		{
			return true;
		}
		if(c.contains(null))
		{
			return false;
		}
		Iterator<?> iterator = c.iterator();
		int index;
		while(iterator.hasNext())
		{
			index = 0;
			Object o = iterator.next();
			while(index < this.size && !(this.array[index].equals(o)))
			{
				index++;
			}
			if(index >= this.size)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @param o the Object to compare with this list for equality
	 * @return true if this list matches the provided Object, false otherwise
	 * @code Compares the specified object with this list for equality/
	 */
	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null)
		{
			return false;
		}
		if(!(o instanceof ArrayList<?>))
		{
			return false;
		}
		ArrayList<?> other = (ArrayList<?>) o;
		if(this.size != other.size)
		{
			return false;
		}
		for(int i = 0; i < this.size; i++)
		{
			Object thisElement = this.array[i];
			Object otherElement = other.array[i];
			if(thisElement == null && otherElement != null)
			{
				return false;
			}
			else if(!(thisElement.equals(otherElement)))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @param index the location at which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specific location in this list
	 */
	@Override
	public E get(int index)
	{
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		return this.array[index];
	}

	/**
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		int hashcode = 1;
		for(int i = 0; i < this.size; i++)
		{
			E value = this.array[i];
			if(value != null)
			{
				hashcode = 31 * hashcode + value.hashCode();
			}
		}
		return hashcode;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int indexOf(Object o)
	{
		if(o == null)
		{
			return -1;
		}
		int index = 0;
		while(index < this.size && !(this.array[index].equals(o)))
		{
			index++;
		}
		return (index >= this.size) ? -1 : index;
	}

	/**
	 * @return an iterator over the elements in this list
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<>()
		{
			private int currentIndex;
			private int lastReturnedIndex;

			{
				this.currentIndex = 0;
				this.lastReturnedIndex = -1;
			}

			/**
			 * @return true if the iteration has more elements, false otherwise
			 */
			@Override
			public boolean hasNext()
			{
				return this.currentIndex < size;
			}

			/**
			 * @return the next element in the iteration
			 * @throws NoSuchElementException if hasNext() returns false
			 */
			@Override
			public E next()
			{
				if(this.currentIndex >= size)
				{
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				this.lastReturnedIndex = this.currentIndex;
				this.currentIndex++;
				return array[this.lastReturnedIndex];
			}

			/**
			 * @code Removes from the underlying collection the last element returned by the iterator.
			 * @throws IllegalStateException if called multiple times
			 */
			@Override
			public void remove()
			{
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() once before calling remove()");
				}
				for(int i = lastReturnedIndex; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				size--;
				lastReturnedIndex = -1;
			}
		};
	}

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		return this.size == 0;
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		if(o == null)
		{
			return -1;
		}
		int index = this.size - 1;
		while(index >= 0 && !(this.array[index].equals(o)))
		{
			index--;
		}
		return index;
	}

	/**
	 * @return a list iterator over the elements in this list
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<>()
		{
			private int currentIndex;
			private int lastReturnedIndex;

			{
				this.currentIndex = 0;
				this.lastReturnedIndex = -1;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add");
				}
				ensureCapacity();
				for(int i = size; i > currentIndex; i--)
				{
					array[i] = array[i - 1];
				}
				array[currentIndex] = e;
				currentIndex++;
				size++;
				lastReturnedIndex = -1;
			}

			@Override
			public boolean hasNext()
			{
				return this.currentIndex < size;
			}

			@Override
			public E next()
			{
				if(this.currentIndex >= size)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				this.lastReturnedIndex = this.currentIndex;
				this.currentIndex++;
				return array[this.lastReturnedIndex];
			}

			@Override
			public boolean hasPrevious()
			{
				return this.currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if(this.currentIndex <= 0)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				this.currentIndex--;
				this.lastReturnedIndex = this.currentIndex;
				return array[this.lastReturnedIndex];
			}

			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			@Override
			public int previousIndex()
			{
				return this.currentIndex - 1;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to set");
				}
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				array[lastReturnedIndex] = e;
			}

			@Override
			public void remove()
			{
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling remove()");
				}
				for(int i = lastReturnedIndex; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				array[size - 1] = null;
				size--;
				if(lastReturnedIndex < currentIndex)
				{
					currentIndex--;
				}
				lastReturnedIndex = -1;
			}
		};
	}

	/**
	 * @param index the location from which to create this list iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list, starting at the specified index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		return new ListIterator<>()
		{
			private int currentIndex;
			private int lastReturnedIndex;

			{
				this.currentIndex = index;
				this.lastReturnedIndex = -1;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add");
				}
				ensureCapacity();
				for(int i = size; i > currentIndex; i--)
				{
					array[i] = array[i - 1];
				}
				array[currentIndex] = e;
				currentIndex++;
				size++;
				lastReturnedIndex = -1;
			}

			@Override
			public boolean hasNext()
			{
				return this.currentIndex < size;
			}

			@Override
			public E next()
			{
				if(this.currentIndex >= size)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				this.lastReturnedIndex = this.currentIndex;
				this.currentIndex++;
				return array[this.lastReturnedIndex];
			}

			@Override
			public boolean hasPrevious()
			{
				return this.currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if(this.currentIndex <= 0)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				this.currentIndex--;
				this.lastReturnedIndex = this.currentIndex;
				return array[this.lastReturnedIndex];
			}

			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			@Override
			public int previousIndex()
			{
				return this.currentIndex - 1;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to set");
				}
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				array[lastReturnedIndex] = e;
			}

			@Override
			public void remove()
			{
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling remove()");
				}
				for(int i = lastReturnedIndex; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				array[size - 1] = null;
				size--;
				if(lastReturnedIndex < currentIndex)
				{
					currentIndex--;
				}
				lastReturnedIndex = -1;
			}
		};
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
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		E removingValue = this.array[index];
		for(int i = index; i < this.size - 1; i++)
		{
			this.array[i] = this.array[i + 1];
		}
		this.array[this.size - 1] = null;
		this.size--;
		return removingValue;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		if(o == null)
		{
			return false;
		}
		int removingIndex = 0;
		while(removingIndex < this.size && !(this.array[removingIndex].equals(o)))
		{
			removingIndex++;
		}
		if(removingIndex >= this.size)
		{
			return false;
		}
		else
		{
			for(int i = removingIndex; i < this.size - 1; i++)
			{
				this.array[i] = this.array[i + 1];
			}
			this.array[this.size - 1] = null;
			this.size--;
		}
		return true;
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
		if(fromIndex < 0 || toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") and/or toIndex (" + toIndex + ") is/are out of bounds");
		}
		if(fromIndex > toIndex)
		{
			throw new IllegalArgumentException("fromIndex (" + fromIndex + ") cannot be greater than toIndex (" + toIndex + ")");
		}
		for(int i = fromIndex; i < toIndex; i++)
		{
			for(int j = fromIndex; j < this.size - 1; j++)
			{
				this.array[j] = this.array[j + 1];
			}
			this.array[this.size - 1] = null;
			this.size--;
		}
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
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to remove if contained in this list");
		}
		if(c.isEmpty())
		{
			return false;
		}
		boolean listModified = false;
		int i = 0;
		while(i < this.size)
		{
			if(c.contains(this.array[i]))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				this.array[this.size - 1] = null;
				this.size--;
				listModified = true;
			}
			else
			{
				i++;
			}
		}
		return listModified;
	}

	/**
	 * @param c Collection of values to retain
	 * @throws NullPointerException if no collection is provided
	 * @return true if thi slist has been structurally modified, false otherwise
	 * @code Retains only values in this list that are contained in the specified collection.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to retain if contained in this list");
		}
		if(c.isEmpty())
		{
			this.size = 0;
			this.capacity = 10;
			this.array = (E[]) new Object[this.capacity];
			return true;
		}
		boolean listModified = false;
		int i = 0;
		while(i < this.size)
		{
			if(!(c.contains(this.array[i])))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				this.array[this.size - 1] = null;
				this.size--;
				listModified = true;
			}
			else
			{
				i++;
			}
		}
		return listModified;
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
