package src.Java_SE_9;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements the ListIterator Object for Java SE 9.
 */
public interface ListIterator<E> extends Iterator<E>
{
	/**
	 * @param e the value to be inserted into the list represented by this ListIterator
	 * @throws NullPointerException if no value is provided
	 * @code Inserts the specified element into the list.
	 */
	void add(E e);

	/**
	 * @return true if this list iterator has more elements when traversing in the forward direction
	 */
	@Override
	boolean hasNext();

	/**
	 * @return true if this list iterator has more elements when traversing in the backward direction
	 */
	boolean hasPrevious();

	/**
	 * @return the next element in the list
	 * @code Returns the next element in the list and advances the cursor position.
	 */
	@Override
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
	 * @param e the value to set to the value to be returned by a subsequent call to previous() or next()
	 * @throws NullPointerException if no value is provided
	 * @code Replaces the last element returned by next() or previous() with the specified element.
	 */
	void set(E e);
}
