package src.Java_SE_8;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class implements ArrayList for Java SE 8
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
	 * @param c Collection of values to initialize this ArrayList with
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(Collection<? extends E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a Collection of values to initialize this ArrayList with");
		}
		this.size = 0;
		this.capacity = 10;
		if(!c.isEmpty())
		{
			this.capacity = c.size() + c.size() / 2;
		}
		this.array = (E[]) new Object[this.capacity];
		if(!c.isEmpty())
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				this.array[this.size] = iterator.next();
				this.size++;
			}
		}
	}

	/**
	 * @param initialCapacity the capacity to initialize this ArrayList with
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(int initialCapacity)
	{
		this.size = 0;
		this.capacity = initialCapacity;
		this.array = (E[]) new Object[this.capacity];
	}

	/**
	 * @code This is a private helper function to assist with managing the amount of space left, expanding if necessary.
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
	 * @throws NullPointerException if no value is provided
	 * @return true if this ArrayList has been modified
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non null element to insert into this ArrayList");
		}
		ensureCapacity();
		this.array[this.size] = e;
		this.size++;
		return true;
	}

	/**
	 * @param index the location at which to add the specified value
	 * @param element the value to add to the specified location in this list
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a non null element to insert into this ArrayList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		ensureCapacity();
		for(int i = this.size; i > index; i++)
		{
			this.array[i] = this.array[i - 1];
		}
		this.array[index] = element;
		this.size++;
	}

	/**
	 * @param c Collection of values to add to the end of this ArrayList
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non null collection of values to insert into this ArrayList");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		while(iterator.hasNext())
		{
			E element = iterator.next();
			if(element == null)
			{
				throw new NullPointerException("You MUST provide a non null element to insert into this ArrayList");
			}
			ensureCapacity();
			this.array[this.size] = element;
			this.size++;
		}
		return true;
	}

	/**
	 * @param index the location at which to start adding the values from the provided Collection
	 * @param c Collection of values to add to this ArrayList, starting at the specified index
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non null collection of values to insert into this ArrayList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		int startingIndex = index;
		while(iterator.hasNext())
		{
			E element = iterator.next();
			if(element == null)
			{
				throw new NullPointerException("You MUST provided a non null value to insert into this ArrayList");
			}
			ensureCapacity();
			for(int i = this.size; i > startingIndex; i--)
			{
				this.array[i] = this.array[i - 1];
			}
			this.array[startingIndex] = element;
			this.size++;
			startingIndex++;
		}
		return true;
	}

	/**
	 * @code Removes all the elements from this list.
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
	 * @return a shallow copy of this ArrayList
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
	 * @throws NullPointerException if no Object is provided
	 * @return true if this ArrayList contains the specified Object, false otherwise
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a value to find the existence of in this Arraylist");
		}
		int i = 0;
		while(i < this.size && !(this.array[i].equals(o)))
		{
			i++;
		}
		return i < this.size;
	}

	/**
	 * @param c Collection of values to check for existence in this ArrayList
	 * @throws NullPointerException if no Collection is provided
	 * @return false if a value in the provided Collection is not contained in this ArrayList, true otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to find the existence of in this ArrayList");
		}
		if(c.isEmpty())
		{
			return true;
		}
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext())
		{
			Object element = iterator.next();
			int i = 0;
			while(i < this.size && !(this.array[i].equals(element)))
			{
				i++;
			}
			if(i >= this.size)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @code Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
	 */
	public void forEach(Consumer<? super E> action)
	{
		if(action == null)
		{
			throw new NullPointerException("The action cannot be null");
		}
		for(int i = 0; i < this.size; i++)
		{
			action.accept(this.array[i]);
		}
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
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
	 * @param o the Object to find the location of the first occurrence of
	 * @throws NullPointerException if no Object is provided
	 * @return the location of the first occurrence of the provided Object or -1 if not found
	 */
	@Override
	public int indexOf(Object o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a value to find the location of the first occurrence of");
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
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<E>()
		{
			private int index = 0;
			private boolean canRemove = false;

			@Override
			public boolean hasNext()
			{
				return this.index < size;
			}

			@Override
			public E next()
			{
				if(!hasNext())
				{
					throw new NoSuchElementException("Iterator has reached the end of this list");
				}
				E value = array[index];
				index++;
				canRemove = true;
				return value;
			}

			@Override
			public void remove()
			{
				if(!canRemove)
				{
					throw new IllegalStateException("You cannot remove an element before calling next() or after removing an element");
				}
				for(int i = index - 1; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}
				size--;
				index--;
				canRemove = false;
			}
		};
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @throws NullPointerException if no Object is provided or the provided Object is 'null'
	 * @return the location of the last occurrence of the provided Object or -1 if not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a value to find the last occurrence of");
		}
		int index = this.size - 1;
		while(index >= 0 && !(this.array[index].equals(o)))
		{
			index--;
		}
		return index;
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
				if (!hasNext())
				{
					throw new NoSuchElementException("Iterator has reached the end of this list");
				}
				E value = array[this.currentIndex];
				lastReturnedIndex = currentIndex;
				this.currentIndex++;
				return value;
			}

			@Override
			public boolean hasPrevious()
			{
				return this.currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if (!hasPrevious())
				{
					throw new NoSuchElementException("Iterator has reached the end of this list");
				}
				this.currentIndex--;
				lastReturnedIndex = currentIndex;
				return array[this.currentIndex];
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
			public void remove()
			{
				if (lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling remove()");
				}

				for (int i = lastReturnedIndex; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}

				array[size - 1] = null;

				size--;
				currentIndex = lastReturnedIndex;
				lastReturnedIndex = -1;
			}

			@Override
			public void set(E e)
			{
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				array[lastReturnedIndex] = e;
			}

			@Override
			public void add(E e)
			{
				for(int i = size; i > currentIndex; i--)
				{
					array[i] = array[i - 1];
				}

				array[currentIndex] = e;
				size++;
				currentIndex++;
				lastReturnedIndex = -1;
			}
		};
	}

	/**
	 * @param index the location at which to create the list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in this list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
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
				if (!hasNext())
				{
					throw new NoSuchElementException("Iterator has reached the end of this list");
				}
				E value = array[this.currentIndex];
				lastReturnedIndex = currentIndex;
				this.currentIndex++;
				return value;
			}

			@Override
			public boolean hasPrevious()
			{
				return this.currentIndex > 0;
			}

			@Override
			public E previous()
			{
				if (!hasPrevious())
				{
					throw new NoSuchElementException("Iterator has reached the end of this list");
				}
				this.currentIndex--;
				lastReturnedIndex = currentIndex;
				return array[this.currentIndex];
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
			public void remove()
			{
				if (lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling remove()");
				}

				for (int i = lastReturnedIndex; i < size - 1; i++)
				{
					array[i] = array[i + 1];
				}

				array[size - 1] = null;

				size--;
				currentIndex = lastReturnedIndex;
				lastReturnedIndex = -1;
			}

			@Override
			public void set(E e)
			{
				if(lastReturnedIndex == -1)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				array[lastReturnedIndex] = e;
			}

			@Override
			public void add(E e)
			{
				for(int i = size; i > currentIndex; i--)
				{
					array[i] = array[i - 1];
				}

				array[currentIndex] = e;
				size++;
				currentIndex++;
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
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		E removingValue = this.array[index];
		for(int i = index; i < this.size - 1; i++)
		{
			array[i] = array[i + 1];
		}
		this.size--;
		return removingValue;
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @throws NullPointerException if no Object is provided
	 * @return true if this list has been modified, false if the provided Object does not exist
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a value to find and remove the first occurrence of");
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
		for(int i = removingIndex; i < this.size - 1; i++)
		{
			array[i] = array[i + 1];
		}
		this.size--;
		return true;
	}

	/**
	 * @param c Collection of values to remove if found
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Removes from this list all of its elements that are contained in the specified collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a Collection of values to remove if found");
		}
		int i = 0;
		boolean modified = false;
		while(i < this.size)
		{
			if(c.contains(this.array[i]))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				i--;
				this.size--;
				modified = true;
			}
			i++;
		}
		return modified;
	}

	/**
	 * @param filter the condition that is needed to be satisfied to remove a value from this ArrayList
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Removes all of the elements of this collection that satisfy the given predicate.
	 */
	@Override
	public boolean removeIf(Predicate<? super E> filter)
	{
		if(filter == null)
		{
			throw new NullPointerException("The provided predicate cannot be null");
		}
		boolean modified = false;
		int i = 0;

		while(i < this.size)
		{
			if(filter.test(this.array[i]))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				this.size--;
				modified = true;
				i--;
			}
			i++;
		}
		return modified;
	}

	/**
	 * @param fromIndex the index, inclusive of which, to remove values from
	 * @param toIndex the index, exclusive of which, to remove values until
	 * @throws IndexOutOfBoundsException if either of the provided indices is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 && toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("Indices " + fromIndex + " and " + toIndex + " are out of bounds");
		}
		else if(fromIndex < 0)
		{
			throw new IndexOutOfBoundsException("Index " + fromIndex + " is out of bounds");
		}
		else if(toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + toIndex + " is out of bounds");
		}
		int numberOfTimesToRemove = toIndex - fromIndex;
		for(int i = 0; i < numberOfTimesToRemove; i++)
		{
			for(int j = fromIndex; j < this.size - 1; j++)
			{
				this.array[j] = this.array[j + 1];
			}
			this.size--;
		}
	}

	/**
	 * @param operator the operation to be performed on each value in this ArrayList
	 * @code Replaces each element of this list with the result of applying the operator to that element.
	 */
	@Override
	public void replaceAll(UnaryOperator<E> operator)
	{
		if(operator == null)
		{
			throw new NullPointerException("You MUST provide an operator, and the provided operator cannot be null");
		}
		for(int i = 0; i < this.size; i++)
		{
			this.array[i] = operator.apply(this.array[i]);
		}
	}

	/**
	 * @param c Collection of values to keep in this ArrayList
	 * @throws NullPointerException if no Collection is presented
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to keep if found in this ArrayList");
		}
		if(c.isEmpty())
		{
			this.size = 0;
			this.capacity = 10;
			this.array = (E[]) new Object[this.capacity];
			return true;
		}
		boolean modified = false;
		int i = 0;
		while(i < this.size)
		{
			if(!(c.contains(this.array[i])))
			{
				for(int j = i; j < this.size - 1; j++)
				{
					this.array[j] = this.array[j + 1];
				}
				this.size--;
				modified = true;
				i--;
			}
			i++;
		}
		return modified;
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a replacement value for the specific index");
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
	 * @param c the Comparator used to sort this ArrayList
	 * @code Sorts this list according to the order induced by the specified Comparator.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparator<? super E> c)
	{
		if(this.size <= 1)
		{
			return;
		}
		if(c == null)
		{
			c = (Comparator<? super E>) Comparator.naturalOrder();
		}
		E[] sortedArray = (E[]) Arrays.copyOf(this.array, this.size);
		System.arraycopy(sortedArray, 0, this.array, 0, this.size);
	}

	/**
	 * @return a late-binding and fail-fast Spliterator over the elements in this list
	 */
	@Override
	public Spliterator<E> spliterator()
	{
		return Spliterators.spliterator(this.array, 0, this.size, Spliterator.ORDERED);
	}

	/**
	 * @param fromIndex the location, inclusive of which, to create a sublist from
	 * @param toIndex to location, exclusive of which, to create a sublist from
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @return a subList containing values between fromIndex (inclusive of which) till toIndex (exclusive of which)
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 && toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("Indices " + fromIndex + " and " + toIndex + " are out of bounds");
		}
		else if(fromIndex < 0)
		{
			throw new IndexOutOfBoundsException("Index " + fromIndex + " is out of bounds");
		}
		else if(toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + toIndex + " is out of bounds");
		}
		ArrayList<E> list = new ArrayList<>();
		for(int i = fromIndex; i < toIndex; i++)
		{
			list.add(this.array[i]);
		}
		return list;
	}

	/**
	 * @return an array containing all the elements in this list in proper sequence (from first to last element)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a the array into which to copy values into
	 * @throws NullPointerException if no array is provided
	 * @return the array containing all the elements in this list in proper sequence (from first to last element)
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
	 * @return a String representation of this ArrayList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
