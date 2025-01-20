package src.Java_SE_10;

import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Collection<E> extends Iterable<E>
{
	/**
	 * @param e the value to be added to this Collection
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value was successfully added
	 * @code Ensures that this collection contains the specified element.
	 */
	boolean add(E e);

	/**
	 * @param c Collection of values to add to this Collection
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @return true if this Collection has been modified, false otherwise
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this collection.
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @return false if the Object is null or not found, true if found
	 * @code Returns true if this collection contains the specified element.
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no Collection is provided or the provided variable is 'null'
	 * @return true if all the values were found, false if a value was not found, or is simply null
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with this Object for equality
	 * @return false if the provided Object is null or not an exact match, true otherwise
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
	 * @return a possibly parallel Stream with this collection as its source
	 */
	default Stream<E> parallelStream()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param o the Object to find and remove
	 * @return false if the provided Object is null or not found, true if found and removed
	 * @code Removes a single instance of the specified element from this collection, if it is present.
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if found
	 * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is 'null'
	 * @return true if this Collection has been modified, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param filter the condition to satisfy to be eligible for removal
	 * @throws NullPointerException if no filter is provided
	 * @return true if at least one value has been removed, false otherwise
	 * @code Removes all of the elements of this collection that satisfy the given predicate.
	 */
	default boolean removeIf(Predicate<? super E> filter)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to keep if found in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return true if at least one value has been removed, false otherwise
	 * @code Retains only the elements in this collection that are contained in the specified collection.
	 */
	boolean retainAll(Collection<?> c);

	/**
	 * @return the number of elements in this collection
	 */
	int size();

	/**
	 * @return a spliterator over the elements in this collection
	 */
	@Override
	default Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return a sequential Stream with this collection as its source
	 */
	default Stream<E> stream()
	{
		throw new UnsupportedOperationException("Not supported.");
	}

	/**
	 * @return an array containing all of the elements in this collection
	 */
	Object[] toArray();

	/**
	 * @param a an array of elements of type T into which to copy values
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this Collection copied into it
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	<T> T[] toArray(T[] a);
}
