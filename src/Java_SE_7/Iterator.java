package Java_SE_7;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 * @code This interface adds all methods associated with Iterator for Java SE 7.
 */
public interface Iterator<E>
{
	/**
	 * @return true if the iteration has more elements
	 * false otherwise
	 * @code Returns true if the iteration has more elements.
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
