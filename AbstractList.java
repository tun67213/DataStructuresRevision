
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this abstract class
 */
public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>
{
    /**
     * @code Counts the number of times this list has been structurally modified
     */
    protected int modCount;

    /**
     * @code Sole constructor.
     */
    protected AbstractList()
    {

    }
}
