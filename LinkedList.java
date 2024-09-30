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
}
