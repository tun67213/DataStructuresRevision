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


