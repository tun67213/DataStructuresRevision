package src;

// To return back to the README.md for this file, click here: https://github.com/tun67213/DataStructuresRevision/blob/main/README.md
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

    /**
     * @return an iterator over the elements in this list
     */
    @Override
    public Iterator<E> iterator()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param index the location at which to create this list iterator from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return a list iterator over the elements in this List, starting at the specified index
     */
    @Override
    public abstract ListIterator<E> listIterator(int index);

    /**
     * @param index the location at which to remove a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value previously at the specified index
     * @code Removes the element at the specified position in this list.
     */
    @Override
    public E remove(int index)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param index the location at which to switch value
     * @param element the value to switch with at the specified index
     * @throws NullPointerException if no element is provided or the provided element is 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value previously at the specified index
     * @code Replaces the element at the specified position in this list with the specified element.
     */
    @Override
    public E set(int index, E element)
    {
        throw new UnsupportedOperationException();
    }
}
