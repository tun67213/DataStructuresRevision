package Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with Queue for Java SE 6.
 */
public interface Queue<E> extends Collection<E>
{
	/**
	 * @param e the value to be added into this queue
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IllegalStateException if no space is currently available
	 * @return true if the value has successfully been added
	 * @code Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	@Override
	boolean add(E e);

	/**
	 * @return the head of this queue
	 * @code Retrieves, but does not remove, the head of this queue.
	 */
	E element();

	/**
	 * @param e the value to be offered to this queue
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has successfully been added
	 * @code Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
	 */
	boolean offer(E e);

	/**
	 * @return the head of this queue or null if this queue is empty
	 * @code Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	 */
	E peek();

	/**
	 * @return the value previously the head of this queue, or null if this queue is originally empty
	 * @code Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 */
	E poll();

	/**
	 * @return the head of this queue
	 * @throws NoSuchElementException if this queue is empty
	 * @code Retrieves and removes the head of this queue.
	 */
	E remove();
}
