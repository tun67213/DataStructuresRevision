# DataStructuresRevision
## Description
    This project is designed to demonstrate the linking between various data structures, and their usage.
    The project will focus on covering the functions for interfaces, and then the functions for the classes themselves.
## Interfaces
The following are the interfaces and the functions they will contain.

### RandomAccess.java, Serializable.java, Cloneable.java
    The three interfaces mentioned above are all empty interfaces, i.e., they contain no functions.

### Iterator.java

#### Functions

##### boolean hasNext()
    Returns:
        true if the iteration has more elements, false otherwise
##### E next()
    Throws:
        NoSuchElementException() if hasNext() returns false
    Returns:
        The next element in the iterator
##### void remove()
    Throws:
        NoSuchElementException() if current is null
    Functionality:
        If current is null, the function throws NoSuchElementException().
        Otherwise, removes the value pointed to by current and adjusts the iterator's state.
        After removal, sets current to null to prevent consecutive calls to remove().


### Iterable.java

#### Functions
##### Iterator<T> iterator()
    Returns:
        an iterator over a set of elements of type T


### ListIterator.java extends Iterator<E>
#### Functions
##### void add(E e)
    Variables:
        E e:
            Variable to be added into the list
    Throws:
        NullPointerException() if no value is provided
    Functionality:
        If no value is provided, throws a NullPointerException().
        Otherwise, adds the value to this ListIterator.
##### boolean hasNext()
    Returns:
        true if this list iterator has more elements when traversing the list in the forward direction, false otherwise
##### boolean hasPrevious()
    Returns:
        true if this list iterator has more elements when traversing the list in the reverse direction, false otherwise
##### E next()
    Throws:
        NoSuchElementException() if hasNext() returns false
    Returns:
        the next value in the iteration
##### int nextIndex()
    Returns:
        the index of the value that would be returned by a subsequent call to next() 
##### E previous()
    Throws:
        NoSuchElementException() if hasPrevious() returns false
    Returns:
        the previous value in the iteration
##### int previousIndex()
    Returns:
        the index of the value that would be returned by a subsequent call to previous()
##### void remove()
    Throws:
        NoSuchElementException() if no values are pointed to right now
    Functionality:
        Removes from the list the last element that was returned by next() or previous().
##### void set(E e)
    Variables:
        E e:
            The value to be set to the index currently pointed to by this ListIterator
    Throws:
        NullPointerException() if no value is provided
    Functionality:
        Sets the value returned by next() or previous() to the provided value e


### Collection.java extends Iterable<E>

#### Functions
##### boolean add(E e)
    Variables:
        E e:
            the Object to be added to this collection
    Throws:
        NullPointerException() if no value is provided or the provided value is null
    Returns:
        true if the value has successfully been added to this Collection
    Functionality:
        Ensures that this collection contains the specified element.
##### boolean addAll(Collection<? extends E> c)
    Variables:
        Collection<? extends E> c:
            Collection of values to add to the end of this Collection
    Throws:
        NullPointerException() if no Collection is provided or any value inside the input Collection c is null
    Returns:
        true if this Collection has been modified, false if the provided Collection is empty
    Functionality:
        If no Collection is provided, the fucntion throws a NullPointerException().
##### void clear()
    Functionality:
        Removes all the elements from this collection.
##### boolean contains(Object o)
    Variables: 
        Object o:
            the Object to find the existence of in this Collection
    Throws:
        NullPointerException() if no Object is provided
    Returns:
        True if the provided Object is found in this Collection, false otherwise
##### boolean containsAll(Collection<?> c)
    Variables:
        Collection<?> c:
            Collection of values to find the existence of in this Collection
    Throws:
        NullPointerException() if no Collection variable is provided or the provided Collection variable is 'null'
    Returns:
        False immediately if one value is not found, True if all values are found
##### boolean equals(Object o)
    Variables:
        Object o:
            The Object to compare with this Collection for equality
    Throws:
        NullPointerException() if no Object is provided
        ClassCastException() if the provided Object is not a Collection
    Returns:
        True if all values match exactly
        False if the sizes are different or a value does not match
##### int hashCode()
    Returns:
        the hash code value for this Collection
##### boolean isEmpty()
    Returns:
        True if this Collection contains no elements, False otherwise
##### Iterator<E> iterator()
    Returns:
        an iterator over the elements in this collection
##### boolean remove(Object o)
    Variables:
        Object o:
            the value to remove the first occurrence of if found
    Throws:
        NullPointerException() if no Object is provided or the provided variable is 'null'
    Returns:
        True if this Collection has been modified, False otherwise
    Functionality:
        If no value is provided or the provided value is 'null', the function throws a NullPointerException().
        Otherwise, the function will search for the provided value.
            If the first occurrence of the value is found, the function will remove it.
            Otherwise, if it reaches the end of this Collection, it will return false, meaning the Collection hasn't changed.
##### boolean removeAll(Collection<?> c)
    Variables:
        Collection<?> c:
            Collection of values to remove if found
    Throws:
        NullPointerException() if no Collection is provided
    Returns:
        True if this Collection has been modified, false otherwise
    Functionality:
        If no Collection was provided, the function throws a NullPointerException().
        If the provided Collection is empty, the function returns true immediately.
        If a value in the provided Collection is in this Collection, the function will remove it.
        In the end, if the Collection was modified in any way, the function returns true, otherwise it returns false.
##### boolean retainAll(Collection<?> c)
    Variables:
        Collection<?> c:
            Collection of values to keep if found
    Throws:
        NullPointerException() if no Collection is provided
    Returns:
        True if this Collection has been modified, false otherwise
    Functionality:
        If no Collection is provided, the function throws a NullPointerException().
        Otherwise, if a value in this Collection is not in the provided Collection, the function will remove it.
##### int size()
    Returns:
        the number of elements in this Collection
##### Object[] toArray()
    Returns:
        an array containing all the elements in this Collection
##### <T> T[] toArray(T[] a)
    Variables:
        T[] a:
            Array into which to copy values in this Collection
    Throws:
        NullPointerException() if no array is provided
    Returns:
        the array a with values from this Collection
    Functionality:
        Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.


