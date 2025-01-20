package src.Java_SE_6;

/**
 * @author arvindhvelrajan
 * @param <T> Generic variable for this interface
 * @code Interface that implements Iterable for Java SE 6
 */
public interface Iterable<T>
{
	/**
	 * @return an iterator over a set of elements of type T
	 */
	Iterator<T> iterator();
}
