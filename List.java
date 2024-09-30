
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this interface
 */
public interface List<E> extends Collection<E>
{
    /**
     * @param e the value to be added to the end of this List
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @return true if this List has been modified (If not, the function will have already throws an exception)
     */
    @Override
    boolean add(E e);

    /**
     * @param index the location at which to add the specified element
     * @param element the value to add to the specified index in this List
     * @throws NullPointerException if no value is provided
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @code Inserts the specified element at the specified position in this list.
     */
    void add(int index, E element);

    /**
     * @param c Collection of values to add to the end of this LIst
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is defined as 'null'
     * @return true if this List has been modified, false if the provided Collection is empty
     * @code If no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is null, the function throws a NullPointerException(). Otherwise, the function adds the values in the provided Collection to the end of this List in the order returned by the Collection's iterator.
     */
    @Override
    boolean addAll(Collection<? extends E> c);

    /**
     * @param index the location at which the FIRST value returned by the Collection's iterator must go, with everything else after it
     * @param c Collection of values to add to the end of this LIst
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is defined as 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return true if this List has been modified, false if the provided Collection is empty
     * @code If no Collection variable is provided, the provided Collection variable is defined as 'null', or any value IN the provided Collection is null, the function throws a NullPointerException(). Otherwise, the function adds the values in the provided Collection to this List, starting at the specified index in this List, in the order returned by the Collection's iterator.
     */
    boolean addAll(int index, Collection<? extends E> c);

    /**
     * @code Removes all the elements from this list.
     */
    @Override
    void clear();

    /**
     * @param o the Object to find the existence of in this List
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if the provided Object exists in this List, false otherwise
     */
    @Override
    boolean contains(Object o);

    /**
     * @param c Collection of values to find the existence of in this List
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is null
     * @return true if the provided Collection is empty or all the values in the provided Collection are found, false if any value is null or not found
     */
    @Override
    boolean containsAll(Collection<?> c);

    /**
     * @param o the Object to compare with this List
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if the provided Object is the same length as this List and contains the exact same values as this list, false otherwise
     * @code Compares the specified object with this list for equality.
     */
    @Override
    boolean equals(Object o);

    /**
     * @param index the location at which to retrieve a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the specified index, given it is valid
     * @code If the provided index is out of bounds, the function throws an IndexOutOfBoundsException(). Otherwise, the function returns the value at the specified index in this List.
     */
    E get(int index);

    /**
     * @return the hash code value for this List
     */
    @Override
    int hashCode();

    /**
     * @param o the Object to find the location of the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return the location of the first occurrence of the provided Object
     */
    int indexOf(Object o);

    /**
     * @return true if this List contains no elements, false otherwise
     */
    @Override
    boolean isEmpty();

    /**
     * @return an iterator over the elements in this List in proper sequence
     */
    @Override
    Iterator<E> iterator();

    /**
     * @param o the Object ot find the location of the last occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return the location of the last occurrence of the provided Object
     */
    int lastIndexOf(Object o);

    /**
     * @return a list iterator over the elements in this list (in proper sequence)
     */
    ListIterator<E> listIterator();

    /**
     * @param index the location at which to start in this List
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return a list iterator over the elements in this list (in proper sequence), starting at the specified index
     */
    ListIterator<E> listIterator(int index);

    /**
     * @param index the location at which to remove a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the provided index before removal
     * @code Removes the element at the specified position in this list.
     */
    E remove(int index);

    /**
     * @param o the Object to find and remove the first occurrence of if found
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if this List has been modified, false otherwise
     * @code If no Object is provided, the function throws a NullPointerException(). Otherwise, the function will search for the provided Object. If found, it will remove that index from this List. Finally, if a change WAS made to this List, the function returns true. Otherwise, it returns false.
     */
    @Override
    boolean remove(Object o);

    /**
     * @param c Collection of values to remove if found
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is null
     * @return true if this List has been modified, false otherwise
     * @code If no Collection variable is provided or the provided Collection variable is defined as 'null', the function throws a NullPointerException(). If the provided Collection variable is empty, the function returns false immediately. If any value in the provided Collection is found in this List, the function will proceed and remove that function from this List. In the end, if this List has been modified, the function will return true. Otherwise, it will return false.
     */
    @Override
    boolean removeAll(Collection<?> c);

    /**
     * @param c Collection of values to keep if found
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is null
     * @return true if this List has been modified, false otherwise
     * @code If no Collection variable is provided or the provided Collection variable is defined as 'null', the function throws a NullPointerException(). If the provided Collection variable is empty, the function will reset this List to default and return true. Otherwise, if a value in this List isn't contained in the specified Collection, the value will be removed from this List. The function returns true if this List has gone through changes, false otherwise.
     */
    @Override
    boolean retainAll(Collection<?> c);
}
