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


