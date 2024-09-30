
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this Queue
 */
public interface Queue<E>
{
    /**
     * @param e value to add into this Queue
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @throws IllegalStateException if no space is available in this Queue
     * @return true if the provided value was added successfully
     */
    @Override
    boolean add(E e);
}
