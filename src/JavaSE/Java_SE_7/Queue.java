package Java_SE_7;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with Queue for Java SE 7.
 */
public interface Queue<E> extends Collection<E>
{
	/**
	 * @param e the value to be added to this queue
	 * @return true if the value has been successfully inserted
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IllegalStateException if no space is currently available
	 * @code Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	@Override
	boolean add(E e);

	/**
	 * @return the head of this queue
	 * @throws NoSuchElementException if this queue is empty
	 * @code Retrieves, but does not remove, the head of this queue.
	 */
	E element();

	/**
	 * @param e the value to add to this queue
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if this value has successfully been added into this queue
	 * @code Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
	 */
	boolean offer(E e);

	/**
	 * @return the head of this queue or null if this queue is empty
	 * @code Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	 */
	E peek();

	/**
	 * @return the value previously the head of this queue or null if this queue is initially empty
	 * @code Retrieves and removes the head of this queue, or returns null if this queue is empty.
	 */
	E poll();

	/**
	 * @return the value previously the head of this queue
	 * @throws NoSuchElementException if this queue is empty at the time this method is called
	 * @code Retrieves and removes the head of this queue.
	 */
	E remove();
}
