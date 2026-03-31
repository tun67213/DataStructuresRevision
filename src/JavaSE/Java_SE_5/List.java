package Java_SE_5;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements List for Java SE 5.
 */
public interface List<E> extends Collection<E>
{
	/**
	 * @param o the element to add to this List
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has successfully been added
	 * @code Appends the specified element to the end of this list (optional operation).
	 */
	@Override
	boolean add(E o);

	/**
	 * @param index the location at which to add a value into this list
	 * @param element the value to add to the specified index in this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list (optional operation).
	 */
	void add(int index, E element);

	/**
	 * @param c Collection of values to add to the end of this list
	 * @throws NullPointerException if no collection is provided, the provided variable for the collection is defined as null, or the provided collection contains null values
	 * @return true if all the values in the provided collection have been added, false if the provided collection is empty
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator (optional operation).
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @param index the location at which to start adding values from
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided, the provided variable for the collection is defined as null, or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if all the values in the provided collection have been added, false if the provided collection is empty
	 * @code Inserts all of the elements in the specified collection into this list at the specified position (optional operation).
	 */
	boolean addAll(int index, Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this list (optional operation).
	 */
	@Override
	void clear();

	/**
	 * @param o the Object to find the existence of in this list
	 * @return true if the provided Object is non-null and contained in this list, false if null or not contained in this list
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this list
	 * @throws NullPointerException if no collection is provided or the provided collection variable is defined as null
	 * @return true if the provided collection is empty or all values in the collection are contained in this list, false if the provided collection contains null values or values not contained in this list
	 * @code Returns true if this list contains all of the elements of the specified collection.
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare this list with
	 * @throws NullPointerException if no Object is provided
	 * @return true if this list is an exact match to the provided Object, false otherwise
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
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object, or -1 if the provided Object is null or not found in this list
	 * @code Returns the index in this list of the first occurrence of the specified element, or -1 if this list does not contain this element.
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
	 * @return the location of the last occurrence of the specified Object, or -1 if the provided Object is null or not found in this list
	 * @code Returns the index in this list of the last occurrence of the specified element, or -1 if this list does not contain this element.
	 */
	int lastIndexOf(Object o);

	/**
	 * @return a list iterator of the elements in this list (in proper sequence)
	 */
	ListIterator<E> listIterator();

	/**
	 * @param index the location from which to create this list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator of the elements in this list (in proper sequence), starting at the specified position in this list
	 */
	ListIterator<E> listIterator(int index);

	/**
	 * @param index the location from which to remove a value from in this list
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value removed from the specified index
	 * @code Removes the element at the specified position in this list (optional operation).
	 */
	E remove(int index);

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence in this list of the specified element (optional operation).
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if contained in this list
	 * @throws NullPointerException if no collection variable is provided or the provided variable is defined as null
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes from this list all the elements that are contained in the specified collection (optional operation).
	 */
	@Override
	boolean removeAll(Collection<?> c);

	/**
	 * @param c Collection of values to retain if contained in this list
	 * @throws NullPointerException if no collection variable is provided or the provided variable is defined as null
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection (optional operation).
	 */
	@Override
	boolean retainAll(Collection<?> c);

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this list
	 * @code Replaces the element at the specified position in this list with the specified element (optional operation).
	 */
	E set(int index, E element);

	/**
	 * @return the number of elements in this list
	 */
	@Override
	int size();

	/**
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until which to create this subList
	 * @throws IndexOutOfBoundsException if either or both indices is/are out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	List<E> subList(int fromIndex, int toIndex);

	/**
	 * @return an array containing all of the elements in this list in proper sequence
	 */
	@Override
	Object[] toArray();

	/**
	 * @param a an array of type T whose runtime this array must mimic
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this list in proper sequence
	 * @code Returns an array containing all of the elements in this list in proper sequence; the runtime type of the returned array is that of the specified array.
	 */
	@Override
	<T> T[] toArray(T[] a);
}
