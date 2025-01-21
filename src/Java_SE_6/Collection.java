package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements Collection for Java SE 6
 */
public interface Collection<E> extends Iterable<E> {
	/**
	 * @param e the value to be added to this Collection
	 * @return true if the provided value has been successfully added
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Ensures that this collection contains the specified element.
	 */
	boolean add(E e);

	/**
	 * @param c Collection of values to add to this Collection
	 * @return true if this Collection has been modified, false otherwise
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @code Adds all of the elements in the specified collection to this collectio
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all the elements from this collection.
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @return true if the provided Object is found, false if the provided Object is null or not found
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @return false if the provided Collection contains null values or has a value not contained in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @code Returns true if this collection contains all of the elements in the specified collection.
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with this collection
	 * @return false if the provided Object is null or not equal, true otherwise
	 */
	@Override
	boolean equals(Object o);

	/**
	 * @return the hash code value for this collection
	 */
	@Override
	int hashCode();

	/**
	 * @return true if this collection contains no elements, false otherwise
	 */
	boolean isEmpty();

	/**
	 * @return an iterator over the elements in this collection
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param o the Object to find and remove in this Collection
	 * @return false if the provided Object is null or not found, true if found and removed
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if found in this Collection
	 * @throws NullPointerException if no Collection is provided or the provided variable is defined as 'null'
	 * @return true if at least one value has been removed from this Collection, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param c Collection of values to keep if found in this Collection
	 * @throws NullPointerException if no Collection is provided or the provided variable is defined as 'null'
	 * @return true if this Collection has been structurally modified, false otherwise
	 * @code Retains only the elements in this collection that are contained in the specified collection.
	 */
	boolean retainAll(Collection<?> c);

	/**
	 * @return the number of elements in this collection
	 */
	int size();

	/**
	 * @return an array containing all of the elements in this collection
	 */
	Object[] toArray();

	/**
	 * @param a an array into which to copy values into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this collection
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	<T> T[] toArray(T[] a);
}
