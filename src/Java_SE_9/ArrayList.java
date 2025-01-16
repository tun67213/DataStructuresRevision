package src.Java_SE_9;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.Comparator;
import java.util.Spliterator;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class implements the methods associated with ArrayList for Java SE 9.
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
	 * @param initialCapacity the initial capacity to create this ArrayList with
	 * @throws IllegalArgumentException if the provided initial capacity is negative
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
	 * @param c Collection of values to initialize this ArrayList with
	 * @throws NullPointerException if the provided Collection is null
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	@SuppressWarnings("unchecked")
	public ArrayList(Collection<? extends E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to initialize this ArrayList with");
		}
		Collection<? extends E> collectionToCopy = c;
		Iterator<? extends E> iteratorOne = collectionToCopy.iterator();
		Iterator<? extends E> iterator = c.iterator();
		while(iteratorOne.hasNext())
		{
			E value = iteratorOne.next();
			if(value == null)
			{
				throw new NullPointerException("You MUST provide a non-null collection of non-null values to initialize this ArrayList with");
			}
		}
		this.size = 0;
		this.capacity = c.size() + c.size() / 2;
		this.array = (E[]) new Object[this.capacity];
		while(iterator.hasNext())
		{
			this.array[size++] = iterator.next();
		}
	}

	/**
	 * @code This method ensures that the array representing this ArrayList has enough space to hold more elements. If space is full, it reallocates to a bigger array.
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
	@SuppressWarnings("unchecked")
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
	 * @param action the action to be performed on each value
	 * @throws NullPointerException if no action is provided
	 * @code Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
	 */
	@Override
	public void forEach(Consumer<? super E> action)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	@Override
	public E get(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the provided Object is null or not found
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
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	public Iterator<E> iterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the provided Object is null or not found
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start the list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is 'null', true if at least one value has been removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to remove if contained in this ArrayList
	 * @throws NullPointerException if no Collection of values is provided
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Removes from this list all of its elements that are contained in the specified collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param filter the condition to satisfy for removal
	 * @throws NullPointerException if no filter is provided
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Removes all of the elements of this collection that satisfy the given predicate.
	 */
	@Override
	public boolean removeIf(Predicate<? super E> filter)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the index, inclusive of which, to remove from
	 * @param toIndex the index, exclusive of which, to remove until
	 * @throws IndexOutOfBoundsException if either of the provided indices is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param operator the operation that needs to be performed on each item in this ArrayList
	 * @code Replaces each element of this list with the result of applying the operator to that element.
	 */
	@Override
	public void replaceAll(UnaryOperator<E> operator)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to keep if found in this ArrayList
	 * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is defined as 'null'
	 * @return true if this ArrayList has been modified in any way
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace an element
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
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
	 * @param c Comparator to sort this ArrayList using
	 * @throws NullPointerException if no Comparator is provided
	 * @code Sorts this list according to the order induced by the specified Comparator.
	 */
	@Override
	public void sort(Comparator<? super E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a late-binding and fail-fast Spliterator over the elements in this list.
	 */
	@Override
	public Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until, exclusive of, which to create this subList
	 * @throws IndexOutOfBoundsException if either of the provided indices is out of bounds
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
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a an array of type T into which to copy values from this ArrayList into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
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
	 * @return a readable String of this ArrayList for the user to see
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
