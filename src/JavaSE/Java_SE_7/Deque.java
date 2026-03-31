package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with Deque for Java SE 7.
 */
public interface Deque<E> extends Queue<E>
{
	/**
	 * @param e the value to be added to this deque
	 * @throws IllegalStateException if no space is currently available
	 * @return true upon success
	 * @code Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param e the value to be added to the beginning of this deque
	 * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addFirst(E e);

	/**
	 * @param e the value to be added to the end of this deque
	 * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addLast(E e);

	/**
	 * @param o the object to find the existence of
	 * @return true if this deque contains the specified element
	 * 		   false otherwise
	 * @code Returns true if this deque contains the specified element.
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	Iterator<E> descendingIterator();

	/**
	 * @return the head of the queue
	 * @code Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E element();

	/**
	 * @return the first element of this deque
	 * @code Retrieves, but does not remove, the first element of this deque.
	 */
	E getFirst();

	/**
	 * @return the last element of this deque
	 * @code Retrieves, but does not remove, the last element of this deque.
	 */
	E getLast();

	/**
	 * @return an iterator over the elements in this deque in proper sequence
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param e the value to offer to this deque
	 * @return true upon success, false if no space is currently available
	 */
	@Override
	boolean offer(E e);

	/**
	 * @param e the value to offer to this deque
	 * @return true upon success and false if no space is currently available
	 * @code Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
	 */
	boolean offerFirst(E e);

	/**
	 * @param e the value to offer to this deque
	 * @return true upon success and false if no space is currently available
	 * @code Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
	 */
	boolean offerLast(E e);

	/**
	 * @return the head of this queue, or null if this queue is empty
	 * @code Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty
	 */
	@Override
	E peek();

	/**
	 * @return the first element of this deque or null if this deque is empty
	 */
	E peekFirst();

	/**
	 * @return the last element of this deque or null if this deque is empty
	 */
	E peekLast();

	/**
	 * @return the value previously head before removal, or null if this deque is empty before removal
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
	 */
	@Override
	E poll();

	/**
	 * @return the value previously head before removal, or null if this deque is empty before removal
	 * @code Retrieves and removes the first element of this deque, or returns null if this deque is empty.
	 */
	E pollFirst();

	/**
	 * @return the value previously tail before removal, or null if this deque is empty before removal
	 * @code Retrieves and removes the last element of this deque, or returns null if this deque is empty.
	 */
	E pollLast();

	/**
	 * @return the value at the top of the stack
	 * @code Pops an element from the stack represented by this deque.
	 */
	E pop();

	/**
	 * @param e the value to push onto the stack
	 * @code Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 * @throws IllegalStateException if no space is currently available
	 */
	void push(E e);

	/**
	 * @return the value previously the head of this queue
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E remove();

	/**
	 * @param o the Object to find the first occurrence of
	 * @return true if this queue has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @return the first element of this deque
	 * @code Retrieves and removes the first element of this deque.
	 */
	E removeFirst();

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return true if this queue has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	boolean removeFirstOccurrence(Object o);

	/**
	 * @return the last element of this deque
	 * @code Retrieves and removes the last element of this deque.
	 */
	E removeLast();

	/**
	 * @param o the Object to find and remove the last occurrence of
	 * @return true if this queue has been structurally modified, false otherwise
	 * @code Removes the last occurrence of the specified element from this deque.
	 */
	boolean removeLastOccurrence(Object o);

	/**
	 * @return the number of elements in this deque
	 */
	@Override
	int size();
}
