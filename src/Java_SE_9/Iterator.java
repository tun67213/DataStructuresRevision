package src.Java_SE_9;

import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface defines the Iterator Object.
 */
public interface Iterator<E>
{
	/**
	 * @param action the action to be performed for each of the remaining values until all values have been processed
	 * @throws NullPointerException if no action is provided
	 * @code Performs the given action for each remaining element until all elements have been processed or the action throws an exception.
	 */
	default void forEachRemaining(Consumer<? super E> action)
	{

	}

	/**
	 * @return true if the iteration has more elements
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

	}
}
