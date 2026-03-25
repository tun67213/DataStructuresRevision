package Java_SE_5;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this interface
 * @code This interface implements Iterable for Java SE 5.
 */
public interface Iterable<T>
{
	/**
	 * @return an iterator over a set of elements of type T
	 */
	Iterator<T> iterator();
}
