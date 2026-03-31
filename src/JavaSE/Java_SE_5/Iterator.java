package Java_SE_5;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements Iterator for Java SE 5.
 */
public interface Iterator<E>
{
	/**
	 * @return true if the iteration has more elements, false otherwise
	 * @code Returns true if the iteration has more elements.
	 */
	boolean hasNext();

	/**
	 * @return the next element in the iteration
	 * @throws NoSuchElementException if this iterator has reached the end of this list
	 * @code Returns the next element in the iteration.
	 */
	E next();

	/**
	 * @code Removes from the underlying collection the last element returned by the iterator.
	 */
	void remove();
}
