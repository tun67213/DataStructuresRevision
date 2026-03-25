package Java_SE_5;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements ListIterator for Java SE 5.
 */
public interface ListIterator<E> extends Iterator<E>
{
	/**
	 * @param o the element to be added to this List Iterator
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @code Inserts the specified element into the list (optional operation).
	 */
	void add(E o);

	/**
	 * @return true if this list iterator has more elements when traversing the list in the forward direction, false otherwise
	 */
	@Override
	boolean hasNext();

	/**
	 * @return true if this list iterator has more elements when traversing the list in the reverse direction, false otherwise
	 */
	boolean hasPrevious();

	/**
	 * @return the next element in the list
	 * @throws NoSuchElementException if hasNext() returns false
	 */
	@Override
	E next();

	/**
	 * @return the index of the element that would be returned by a subsequent call to next
	 */
	int nextIndex();

	/**
	 * @return the previous element in the list
	 * @throws NoSuchElementException if hasPrevious() returns false
	 */
	E previous();

	/**
	 * @return the index of the element that would be returned by a subsequent call to previous
	 */
	int previousIndex();

	/**
	 * @code Removes from the list the last element that was returned by next or previous.
	 */
	@Override
	void remove();

	/**
	 * @param o the replacement element for the last returned value
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @code Replaces the last element returned by next or previous with the specified element (optional operation).
	 */
	void set(E o);
}
