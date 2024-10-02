
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
    private int modCount;   // Counts the number of structural changes that occur to this ArrayList
    private int size;
    private int capacity;
    private E[] array;

    /**
     * @code Default constructor for this class
     */
    public ArrayList()
    {

    }

    /**
     * @param c Collection of values to initialize this ArrayList with
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or any variable in the provided Collection is null
     * @code This constructor creates a new ArrayList and initializes it with values from this Collection, in the order returned by this Collection's iterator.
     */
    public ArrayList(Collection<? extends E> c)
    {

    }

    /**
     * @param initialCapacity capacity to initialize this ArrayList with
     * @throws IllegalArgumentException if the provided index is less than or equal to 0
     * @code This constructor will initialize this ArrayList with an initialCapacity number of values allocated in the array
     */
    public ArrayList(int initialCapacity)
    {

    }

    /**
     * @code Makes sure that the array representing this ArrayList has enough capacity, and if not, expands the storage.
     */
    private void ensureCapacity()
    {

    }

    /**
     * @param e the value to be added to the end of this ArrayList
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if this value has been added successfully
     * @code Appends the specified element to the end of this list.
     */
    @Override
    public boolean add(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to add the specified element
     * @param element the value to be added to the specified element in the array representing this ArrayList
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @code If no element is provided or the provided element is null, the function throws a NullPointerException(). if the provided index is out of bounds, the function throws an IndexOutOfBoundsException(). Otherwise, it calls ensureCapacity(), shifts elements over to the right to allocate the value provided, and then inserts it into the provided index by assigning it there.
     */
    @Override
    public void add(int index, E element)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to add to the end of this ArrayList
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or any value in the provided Collection variable is 'null'
     * @return true if values have been added to this ArrayList, modifying it, false if the provided Collection is empty
     * @code If no Collection variable is provided, the provided Collection variable is defined as 'null' or the provided Collection variable contains 'null' values, the function throws a NullPointerException(). Otherwise, the function adds the values in the provided Collection in the order returned by the Collection's iterator to the end of this ArrayList, calling ensureCapacity() each time.
     */
    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which the FIRST value of this Collection must go
     * @param c Collection of values to add to the specified index in this ArrayList
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is 'null' or the provided Collection variable contains values that are 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return true if this ArrayList has been modified, false if the provided Collection is empty
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c)
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
     * @return a shallow copy of this ArrayList
     */
    @Override
    public Object clone()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find the existence of in this Arraylist
     * @throws NullPointerException if the provided element is 'null'
     * @return true if this list contains the specified element, false otherwise
     */
    @Override
    public boolean contains(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to find the existence of in this ArrayList
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is null
     * @return false if a value in the provided Collection is 'null' or could not be found in this Arraylist, true if all values were found
     */
    @Override
    public boolean containsAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to retrieve a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the specified index in this List
     */
    @Override
    public E get(int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find the location of the first occurrence of
     * @throws NullPointerException if the provided index is out of bounds
     * @return the location of the first occurrence of the provided index or -1 if not found
     */
    @Override
    public int indexOf(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return true if this list contains no elements, false otherwise
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
     * @param o the Object to find the last occurrence of
     * @throws NullPointerException if no Object is provided
     * @return the location of the last occurrence of the provided Object or -1 if not found
     */
    @Override
    public int lastIndexOf(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return a list iterator over the elements in this list (in proper sequence)
     */
    @Override
    public ListIterator<E> listIterator()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to start this List Iterator from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in this list
     */
    @Override
    public ListIterator<E> listIterator(int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to remove a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the specified index prior to removal
     * @code If the provided index is out of bounds, the function throws an IndexOutOfBoundsException(). Otherwise, the function saves the value at the specified index, removes it, and then returns that removed value back to the user.
     */
    @Override
    public E remove(int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param o the Object to find and remove the first occurrence of
     * @throws NullPointerException if the provided index is out of bounds
     * @return true if this ArrayList has been modified, false otherwise
     * @code If no Object is provided or the provided Object is 'null' the function throws a NullPointerException(). Otherwise, if the provided Object is found, it removes the first occurrence of it from this List and returns true.
     */
    @Override
    public boolean remove(Object o)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to remove if located in this ArrayList
     * @throws NullPointerException if no Collection is provided or the provided Collection variable is null.
     * @return true if this ArrayList has been modified, false otherwise.
     * @code If no Collection variable is provided, the function throws a NullPointerException(). Otherwise, the function runs through the values in the order returned by its iterator, and if a value is found in this List, the function will remove it from this ArrayList. In the end, if this ArrayList has been structurally modified, the function returns true.
     */
    @Override
    public boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param fromIndex the index, inclusive of which, to start removing from
     * @param toIndex the index, exclusive of which, to remove values until
     * @throws IndexOutOfBoundsException if either index is out of bounds
     * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
     * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
     */
    @Override
    protected void removeRange(int fromIndex, int toIndex)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param c Collection of values to keep if found in this ArrayLIst
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is 'null'
     * @return true if this ArrayList has been modified, false otherwise
     * @code If no Collection is provided or the variable provided is defined as 'null' the function throws a NullPointerException(). Otherwise, if a value in this ArrayList isn't contained in the provided Collection, the function removes it. In the end, if at least one value was removed, the function returns true. Otherwise, the function returns false.
     */
    @Override
    public boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to replace value
     * @param element the replacement value for this ArrayList
     * @throws NullPointerException if no element is provided or the provided element is null
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value previously at the specified index
     * @code Replaces the element at the specified position in this list with the specified element.
     */
    @Override
    public E set(int index, E element)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the number of elements in this ArrayList
     */
    @Override
    public int size()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param fromIndex the index (inclusive of) from which to create this new List
     * @param toIndex the index (exclusive of) to create this new List until
     * @throws IndexOutOfBoundsException if any of these indices are out of bounds
     * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
     * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex)
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
     * @param a array into which to copy values from this ArrayList
     * @throws NullPointerException if no array variable is provided or the provided variable is null
     * @return the provided array with values from this List accommodated into it
     */
    @Override
    public <T> T[] toArray(T[] a)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @code Trims the capacity of this ArrayList instance to be the list's current size.
     */
    public void trimToSize()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return a String representation of this ArrayList
     */
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
