
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public abstract class AbstractSequentialList<E> extends AbstractList<E>
{
    private int modCount;

    /**
     * @code Sole constructor.
     */
    protected AbstractSequentialList()
    {
        
    }

    /**
     * @param index the location at which to add value
     * @param element the value to be added to the specified index
     * @throws NullPointerException if no Object is provided
     * @throws IndexOutOfBoundsException if the provided Index is out of bounds
     * @code Inserts the specified element at the specified position in this list.
     */
    @Override
    public void add(int index, E element)
    {

    }

    /**
     * @param index the location at which to start adding the values in this Collection
     * @param c Collection of values to add to the specified index
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is 'null' or any value IN the provided Collection variable is null
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return true if this List has been modified, false if the provided Collection is empty
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param index the location at which to retrieve a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the element at the specified position in this list
     */
    @Override
    public E get(int index)
    {
        throw new UnsupportedOperationException();
    }
}
