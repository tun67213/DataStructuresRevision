package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with List for Java SE 7.
 */
public interface ListIterator<E> extends Iterator<E>
{
	/**
	 * @param e the value to be added into the list
	 * @code Inserts the specified element into the list (optional operation).
	 */
	void add(E e);

	/**
	 * @return true if this list iterator has more elements when traversing the list in the forward direction
	 * 		   false otherwise
	 * @code Returns true if this list iterator has more elements when traversing the list in the forward direction.
	 */
	@Override
	boolean hasNext();

	/**
	 * @return true if this list iterator has more elements when traversing in the reverse direction
	 * 		   false otherwise
	 * @code Returns true if this list iterator has more elements when traversing the list in the reverse direction.
	 */
	boolean hasPrevious();

	/**
	 * @return the next element in the list
	 * @code Returns the next element in the list and advances the cursor position.
	 */
	@Override
	E next();

	/**
	 * @return the index of the next element in the list
	 */
	int nextIndex();

	/**
	 * @return the previous element in the list
	 * @code Returns the previous element in the list and moves the cursor position backwards.
	 */
	E previous();

	/**
	 * @return the index of the previous element in the list
	 */
	int previousIndex();

	/**
	 * @code Removes from the list the last element that was returned by next() or previous().
	 */
	@Override
	void remove();

	/**
	 * @param e the replacement value for the last element returned
	 * @code Replaces the last element returned by next() or previous() with the specified element (optional operation).
	 */
	void set(E e);
}
