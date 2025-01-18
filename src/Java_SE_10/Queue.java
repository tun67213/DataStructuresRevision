package src.Java_SE_10;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Queue<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to this Queue
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @return true if this value is successfully added, false otherwise
	 */
	@Override
	boolean add(E e);

	/**
	 * @return the head of this queue
	 * @code Retrieves, but does not remove, the head of this queue.
	 */
	E element();

	/**
	 * @param e the value to be offered to this Queue
	 * @throws NullPointerException if no value is provided
	 * @return true if this value has been successfully added
	 */
	boolean offer(E e);

	/**
	 * @return the value at the head of this queue or null if this queue is empty
	 * @code Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	 */
	E peek();

	/**
	 * @return the value in the node previously at the head of this queue or null if this queue is empty
	 * @code Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 */
	E poll();

	/**
	 * @return the value in the Node previously at head
	 */
	E remove();
}
