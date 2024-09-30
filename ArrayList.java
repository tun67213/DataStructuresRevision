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

    /**
     * @param e the value to be added to the end of this ArrayList
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if the value was added to the end of this ArrayList successfully
     */
    @Override
    public boolean add(E e)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param index the location at which to insert the specified element in this ArrayList
     * @param element the value to be added to the specified location in this ArrayList
     * @throws NullPointerException if no element variable is provided or the provided variable is 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @code If no element is provided or the provided element is null, the function throws a NullPointerException(). If the provided index is out of bounds, the function throws an IndexOutOfBoundsException(). Otherwise, it shifts elements to the right and allocates space for this element.
     */
    @Override
    public void add(int index, E element)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
