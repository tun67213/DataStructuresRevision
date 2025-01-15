package src.Java_SE_9;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements the ListIterator Object for Java SE 9.
 */
public interface Queue<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to this queue
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is available
	 * @return true if the provided value was added successfully
	 */
	@Override
	boolean add(E e);

	/**
	 * @return the value at the head of this queue
	 * @code Retrieves, but does not remove, the head of this queue.
	 */
	E element();

	/**
	 * @param e the value to offer to this Queue
	 * @throws NullPointerException if no value is provided
	 * @return true if the value was added successfully
	 * @code Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
	 */
	boolean offer(E e);

	/**
	 * @return the head of this queue or null if this queue is empty
	 * @code Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	 */
	E peek();

	/**
	 * @return the value previously at head, or null if head is null
	 * @code Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 */
	E poll();

	/**
	 * @return the value at the node previously the head of this queue
	 * @code Retrieves and removes the head of this queue.
	 */
	E remove();
}
