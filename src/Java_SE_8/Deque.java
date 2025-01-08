package src.Java_SE_8;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code Class that implements the Deque interface
 */
public interface Deque<E> extends Queue<E>
{
	/**
	 * @param e the value to be added to the end of this Deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @return true if the value has been successfully
	 */
	@Override
	boolean add(E e);

	/**
	 * @param e the value to be added to the beginning of this Deque
	 * @throws NullPointerException if no value has been provided
	 * @throws IllegalStateException if no space is currently available
	 * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addFirst(E e);

	/**
	 * @param e the value to be added to the end of this Deque
	 * @throws NullPointerException if no value has been provided
	 * @throws IllegalStateException if no space is currently available
	 * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addLast(E e);

	/**
	 * @param o the object to find the existence of in this deque
	 * @throws NullPointerException if no object has been provided
	 * @return true if this deque contains the specified element, false otherwise
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	Iterator<E> descendingIterator();

	/**
	 * @return the value at the head Node in the queue represented by this deque
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
	 * @param e the value to be offered to this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if this deque has been modified, false otherwise
	 * @code Inserts the specified element into the queue represented by this deque.
	 */
	@Override
	boolean offer(E e);

	/**
	 * @param e the value to be offered to the front of this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if this deque has been modified, false otherwise
	 */
	boolean offerFirst(E e);

	/**
	 * @param e the value to be offered to the end of this deque
	 * @throws NullPointerException if no value is provided
	 * @return true if this deque has been modified, false otherwise
	 */
	boolean offerLast(E e);

	/**
	 * @return the head of the queue represented by this deque or null if this deque is empty
	 */
	@Override
	E peek();

	/**
	 * @return the first element of this deque or null if this deque is empty
	 * @code Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
	 */
	E peekFirst();

	/**
	 * @return the last element of this deque or null if this deque is empty
	 * @code Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
	 */
	E peekLast();

	/**
	 * @return the value in the node previously at head in this deque or null if this deque is empty
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
	 */
	@Override
	E poll();

	/**
	 * @return the value in the node previously at head in this deque or null if this deque is empty
	 * @code Retrieves and removes the first element of this deque, or returns null if this deque is empty.
	 */
	E pollFirst();

	/**
	 * @return the value in the node previously at tail in this deque or null if this deque is empty
	 * @code Retrieves and removes the last element of this deque, or returns null if this deque is empty.
	 */
	E pollLast();

	/**
	 * @return the value in the Node previously at the top of the stack
	 * @code Pops an element from the stack represented by this deque.
	 */
	E pop();

	/**
	 * @param e the value to be pushed onto the top of the stack represented by this deque
	 * @throws NullPointerException if no value is provided or the value provided is 'null'
	 * @code Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions.
	 */
	void push(E e);

	/**
	 * @return the value in the Node previously at head in this deque
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E remove();

	/**
	 * @param o the value to find and remove the first occurrence of if existent
	 * @throws NullPointerException if no value is provided or the provided value is 'null', since null values are not allowed
	 * @return true if the queue representing this deque has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @return the element previously the first element of this deque
	 * @code Retrieves and removes the first element of this deque.
	 */
	E removeFirst();

	/**
	 * @param o the Object to find and remove the first occurrence of (if existent)
	 * @throws NullPointerException if no Object is provided
	 * @return true if the queue representing this deque has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	boolean removeFirstOccurrence(Object o);

	/**
	 * @return the element previously the last element of this deque
	 * @code Retrieves and removes the last element of this deque.
	 */
	E removeLast();

	/**
	 * @param o the Object to find and remove the last occurrence of (if existent)
	 * @throws NullPointerException if no Object is provided
	 * @return true if the queue representing this deque has been modified, false otherwise
	 * @code Removes the last occurrence of the specified element from this deque.
	 */
	boolean removeLastOccurrence(Object o);

	/**
	 * @return the number of elements in this deque
	 */
	@Override
	int size();
}
