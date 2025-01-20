package src.Java_SE_11;

import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public interface Collection<E> extends Iterable<E>
{
	/**
	 * @param e the value to be added to this Collection
	 * @throws NullPointerException if no value is provided
	 * @return true if the provided value has been successfully added
	 * @code Ensures that this collection contains the specified element.
	 */
	boolean add(E e);

	/**
	 * @param c Collection of values to add to the end of this Collection
	 * @throws NullPointerException if no Collection is provided, the provided Collection is 'null', or the provided Collection contains 'null' values
	 * @return true if this Collection has been modified, false otherwise
	 */
	boolean addAll(Collection<? extends E> c);

	/**
	 * @code Removes all elements from this collection.
	 */
	void clear();

	/**
	 * @param o the Object to find the existence of in this Collection
	 * @return false if the provided Object is null or has not been found, true if found
	 */
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return false if a value is 'null' or not found, true if all is found
	 * @code Returns true if this collection contains all of the elements in the specified collection.
	 */
	boolean containsAll(Collection<?> c);

	/**
	 * @param o the Object to compare with this Object for equality
	 * @return false if the provided Object is null or not equal, true if equal
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
	 * @return a possibly parallel Stream with this collection as its source
	 */
	default Stream<E> parallelStream()
	{
		return StreamSupport.stream(this.spliterator(), true);
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is null or not found, true if found and removed
	 * @code Removes a single instance of the specified element from this collection, if it is present.
	 */
	boolean remove(Object o);

	/**
	 * @param c Collection of values to remove if found in this Collection
	 * @throws NullPointerException if no Collection is provided
	 * @return true if this Collection was modified, false otherwise
	 * @code Removes all of this collection's elements that are also contained in the specified collection.
	 */
	boolean removeAll(Collection<?> c);

	/**
	 * @param filter the condition to be satisfied for removal
	 * @throws NullPointerException if no condition is specified
	 * @return true if this Collection has been modified, false otherwise
	 * @code Removes all of the elements of this collection that satisfy the given predicate.
	 */
	default boolean removeIf(Predicate<? super E> filter)
	{
		if(filter == null)
		{
			throw new NullPointerException("You MUST provide a removal condition");
		}
		boolean modified = false;
		Iterator<E> iterator = iterator();
		while(iterator.hasNext())
		{
			E element = iterator.next();
			if(filter.test(element))
			{
				iterator.remove();
				modified = true;
			}
		}
		return modified;
	}

	/**
	 * @param c Collection of values to keep if found in this Collection
	 * @throws NullPointerException if no Collection is provided
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
	default Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported");
	}


	/**
	 * @return a sequential Stream with this collection as its source
	 */
	default Stream<E> stream()
	{
		return StreamSupport.stream(this.spliterator(), false);
	}

	/**
	 * @return an array containing all of the elements in this collection
	 */
	Object[] toArray();

	/**
	 * @param generator function to allocate the returned array
	 * @return an array containing the elements in this collection
	 */
	default <T> T[] toArray(IntFunction<T[]> generator)
	{
		throw new UnsupportedOperationException("Not supported");
	}

	/**
	 * @param a the array of type T into which to copy values from this Collection into
	 * @throws NullPointerException if no array is provided
	 * @return an array of type T containing all of the elements in this collection
	 */
	<T> T[] toArray(T[] a);
}
