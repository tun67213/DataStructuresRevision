
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

    /**
     * @code Removes all the elements from this list.
     */
    @Override
    public void clear()
    {

    }

    /**
     * @param o the Object to compare with this List
     * @throws NullPointerException if no Object is provided
     * @throws ClassCastException if the provided Object is not an AbstractList
     * @return true if the Object is an exact match, false otherwise
     */
    @Override
    public boolean equals(Object o)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param index the location at which to retrieve a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the provided index
     * @code Returns the element at the specified position in this list.
     */
    @Override
    public abstract E get(int index);

    /**
     * @return the hash code value for this list
     */
    @Override
    public int hashCode()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param o the Object to find the location of the first occurrence of
     * @throws NullPointerException if the provided Object is null
     * @return the location of the first occurrence of the provided Object, or -1 if not found
     */
    @Override
    public int indexOf(Object o)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @return an iterator over the elements in this list in proper sequence
     */
    @Override
    public Iterator<E> iterator()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param o the Object to find the location of the last occurrence of
     * @throws NullPointerException if the provided Object is null
     * @return the location of the last occurrence of the provided Object
     */
    @Override
    public int lastIndexOf(Object o)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @return a list iterator over the elements in this list (in proper sequence)
     */
    @Override
    public ListIterator<E> listIterator()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param index the location at which to start this list iterator from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return a list iterator over the elements in this list (in proper sequence), starting at the specified index
     */
    @Override
    public ListIterator<E> listIterator(int index)
    {
        throw new UnsupportedOperationException();
    }
}
