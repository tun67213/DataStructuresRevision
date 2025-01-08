package src.Java_SE_8;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code Interface that implements a Queue
 */
public interface Queue<E> extends Collection<E>
{
	/**
	 * @param e the value to be inserted into this queue
	 * @throws NullPointerException if no value is provided to insert into this queue
	 * @return true if the provided value has been successfully added to this queue
	 */
	@Override
	boolean add(E e);

	/**
	 * @return the head of this queue
	 * @code Retrieves, but does not remove, the head of this queue.
	 */
	E element();

	/**
	 * @param e the value to be added into this queue
	 * @throws NullPointerException if no value is provided
	 * @return true if this queue has been successfully modified
	 */
	boolean offer(E e);

	/**
	 * @return the head of this queue or null if this queue is empty
	 */
	E peek();

	/**
	 * @return the value previously at head of this queue or null
	 * @code Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 */
	E poll();

	/**
	 * @return the value at the node previously defined as head in this queue
	 * @code Retrieves and removes the head of this queue.
	 */
	E remove();
}
