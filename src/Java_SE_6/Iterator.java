package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements Iterator for Java SE 6
 */
public interface Iterator<E>
{
	/**
	 * @return true if the iteration has more elements, false otherwise
	 */
	boolean hasNext();

	/**
	 * @return the next element in the iteration
	 */
	E next();

	/**
	 * @code Removes from the underlying collection the last element returned by the iterator.
	 */
	void remove();
}
