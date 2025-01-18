package src.Java_SE_10;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this interface
 */
public interface Iterable<T>
{
	/**
	 * @param action the action to be performed on each element of the Iterable
	 * @throws NullPointerException if no action is provided
	 * @code Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.
	 */
	default void forEach(Consumer<? super T> action)
	{
		throw new UnsupportedOperationException("Not supported.");
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
		throw new UnsupportedOperationException("Not supported.");
	}
}
