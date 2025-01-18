package src.Java_SE_10;

/**
 * @param <E> Generic variable for this interface
 * @code This interface implements the ListIterator for Java SE 10
 */
public interface ListIterator<E> extends Iterator<E>
{
	/**
	 * @param e the value to be added into this list
	 * @throws NullPointerException if no value is provided
	 * @code Inserts the specified element into the list.
	 */
	void add(E e);

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
	 * @return the next element in this list
	 * @code Returns the next element in the list and advances the cursor position.
	 */
	E next();

	/**
	 * @return the index of the element that would be returned by a subsequent call to next()
	 */
	int nextIndex();

	/**
	 * @return the previous element in this list
	 * @code Returns the previous element in the list and moves the cursor position backwards.
	 */
	E previous();

	/**
	 * @return the index of the element that would be returned by a subsequent call to previous()
	 */
	int previousIndex();

	/**
	 * @code Removes from the list the last element that was returned by next() or previous().
	 */
	@Override
	void remove();

	/**
	 * @param e the value to set to the current position in the list represented by this ListIterator
	 * @throws NullPointerException if no value is provided
	 * @code Replaces the last element returned by next() or previous() with the specified element.
	 */
	void set(E e);
}
