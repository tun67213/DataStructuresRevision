
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this abstract class
 */
public abstract class AbstractCollection<E> implements Collection<E>
{
    /**
     * @code Sole constructor
     */
    protected AbstractCollection()
    {

    }

    /**
     * @param e the value to be added to this Collection
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if this collection contains the specified element
     */
    @Override
    public boolean add(E e)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param c Collection of values to add to the end of this Collection
     * @throws NullPointerException if the provided Collection is null or any value in it is null
     * @return true if this AbstractCollection has changed
     * @code Adds all the elements in the specified collection to this collection.
     */
    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @code Removes all the elements from this Collection.
     */
    @Override
    public void clear()
    {
        throw new UnsupportedOperationException();
    }
}
