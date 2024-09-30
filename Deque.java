
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Deque<E> extends Queue<E>
{
    /**
     * @param e the value to be added to this Deque
     * @throws NullPointerException if no element is provided or the provided Object is null
     * @return true if adding was successful
     */
    @Override
    boolean add(E e);

    /**
     * @param e the value to add to the beginning of this Deque
     * @throws NullPointerException if no element is provided or the provided element is null
     * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions
     */
    void addFirst(E e);

    /**
     * @param e the value to add to the end of this Deque
     * @throws NullPointerException if no Object is provided or the provided element is null
     * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions
     */
    void addLast(E e);

    /**
     * @param o the Object to find the existence of in this deque
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if the provided Object is found in this deque, false otherwise
     */
    @Override
    boolean contains(Object o);

    /**
     * @return an iterator over the elements in this deque in reverse sequential order
     */
    Iterator<E> descendingIterator();

    /**
     * @return the head of the queue represented by this deque
     */
    @Override
    E element();
}
