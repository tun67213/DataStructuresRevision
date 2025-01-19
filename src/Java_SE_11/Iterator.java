package src.Java_SE_11;

import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public interface Iterator<E>
{
	/**
	 * @param action the action to be performed on each of the remaining elements
	 * @throws NullPointerException if no action is specified
	 * @code Performs the given action for each remaining element until all elements have been processed or the action throws an exception.
	 */
	default void forEachRemaining(Consumer<? super E> action)
	{
		throw new UnsupportedOperationException("Due to being an interface, it is not supported here");
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
		throw new UnsupportedOperationException("Due to being an interface, it is not supported here");
	}
}
