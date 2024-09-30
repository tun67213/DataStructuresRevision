
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this Queue
 */
public interface Queue<E> extends Collection<E>
{
    /**
     * @param e value to add into this Queue
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @throws IllegalStateException if no space is available in this Queue
     * @return true if the provided value was added successfully
     */
    @Override
    boolean add(E e);

    /**
     * @return the head of this queue
     * @code Retrieves, but does not remove, the head of this queue.
     */
    E element();

    /**
     * @param e the value to offer to this Queue
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if the value was added successfully
     */
    boolean offer(E e);

    /**
     * @return the head of this queue
     * @code Retrieves, but does not remove, the head of this queue.
     */
    E peek();

    /**
     * @return the value previously at head in this queue or null if this queue is empty
     * @code Retrieves and removes the head of this queue, or returns null if this queue is empty.
     */
    E poll();
}
