package src.Java_SE_10;

import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author arvindhvelrajan
 * @param <E> Generic method for this class
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
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
	 * @param initialCapacity the initial capacity to initialize this ArrayList with
	 * @throws IllegalArgumentException if the provided capacity is less than or equal to 0
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity)
	{
		if(initialCapacity <= 0)
		{
			throw new IllegalArgumentException("You MUST provide a non-null non-zero capacity to initialize this ArrayList with");
		}
		this.size = 0;
		this.capacity = initialCapacity;
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
			throw new NullPointerException("You MUST provide a non-null collection of non-null values to initialize this LinkedList with");
		}
		Iterator<? extends E> iterator = c.iterator();
		this.size = 0;
		this.capacity = c.size() + c.size() / 2;
		this.array = (E[]) new Object[this.capacity];
		while(iterator.hasNext())
		{
			this.array[this.size] = iterator.next();
			this.size++;
		}
	}

	/**
	 * @code Ensures that the array representing this ArrayList has enough space. If not, a new array with more space is allocated, and values from this array are copied into it.
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
	 * @param index the location at which to add the specified element
	 * @param element the value to be added to the specified location
	 * @throws NullPointerException if the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a value to add into this ArrayList");
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
	 * @param e the value to be added to the end of this ArrayList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to the end of this ArrayList");
		}
		ensureCapacity();
		this.array[this.size] = e;
		this.size++;
		return true;
	}

	/**
	 * @param index the location at which to start adding values from the provided Collection
	 * @param c Collection of values to add to this ArrayList, from the specified index in this List
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if all the values have been successfully added, false if the provided Collection is empty
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null elements to add to this ArrayList");
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
		Iterator<? extends E> iterator = c.iterator();
		if(index == this.size)
		{
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
	 * @param c Collection of values to add to this ArrayList
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null elements to add to this ArrayList");
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
	 * @param o the Object to find the existence of in this ArrayList
	 * @throws NullPointerException if no Object is provided or the provided Object is null
	 * @return true if this ArrayList contains the provided Object, false otherwise
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			return false;
		}
		for(int i = 0; i < this.size; i++)
		{
			if(this.array[i].equals(o))
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * @param c the Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no Collection is provided
	 * @return false if the provided Collection contains null values or a value in the Collection is not found in this ArrayList, true otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null Collection of values to find the existence of in this ArrayList");
		}
		if(c.contains(null))
		{
			return false;
		}
		Iterator<?> iterator = c.iterator();
		boolean foundValue = false;
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			for(int i = 0; i < this.size; i++)
			{
				if(this.array[i].equals(value))
				{
					foundValue = true;
					break;
				}
			}
			if(!foundValue)
			{
				return false;
			}
			foundValue = false;
		}
		return true;
	}

	/**
	 * @param action the action to be performed on each value in this ArrayList
	 * @throws NullPointerException if no action is specified
	 * @code Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
	 */
	@Override
	public void forEach(Consumer<? super E> action)
	{
		if(action == null)
		{
			throw new NullPointerException("You MUST provide a non-null action to apply to each element of this ArrayList");
		}
		for(int i = 0; i < this.size; i++)
		{
			action.accept(this.array[i]);
		}
	}

	/**
	 * @param index the location from which to retrieve a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specified index in this ArrayList
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
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the provided Object is null or not found
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
	 * @return true if this list contains no elements
	 */
	@Override
	public boolean isEmpty()
	{
		return this.size == 0;
	}

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<>()
		{
			private int currentIndex = 0;
			private int lastReturnedIndex = -1;

			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				for(int i = currentIndex; i < size; i++)
				{
					action.accept(array[i]);
				}
			}

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
					throw new NoSuchElementException("This iterator has reached the end of this ArrayList");
				}
				lastReturnedIndex = currentIndex;
				this.currentIndex++;
				return array[lastReturnedIndex];
			}

			@Override
			public void remove()
			{
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() before calling remove()");
				}
				for(int i = lastReturnedIndex; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				array[size - 1] = null;
				size--;
				lastReturnedIndex = -1;
			}
		};
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the provided Object is null or not found
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
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<>()
		{
			private int currentIndex = 0;
			private int lastReturnedIndex = -1;

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
					throw new NoSuchElementException("This list iterator has reached the end of this ArrayList");
				}
				E value = array[this.currentIndex];
				lastReturnedIndex = this.currentIndex;
				this.currentIndex++;
				return value;
			}

			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			@Override
			public boolean hasPrevious()
			{
				return this.currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This list iterator has reached the end of this ArrayList");
				}
				this.currentIndex--;
				lastReturnedIndex = this.currentIndex;
				return array[this.currentIndex];
			}

			@Override
			public int previousIndex()
			{
				return this.currentIndex;
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
				size--;
				lastReturnedIndex = -1;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to set in this ArrayList");
				}
				if (lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				array[lastReturnedIndex] = e;
			}

			@Override
			public void add(E e)
			{
				if (e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add to this ArrayList");
				}
				ensureCapacity();
				for (int i = size; i > currentIndex; i--)
				{
					array[i] = array[i - 1];
				}
				array[currentIndex] = e;
				size++;
				currentIndex++;
			}
		};
	}

	/**
	 * @param index the location from which to start this list iterator from
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
		return new ListIterator<>()
		{
			private int currentIndex = index;
			private int lastReturnedIndex = -1;

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
					throw new NoSuchElementException("This list iterator has reached the end of this ArrayList");
				}
				E value = array[this.currentIndex];
				lastReturnedIndex = this.currentIndex;
				this.currentIndex++;
				return value;
			}

			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			@Override
			public boolean hasPrevious()
			{
				return this.currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This list iterator has reached the end of this ArrayList");
				}
				this.currentIndex--;
				lastReturnedIndex = this.currentIndex;
				return array[this.currentIndex];
			}

			@Override
			public int previousIndex()
			{
				return this.currentIndex;
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
				size--;
				lastReturnedIndex = -1;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to set in this ArrayList");
				}
				if (lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				array[lastReturnedIndex] = e;
			}

			@Override
			public void add(E e)
			{
				if (e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add to this ArrayList");
				}
				ensureCapacity();
				for (int i = size; i > currentIndex; i--)
				{
					array[i] = array[i - 1];
				}
				array[currentIndex] = e;
				size++;
				currentIndex++;
			}
		};
	}

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this ArrayList
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
			this.array[i] = array[i + 1];
		}
		this.size--;
		return value;
	}

	/**
	 * @param o the Object to find and remove the first occurrence o
	 * @return false if the provided Object is null or not found, true otherwise
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
		this.size--;
		return true;
	}

	/**
	 * @param c Collection of values to remove if found in this ArrayList
	 * @throws NullPointerException if no Collection is provided or the provided Collection variable is null
	 * @return true if at least one value has been removed from this ArrayList, false otherwise
	 * @code Removes from this list all of its elements that are contained in the specified collection.
	 */
	@SuppressWarnings("unchecked")
	public boolean removeAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to remove if found in this ArrayList");
		}
		if(c.isEmpty())
		{
			return false;
		}
		int i = 0;
		int currentSize = this.size;
		while(i < this.size)
		{
			E value = this.array[i];
			if(c.contains(value))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = array[j + 1];
				}
				this.size--;
			}
			else
			{
				i++;
			}
		}
		return this.size != currentSize;
	}

	/**
	 * @param filter the condition to satisfy for removal
	 * @throws NullPointerException if no condition is provided
	 * @return true if at least one value has been removed, false otherwise
	 * @code Removes all of the elements of this collection that satisfy the given predicate.
	 */
	@Override
	public boolean removeIf(Predicate<? super E> filter)
	{
		if(filter == null)
		{
			throw new NullPointerException("You MUST provide a condition to use to remove values from this ArrayList");
		}
		int currentSize = this.size;
		int i = 0;
		while(i < this.size)
		{
			E value = this.array[i];
			if(filter.test(value)) // If the condition is met
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				this.array[this.size - 1] = null;
				this.size--;
			}
			else
			{
				i++;
			}
		}
		return this.size != currentSize;
	}

	/**
	 * @param fromIndex the location, inclusive of which, to remove from
	 * @param toIndex the location, exclusive of which, to remove until
	 * @throws IndexOutOfBoundsException if fromIndex is less than 0 and/or toIndex is greater than the size of this list
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	protected void removeRange(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 || toIndex > this.size || fromIndex > toIndex)
		{
			throw new IndexOutOfBoundsException("Invalid range: fromIndex (" + fromIndex + ") and toIndex (" + toIndex + ") must be within bounds, and fromIndex should not be greater than toIndex.");
		}
		for(int i = fromIndex; i < toIndex; i++)
		{
			for(int j = fromIndex; j < this.size - 1; j++)
			{
				this.array[j] = array[j + 1];
			}
			this.size--;
		}
	}

	/**
	 * @param c Collection of values to keep if found in this ArrayList
	 * @throws NullPointerException if no Collection is provided or the provided Collection variable is 'null'
	 * @return true if at least one value was removed (i.e. this ArrayList has changed), false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a Collection of values to retain if existence in this ArrayList");
		}
		int i = 0;
		int previousSize = this.size;
		while(i < this.size)
		{
			if(!c.contains(this.array[i]))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				this.size--;
			}
			else
			{
				i++;
			}
		}
		return this.size != previousSize;
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no element is provided or the provided element is defined as 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index before replacement
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a replacement value");
		}
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		E oldValue = this.array[index];
		this.array[index] = element;
		return oldValue;
	}

	/**
	 * @return the number of elements in this ArrayList
	 */
	@Override
	public int size()
	{
		return this.size;
	}

	/**
	 * @return a late-binding and fail-fast Spliterator over the elements in this list
	 */
	@Override
	public Spliterator<E> spliterator()
	{
		return new Spliterator<E>()
		{
			private int currentIndex = 0;

			@Override
			public boolean tryAdvance(Consumer<? super E> action)
			{
				if (currentIndex < size)
				{
					action.accept(array[currentIndex]);
					currentIndex++;
					return true;
				}
				return false;
			}

			@Override
			public Spliterator<E> trySplit()
			{
				int mid = (size + currentIndex) / 2;
				if (mid <= currentIndex) return null;

				int oldIndex = currentIndex;
				currentIndex = mid;
				return new Spliterator<E>()
				{
					private int localIndex = oldIndex;

					@Override
					public boolean tryAdvance(Consumer<? super E> action)
					{
						if (localIndex < currentIndex)
						{
							action.accept(array[localIndex]);
							localIndex++;
							return true;
						}
						return false;
					}

					@Override
					public Spliterator<E> trySplit()
					{
						return null;
					}

					@Override
					public long estimateSize()
					{
						return currentIndex - localIndex;
					}

					@Override
					public int characteristics()
					{
						return ORDERED | SIZED;
					}
				};
			}

			@Override
			public long estimateSize()
			{
				return size - currentIndex;
			}

			@Override
			public int characteristics()
			{
				return ORDERED | SIZED;
			}
		};
	}

	/**
	 * @param fromIndex the location, inclusive of which, to create the subList from
	 * @param toIndex the location, exclusive of which, to create the subList until
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
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
	 * @param a an array of type T into which to copy values from this ArrayList into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this ArrayList accommodated into it
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @code Trims the capacity of this ArrayList instance to be the list's current size.
	 */
	public void trimToSize()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a String representation of this ArrayList that is more readable to the user
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
