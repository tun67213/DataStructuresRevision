
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface List<E> extends Collection<E>
{
    /**
     * @param e the value to be added to the end of this List
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if this List has been modified (If not, the function will have already throws an exception)
     */
    @Override
    boolean add(E e);

    /**
     * @param index the location at which to add the specified element
     * @param element the value to add to the specified index in this List
     * @throws NullPointerException if no value is provided
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @code Inserts the specified element at the specified position in this list.
     */
    void add(int index, E element);

    /**
     * @param c Collection of values to add to the end of this LIst
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is defined as 'null'
     * @return true if this List has been modified, false if the provided Collection is empty
     * @code If no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is null, the function throws a NullPointerException(). Otherwise, the function adds the values in the provided Collection to the end of this List in the order returned by the Collection's iterator.
     */
    @Override
    boolean addAll(Collection<? extends E> c);

    /**
     * @param index the location at which the FIRST value returned by the Collection's iterator must go, with everything else after it
     * @param c Collection of values to add to the end of this LIst
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is defined as 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return true if this List has been modified, false if the provided Collection is empty
     * @code If no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is null, the function throws a NullPointerException(). Otherwise, the function adds the values in the provided Collection to this List, starting at the specified index in this List, in the order returned by the Collection's iterator.
     */
    boolean addAll(int index, Collection<? extends E> c);
}
