package src;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this class
 */
public interface Iterable<T>
{
    /**
     * @return an iterator over a set of elements of type T
     */
    Iterator<T> iterator();
}
