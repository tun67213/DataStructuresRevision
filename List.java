
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
}
