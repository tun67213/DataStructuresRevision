
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

    /**
     * @return the first element of this deque
     * @code Retrieves, but does not remove, the first element of this deque.
     */
    E getFirst();

    /**
     * @return the last element of this deque
     * @code Retrieves, but does not remove, the last element of this deque.
     */
    E getLast();

    /**
     * @return an iterator over the elements in this deque in proper sequence
     */
    @Override
    Iterator<E> iterator();

    /**
     * @param e the value to be offered to this deque
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if successfully added
     * @code If no value is provided, the function throws a NullPointerException(). Otherwise, the function inserts the value as the tail at the end of this deque.
     */
    @Override
    boolean offer(E e);

    /**
     * @param e the value to be offered to this deque
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if successfully added
     * @code If no value is provided, the function throws a NullPointerException(). Otherwise, the function inserts the value as the head at the beginning of this deque.
     */
    boolean offerFirst(E e);

    /**
     * @param e the value to be offered to this deque
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if successfully added
     * @code If no value is provided, the function throws a NullPointerException(). Otherwise, the function inserts the value as the tail at the end of this deque.
     */
    boolean offerLast(E e);

    /**
     * @return the value at the head of this deque or null if this deque is empty
     * @code Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
     */
    @Override
    E peek();

    /**
     * @return the value at the head of this deque or null if this deque is empty
     * @code Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
     */
    E peekFirst();

    /**
     * @return the value at the tail of this deque or null if this deque is empty
     * @code Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
     */
    E peekLast();
}
