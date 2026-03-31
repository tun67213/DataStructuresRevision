package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this interface
 * @code This interface adds all methods associated with Iterable for Java SE 7.
 */
public interface Iterable<T>
{
	/**
	 * @return an iterator over a set of elements of type T
	 */
	Iterator<T> iterator();
}
