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
}
