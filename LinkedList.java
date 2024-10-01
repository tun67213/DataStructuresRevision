import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
    private int modCount;   // Counts the number of structural changes that occur to this LinkedList

    /**
     * @code Constructs an empty list.
     */
    public LinkedList()
    {

    }

    /**
     * @param c Collection of values to initialize this LinkedList with
     * @throws NullPointerException if the provided Collection variable is null or any value in the provided Collection is null
     * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
     */
    public LinkedList(Collection<? extends E> c)
    {

    }

    /**
     * @param e the value to add to the end of this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value has been added successfully
     * @code Appends the specified element to the end of this list.
     */
    @Override
    public boolean add(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to add the specified element in this LinkedList
     * @param element the value to add at the specified location in this list
     * @throws NullPointerException if no element is provided or the provided element is null
     * @code Inserts the specified element at the specified position in this list.
     */
    @Override
    public void add(int index, E element)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to add to the end of this LinkedList in the order returned by the collection's iterator
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or the Collection variable contains null values
     * @return true if all the values were successfully added, false if the provided Collection is empty
     * @code Appends all the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
     */
    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to start adding values from this Collection
     * @param c Collection of values to add to this LinkedList starting at the specified index
     * @throws NullPointerException if no Collection is provided, the provided Collection variable is null, or any value in the provided Collection is null
     * @return true if all the values were successfully added, false if the provided Collection is empty
     * @code Inserts all the elements in the specified collection into this list, starting at the specified position.
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param e the value to add to the beginning of this List
     * @throws NullPointerException if no value is provided or the provided value is null
     * @code Inserts the specified element at the beginning of this list.
     */
    @Override
    public void addFirst(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param e the value to add to the end of this List
     * @throws NullPointerException if no value is provided or the provided value is null
     * @code Inserts the specified element to the end of this list.
     */
    @Override
    public void addLast(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @code Removes all the elements from this list.
     */
    @Override
    public void clear()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return a shallow copy of this LinkedList
     */
    @Override
    public Object clone()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find the existence of in this LinkedList
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if the provided Object has been found, false otherwise
     */
    @Override
    public boolean contains(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to find the existence of in this LinkedList
     * @throws NullPointerException if no Collection is provided or the Collection variable provided is null
     * @return false if any value in the provided Collection is null or cannot be found in this LinkedList, true otherwise
     */
    @Override
    public boolean containsAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return an iterator over the elements in this deque in reverse sequential order
     */
    @Override
    public Iterator<E> descendingIterator()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @throws NoSuchElementException if this List is empty
     * @return the value at the head (first element)
     */
    @Override
    public E element()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to retrieve a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the element at the specified position in this list
     */
    @Override
    public E get(int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the first element in this list
     */
    @Override
    public E getFirst()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the last element in this list
     */
    @Override
    public E getLast()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find the location of the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return the index of the first occurrence of the specified element in this list or -1 if not found
     */
    @Override
    public int indexOf(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return true if this LinkedList contains no values, false otherwise
     */
    @Override
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return an iterator over the elements in this list, in proper sequence
     */
    @Override
    public Iterator<E> iterator()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find the location of the last occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return the index of the last occurrence of the specified element in this list or -1 if not found
     */
    @Override
    public int lastIndexOf(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return a list-iterator over the elements in this list (in proper sequence)
     */
    @Override
    public ListIterator<E> listIterator()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to start this listIterator from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return a list-iterator over the elements in this list (in proper sequence), starting at the specified position in this list
     */
    @Override
    public ListIterator<E> listIterator(int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param e the value to offer to this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value was successfully added as the tail element of this list
     * @code Adds the specified element as the tail (last element) of this list.
     */
    @Override
    public boolean offer(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param e the value to offer to this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value was successfully added as the head element of this list
     * @code Inserts the specified element at the front of this list.
     */
    @Override
    public boolean offerFirst(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param e the value to offer to this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value was successfully added as the tail element of this list
     * @code Inserts the specified element at the end of this list.
     */
    @Override
    public boolean offerLast(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @throws NoSuchElementException if this List is empty
     * @return the head (first element) of this list
     * @code Retrieves, but does not remove, the head (first element) of this list.
     */
    @Override
    public E peek()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the first element of this list or null if this list is empty
     * @code Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
     */
    @Override
    public E peekFirst()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the last element of this list or null if this list is empty
     * @code Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
     */
    @Override
    public E peekLast()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @throws NoSuchElementException if this List is empty
     * @return the value in the Node previously at head
     * @code Retrieves and removes the head (first element) of this list.
     */
    @Override
    public E poll()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the value in the Node previously at head or null if this List is empty
     * @code Retrieves and removes the first element of this list, or returns null if this list is empty.
     */
    @Override
    public E pollFirst()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the value in the Node previously at tail or null if this List is empty
     * @code Retrieves and removes the last element of this list, or returns null if this list is empty.
     */
    @Override
    public E pollLast()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the value at the top of the stack represented by this list
     * @code Pops an element from the stack represented by this list.
     */
    @Override
    public E pop()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param e the value to be added onto the stack represented by this list
     * @throws NullPointerException if no value is provided
     * @code Pushes an element onto the stack represented by this list.
     */
    @Override
    public void push(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the value in the Node previously at head
     * @code Retrieves and removes the head (first element) of this list.
     */
    @Override
    public E remove()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to remove a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value previously at the provided index
     * @code Removes the element at the specified position in this list.
     */
    @Override
    public E remove(int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find and remove the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if this LinkedList has been modified, false otherwise
     * @code Removes the first occurrence of the specified element from this list, if it is present.
     */
    @Override
    public boolean remove(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the first element from this list
     * @throws NoSuchElementException if this List is empty
     * @code Removes and returns the first element from this list.
     */
    @Override
    public E removeFirst()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find and remove the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if this List has been modified, false otherwise
     * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
     */
    @Override
    public boolean removeFirstOccurrence(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the last element from this list
     * @throws NoSuchElementException if this List is empty
     * @code Removes and returns the last element from this list.
     */
    @Override
    public E removeLast()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find and remove the last occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if this List has been modified, false otherwise
     * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
     */
    @Override
    public boolean removeLastOccurrence(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to remove if found in this List
     * @throws NullPointerException if no Collection is provided or the provided Collection is 'null'
     * @return true if this List has been modified, false otherwise
     * @code If no Collection is provided, the function throws a NullPointerException(). Otherwise, if any value in this List is found in the provided Collection, the function removes it from this List. In the end, if the List has been changed in any way, the function returns true.
     */
    @Override
    public boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to keep if found in this List
     * @throws NullPointerException if no Collection is provided
     * @return true if this List has been modified, false otherwise
     * @code If no Collection is provided, the function throws a NullPointerException(). Otherwise, if any value in this List is not found in the provided Collection, the function removes it from this List. In the end, if the list has been changed in any way, the function returns true.
     */
    @Override
    public boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to replace a value
     * @param element the replacement value for the specified index
     * @throws NullPointerException if no replacement value is provided
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the specified index BEFORE replacement
     * @code Replaces the element at the specified position in this list with the specified element.
     */
    @Override
    public E set(int index, E element)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the number of elements in this list
     */
    @Override
    public int size()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return an array containing all the elements in this list in proper sequence (from first to last element)
     */
    @Override
    public Object[] toArray()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param a an array of type T into which to copy values from this LinkedList into
     * @throws NullPointerException if no array of type T is provided
     * @throws ClassCastException if T is not of the same type as E
     * @return an array containing all the elements in this list in proper sequence (from first to last element); the runtime of the returned array is that of the specified array
     */
    @Override
    public <T> T[] toArray(T[] a)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return a String representation of this LinkedList that is easier for the user to understand
     */
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
