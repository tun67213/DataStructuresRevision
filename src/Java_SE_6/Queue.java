package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements Queue for Java SE 6
 */
public interface Queue<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to this queue
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @return true if the value has been successfully added
	 */
	@Override
	boolean add(E e);

	/**
	 * @return the head of this queue or null if this queue is empty
	 */
	E element();

	/**
	 * @param e the value to be offered to this queue
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 */
	boolean offer(E e);

	/**
	 * @return the head of this queue or null if this queue is empty
	 */
	E peek();

	/**
	 * @return the value in the Node previously at head or null if this queue is empty
	 * @code Retrieves and removes the head of this queue.
	 */
	E poll();

	/**
	 * @return the value in the Node previously at head
	 * @code Retrieves and removes the head of this queue.
	 */
	E remove();
}
