
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for interface
 */
public interface Iterator<E>
{
    /**
     * @return true if the iteration has more elements
     */
    boolean hasNext();

    /**
     * @return the next element in the iteration
     */
    E next();
}
