package src.Java_SE_10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface List<E> extends Collection<E>
{
	/**
	 * @param index the location at which to add the specified element
	 * @param element the value to add to the specified location in this List
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	void add(int index, E element);

	/**
	 * @param e the value to add to the end of this List
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has been successfully added to the end of this List
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param index the location from which to start adding values
	 * @param c Collection of values to add to the specified index
	 * @throws NullPointerException if no Collection variable is provided, the provided variable is defined as 'null', or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this List has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list at the specified position.
	 */
	boolean addAll(int index, Collection<? extends E> c);

	/**
	 * @param c Collection of values to add to the end of this List
	 * @throws NullPointerException if no Collection variable is provided, the provided variable is defined as 'null', or the provided Collection contains null values
	 * @return true if this List has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	void clear();

	/**
	 * @param o the Object to find the existence of in this List
	 * @return false if the Object is null or not found, true if found
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this List
	 * @throws NullPointerException if no Collection is provided
	 * @return false if a value in the Collection is null or not in this List, true otherwise
	 * @code Returns true if this list contains all of the elements of the specified collection.
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @param coll Collection from which to create a new List
	 * @throws NullPointerException if no Collection is provided
	 * @return an unmodifiable List containing the elements of the given Collection, in its iteration order
	 */
	static <E> List<E> copyOf(Collection<? extends E> coll)
	{
		List<E> list = new ArrayList<>();
		Iterator<? extends E> iterator = coll.iterator();
		while(iterator.hasNext())
		{
			list.add(iterator.next());
		}
		return list;
	}

	/**
	 * @param o the Object to compare this List with for equality
	 * @return false if the provided Object is not equal to this List in any way, true otherwise
	 */
	@Override
	boolean equals(Object o);

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the provided index
	 */
	E get(int index);

	/**
	 * @return the hash code value for this list
	 */
	@Override
	int hashCode();

	/**
	 * @param o the Object to find the existence of
	 * @return the location of the first occurrence of the provided Object or -1 if the Object is 'null' or not found
	 */
	int indexOf(Object o);

	/**
	 * @return true if this List contains no elements, false otherwise
	 */
	@Override
	boolean isEmpty();

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param o the Object to find the existence of
	 * @return the location of the last occurrence of the provided Object or -1 if the Object is 'null' or not found
	 */
	int lastIndexOf(Object o);

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	ListIterator<E> listIterator();

	/**
	 * @param index the location from which to create this ListIterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	ListIterator<E> listIterator(int index);

	/**
	 * @return an immutable list containing zero elements
	 */
	static <E> src.Java_SE_9.List<E> of(E... elements)
	{
		src.Java_SE_9.List<E> list = new src.Java_SE_9.ArrayList<E>();
		for(E e : elements)
		{
			list.add(e);
		}
		return list;
	}

	/**
	 * @param index the location from which to remove a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	E remove(int index);

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is null or not found, true if found and removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if foudn in this List
	 * @return true if this list has been modified, false otherwise
	 * @code Removes from this list all of its elements that are contained in the specified collection.
	 */
	@Override
	boolean removeAll(Collection<?> c);

	/**
	 * @param operator the operation to be performed on all values
	 * @throws NullPointerException if no operator is provided
	 * @code Replaces each element of this list with the result of applying the operator to that element.
	 */
	default void replaceAll(UnaryOperator<E> operator)
	{

	}

	/**
	 * @param c Collection of values to keep if found in this List
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	boolean retainAll(Collection<?> c);

	/**
	 * @param index the location at which to set a value
	 * @param element the value to be set for the specified location
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value that was previously at the specified location
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	E set(int index, E element);

	/**
	 * @return the number of elements in this list
	 */
	@Override
	int size();

	/**
	 * @param c Collection to sort by
	 * @throws NullPointerException if no Collection is provided
	 * @code Sorts this list according to the order induced by the specified Comparator.
	 */
	@SuppressWarnings("unchecked")
	default void sort(Comparator<? super E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("Comparator cannot be null");
		}
		Object[] array = this.toArray();
		Arrays.sort(array, (Comparator) c);
		this.clear();
		for(Object element : array)
		{
			this.add((E) element);
		}
	}

	/**
	 * @return a Spliterator over the elements in this list
	 */
	default Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param fromIndex the location from which to create this list
	 * @param toIndex the location until which to create this list
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	List<E> subList(int fromIndex, int toIndex);

	/**
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
	@Override
	Object[] toArray();

	/**
	 * @param a array of type T into which to copy all values from this List into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array of type T, with all values from this array allocated into it
	 */
	@Override
	<T> T[] toArray(T[] a);
}
