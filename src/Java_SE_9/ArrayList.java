package src.Java_SE_9;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable fo this class
 * @code This class implements the methods associated with ArrayList for Java SE 9.
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
	/**
	 * @code Constructs an empty list with an initial capacity of ten.
	 */
	public ArrayList()
	{

	}

	/**
	 * @param initialCapacity the initial capacity to create this ArrayList with
	 * @throws IllegalArgumentException if the provided initial capacity is negative
	 * @code Constructs an empty list with the specified initial capacity.
	 */
	public ArrayList(int initialCapacity)
	{

	}

	/**
	 * @param c Collection of values to initialize this ArrayList with
	 * @throws NullPointerException if the provided Collection is null
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public ArrayList(Collection<? extends E> c)
	{

	}

	/**
	 * @param e the value to be added to this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if this ArrayList has been modified, false otherwise
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to add the specified value
	 * @param element the value ot be added to the specified index in this ArrayList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
