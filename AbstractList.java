
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this abstract class
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
    /**
     * @code Counts the number of times this list has been structurally modified
     */
    protected int modCount;

    /**
     * @code Sole constructor.
     */
    protected AbstractList()
    {

    }

    /**
     * @param e the value to add to the end of this AbstractList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if this AbstractList has been modified
     */
    @Override
    public boolean add(E e)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param index the location at which to add the specified value
     * @param element the value to add at the specified index
     * @throws NullPointerException if no element is provided
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return true if this AbstractList has been modified
     * @code Inserts the specified element at the specified position in this list.
     */
    @Override
    public void add(int index, E element)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param index the location at which to start adding values into this List
     * @param c Collection of values to add to this List, starting at the specified index
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or any value IN the provided Collection is null
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return true if this Abstract List has been modified, false otherwise
     */
    @Override
    public boolean addAll(int index, Collection<? extends E> c)
    {
        throw new UnsupportedOperationException();
    }
}
