package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements List for Java SE 6
 */
public interface List<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if this List has been structurally modified, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param index the location at which to add the specified element
	 * @param element the value to be added to the specified index in this List
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	void add(int index, E element);

	/**
	 * @param c Collection of values to add to the end of this List
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @return false if the provided Collection is empty, true if the Collection contains non-null values
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @param index the location at which to start adding values from
	 * @param c Collection of values to add to this List, starting at the specified index
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return false if the provided Collection is empty, true if the Collection contains non-null values
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
	 * @return false if the Object is 'null' or not found
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this List
	 * @throws NullPointerException if no Collection is provided
	 * @return true if all values in this Collection are found in this List, false otherwise
	 * @code Returns true if this list contains all of the elements of the specified collection.
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with for equality
	 * @return false if the provided Object is null or not equal, true if exactly equal
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
	 * @return the first occurrence of the specified Object or -1 if the Object was 'null' or not found
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
	 * @param o the Object to find the location of the last occurrence of
	 * @return the last occurrence of the specified Object or -1 if the Object was 'null' or not found
	 */
	int lastIndexOf(Object o);

	/**
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	ListIterator<E> listIterator();

	/**
	 * @param index the location at which to create this list iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator of the elements in this list (in proper sequence), starting at the specified position in this list
	 */
	ListIterator<E> listIterator(int index);

	/**
	 * @param index the location from which to remove a value
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value at the specified index before removal
	 * @code Removes the element at the specified position in this list.
	 */
	E remove(int index);

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is 'null' or not found, true if found and removed
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if found in this List
	 * @throws NullPointerException if no Collection was provided or the provided Collection value was 'null'
	 * @return true if this List has been modified, false otherwise
	 * @code Removes from this list all of its elements that are contained in the specified collection.
	 */
	@Override
	boolean removeAll(Collection<?> c);

	/**
	 * @param c Collection of values to keep if found in this List
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	boolean retainAll(Collection<?> c);

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no element is provided or the provided element is 'null'
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
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until which to create this subList
	 * @throws IndexOutOfBoundsException if either of these indices is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	List<E> subList(int fromIndex, int toIndex);

	/**
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
	@Override
	Object[] toArray();

	/**
	 * @param a the array of type T into which to copy values into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this array allocated into it
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@Override
	<T> T[] toArray(T[] a);
}
