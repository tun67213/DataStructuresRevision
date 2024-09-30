
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Deque<E> extends Queue<E>
{
    /**
     * @param e the value to be added to this Deque
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if adding was successful
     */
    @Override
    boolean add(E e);
}
