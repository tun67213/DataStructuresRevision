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
}
