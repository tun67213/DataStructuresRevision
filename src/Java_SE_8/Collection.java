package src.Java_SE_8;

import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements a Collection
 */
public interface Collection<E> extends Iterable<E>
{
	/**
	 * @param e the value to be added to this collection
	 * @throws NullPointerException it no value is provided
	 * @return true if the provided value has been successfully added
	 * @code Ensures that this collection contains the specified element.
	 */
	boolean add(E e);

	/**
	 * @param c Collection of values to add to the specified collection
	 * @throws NullPointerException if no Collection is provided, or the provided Collection has null values
	 * @return true if this Collection has been modified, false otherwise
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all of the elements from this collection.
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @throws NullPointerException if no Object is provided
	 * @return true if this Collection contains the specified Object, false otherwise
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this Collection contains all the elements in the provided Collection, false otherwise (including if the provided Collection contains null values)
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o Object to compare with this Collection
	 * @throws NullPointerException if no Object is provided or the provided variable is defined as 'null'
	 * @return true if this Collection is an exact replica of the provided Object, false otherwise
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
		throw new UnsupportedOperationException();
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @throws NullPointerException if no Object is provided
	 * @return true if this Collection has been modified, false otherwise
	 * @code Removes a single instance of the specified element from this collection, if it is present.
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if existent in this Collection
	 * @throws NullPointerException if the provided Collection is null
	 * @return true if this Collection has been modified, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param filter the condition to sort this list by
	 * @return true if this Collection has been modified, false otherwise
	 * @code Removes all of the elements of this collection that satisfy the given predicate.
	 */
	default boolean removeIf(Predicate<? super E> filter)
	{
		throw new UnsupportedOperationException();
	}

	/**
	 * @param c Collection of values to keep if found in this Collection
	 * @throws NullPointerException if no variable is provided or the provided variable is defined as null
	 * @return true if this Collection has been modified, false otherwise
	 */
	boolean retainAll(Collection<?> c);

	/**
	 * @return the number of elements in this collection
	 */
	int size();

	/**
	 * @return a Spliterator over the elements in this collection
	 */
	default Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException();
	}

	/**
	 * @return a sequential Stream with this collection as its source
	 */
	default Stream<E> stream()
	{
		throw new UnsupportedOperationException();
	}

	/**
	 * @return an array containing all the elements in this collection
	 */
	Object[] toArray();

	/**
	 * @param a an array to copy values in this Collection into and return
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with the values from this Collection overridden into it
	 */
	<T> T[] toArray(T[] a);
}
