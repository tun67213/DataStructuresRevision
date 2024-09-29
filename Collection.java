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

    /**
     * @param o the Object to find the existence of in this Collection
     * @throws NullPointerException if no Object is provided
     * @return true if the provided Object is found, false otherwise
     */
    boolean contains(Object o);

    /**
     * @param c Collection of values to find the existence of in this Collection
     * @throws NullPointerException if no Collection is provided, or the provided Collection variable is defined as 'null'
     * @return true if the provided Collection is empty or all the values in the provided Collection were found, false otherwise
     */
    boolean containsAll(Collection<?> c);

    /**
     * @param o the Object to compare with this Collection
     * @throws NullPointerException if no Object was provided, or the provided Object variable was null
     * @return true if the provided Object matches this Collection exactly, false otherwise
     */
    @Override
    boolean equals(Object o);
}
