import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface ListIterator<E> extends Iterator<E>
{
    /**
     * @param e the value to add to the end of the List
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
     * @return the previous element in the list
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
}
