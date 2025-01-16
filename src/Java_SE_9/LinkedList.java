package src.Java_SE_9;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class implements the methods associated with LinkedList for Java SE 9.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code Constructs an empty list.
	 */
	public LinkedList()
	{

	}

	/**
	 * @param c Collection of values to initialize this LinkedList with
	 * @throws NullPointerException if the provided Collection contains any null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{

	}

	/**
	 * @param e the value to be added to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added to this LinkedList
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to add the specified element to this LinkedList
	 * @param element the value to be added to the specified index in this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
