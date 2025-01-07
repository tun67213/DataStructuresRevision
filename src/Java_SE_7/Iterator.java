package src.Java_SE_7;

// To return back to the README.md for this file, click here: https://github.com/tun67213/DataStructuresRevision/blob/main/README.md
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

    /**
     * @code Removes from the underlying collection the last element returned by this iterator.
     */
    void remove();
}
