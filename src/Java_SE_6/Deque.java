package src.Java_SE_6;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Interface that implements Deque for Java SE 6
 */
public interface Deque<E> extends Queue<E>
{
	/**
	 * @param e the value to be added into the queue represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is allocated
	 * @return true if the value is successfully added
	 */
	@Override
	boolean add(E e);

	/**
	 * @param e the value to be added to the beginning of the queue represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addFirst(E e);

	/**
	 * @param e the value to be added to the end of the queue represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addLast(E e);

	/**
	 * @param o the Object to find the existence of in this deque
	 * @return false if the provided value is null or not found, true if found
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in the Queue represented by this Deque
	 * @throws NullPointerException if no Collection is provided
	 * @return false if a provided Collection contains null values or values not in this Deque, true if all values are found or the provided Collection is empty
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	Iterator<E> descendingIterator();

	/**
	 * @return the value at head in this deque
	 * @code Retrieves, but does not remove, the head of the queue represented by this deque.
	 */
	@Override
	E element();

	/**
	 * @return the first element of this deque
	 * @throws NoSuchElementException if this deque is empty
	 */
	E getFirst();

	/**
	 * @return the last element of this deque
	 * @throws NoSuchElementException if this deque is empty
	 */
	E getLast();

	/**
	 * @return an iterator over the elements in this deque in proper sequence
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param e the value to offer to this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if the provided value has been added successfully, false if no space is available
	 */
	@Override
	boolean offer(E e);

	/**
	 * @param e the value to offer to this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if the provided value has been added successfully
	 */
	boolean offerFirst(E e);

	/**
	 * @param e the value to offer to this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if the provided value has been added successfully
	 */
	boolean offerLast(E e);

	/**
	 * @return the head of the queue represented by this deque, or null if this deque is empty
	 */
	@Override
	E peek();

	/**
	 * @return the head of the queue represented by this deque, or null if this deque is empty
	 */
	E peekFirst();

	/**
	 * @return the tail of the queue represented by this deque, or null if this deque is empty
	 */
	E peekLast();

	/**
	 * @return the value in the Node previously at the head of the queue before removal, or null if this deque is empty
	 * @code Retrieves and removes the head of the queue represented by this deque, or returns null if this deque is empty.
	 */
	@Override
	E poll();

	/**
	 * @return the first element of this deque, or null if this deque is empty
	 * @code Retrieves and removes the first element of this deque, or returns null if this deque is empty.
	 */
	E pollFirst();

	/**
	 * @return the last element of this deque, or null if this deque is empty
	 * @code Retrieves and removes the last element of this deque, or returns null if this deque is empty.
	 */
	E pollLast();

	/**
	 * @return the first element in the queue represented by this deque or null if this queue is empty
	 * @code Pops the element at the top of the stack represented by the queue represented by this deque.
	 */
	E pop();

	/**
	 * @param e the value to be added onto the top of the stack
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is available
	 * @code Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	void push(E e);

	/**
	 * @return the value at the head of the queue represented by this deque
	 * @throws NoSuchElementException if this deque is empty
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E remove();

	/**
	 * @param o the Object to find the existence of in this Queue
	 * @return false if the provided Object is null or not found, true if the provided Object is found and removed
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @return the value that was previously the first element in this deque
	 * @throws NoSuchElementException if this Deque contains no values
	 * @code Retrieves and removes the first element of this deque.
	 */
	E removeFirst();

	/**
	 * @param o the Object to find the first occurrence of
	 * @return false if the provided Object is null or has not been found in this Deque, true if found and removed
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	boolean removeFirstOccurrence(Object o);

	/**
	 * @return the value that was previously the last element in this deque
	 * @throws NoSuchElementException if this deque contains no values
	 * @code Retrieves and removes the last element of this deque.
	 */
	E removeLast();

	/**
	 * @param o the Object to find the last occurrence of
	 * @return false if the provided Object is null or has not been found in this Deque, t rue if found and removed
	 * @code Removes the last occurrence of the specified element from this deque.
	 */
	boolean removeLastOccurrence(Object o);

	/**
	 * @return the number of elements in this deque
	 */
	@Override
	int size();
}
