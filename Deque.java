
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Deque<E> extends Queue<E>
{
    /**
     * @param e the value to be added to this Deque
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
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
}
