package src.Java_SE_9;

/**
 * @param <E> Generic variable for this class
 * @code This class implements the methods involved with AbstractList for Java SE 9
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
	// This variable keeps track of the number of times this list has been structurally modified
	protected int modCount;
}
