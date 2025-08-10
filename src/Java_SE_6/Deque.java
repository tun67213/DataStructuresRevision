package Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with Deque for Java SE 6.
 */
public interface Deque<E> extends Queue<E>
{
	/**
	 * @param e the value to add into this deque
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IllegalStateException if no space is currently available
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	@Override
	boolean add(E e);

	/**
	 * @param e the value to add to the beginning of this deque
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addFirst(E e);

	/**
	 * @param e the value to add to the end of this deque
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions.
	 */
	void addLast(E e);

	/**
	 * @param o the Object to find the existence of in this deque
	 * @return true if this deque contains the specified element, false otherwise
	 */
	@Override
	boolean contains(Object o);

	/**
	 * @param c Collection of values to find the existence of in this deque
	 * @throws NullPointerException if no collection is provided or the provided variable is defined as null
	 * @return true if all values in the provided collection are contained in this deque, false otherwise
	 */
	@Override
	boolean containsAll(Collection<?> c);

	/**
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	Iterator<E> descendingIterator();

	/**
	 * @return the head of this deque or null if this deque is empty
	 * @throws NoSuchElementException if this deque is empty
	 */
	@Override
	E element();

	/**
	 * @return the first element of this deque
	 * @throws NoSuchElementException if this deque is empty
	 * @code Retrieves, but does not remove, the first element of this deque.
	 */
	E getFirst();

	/**
	 * @return the last element of this deque
	 * @throws NoSuchElementException if this deque is empty
	 * @code Retrieves, but does not remove, the last element of this deque.
	 */
	E getLast();

	/**
	 * @return an iterator over the elements in this deque in proper sequence
	 */
	@Override
	Iterator<E> iterator();

	/**
	 * @param e the value to be offered to this queue
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if there is enough space and the value has been added, false if there isn't enough space
	 * @code Inserts the specified element into the queue represented by this deque (in other words, at the tail of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and false if no space is currently available.
	 */
	@Override
	boolean offer(E e);

	/**
	 * @param e the value to be added at the front of this deque
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the front of this deque unless it would violate capacity restrictions.
	 */
	boolean offerFirst(E e);

	/**
	 * @param e the value to be added to the back of this deque
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the end of this deque unless it would violate capacity restrictions.
	 */
	boolean offerLast(E e);

	/**
	 * @return the head (first element) of this deque or null if this deque is empty
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
	 * @return the first element of this deque or null if this deque is empty
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
	 */
	@Override
	E poll();

	/**
	 * @return the first element of this deque or null if this deque is empty
	 * @code Retrieves and removes the first element of this deque, or returns null if this deque is empty.
	 */
	E pollFirst();

	/**
	 * @return the last element of this deque or null if this deque is empty
	 * @code Retrieves and removes the last element of this deque, or returns null if this deque is empty.
	 */
	E pollLast();

	/**
	 * @return the value at the top of the stack represented by this list
	 * @throws EmptyStackException if the stack representing this deque is empty
	 * @code Pops an element from the stack represented by this deque.
	 */
	E pop();

	/**
	 * @param e the value to be added to the top of the stack represented by this deque
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @throws IllegalStateException if no space is currently available
	 * @code Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
	 */
	void push(E e);

	/**
	 * @return the head of this queue represented by this deque
	 * @throws NoSuchElementException if this deque is empty
	 * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
	 */
	@Override
	E remove();

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return true if the provided Object is found and removed, false if not found
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	@Override
	boolean remove(Object o);

	/**
	 * @return the first element of this deque
	 * @throws NoSuchElementException if this deque is empty
	 * @code Retrieves and removes the first element of this deque.
	 */
	E removeFirst();

	/**
	 * @param o the Object to find the first occurrence of
	 * @return true if this deque has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this deque.
	 */
	boolean removeFirstOccurrence(Object o);

	/**
	 * @@return the last element of this deque
	 * @throws java.util.NoSuchElementException if this deque is empty
	 * @code Retrieves and removes the last element of this deque.
	 */
	E removeLast();

	/**
	 * @param o the Object to find the last occurrence of
	 * @return true if this deque has been structurally modified, false otherwise
	 * @code Removes the last occurrence of the specified element from this deque.
	 */
	boolean removeLastOccurrence(Object o);

	/**
	 * @return the number of elements in this deque
	 */
	@Override
	int size();
}
