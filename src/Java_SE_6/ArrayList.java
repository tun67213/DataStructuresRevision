package src.Java_SE_6;

import java.util.NoSuchElementException;

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
	@SuppressWarnings("unchecked")
	public ArrayList()
	{
		this.size = 0;
		this.capacity = 10;
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @param c Collection of values to initialize this ArrayList with
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to initialize this ArrayList with");
		}
		this.size = 0;
		this.capacity = c.size() + c.size() / 2;
		this.array = (E[]) new Object[this.capacity];
		Iterator<? extends E> iterator = c.iterator();
		while(iterator.hasNext())
		{
			this.array[this.size] = iterator.next();
			this.size++;
		}
	}

	/**
	 * @param initialCapacity the initial capacity to initialize this ArrayList with
	 * @throws IllegalArgumentException if the provided capacity is less than or equal to 0
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity)
	{
		if(initialCapacity <= 0)
		{
			throw new IllegalArgumentException("You MUST provide a non-negative non-zero initial capacity");
		}
		this.size = 0;
		this.capacity = initialCapacity;
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @code This method ensures that the array representing this ArrayList has enough space, and if necessary, allocates more storage for this ArrayList.
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
	 * @param e the value to be added to the end of this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has successfully been added (no return if method failed, because an exception will be thrown)
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("No null values are allowed in this ArrayList");
		}
		ensureCapacity();
		this.array[this.size] = e;
		this.size++;
		return true;
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
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this ArrayList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("The provided index, index " + index + ", is out of bounds.");
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
	 * @throws NullPointerException if no Collection is provided, the provided Collection is defined as 'null' or the provided Collection contains null values
	 * @return true if this ArrayList has been modified, false otherwise (i.e. the provided Collection is empty)
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to add to this ArrayList");
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
	 * @param index the location at which to start adding values into this ArrayList
	 * @param c Collection of values to add into this ArrayList, starting at the specified index
	 * @throws NullPointerException if no Collection is provided, the provided Collection is defined as 'null' or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been modified, false otherwise (i.e. the provided Collection is empty)
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to add to this ArrayList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("The provided index, index " + index + ", is out of bounds.");
		}
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
			Object[] values = c.toArray();
			for(int i = values.length - 1; i >= 0; i--)
			{
				ensureCapacity();
				for(int j = this.size; j > index; j--)
				{
					this.array[j] = this.array[j - 1];
				}
				this.array[index] = (E) values[i];
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
	 * @return the hash code value for this ArrayList
	 */
	@Override
	public int hashCode()
	{
		int hashCode = 1;
		for(int i = 0; i < this.size; i++)
		{
			E value = this.array[i];
			hashCode = 31 * hashCode + value.hashCode();
		}
		return hashCode;
	}

	/**
	 * @param o the Object ot find the existence of in this ArrayList
	 * @return false if the provided Object is 'null' or not found, true if found
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			return false;
		}
		int i = 0;
		while(i < this.size && !(this.array[i].equals(o)))
		{
			i++;
		}
		return i < this.size;
	}

	/**
	 * @param c Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no Collection is provided or the provided Collection variable is 'null'
	 * @return false if a value in the provided Collection is 'null' or not found in this ArrayList, true if empty or all values are found
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to check the existence of in this ArrayList");
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
		boolean valueFound = false;
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			for(int i = 0; i < this.size; i++)
			{
				if(this.array[i].equals(value))
				{
					valueFound = true;
					break;
				}
			}
			if(!valueFound)
			{
				return false;
			}
			valueFound = false;
		}
		return true;
	}

	/**
	 * @param o the Object to compare with for equality
	 * @return false if the provided Object is null or not equal, true if exactly equal
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		if(o == null || !(o instanceof ArrayList))
		{
			return false;
		}
		if(o == this)
		{
			return true;
		}
		ArrayList<?> other = (ArrayList<?>) o;
		if(this.size != other.size())
		{
			return false;
		}
		for(int i = 0; i < this.size; i++)
		{
			Object value = other.get(i);
			if(value == null || (!this.array[i].equals(value)))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the provided index in this ArrayList
	 */
	@Override
	public E get(int index)
	{
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		return this.array[index];
	}

	/**
	 * @return an iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<E>()
		{
			private int currentIndex = 0;
			private int lastCalled = -1;

			@Override
			public boolean hasNext()
			{
				return this.currentIndex < size;
			}

			@Override
			public E next()
			{
				if(!hasNext())
				{
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				this.lastCalled = this.currentIndex;
				this.currentIndex++;
				return array[this.lastCalled];
			}

			@Override
			public void remove()
			{
				if(lastCalled == -1)
				{
					throw new NoSuchElementException("You MUST call next() before calling remove");
				}
				for(int i = lastCalled; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				array[size - 1] = null;
				size--;
				lastCalled = -1;
			}
		};
	}

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<E>()
		{
			private int currentIndex = 0;
			private int lastCalled = -1;

			@Override
			public boolean hasNext()
			{
				return currentIndex < size;
			}

			@Override
			public E next()
			{
				if(!hasNext())
				{
					throw new NoSuchElementException("This list iterator has reached the end of this list");
				}
				this.lastCalled = this.currentIndex;
				this.currentIndex++;
				return array[this.lastCalled];
			}

			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			@Override
			public boolean hasPrevious()
			{
				return currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This list iterator has reached the end of this list");
				}
				this.currentIndex--;
				this.lastCalled = this.currentIndex;
				return array[this.lastCalled];
			}

			@Override
			public int previousIndex()
			{
				return this.currentIndex - 1;
			}

			@Override
			public void remove()
			{
				if(lastCalled == -1)
				{
					throw new NoSuchElementException("You MUST call previous() or next() before calling remove()");
				}
				for(int i = lastCalled; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				array[size - 1] = null;
				lastCalled = -1;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null replacement value");
				}
				array[lastCalled] = e;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null value to add to this ListIterator");
				}
				ensureCapacity();
				for(int i = size; i > currentIndex; i++)
				{
					array[i] = array[i - 1];
				}
				array[currentIndex] = e;
				size++;
			}
		};
	}

	/**
	 * @param index the location at which to create this List Iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		return new ListIterator<E>()
		{
			private int currentIndex = index;
			private int lastCalled = -1;

			@Override
			public boolean hasNext()
			{
				return currentIndex < size;
			}

			@Override
			public E next()
			{
				if(!hasNext())
				{
					throw new NoSuchElementException("This list iterator has reached the end of this list");
				}
				this.lastCalled = this.currentIndex;
				this.currentIndex++;
				return array[this.lastCalled];
			}

			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			@Override
			public boolean hasPrevious()
			{
				return currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This list iterator has reached the end of this list");
				}
				this.currentIndex--;
				this.lastCalled = this.currentIndex;
				return array[this.lastCalled];
			}

			@Override
			public int previousIndex()
			{
				return this.currentIndex - 1;
			}

			@Override
			public void remove()
			{
				if(lastCalled == -1)
				{
					throw new NoSuchElementException("You MUST call previous() or next() before calling remove()");
				}
				for(int i = lastCalled; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				array[size - 1] = null;
				lastCalled = -1;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null replacement value");
				}
				array[lastCalled] = e;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null value to add to this ListIterator");
				}
				ensureCapacity();
				for(int i = size; i > currentIndex; i++)
				{
					array[i] = array[i - 1];
				}
				array[currentIndex] = e;
				size++;
			}
		};
	}

	/**
	 * @param o the Object to find the location of the first occurrence of
	 * @return -1 if the provided value is null or not found, or the location of the first occurrence of the provided Object
	 * @code Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int indexOf(Object o)
	{
		if(o == null)
		{
			return -1;
		}
		for(int i = 0; i < this.size; i++)
		{
			if(this.array[i].equals(o))
			{
				return i;
			}
		}
		return -1;
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
	 * @param o the Object to find the location of the last occurrence of
	 * @return -1 if the provided value is null or not found, or the location of teh last occurrence of the provided Object
	 * @code Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		if(o == null)
		{
			return -1;
		}
		for(int i = this.size - 1; i >= 0; i--)
		{
			if(this.array[i].equals(o))
			{
				return i;
			}
		}
		return -1;
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
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		E value = this.array[index];
		for(int i = index; i < this.size - 1; i++)
		{
			this.array[i] = this.array[i + 1];
		}
		this.array[this.size - 1] = null;
		this.size--;
		return value;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return false if the provided Object is null or not found, true if found and removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
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
		if(index >= this.size)
		{
			return false;
		}
		for(int i = index; i < this.size - 1; i++)
		{
			this.array[i] = this.array[i + 1];
		}
		this.array[this.size - 1] = null;
		this.size--;
		return true;
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
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null Collection of values to remove if found in this ArrayList");
		}
		if(c.isEmpty())
		{
			return false;
		}
		boolean modified = false;
		int i = 0;
		while(i < this.size)
		{
			E value = this.array[i];
			if(c.contains(value))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				this.array[this.size - 1] = null;
				modified = true;
				this.size--;
			}
			else
			{
				i++;
			}
		}
		return modified;
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
		if(fromIndex < 0 || toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("fromIndex " + fromIndex + " and/or toIndex " + toIndex + "is/are out of bounds");
		}
		if(fromIndex > toIndex)
		{
			throw new IllegalArgumentException("fromIndex " + fromIndex + " cannot be greater than toIndex " + toIndex);
		}
		int numberOfShifts = toIndex - fromIndex;
		for(int i = toIndex; i < this.size; i++)
		{
			this.array[i - numberOfShifts] = this.array[i];
		}
		for(int i = this.size - numberOfShifts; i < this.size; i++)
		{
			this.array[i] = null;
		}
		this.size -= numberOfShifts;
	}

	/**
	 * @param c Collection of values to keep if found in this ArrayList
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Removes any elements not contained in the provided Collection. Empties the ArrayList if the provided Collection is empty.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a Collection of values to retain if found in this ArrayList");
		}
		if(c.isEmpty())
		{
			this.size = 0;
			this.capacity = 10;
			this.array = (E[]) new Object[this.capacity];
			return true;
		}
		int i = 0;
		boolean modified = false;
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
				modified = true;
			}
			else
			{
				i++;
			}
		}
		return modified;
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
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a replacement value for the specified index");
		}
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		E value = this.array[index];
		this.array[index] = element;
		return value;
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		return this.size;
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
	@SuppressWarnings("unchecked")
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
	@SuppressWarnings("unchecked")
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
