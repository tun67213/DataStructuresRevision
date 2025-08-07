package Java_SE_5;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements Queue for Java SE 5.
 */
public interface Queue<E> extends Collection<E>
{
	/**
	 * @return the head of this queue or null if this queue is empty
	 */
	E element();

	/**
	 * @param o the element to insert into this queue
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element into this queue, if possible.
	 */
	boolean offer(E o);

	/**
	 * @return the head of this queue, or null if this queue is empty
	 * @code Retrieves, but does not remove, the head of this queue, returning null if this queue is empty.
	 */
	E peek();

	/**
	 * @return the previous head of this queue, or null if this queue is originally empty
	 * @code Retrieves and removes the head of this queue, or null if this queue is empty.
	 */
	E poll();

	/**
	 * @return the value previously the head of this queue
	 * @throws NullPointerException if this queue is empty
	 * @code Retrieves and removes the head of this queue.
	 */
	E remove();
}
