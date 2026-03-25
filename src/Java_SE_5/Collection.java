package Java_SE_5;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements Collection for Java SE 5.
 */
public interface Collection<E> extends Iterable<E>
{
	/**
	 * @param o the value to add to the end of this collection
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the provided value has been successfully added
	 * @code Ensures that this collection contains the specified element (optional operation).
	 */
	boolean add(E o);

	/**
	 * @param c Collection of values to add to the end of this Collection
	 * @throws NullPointerException if no collection variable is provided, the provided variable is defined as null, or the provided collection contains null values
	 * @return true if the collection's values are successfully added, false if the provided collection is empty
	 * @code Adds all of the elements in the specified collection to this collection (optional operation).
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this collection (optional operation).
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @return true if the provided Object is non-null and existent in this collection, false if null or non-existent in this collection
	 * @code Returns true if this collection contains the specified element.
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no collection variable is provided or the provided collection variable is defined as null
	 * @return true if all the values in the provided collection are non-null and contained in this collection, false otherwise
	 * @code Returns true if this collection contains all of the elements in the specified collection.
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with this collection for equality
	 * @return true if the collections are equal, false otherwise
	 * @code Compares the specified object with this collection for equality.
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
	 * @param o the Object to find the first occurrence of
	 * @return true if this collection has been structurally modified, false otherwise
	 * @code Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if contained in this collection
	 * @return true if this collection has been structurally modified, false otherwise
	 * @code Removes all this collection's elements that are also contained in the specified collection (optional operation).
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param c Collection of values to retain if contained in this collection
	 * @return true if this collection has been structurally modified, false otherwise
	 * @code Retains only the elements in this collection that are contained in the specified collection (optional operation).
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
	 * @param a an array of type T into which to copy values from this collection into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this collection
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	<T> T[] toArray(T[] a);
}
