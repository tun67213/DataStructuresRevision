package src;

// To return back to the README.md for this file, click here: https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#randomaccessjava-serializablejava-cloneablejava
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface Collection<E> extends Iterable<E>
{
    /**
     * @param e the value to add to the end of this Collection
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if the Collection has accepted the provided value
     * @code Ensures that this collection contains the specified element.
     */
    boolean add(E e);

    /**
     * @param c Collection of values to add to the end of this Collection
     * @throws NullPointerException if no Collection is provided or the provided Collection variable is 'null' or any value in the provided Collection is 'null'
     * @return false if the provided Collection is empty, true if all the values have been added to the end of this Collection, in the order returned by this Collection's iterator
     */
    boolean addAll(Collection<? extends E> c);

    /**
     * @code Removes all the elements from this collection.
     */
    void clear();

    /**
     * @param o the Object to find the existence of in this Collection
     * @throws NullPointerException if no Object is provided
     * @return true if the provided Object is found, false otherwise
     */
    boolean contains(Object o);

    /**
     * @param c Collection of values to find the existence of in this Collection
     * @throws NullPointerException if no Collection is provided, or the provided Collection variable is defined as 'null'
     * @return true if the provided Collection is empty or all the values in the provided Collection were found, false otherwise
     */
    boolean containsAll(Collection<?> c);

    /**
     * @param o the Object to compare with this Collection
     * @throws NullPointerException if no Object was provided, or the provided Object variable was null
     * @return true if the provided Object matches this Collection exactly, false otherwise
     */
    @Override
    boolean equals(Object o);

    /**
     * @return the hash code value for this collection
     */
    @Override
    int hashCode();

    /**
     * @return true if this collection contains no elements, false otherwise
     */
    boolean isEmpty();

    /**
     * @return an iterator over the elements in this collection
     */
    @Override
    Iterator<E> iterator();

    /**
     * @param o the Object to remove the first occurrence of
     * @throws NullPointerException if no Object is provided
     * @return true if this Collection has been modified, false otherwise
     * @code If no Object is provided, the function throws a NullPointerException(). Otherwise, the function will search for the first occurrence of the provided value in this Collection. If found, the function will remove it and return true. Otherwise, it will return false.
     */
    boolean remove(Object o);

    /**
     * @param c Collection of values to remove if found
     * @throws NullPointerException if no Collection variable is provided, or the provided Collection is defined as 'null'
     * @return true if this Collection has been modified, false otherwise
     * @code If no Collection variable is provided or the provided Collection variable is defined as null, the function throws a NullPointerException(). If the provided Collection is empty, the function returns false immediately. Otherwise, the function will cross-check every element in this Collection and see if it is contained in the provided Collection c. If contained, the function will remove it. In the end, if this Collection is not the same as it started, the function will return true. Otherwise, it will return false.
     */
    boolean removeAll(Collection<?> c);

    /**
     * @param c Collection of values to keep if found
     * @throws NullPointerException if no Collection variable is provided, or the provided Collection is defined as 'null'
     * @return true if this Collection has been modified, false otherwise
     * @code If no Collection variable is provided or the provided Collection variable is defined as null, the function throws a NullPointerException(). If the provided Collection is empty, the function resets this Collection and returns true. Otherwise, any value that isn't a part of the provided Collection is removed from this Collection. In the end, the function returns true if this Collection has been modified in any way (i.e. at least ONE value was removed), false otherwise.
     */
    boolean retainAll(Collection<?> c);

    /**
     * @return the number of elements in this collection
     */
    int size();

    /**
     * @return an array containing all the elements in this Collection
     */
    Object[] toArray();

    /**
     * @param a an array of type T to copy the values of this Collection into
     * @throws NullPointerException if no array variable is provided or the provided array variable is defined as 'null'
     * @return the provided array 'a' of type T with values from this Collection copied into it
     */
    <T> T[] toArray(T[] a);
}
