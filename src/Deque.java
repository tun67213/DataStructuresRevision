package src;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Deque<E> extends Queue<E>
{
    /**
     * @param e the value to be added to this Deque
     * @throws NullPointerException if no element is provided or the provided Object is null
     * @return true if adding was successful
     */
    @Override
    boolean add(E e);

    /**
     * @param e the value to add to the beginning of this Deque
     * @throws NullPointerException if no element is provided or the provided element is null
     * @code Inserts the specified element at the front of this deque if it is possible to do so immediately without violating capacity restrictions
     */
    void addFirst(E e);

    /**
     * @param e the value to add to the end of this Deque
     * @throws NullPointerException if no Object is provided or the provided element is null
     * @code Inserts the specified element at the end of this deque if it is possible to do so immediately without violating capacity restrictions
     */
    void addLast(E e);

    /**
     * @param o the Object to find the existence of in this deque
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if the provided Object is found in this deque, false otherwise
     */
    @Override
    boolean contains(Object o);

    /**
     * @return an iterator over the elements in this deque in reverse sequential order
     */
    Iterator<E> descendingIterator();

    /**
     * @return the head of the queue represented by this deque
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
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if successfully added
     * @code If no value is provided, the function throws a NullPointerException(). Otherwise, the function inserts the value as the tail at the end of this deque.
     */
    @Override
    boolean offer(E e);

    /**
     * @param e the value to be offered to this deque
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if successfully added
     * @code If no value is provided, the function throws a NullPointerException(). Otherwise, the function inserts the value as the head at the beginning of this deque.
     */
    boolean offerFirst(E e);

    /**
     * @param e the value to be offered to this deque
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if successfully added
     * @code If no value is provided, the function throws a NullPointerException(). Otherwise, the function inserts the value as the tail at the end of this deque.
     */
    boolean offerLast(E e);

    /**
     * @return the value at the head of this deque or null if this deque is empty
     * @code Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque), or returns null if this deque is empty.
     */
    @Override
    E peek();

    /**
     * @return the value at the head of this deque or null if this deque is empty
     * @code Retrieves, but does not remove, the first element of this deque, or returns null if this deque is empty.
     */
    E peekFirst();

    /**
     * @return the value at the tail of this deque or null if this deque is empty
     * @code Retrieves, but does not remove, the last element of this deque, or returns null if this deque is empty.
     */
    E peekLast();

    /**
     * @return the value at the Node previously head or null if head is null
     * @code Retrieves and removes the head of the queue represented by this deque or null if this deque is empty.
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
     * @return the value at the top of the stack represented by this deque
     * @code Pops an element from the stack represented by this deque.
     */
    E pop();

    /**
     * @param e the value to be added to the top of ths tack represented by this deque
     * @throws IllegalStateException if no space is currently available
     * @throws NullPointerException if no value is provided or the provided value is null
     * @code Pushes an element onto the stack represented by this deque (in other words, at the head of this deque) if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
     */
    void push(E e);

    /**
     * @return the value previously at the head of the queue represented by this deque
     * @throws NoSuchElementException if this deque is empty
     * @code Retrieves and removes the head of the queue represented by this deque (in other words, the first element of this deque).
     */
    @Override
    E remove();

    /**
     * @param o the Object to find and remove the first occurrence of
     * @throws NullPointerException if the provided element is 'null'
     * @return true if the provided Object has been removed successfully, false if the provided Object is not found
     */
    @Override
    boolean remove(Object o);

    /**
     * @return the first element of this deque
     * @code Retrieves and removes the first element of this deque.
     */
    E removeFirst();

    /**
     * @param o the Object to remove the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if this Deque has been modified, false otherwise
     * @code If no Object is provided, the function throws a NullPointerException(). Otherwise, if the first occurrence is found, the function removes the first occurrence of it and returns true. False is returned if not found.
     */
    boolean removeFirstOccurrence(Object o);

    /**
     * @return the last element of this deque
     * @code Retrieves and removes the last element of this deque.
     */
    E removeLast();

    /**
     * @param o the Object to remove the last occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if this Deque has been modified, false otherwise
     * @code If no Object is provided, the function throws a NullPointerException(). Otherwise, if the last occurrence is found, the function removes the first occurrence of it and returns true. False is returned if not found.
     */
    boolean removeLastOccurrence(Object o);

    /**
     * @return the number of elements in this deque
     */
    @Override
    int size();
}
