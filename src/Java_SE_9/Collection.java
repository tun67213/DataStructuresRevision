package src.Java_SE_9;

import java.util.stream.Stream;
import java.util.function.Predicate;
import java.util.Spliterator;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements the Collection Object for Java SE 9.
 */
public interface Collection<E> extends Iterable<E>
{
	/**
	 * @param e the value to be added to this Collection
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added, false otherwise
	 * @code Ensures that this collection contains the specified element.
	 */
	boolean add(E e);

	/**
	 * @param c Collection of values to add to the end of this Collection
	 * @throws NullPointerException if the provided Collection variable is 'null' or the provided Collection contains any values defined as 'null'
	 * @return true if this Collection has been modified, false otherwise
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this collection.
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @throws NullPointerException if no Object is provided or the provided Object is 'null'
	 * @return true if the provided value was found, false otherwise
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no Collection of values is provided
	 * @return false if a value in the provided Collection is null or not found in this Collection, true otherwise
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with this Collection for equality
	 * @throws NullPointerException if no Object is provided
	 * @return true if this Collection is equal to the provided Object, false otherwise
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
	 * @param o the Object to find the first occurrence of
	 * @return false if the provided Object is null or not found, true if the first occurrence has been successfully removed
	 * @code Removes a single instance of the specified element from this collection, if it is present.
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if found in this Collection
	 * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is null
	 * @return true if this Collection has been modified, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param filter the condition to abide to
	 * @throws NullPointerException if no filter is provided
	 * @return true if at least one value has been removed from this list, false otherwise
	 * @code Removes all of the elements of this collection that satisfy the given predicate.
	 */
	default boolean removeIf(Predicate<? super E> filter)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param c Collection of values to keep if found in this Collection
	 * @throws NullPointerException if no Collection variable is provided
	 * @return true if this Collection has been modified, false otherwise
	 * @code Retains only the elements in this collection that are contained in the specified collection.
	 */
	boolean retainAll(Collection<?> c);

	/**
	 * @return the number of elements in this collection
	 */
	int size();

	/**
	 * @return a Spliterator over the elements in this collection
	 */
	@Override
	default Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an array containing all of the elements in this collection
	 */
	Object[] toArray();

	/**
	 * @param a an array into which to copy values from this Collection into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this collection
	 * @code Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.
	 */
	<T> T[] toArray(T[] a);
}
