package src.Java_SE_8;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements a List
 */
public interface List<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to the end of this List
	 * @throws NullPointerException if no value is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param index location at which to add the specified element
	 * @param element the value to be added to the specified index in this List
	 * @throws NullPointerException if no element is provided or a null value is provided as the element
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds, i.e., index is less than 0 or index is greater than the size of the list
	 * @code Inserts the specified element at the specified position in this list.
	 */
	void add(int index, E element);

	/**
	 * @param c Collection of values to add to the end of this List
	 * @throws NullPointerException if no Collection is provided, the provided Collection variable is null, or the Collection variable has null values
	 * @return true if this List has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @param index the location at which to start adding the Collection of values from
	 * @param c Collection of values to add to this List, starting at the specified index
	 * @throws NullPointerException if no Collection is provided, or the provided Collection contains null values
	 * @return true if this List has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list at the specified position.
	 */
	boolean addAll(int index, Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	void clear();

	/**
	 * @param o the Object to find the existence of in this List
	 * @throws NullPointerException if no value is provided or the provided variable is null
	 * @return true if this List contains the specified element, false otherwise
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this List
	 * @throws NullPointerException if no Collection variable is provided
	 * @return true if all elements in the provided Collection have been found, false if a value is 'null' or not found
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare for equality with this List
	 * @throws NullPointerException if no Object is provided
	 * @return true if the provided Object is a replica of this List, false otherwise
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	boolean equals(Object o);

	/**
	 * @param index the location at which to retrieve a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the element at the specified position in this list
	 */
	E get(int index);

	/**
	 * @return the hash code value for this list
	 */
	@Override
	int hashCode();

	/**
	 * @param o the Object to find the location of the first occurrence of
	 * @throws NullPointerException if no value is provided
	 * @return the location of the first occurrence of the specified Object or -1 if not found
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
	 * @param o the Object to find the location of the last occurrence of
	 * @throws NullPointerException if no value is provided
	 * @return the location of the last occurrence of the specified Object or -1 if not found
	 */
	int lastIndexOf(Object o);

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	ListIterator<E> listIterator();

	/**
	 * @param index the location at which to create the list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified index
	 */
	ListIterator<E> listIterator(int index);

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	E remove(int index);

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @throws NullPointerException if no Object is provided or the provided Object is 'null'
	 * @return true if this List has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if found
	 * @throws NullPointerException if no Collection variable is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Removes any values in this List that are contained in the provided Collection, returning true if this List has been modified.
	 */
	@Override
	boolean removeAll(Collection<?> c);

	/**
	 * @param operator the task to be done to each value in this List
	 * @code Replaces each element of this list with the result of applying the operator to that element.
	 */
	default void replaceAll(UnaryOperator<E> operator)
	{

	}

	/**
	 * @param c Collection of values to keep if found in this List
	 * @throws NullPointerException if no Collection variable is provided
	 * @return true if this List has been modified (i.e. at least one value has been removed), false otherwise
	 */
	@Override
	boolean retainAll(Collection<?> c);

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value has been specified
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	E set(int index, E element);

	/**
	 * @return the number of elements in this list
	 */
	@Override
	int size();

	/**
	 * @code Sorts this list according to the order induced by the specified Comparator.
	 */
	default void sort(Comparator<? super E> c)
	{

	}

	/**
	 * @return a Spliterator over the elements in this list
	 */
	default Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException();
	}

	/**
	 * @param fromIndex the index, inclusive of which, to start creating the subList from
	 * @param toIndex the index, exclusive of which, to create the subList until
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
	 * @param a an array into which to copy all the values from this List into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this List copied into
	 */
	@Override
	<T> T[] toArray(T[] a);
}
