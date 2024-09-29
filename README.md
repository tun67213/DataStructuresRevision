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


### List.java extends Collection<E>

#### Functions


##### boolean add(E e)
    Variables:
        E e:
            the value to add to the end of this List
    Throws:
        NullPointerException() if no value is provided
    Returns:
        true if the value is successfully added
    Functionality:
        Appends the specified element to the end of this list.
##### void add(int index, E element)
    Variables:
        int index:
            the location at which to add the element
        E element:
            the value to add to the specified location in this List
    Throws:
        NullPointerException() if no element is provided or the provided element is 'null'
        IndexOutOfBoundsException() if the provided index is out of bounds
    Functionality:
        If no element is provided or the provided element is null, the function throws a NullPointerException().
        If the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
        Otherwise, the function allocates space for the value added and then inserts the value at the specified index.
##### boolean addAll(Collection<? extends E> c)
    Variables:
        Collection<? extends E> c:
            Collection of values to add to the end of this List in the order returned by the Collection's iterator
    Throws:
        NullPointerException() if no Collection is provided or any value in the Collection is null
    Returns:
        False if a Collection was provided, but was empty. True if all values were added successfully
    Functionality:
        If no Collection is provided or the provided Collection contains null values, the function will throw a NullPointerException().
        Otherwise, it will add the values, in the order returned by its iterator, to the end of this List. 
##### boolean addAll(int index, Collection<? extends E> c)
    Variables:
        int index:
            the location at which to start adding values from the provided Collection
        Collection<? extends E> c:
            Collection of values to add to this List, starting at the provided index
    Throws:
        NullPointerException() if no Collection is provided or any value in the provided Collection is null
        IndexOutOfBoundsException() if the provided index is out of bounds
    Returns:
        True if this List went through changes
        False otherwise
    Functionality:
        If no Collection is provided, the provided Collection variable is null, or the values in the Collection are null, the function throws a NullPointerException().
        If, on the other hand, the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
##### void clear()
    Functionality:
        Removes all the elements from this list.
##### boolean contains(Object o)
    Variables:
        Object o:
            the value to find the existence of in this List
    Throws:
        NullPointerException() if no Object is provided
    Returns:
        False if the provided Object is null or not found 
        True if the Object is found
##### boolean containsAll(Collection<?> c)
    Variables:
        Collection<?> c:
            Collection of values to find the existence of in this List
    Throws:
        NullPointerException() if no Collection is provided
    Returns:
        False if the provided Object in the Collection is null or not found
        True if all the Objects are found
##### boolean equals(Object o)
    Variables:
        Object o:
            The Object to compare with this List for equality
    Throws:
        NullPointerException() if no Object is provided
        ClassCastException() if the provided Object is not of type List<E> or of type subList<E>
    Returns:
        True if all values in this List match, False otherwise
##### E get(int index)
    Variables:
        int index:
            the location at which to retrieve a value from
    Throws:
        IndexOutOfBoundsException() if the provided index is out of bounds
    Returns:
        the value at the specified index, if the provided index is valid
##### int hashCode()
    Returns:
        the hash code value for this list
##### int indexOf(Object o)
    Variables:
        Object o:
            the Object to find the location of the first occurrence of in this List
    Throws:
        NullPointerException() if no Object is provided
    Returns:
        the location of the first occurrence of the provided Object
##### boolean isEmpty()
    Returns:
        true if this list contains no elements, false otherwise
##### Iterator<E> iterator()
    Returns:
        an iterator over the elements in this list in proper sequence
##### int lastIndexOf(Object o)
    Variables:
        Object o:
            the Object to find the location of the last occurrence of in this List
    Throws:
        NullPointerException() if no Object is provided
    Returns:
        the location of the last occurrence of the provided Object
##### ListIterator<E> listIterator()
    Returns:
        a list iterator over the elements in this list
##### ListIterator<E> listIterator(int index)
    Variables:
        int index:
            the location at which to start this ListIterator from
    Throws:
        IndexOutOfBoundsException() if the provided index is out of bounds
    Returns:
        a list iterator over the elements in this list, starting at the provided index
##### E remove(int index)
    Variables:
        int index:
            the location at which to remove a value from this List
    Throws:
        IndexOutOfBoundsException() if the provided index is out of bounds
    Returns:
        the value previously at the provided index
    Functionality:
        If the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
        Otherwise, it will do the following:
            1) Navigate to the value at the provided index.
            2) Save that to a variable.
            3) Then, proceed to removing based on the data structure that is implementing this.
##### boolean removeAll(Collection<?> c)
    Variables:
        Collection<?> c:
            Collection of values to remove if found
    Throws:
        NullPointerException() if no Collection is provided
    Returns:
        True if this List has been modified
        False otherwise
    Functionality:
        If no Collection is provided or the provided variable is 'null', the function throws a NullPointerException().
        If an empty Collection is provided, the function returns false immediately.
        If a value in the provided Collection is contained in this List, the function goes ahead and removes it.
        Eventually, once it has iterated through the whole list, if it has modified the list, it will return true. Otherwise, it will return false.
##### boolean retainAll(Collection<?> c)
    Variables:
        Collection<?> c:
            Collection of values to keep if found
    Throws:
        NullPointerException() if no Collection is provided
    Returns:
        True if this List has been modified
        False otherwise
    Functionality:
        If no Collection is provide  or the provided variable is 'null', the function throws a NullPointerException().
        If an empty Collection is provided, the function resets this List to default and returns true immediately.
        If a value in the List is not contained in the provided Collection, the function removes it from this List.
        Eventually, the function will return true if this List has been modified, false otherwise.
##### E set(int index, E element)
    Variables:
        int index:
            the location at which to swap a value
        E element:
            the value to swap the existing element with
    Throws:
        NullPointerException() if no value is provided
        IndexOutOfBoundsException() if the provided index is out of bounds
    Returns:
        the value previously at the provided index
    Functionality:
        If no element is provided or the provided element is 'null', the function throws a NullPointerException().
        If an index is provided, but is out of bounds, the function throws an IndexOutOfBoundsException().
        Otherwise, the function does the following:
            1) Uses a variable to save the value currently at the specified index.
            2) Replaces the value at the specified index with the provided value.
            3) Returns the old value to the user
##### int size()
    Returns:
        the number of elements in this List
##### List<E> subList(int fromIndex, int toIndex)
    Variables:
        int fromIndex:
            the starting index to create this List from (inclusive)
        int toIndex:
            the endingindex to create this List until (exclusive)
    Throws:
        IndexOutOfBoundsException() if any of the provided indices are out of bounds
        IllegalArgumentException() if fromIndex is greater than toIndex
    Returns:
        a subList containing values between the provided indices
##### Object[] toArray()
    Returns:
        an array containing all the elements in this list in proper sequence
##### <T> T[] toArray(T[] a)
    Variables:
        T[] a:
            Array into which to copy values from this List that are of type T[]
    Throws:
        NullPointerException() if no array is provided
    Returns:
        the provided array overridden with values from this List
##### String toString()
    Returns:
        a String representation of this List that is readable by the user


## Classes
### abstract class AbstractCollection<E> extends Object implements Collection<E>
#### Constructors
##### protected AbstractCollection()
    Functionality:
        Sole constructor.

#### Functions
##### boolean add(E e)
    Variables:
        E e:
            the value to be added to the end of this Collection
    Throws:
        NullPointerException() if no value is provided
    Returns:
        true if adding the value is successful (false is never included because it would have thrown an exception by then)
##### boolean addAll(Collection<? extends E> c)
    Variables:
        Collection<? extends E> c:
            Collection of values to add to the end of this Collection
    Throws:
        NullPointerException() if no Collection is provided, the Collection variable is null, or a value in the Collection is null
    Returns:
        true if all the values were added successfully
    Functionality:
        If no Collection was provided, the provided variable was null, or a value in the provided collection is null, the function.
##### void clear()
    Functionality:
        Removes all the elements from this collection
##### boolean contains(Object o)
    Variables:
        Object o:
            The value to find the existence of in this Collection
    Throws:
        NullPointerException() if no Object is provided
    Returns:
        true if the Object is found
        false otherwise
##### boolean containsAll(Collection<?> c)
    Variables:
        Collection<?> c:
            Collection of values to find the existence of in this Collection
    Throws:
        NullPointerException() if no Collection is provided
    Returns:
        False if a value in the provided Collection is null or not found in this Collection
        True otherwise
