package src;

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

    /**
     * @param o the Object to find the existence of in this Collection
     * @throws NullPointerException if the provided Object is null
     * @return true if the provided value is contained in this Collection, false otherwise
     */
    @Override
    public boolean contains(Object o)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param c Collection of values to find the existence of in this AbstractCollection
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is null
     * @return true if all the values in the provided Collection are found, false if a value is null or not found in this AbstractCollection
     */
    @Override
    public boolean containsAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @return true if this Collection contains no elements, false otherwise
     */
    @Override
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @return an iterator over the elements contained in this Collection
     */
    @Override
    public abstract Iterator<E> iterator();

    /**
     * @param o the Object to remove the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if this Collection has been modified, false otherwise
     * @code If no Object is provided or the provided Object is null, the function throws a NullPointerException(). Otherwise, the function iterates through this Collection, and if the provided Object is found, the function will remove it and return true. Otherwise, the function will return false.
     */
    @Override
    public boolean remove(Object o)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param c Collection of values to remove if found
     * @throws NullPointerException if no Collection is provided or the provided Collection variable is null
     * @return true if this Collection has been modified, false otherwise
     * @code If no Collection is provided or the provided Collection is defined as 'null', the function throws a NullPointerException(). Otherwise, if a value in this Collection is in the provided Collection, remove it. Finally, return true if this Collection has been modified.
     */
    @Override
    public boolean removeAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param c Collection of values to keep if found
     * @throws NullPointerException if no Collection is provided or the provided Collection variable is null
     * @return true if this Collection has been modified, false otherwise
     * @code If no Collection is provided or the provided Collection is defined as 'null', the function throws a NullPointerException(). Otherwise, if a value in this Collection is NOT in the provided Collection, remove it. Finally, return true if this Collection has been modified.
     */
    @Override
    public boolean retainAll(Collection<?> c)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @return the number of elements in this Collection
     */
    @Override
    public abstract int size();

    /**
     * @return an array containing all the elements in this collection
     */
    @Override
    public Object[] toArray()
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @param a array into which to copy values from this Collection into
     * @throws NullPointerException if the provided array variable is null
     * @return the provided array with values from this Collection allotted into it
     */
    @Override
    public <T> T[] toArray(T[] a)
    {
        throw new UnsupportedOperationException();
    }

    /**
     * @return a string representation of this Collection
     */
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException();
    }
}
