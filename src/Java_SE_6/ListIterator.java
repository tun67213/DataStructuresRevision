package Java_SE_6;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with ListIterator for Java SE 6.
 */
public interface ListIterator<E> extends Iterator<E>
{
	/**
	 * @param e the value to be added to the position before where it is pointed to
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Inserts the specified element into this list (optional operation).
	 */
	void add(E e);

	/**
	 * @return true if this list iterator has more elements when traversing in the forward direction, false otherwise
	 */
	@Override
	boolean hasNext();

	/**
	 * @return true if this list iterator has more elements when traversing in the reverse direction, false otherwise
	 */
	boolean hasPrevious();

	/**
	 * @return the next element in the list
	 * @throws NoSuchElementException if this list-iterator has reached the end of this list
	 */
	@Override
	E next();

	/**
	 * @return the index of the element that would be returned by a subsequent call to next() or -1 if this list-iterator has reached the end of the list
	 */
	int nextIndex();

	/**
	 * @return the previous element in the list
	 * @throws NoSuchElementException if this list-iterator has reached the end of this list
	 */
	E previous();

	/**
	 * @return the index of the element that would be returned by a subsequent call to previous() or -1 if this list-iterator has reached the beginning of this list
	 */
	int previousIndex();

	/**
	 * @code Removes from the list the last element that was returned by next() or previous().
	 * @throws IllegalStateException if called before calling next() or previous() or if called right after calling once before
	 */
	@Override
	void remove();

	/**
	 * @param e the value to be set to the last-returned value
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Replaces the last element returned by next or previous with the specified element (optional operation).
	 */
	void set(E e);
}
