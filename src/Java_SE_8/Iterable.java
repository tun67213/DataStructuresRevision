package src.Java_SE_8;

import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this class
 * @code Class that implements an iterable object
 */
public interface Iterable<T>
{
	/**
	 * Performs the given action for each element of the Iterable until all elements have been processed
	 * or the action throws an exception.
	 */
	default void forEach(Consumer<? super T> action)
	{

	}

	/**
	 * @return an iterator over elements of type T
	 */
	Iterator<T> iterator();

	/**
	 * @return a Spliterator over the elements described by this Iterable
	 */
	default Spliterator<T> spliterator()
	{
		return null;
	}
}
