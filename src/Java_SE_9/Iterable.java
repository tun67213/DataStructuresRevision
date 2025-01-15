package src.Java_SE_9;

import java.util.function.Consumer;
import java.util.Spliterator;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this interface
 * @code This interface defines the Iterable Object for Java SE 9.
 */
public interface Iterable<T>
{
	/**
	 * @param action the action to be performed to each value in this list
	 * @throws NullPointerException if no action is provided
	 * @code Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
	 */
	default void forEach(Consumer<? super T> action)
	{

	}

	/**
	 * @return an iterator over elements of type T
	 */
	Iterator<T> iterator();

	/**
	 * @return a Spliterator over the elements described by this Iterable.
	 */
	default Spliterator<T> spliterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
