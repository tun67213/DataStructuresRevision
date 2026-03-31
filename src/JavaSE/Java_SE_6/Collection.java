package Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with Collection for Java SE 6.
 */
public interface Collection<E> extends Iterable<E>
{
	/**
	 * @param e the value to be added into this collection
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has been successfully added
	 * @code Ensures that this collection contains the specified element (optional operation).
	 */
	boolean add(E e);

	/**
	 * @param c Collection of values to add to the end of this collection
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @return true if this collection has been modified, false otherwise
	 * @code Adds all of the elements in the specified collection to this collection (optional operation).
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this collection (optional operation).
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this collection
	 * @return true if the provided Object is non-null and existent, false otherwise
	 * @code Returns true if this collection contains the specified element.
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this collection
	 * @return true if the provided collection contains non-null and existent values, false if a value is either null or not contained in this collection
	 * @code Returns true if this collection contains all of the elements in the specified collection.
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with this for equality
	 * @return true if both are an exact match, false otherwise
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
	 * @return an iterator over the elements in this list
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return true if the provided Object is non-null, found, and removed, false if null or not found in this list
	 * @code Removes a single instance of the specified element from this collection, if it is present (optional operation).
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if contained in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if this collection has been structurally modified, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection (optional operation).
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param c Collection of values to retain if contained in this list
	 * @throws NullPointerException if no collection is provided
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
	 * @param a an array of type T whose runtime the returning array should mimic
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this collection
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	<T> T[] toArray(T[] a);
}
