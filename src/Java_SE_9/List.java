package src.Java_SE_9;

import java.util.Comparator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements the List Object for Java SE 9.
 */
public interface List<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param index the location at which to add the specified value into this list
	 * @param element the value to be added to the specified index in this list
	 * @throws NullPointerException if no value was provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	void add(int index, E element);

	/**
	 * @param c Collection of values to add to the end of this List
	 * @throws NullPointerException if no Collection variable is provided or the provided Collection contains null values
	 * @return true if this List has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list at the specified position.
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @param index the location at which to start adding values into this List
	 * @param c Collection of values to add to the end of this List
	 * @throws NullPointerException if no Collection variable is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this List has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	boolean addAll(int index, Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	void clear();

	/**
	 * @param o the Object to find the existence of in this List
	 * @return true if this list contains the specified element, false if the provided element is null or not found
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this List
	 * @throws NullPointerException if no Collection is provided
	 * @return true if the Collection contains no null values and has all elements contained int his List
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with for equality
	 * @throws NullPointerException if the provided Object is null
	 * @return true if the provided Object equals this List, false otherwise
	 */
	@Override
	boolean equals(Object o);

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 */
	E get(int index);

	/**
	 * @return the hash code value for this list
	 */
	@Override
	int hashCode();

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the provided Object or -1 if the provided Object is null or not found
	 */
	int indexOf(Object o);

	/**
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	boolean isEmpty();

	/**
	 * @return an iterator over the elements in this list in proper sequence
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the provided Object or -1 if the provided Object is null or not found
	 */
	int lastIndexOf(Object o);

	/**
	 * @return a list iterator over the elements in this list
	 */
	ListIterator<E> listIterator();

	/**
	 * @param index the location at which to start creating the list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	ListIterator<E> listIterator(int index);

	/**
	 * @return an immutable list containing zero elements
	 */
	static <E> List<E> of(E... elements)
	{
		List<E> list = new ArrayList<E>();
		for(E e : elements)
		{
			list.add(e);
		}
		return list;
	}

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Removes the element at the specified position in this list.
	 */
	E remove(int index);

	/**
	 * @param o the Object to find the first occurrence of
	 * @throws NullPointerException if no Object is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @param c Collection of values to find the first occurrence of
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Removes ALL occurrences of values found in the provided Collection.
	 */
	@Override
	boolean removeAll(Collection<?> c);

	/**
	 * @param operator the operation to be performed on all values
	 * @throws NullPointerException if no operation is provided
	 * @code Replaces each element of this list with the result of applying the operator to that element.
	 */
	default void replaceAll(UnaryOperator<E> operator)
	{
		throw new UnsupportedOperationException("Not supported for this interface");
	}

	/**
	 * @param c Collection of values to keep if found in this List
	 * @throws NullPointerException if the provided Collection variable is null
	 * @return true if this List has been modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	boolean retainAll(Collection<?> c);

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the provided index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	E set(int index, E element);

	/**
	 * @return the number of elements in this list
	 */
	@Override
	int size();

	/**
	 * @param c Comparator variable to sort this List by
	 * @throws NullPointerException if no variable is provided
	 * @code Sorts this list according to the order induced by the specified Comparator.
	 */
	default void sort(Comparator<? super E> c)
	{
		throw new UnsupportedOperationException("Not supported for this interface");
	}

	/**
	 * @return a Spliterator over the elements in this list
	 * @code Creates a Spliterator over the elements in this list.
	 */
	default Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported for this interface");
	}

	/**
	 * @param fromIndex the index (inclusive of which) to create the sub List from
	 * @param toIndex the index (exclusive of which) to create the sub List until
	 * @throws IndexOutOfBoundsException if either of the provided indices is out of bounds
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
	 * @param a an array of type T into which to copy all values from this Array into
	 * @throws NullPointerException if no array is provided
	 * @return the array of type T with values from this List accommodated into it
	 */
	@Override
	<T> T[] toArray(T[] a);
}
