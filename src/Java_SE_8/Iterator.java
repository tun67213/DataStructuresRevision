package src.Java_SE_8;

import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Class that implements an iterator
 */
public interface Iterator<E>
{
	/**
	 * @code Performs the given action for each remaining element until all elements have been processed or the action
	 * throws an exception.
	 */
	default void forEachRemaining(Consumer<? super E> action)
	{

	}

	/**
	 * @return true if the iteration has more elements, false otherwise
	 */
	boolean hasNext();

	/**
	 * @return the next element in the iteration
	 */
	E next();

	/**
	 * @code Removes from the underlying collection the last element returned by this iterator.
	 */
	default void remove()
	{
		throw new UnsupportedOperationException();
	}
}
