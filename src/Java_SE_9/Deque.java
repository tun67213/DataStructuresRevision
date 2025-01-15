package src.Java_SE_9;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface implements the ListIterator Object for Java SE 9.
 */
public interface Deque<E> extends Queue<E>
{
	/**
	 * @param e the value to be inserted into the queue represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @return true if this value has been successfully added to this queue
	 * @code Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param c Collection of values to add to the end of this Deque
	 * @throws NullPointerException if no Collection is provided or any of the values in the provided Collection is null
	 * @return true if this Collection has been modified, false otherwise
	 * @code Adds all of the elements in the specified collection at the end of this deque, as if by calling addLast(E) on each one, in the order that they are returned by the collection's iterator.
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @param e the value to be added to the beginning of this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
	 */
	void addFirst(E e);

	/**
	 * @param e the value to be added to the end of this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
	 */
	void addLast(E e);

	/**
	 * @param o the value to find the existence of in this Deque
	 * @return false if the provided value is null or not found, true if found
	 * @code Returns true if this deque contains the specified element.
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	Iterator<E> descendingIterator();

	/**
	 * @return the head of the queue represented by this deque
	 * @throws NoSuchElementException if the deque is empty
	 * @code Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E element();

	/**
	 * @return the first element of the deque
	 * @throws NoSuchElementException if the deque is empty
	 * @code Retrieves, but does not remove, the first element of this deque.
	 */
	E getFirst();

	/**
	 * @return the last element of the deque
	 * @throws NoSuchElementException if the deque is empty
	 * @code Retrieves, but does not remove, the last element of this deque.
	 */
	E getLast();

	/**
	 * @return an iterator over the elements in this deque in proper sequence
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param e the value to be offered to the end of this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if this deque has been modified
	 * @code Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
	 */
	@Override
	boolean offer(E e);

	/**
	 * @param e the value to be added to the front of this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if this deque has been modified
	 * @code Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
	 */
	boolean offerFirst(E e);

	/**
	 * @param e the value to be added to the end of this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if this deque has been modified
	 * @code Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
	 */
	boolean offerLast(E e);

	/**
	 * @return the head (first element) of this deque or null if deque is empty
	 * @code Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
	 */
	@Override
	E peek();

	/**
	 * @return the first element of this deque or null if this deque is emtpy
	 * @code Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
	 */
	E peekFirst();

	/**
	 * @return the last element of this deque or null if this deque is empty
	 * @code Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
	 */
	E peekLast();

	/**
	 * @return the value previously the first element or null if this deque is empty
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
	 */
	@Override
	E poll();

	/**
	 * @return the value previously the first element or null if the deque was originally empty
	 * @code Retrieves and removes the first element of this deque, or returns null if this deque is empty.
	 */
	E pollFirst();

	/**
	 * @return the value previously the last element or null if the deque was originally empty
	 * @code Retrieves and removes the last element of this deque, or returns null if this deque is empty.
	 */
	E pollLast();

	/**
	 * @return the value previously at the top of the stack represented by this Deque
	 * @throws NoSuchElementException if the current Deque is null
	 */
	E pop();

	/**
	 * @param e the value to be added to the top of the stack represented by this Deque
	 * @throws NullPointerException if the provided value is null
	 * @throws IllegalStateException if no space is currently available
	 * @code Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
	 */
	void push(E e);

	/**
	 * @return the value at the Node previously the head of this deque
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E remove();

	/**
	 * @param o the value to remove the first occurrence of
	 * @return false if the provided value is null or not found, true if successfully removed
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @return the value previously at the head Node
	 * @throws NoSuchElementException if the Deque is empty
	 */
	E removeFirst();

	/**
	 * @param o the value to remove the first occurrence of
	 * @return false if the provided value is null or not found, true if successfully removed
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	boolean removeFirstOccurrence(Object o);

	/**
	 * @return the value previously at the tail Node
	 * @throws NoSuchElementException if the Deque is empty
	 */
	E removeLast();

	/**
	 * @param o the value to remove the last occurrence of
	 * @return false if the provided value is null or not found, true if successfully removed
	 * @code Removes the last occurrence of the specified element from this deque.
	 */
	boolean removeLastOccurrence(Object o);

	/**
	 * @return the number of elements in this deque
	 */
	@Override
	int size();
}
