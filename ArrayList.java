/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class ArrayList<E>
{
    private int size;
    private int capacity;
    private E[] values;

    /**
     * @code Default constructor
     */
    public ArrayList()
    {

    }

    /**
     * @param c Collection of values to initialize this ArrayList with
     * @throws NullPointerException if no Collection variable is provided or any value in the provided Collection is 'null'
     * @code Initializes this ArrayList with values from the provided Collection
     */
    public ArrayList(Collection<? extends E> c)
    {

    }

    /**
     * @param initialCapacity the number of elements the array representing this ArrayList should initially hold
     * @code Initializes this ArrayList by creating an array that is of 'initialCapacity' elements
     */
    public ArrayList(int initialCapacity)
    {

    }

    /**
     * @code This function makes sure that the array representing this ArrayList has enough space to hold the provided value, and if not, reallocate to a new array.
     */
    private void ensureCapacity()
    {
        
    }
}
