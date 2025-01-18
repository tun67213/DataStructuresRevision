package src.Java_SE_10;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Deque<E> extends Queue<E>
{
	/**
	 * @param e the value to be added into the queue represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @return true if the value has been successfully added to the queue represented by this deque
	 * @code Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param c Collection of values to add to this Deque
	 * @throws NullPointerException if no Collection is provided
	 * @return true if all the values have been added, false if the provided Collection is empty
	 */
	@Override
	boolean addAll(Collection<? extends E> c);

	/**
	 * @param e the value to be added to the beginning of the queue represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
	 */
	void addFirst(E e);

	/**
	 * @param e the value to be added to the beginning of the queue represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is currently available
	 * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
	 */
	void addLast(E e);

	/**
	 * @param o the Object to find the existence of in this Deque
	 * @return true if the deque contains the specified element, false if the element is null or not found
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	Iterator<E> descendingIterator();

	/**
	 * @return the head of the queue represented by this deque
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
	 * @param e the value to offer to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return false if no space is available, true if no exceptions are thrown and space is available
	 */
	@Override
	boolean offer(E e);

	/**
	 * @param e the value to offer to the beginning of this list
	 * @throws NullPointerException if no value is provided
	 * @return true after adding the specified element to the beginning of this list
	 * @code Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
	 */
	boolean offerFirst(E e);

	/**
	 * @param e the value to offer to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return false if no space is available, true if no exceptions are thrown and space is available
	 */
	boolean offerLast(E e);

	/**
	 * @return the value in the head (first Node) or null if this deque is empty
	 * @code Retrieves, but does not remove, the head of the queue represented by this deque.
	 */
	@Override
	E peek();

	/**
	 * @return the value in the head (first Node) or null if this deque is empty
	 * @code Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
	 */
	E peekFirst();

	/**
	 * @return the value in the tail (last Node) or null if this deque is empty
	 * @code Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
	 */
	E peekLast();

	/**
	 * @return the value in the Node previously at head, or null if this deque is empty
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
	 */
	@Override
	E poll();

	/**
	 * @return the value in the Node previously at head, or null if this deque is empty
	 * @code Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
	 */
	E pollFirst();

	/**
	 * @return the value in the Node previously at tail, or null if this deque is empty
	 * @code Retrieves and removes the last element of this deque, or returns null if this deque is empty.
	 */
	E pollLast();

	/**
	 * @return the value in the Node previously at head, or null if this deque is empty
	 * @code Pops an element from the stack represented by this deque.
	 */
	E pop();

	/**
	 * @param e the value to be added onto the stack represented by this deque
	 * @throws NullPointerException if no value is provided
	 * @throws IllegalStateException if no space is available
	 * @code Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, throwing an IllegalStateException if no space is currently available.
	 */
	void push(E e);

	/**
	 * @return the value in the Node previously defined as head
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E remove();

	/**
	 * @param o the Object to find and remove
	 * @return true if this Deque has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @return the value in the Node previously defined as head
	 * @code Retrieves and removes the first element of this deque.
	 */
	E removeFirst();

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return true if this Deque has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	boolean removeFirstOccurrence(Object o);

	/**
	 * @return the value in the Node previously defined as tail
	 * @code Retrieves and removes the last element of this deque.
	 */
	E removeLast();

	/**
	 * @param o the Object to find and remove the last occurrence of
	 * @return true if this Deque has been modified, false otherwise
	 * @code Removes the last occurrence of the specified element from this deque.
	 */
	boolean removeLastOccurrence(Object o);

	/**
	 * @return the number of elements in this deque
	 */
	@Override
	int size();
}
