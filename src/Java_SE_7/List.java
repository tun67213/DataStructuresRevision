package Java_SE_7;

import java.util.Objects;
import java.util.function.UnaryOperator;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with List for Java SE 7.
 */
public interface List<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has successfully been added
	 * @code Appends the specified element to the end of this list
	 */
	@Override
	boolean add(E e);

	/**
	 * @param index the location at which to add the specified value
	 * @param element the value to add to this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	void add(int index, E element);

	/**
	 * @param c Collection of values to add to the end of this list
	 * @throws NullPointerException if no collection is provided, the provided collection variable is defined as null, or the provided collection contains null values
	 * @return true if all the values have been added, false if the provided collection is empty
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @param index the location from which to start adding values into this list
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided, the provided collection variable is defined as null, or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if all the values have been added, false if the provided collection is empty
	 * @code Inserts all of the elements in the specified collection into this list at the specified position.
	 */
	boolean addAll(int index, Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this list.
	 */
	@Override
	void clear();

	/**
	 * @return true if this list contains the specified element, false otherwise
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of
	 * @throws NullPointerException if no collection is provided or the provided collection is null
	 * @return true if all the values in the provided collection are in this list, false otherwise
	 * @code Returns true if this list contains all of the elements of the specified collection.
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with this list
	 * @return true if the provided Object's hashcode is the same as this list's hashcode, false otherwise
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	boolean equals(Object o);

	/**
	 * @param index the location at which to retrieve a value
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
	 * @param o the Object to find the existence of
	 * @return the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
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
	 * @param o the Object to find the existence of
	 * @return the index of the last occurrence of the specified element
	 */
	int lastIndexOf(Object o);

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	ListIterator<E> listIterator();

	/**
	 * @param index the location from which to create this list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	ListIterator<E> listIterator(int index);

	/**
	 * @param index the location from which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index before removal
	 * @code Removes the element at the specified position in this list.
	 */
	E remove(int index);

	/**
	 * @param o the Object to remove the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if contained in this list
	 * @throws NullPointerException if no collection is provided or the provided collection variable is defined as null
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes from this list all of its elements that are contained in the specified collection (optional operation).
	 */
	@Override
	boolean removeAll(Collection<?> c);

	/**
	 * @param c Collection of values to keep if existent in this list
	 * @throws NullPointerException if no collection is provided or the provided collection si null
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	boolean retainAll(Collection<?> c);

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value
	 * @throws NullPointerException if no value is provided or the provided value is null
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
	 * @param fromIndex the index (inclusive of which) to create this sublist from
	 * @param toIndex the index (exclusive of which) to create this sublist until
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
	 * @param a an array of type T whose runtime we must mimic
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 * @throws NullPointerException if no array is provided
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@Override
	<T> T[] toArray(T[] a);
}
