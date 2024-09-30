
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
}
