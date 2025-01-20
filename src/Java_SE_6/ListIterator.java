package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements ListIterator for Java SE 6
 */
public interface ListIterator<E> extends Iterator<E>
{
	/**
	 * @param e the value to be added to this list
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
	 * @return the next element in the list
	 */
	@Override
	E next();

	/**
	 * @return the index of the element that would be returned by a subsequent call to next()
	 */
	int nextIndex();

	/**
	 * @return the previous element in the list
	 */
	E previous();

	/**
	 * @return the index of the element that would be returned by a subsequent call to previous()
	 */
	int previousIndex();

	/**
	 * @code Removes from the list the last element that was returned by next() or previous()
	 */
	@Override
	void remove();

	/**
	 * @param e the replacement value for the specified position in this list
	 * @throws NullPointerException if no value is provided
	 * @code Replaces the last element returned by next or previous with the specified element.
	 */
	void set(E e);
}
