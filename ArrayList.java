
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
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
}
