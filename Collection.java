/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Collection<E> extends Iterable<E>
{
    /**
     * @param e the value to add to the end of this Collection
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if the Collection has accepted the provided value
     * @code Ensures that this collection contains the specified element.
     */
    boolean add(E e);

    /**
     * @param c Collection of values to add to the end of this Collection
     * @throws NullPointerException if no Collection is provided or the provided Collection variable is 'null' or any value in the provided Collection is 'null'
     * @return false if the provided Collection is empty, true if all the values have been added to the end of this Collection, in the order returned by this Collection's iterator
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * @code Removes all the elements from this collection.
     */
    void clear();
}
