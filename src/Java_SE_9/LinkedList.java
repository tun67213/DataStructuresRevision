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

	/**
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or if the provided Collection contains null values
	 * @return true if all the values have been successfully added to the end of this LinkedList, false if the provided Collection is empty
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to start adding values from the provided Collection into this LinkedList
	 * @param c Collection of values to add to this LinkedList
	 * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or the provided Collection contains null values
	 * @return true if all the values have been successfully added to this LinkedList, starting from the specified index
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to add to the beginning of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param e the value to add to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * d@code Appends the specified element to the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
