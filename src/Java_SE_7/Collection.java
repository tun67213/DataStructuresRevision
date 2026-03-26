package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with Collection for Java SE 7.
 */
public interface Collection<E> extends Iterable<E>
{
	/**
	 * @param e the value to be added to this collection
	 * @return true if the value has successfully been added to this collection
	 * @code Ensures that this collection contains the specified element (optional operation).
	 */
	boolean add(E e);

	/**
	 * @param c Collection of values to add to the end of this collection
	 * @return true if this collection has been modified
	 *    	   false if the provided collection is empty
	 * @throws NullPointerException if no collection is provided
	 * @code Adds all of the elements in the specified collection to this collection (optional operation).
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this collection (optional operation).
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this collection
	 * @return true if this collection contains the provided object
	 * 		   false if the provided object is null or not contained in this collection
	 * @code Returns true if this collection contains the specified element.
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of
	 * @return true if this collection contains all of the elements in the specified collection
	 * 		   false otherwise
	 * @code Returns true if this collection contains all of the elements in the specified collection.
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o Object to compare with this object
	 * @return true if the provided Object is the same as this collection
	 * false otherwise
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
	 * @return true if this collection contains no elements
	 * 		   false otherwise
	 */
	boolean isEmpty();

	/**
	 * @return an iterator over the elements in this collection
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param o the Object to find in this collection
	 * @return true if this collection has been modified
	 * 		   false otherwise
	 * @code Removes a single instance of the specified element from this collection, if it is present.
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if contained in this collection
	 * @throws NullPointerException if no collection is provided
	 * @return true if this collection has been structurally modified
	 * 		   false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param c Collection of values to retain
	 * @throws NullPointerException if no collection is provided
	 * @return true if this collection has been structurally modified
	 * 		   false otherwise
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
	 * @param a an array of type T whose runtime the returning array must mimic
	 * @throw NullPointerException if no array is provided
	 * @return an array containing all of the elements in this collection
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	<T> T[] toArray(T[] a);
}
