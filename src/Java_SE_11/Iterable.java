package src.Java_SE_11;

import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this class
 */
public interface Iterable<T>
{
	/**
	 * @param action the action to be performed on each element in this Iterable
	 * @throws NullPointerException if no action is provided
	 * @code Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
	 */
	default void forEach(Consumer<? super T> action)
	{
		throw new UnsupportedOperationException("To be implemented in classes that implement it");
	}

	/**
	 * @return an iterator over the elements of type T
	 */
	Iterator<T> iterator();

	/**
	 * @return a Spliterator over the elements described by this Iterable
	 */
	default Spliterator<T> spliterator()
	{
		throw new UnsupportedOperationException("To be implemented in classes that implement it");
	}
}
