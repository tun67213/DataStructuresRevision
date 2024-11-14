# DataStructuresRevision

## Description

This project is designed to demonstrate the linking between various data structures, and their usage, using Java SE 7.
The project will focus on covering the functions for interfaces, and then the functions for the classes themselves.

## Instructions for Usage

This repository has been made public for reference and educational purposes only. Please follow the steps below to clone the repository and explore the code:

    No Contributions or Changes:
    This repository is not open for contributions. Please do not attempt to push, pull, or request changes. The repository is provided as-is, and no updates or external changes will be accepted.

Instructions to get access to the files can be found [HERE] ([#instructions](https://github.com/tun67213/DataStructuresRevision/blob/main/INSTRUCTIONS.md))

    Testing the Code:
    To test the data structures (such as ArrayList and LinkedList):
        Open the Main.java file, which contains the main function.
        Instantiate the data structures by writing:
            List<'datatype'> list = new ArrayList<>();
            or
            List<'datatype'> list = new LinkedList<>();
            or
            ArrayList<'datatype'> list = new ArrayList<>();
            or
            LinkedList<'datatype'> list = new LinkedList<>();
        Use the last 2 if you desire to test functions specifically dedicated to ArrayList or LinkedList, but are not common.
        Call functions on the list using list.'functionName' and explore the available methods.

## Table of Contents

[Interfaces] ([#interfaces](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#interfaces)) <br>

- [RandomAccess] ([#random_access](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#randomaccessjava-serializablejava-cloneablejava))
    - [Open Official Documentation for RandomAccess] ([#random_access_documentation](https://docs.oracle.com/javase/7/docs/api//java/util/RandomAccess.html))
    - [Open File] ([#random_access_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/RandomAccess.java))
- [Serializable] ([#serializable](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#randomaccessjava-serializablejava-cloneablejava))
    - [Open Official Documentation for Serializable] ([#serializable_documentation](https://docs.oracle.com/javase/7/docs/api//java/io/Serializable.html))
    - [Open File] ([#serializable_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/Serializable.java))
- [Cloneable] ([#cloneable](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#randomaccessjava-serializablejava-cloneablejava))
    - [Open Official Documentation for Cloneable] ([#cloneable_documentation](https://docs.oracle.com/javase/7/docs/api//java/lang/Cloneable.html))
    - [Open File] ([#cloneable_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/Cloneable.java))
- [Iterator] ([#iterator](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#iteratorjava))
    - [Open Official Documentation for Iterator] ([#iterator_documentation](https://docs.oracle.com/javase/7/docs/api/java/util/Iterator.html))
    - [Open File] ([#iterator_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/Iterator.java))
- [Iterable] ([#iterable](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#iterablejava))
    - [Open Official Documentation for Iterable] ([#iterable_documentation](https://docs.oracle.com/javase/7/docs/api/java/lang/Iterable.html))
    - [Open File] ([#iterable_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/Iterable.java))
- [ListIterator] ([#listIterator](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#listiteratorjava-extends-iterator))
    - [Open Official Documentation for ListIterator] ([#list_iterator_documentation](https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html))
    - [Open File] ([#list_iterator_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/ListIterator.java))
- [Collection] ([#collection](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#collectionjava-extends-iterable))
    - [Open Official Documentation for Collection] ([#collection_documentation](https://docs.oracle.com/javase/7/docs/api/java/util/Collection.html))
    - [Open File] ([#collection_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/Collection.java))
- [List] ([#list](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#listjava-extends-collection))
    - [Open Official Documentation for List] ([#list_documentation](https://docs.oracle.com/javase/7/docs/api/java/util/List.html))
    - [Open File] ([#list_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/List.java))

[Classes] ([(#classes)](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#classes)) <br>

- [ArrayList] ([#arraylist](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#arraylist-extends-abstractlist-implements-list-randomaccess-cloneable-serializable))
    - [Open Official Documentation for ArrayList] ([#arraylist_documentation](https://docs.oracle.com/javase/7/docs/api//java/util/ArrayList.html))
    - [Open File] ([#arraylist_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/ArrayList.java))
- [LinkedList] ([#linkedlist](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#linkedlist-extends-abstractsequentiallist-implements-list-deque-cloneable-serializable))
    - [Open Official Documentation for LinkedList] ([#linkedlist_documentation](https://docs.oracle.com/javase/7/docs/api//java/util/LinkedList.html))
    - [Open File] ([#linkedlist_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/LinkedList.java))
- [Main] ([#main](https://github.com/tun67213/DataStructuresRevision/tree/main#mainjava))
    - [Open File] ([#main_file](https://github.com/tun67213/DataStructuresRevision/blob/main/src/Main.java))

## Interfaces

The following are the interfaces and the functions they will contain.

### RandomAccess.java, Serializable.java, Cloneable.java

The three interfaces mentioned above are all empty interfaces, i.e., they contain no functions.

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### Iterator.java


#### Functions

##### boolean hasNext() ([#hasNext()](https://github.com/tun67213/DataStructuresRevision/blob/main/src/Iterator.java#L13))

###### Returns
    true if the iteration has more elements, false otherwise


##### E next() ([#next()](https://github.com/tun67213/DataStructuresRevision/blob/e79b3cba03db1a051efd565e5e7c0fb9eecab392/src/Iterator.java#L18))

###### Throws
    NoSuchElementException() if hasNext() returns false
###### Returns
    The next element in the iterator


##### void remove() ([#remove()](https://github.com/tun67213/DataStructuresRevision/blob/e79b3cba03db1a051efd565e5e7c0fb9eecab392/src/Iterator.java#L23))

###### Throws
    NoSuchElementException() if current is null
###### Functionality
    If current is null, the function throws NoSuchElementException().
	Otherwise, removes the value pointed to by current and adjusts the iterator's state.
	After removal, sets current to null to prevent consecutive calls to remove().

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))


### Iterable.java


#### Functions

##### Iterator<T> iterator() ([#iterator()](https://github.com/tun67213/DataStructuresRevision/blob/e79b3cba03db1a051efd565e5e7c0fb9eecab392/src/Iterable.java#L13))

###### Returns
    An iterator over a set of elements of type T

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))


### ListIterator.java extends Iterator<E>


#### Functions

##### void add(E e) ([#add()](https://github.com/tun67213/DataStructuresRevision?tab=readme-ov-file#void-adde-e))

###### Variables
    E e:
        Variable to be added into the list
###### Throws
    NullPointerException() if no value is provided
###### Functionality
    If no value is provided, throws a NullPointerException().
    Otherwise, adds the value to this ListIterator.

##### boolean hasNext()

###### Returns
    true if this list iterator has more elements when traversing the list in the forward direction, false otherwise

##### boolean hasPrevious()

###### Returns
    true if this list iterator has more elements when traversing the list in the reverse direction, false otherwise

##### E next()

###### Throws
    NoSuchElementException() if hasNext() returns false
###### Returns
    the next value in the iteration

##### int nextIndex()

###### Returns
    the index of the value that would be returned by a subsequent call to next() 

##### E previous()

###### Throws
    NoSuchElementException() if hasPrevious() returns false
###### Returns
    the previous value in the iteration

##### int previousIndex()

###### Returns
    the index of the value that would be returned by a subsequent call to previous()

##### void remove()

###### Throws
    NoSuchElementException() if no values are pointed to right now
###### Functionality
    Removes from the list the last element that was returned by next() or previous().

##### void set(E e)

###### Variables
    E e:
        The value to be set to the index currently pointed to by this ListIterator
###### Throws
    NullPointerException() if no value is provided
###### Functionality
    Sets the value returned by next() or previous() to the provided value e

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### Collection.java extends Iterable<E>

#### Functions

##### boolean add(E e)

###### Variables
    E e:
        the Object to be added to this collection
###### Throws
    NullPointerException() if no value is provided or the provided value is null
###### Returns
    true if the value has successfully been added to this Collection
###### Functionality
    Ensures that this collection contains the specified element.

##### boolean addAll(Collection<? extends E> c)

###### Variables
    Collection<? extends E> c:
        Collection of values to add to the end of this Collection
###### Throws
    NullPointerException() if no Collection is provided or any value inside the input Collection c is null
###### Returns
    true if this Collection has been modified, false if the provided Collection is empty
###### Functionality
    If no Collection is provided, the fucntion throws a NullPointerException().

##### void clear()

###### Functionality
    Removes all the elements from this collection.

##### boolean contains(Object o)

###### Variables 
    Object o:
        the Object to find the existence of in this Collection
###### Throws
    NullPointerException() if no Object is provided
###### Returns
    True if the provided Object is found in this Collection, false otherwise

##### boolean containsAll(Collection<?> c)

###### Variables
    Collection<?> c:
        Collection of values to find the existence of in this Collection
###### Throws
    NullPointerException() if no Collection variable is provided or the provided Collection variable is 'null'
###### Returns
    False immediately if one value is not found, True if all values are found

##### boolean equals(Object o)

###### Variables
    Object o:
        The Object to compare with this Collection for equality
###### Throws
    NullPointerException() if no Object is provided
    ClassCastException() if the provided Object is not a Collection
###### Returns
    True if all values match exactly
	False if the sizes are different or a value does not match

##### int hashCode()

###### Returns
    the hash code value for this Collection

##### boolean isEmpty()

###### Returns
    True if this Collection contains no elements, False otherwise

##### Iterator<E> iterator()

###### Returns
    an iterator over the elements in this collection

##### boolean remove(Object o)

###### Variables
	Object o:
		the value to remove the first occurrence of if found
###### Throws
	NullPointerException() if no Object is provided or the provided variable is 'null'
###### Returns
	True if this Collection has been modified, False otherwise
###### Functionality
	If no value is provided or the provided value is 'null', the function throws a NullPointerException().
	Otherwise, the function will search for the provided value.
	If the first occurrence of the value is found, the function will remove it.
	Otherwise, if it reaches the end of this Collection, it will return false, meaning the Collection hasn't changed.

##### boolean removeAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to remove if found
###### Throws
	NullPointerException() if no Collection is provided
###### Returns
	True if this Collection has been modified, false otherwise
###### Functionality
	If no Collection was provided, the function throws a NullPointerException().
	If the provided Collection is empty, the function returns true immediately.
	If a value in the provided Collection is in this Collection, the function will remove it.
	In the end, if the Collection was modified in any way, the function returns true, otherwise it returns false.

##### boolean retainAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to keep if found
###### Throws
	NullPointerException() if no Collection is provided
###### Returns
	True if this Collection has been modified, false otherwise
###### Functionality
	If no Collection is provided, the function throws a NullPointerException().
	Otherwise, if a value in this Collection is not in the provided Collection, the function will remove it.

##### int size()

###### Returns
	the number of elements in this Collection

##### Object[] toArray()

###### Returns
	an array containing all the elements in this Collection

##### <T> T[] toArray(T[] a)

###### Variables
	T[] a:
		Array into which to copy values in this Collection
###### Throws
	NullPointerException() if no array is provided
###### Returns
	the array a with values from this Collection
###### Functionality
	Returns an array containing all of the elements in this collection; the runtime type of the returned array is that of the specified array.

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### List.java extends Collection<E>

#### Functions

##### boolean add(E e)

###### Variables
	E e:
		the value to add to the end of this List
###### Throws
	NullPointerException() if no value is provided
###### Returns
	true if the value is successfully added
###### Functionality
	Appends the specified element to the end of this list.

##### void add(int index, E element)

###### Variables
	int index:
		the location at which to add the element
	E element:
		the value to add to the specified location in this List
###### Throws
	NullPointerException() if no element is provided or the provided element is 'null'
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Functionality
	If no element is provided or the provided element is null, the function throws a NullPointerException().
	If the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
	Otherwise, the function allocates space for the value added and then inserts the value at the specified index.

##### boolean addAll(Collection<? extends E> c)

###### Variables
	Collection<? extends E> c:
		Collection of values to add to the end of this List in the order returned by the Collection's iterator
###### Throws
	NullPointerException() if no Collection is provided or any value in the Collection is null
###### Returns
	False if a Collection was provided, but was empty. True if all values were added successfully
###### Functionality
	If no Collection is provided or the provided Collection contains null values, the function will throw a NullPointerException().
	Otherwise, it will add the values, in the order returned by its iterator, to the end of this List. 

##### boolean addAll(int index, Collection<? extends E> c)

###### Variables
	int index:
		the location at which to start adding values from the provided Collection
	Collection<? extends E> c:
		Collection of values to add to this List, starting at the provided index
###### Throws
	NullPointerException() if no Collection is provided or any value in the provided Collection is null
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	True if this List went through changes
	False otherwise
###### Functionality
	If no Collection is provided, the provided Collection variable is null, or the values in the Collection are null, the function throws a NullPointerException().
	If, on the other hand, the provided index is out of bounds, the function throws an IndexOutOfBoundsException().

##### void clear()

###### Functionality
	Removes all the elements from this list.

##### boolean contains(Object o)

###### Variables
	Object o:
		the value to find the existence of in this List
###### Throws
	NullPointerException() if no Object is provided
###### Returns
	False if the provided Object is null or not found 
	True if the Object is found

##### boolean containsAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to find the existence of in this List
###### Throws
	NullPointerException() if no Collection is provided
###### Returns
	False if the provided Object in the Collection is null or not found
	True if all the Objects are found

##### boolean equals(Object o)

###### Variables
	Object o:
		The Object to compare with this List for equality
###### Throws
	NullPointerException() if no Object is provided
	ClassCastException() if the provided Object is not of type List<E> or of type subList<E>
###### Returns
	True if all values in this List match, False otherwise

##### E get(int index)

###### Variables
	int index:
		the location at which to retrieve a value from
###### Throws
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	the value at the specified index, if the provided index is valid

##### int hashCode()

###### Returns
	the hash code value for this list

##### int indexOf(Object o)

###### Variables
	Object o:
		the Object to find the location of the first occurrence of in this List
###### Throws
	NullPointerException() if no Object is provided
###### Returns
	the location of the first occurrence of the provided Object

##### boolean isEmpty()

###### Returns
	true if this list contains no elements, false otherwise

##### Iterator<E> iterator()

###### Return
	an iterator over the elements in this list in proper sequence

##### int lastIndexOf(Object o)

###### Variables
	Object o:
		the Object to find the location of the last occurrence of in this List
###### Throws
	NullPointerException() if no Object is provided
###### Returns
	the location of the last occurrence of the provided Object

##### ListIterator<E> listIterator()

###### Returns
	a list iterator over the elements in this list

##### ListIterator<E> listIterator(int index)

###### Variables
	int index:
		the location at which to start this ListIterator from
###### Throws
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	a list iterator over the elements in this list, starting at the provided index

##### E remove(int index)

###### Variables
	int index:
		the location at which to remove a value from this List
###### Throws
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	the value previously at the provided index
###### Functionality
	If the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
	Otherwise, it will do the following:
		1) Navigate to the value at the provided index.
		2) Save that to a variable.
		3) Then, proceed to removing based on the data structure that is implementing this.

##### boolean removeAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to remove if found
###### Throws
	NullPointerException() if no Collection is provided
###### Returns
	True if this List has been modified
	False otherwise
###### Functionality
	If no Collection is provided or the provided variable is 'null', the function throws a NullPointerException().
	If an empty Collection is provided, the function returns false immediately.
	If a value in the provided Collection is contained in this List, the function goes ahead and removes it.
	Eventually, once it has iterated through the whole list, if it has modified the list, it will return true. Otherwise, it will return false.

##### boolean retainAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to keep if found
###### Throws
	NullPointerException() if no Collection is provided
###### Returns
	True if this List has been modified
	False otherwise
###### Functionality
	If no Collection is provide  or the provided variable is 'null', the function throws a NullPointerException().
	If an empty Collection is provided, the function resets this List to default and returns true immediately.
	If a value in the List is not contained in the provided Collection, the function removes it from this List.
	Eventually, the function will return true if this List has been modified, false otherwise.

##### E set(int index, E element)

###### Variables
	int index:
		the location at which to swap a value
	E element:
		the value to swap the existing element with
###### Throws
	NullPointerException() if no value is provided
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	the value previously at the provided index
###### Functionality:
	If no element is provided or the provided element is 'null', the function throws a NullPointerException().
	If an index is provided, but is out of bounds, the function throws an IndexOutOfBoundsException().
	Otherwise, the function does the following:
		1) Uses a variable to save the value currently at the specified index.
		2) Replaces the value at the specified index with the provided value.
		3) Returns the old value to the user

##### int size()

###### Returns
	the number of elements in this List

##### List<E> subList(int fromIndex, int toIndex)

###### Variables
	int fromIndex:
		the starting index to create this List from (inclusive)
	int toIndex:
		the endingindex to create this List until (exclusive)
###### Throws
	IndexOutOfBoundsException() if any of the provided indices are out of bounds
	IllegalArgumentException() if fromIndex is greater than toIndex
###### Returns
	a subList containing values between the provided indices

##### Object[] toArray()

###### Returns
	an array containing all the elements in this list in proper sequence

##### <T> T[] toArray(T[] a)

###### Variables
	T[] a:
		Array into which to copy values from this List that are of type T[]
###### Throws
	NullPointerException() if no array is provided
###### Returns
	the provided array overridden with values from this List

##### String toString()

###### Returns
	a String representation of this List that is readable by the user

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

## Classes

### abstract class AbstractCollection<E> extends Object implements Collection<E>

#### Constructors

##### protected AbstractCollection()

###### Functionality
	Sole constructor.

#### Functions

##### boolean add(E e)

###### Variables
	E e:
		the value to be added to the end of this Collection
###### Throws
	NullPointerException() if no value is provided
###### Returns
	true if adding the value is successful (false is never included because it would have thrown an exception by then)

##### boolean addAll(Collection<? extends E> c)

###### Variables
	Collection<? extends E> c:
		Collection of values to add to the end of this Collection
###### Throws
	NullPointerException() if no Collection is provided, the Collection variable is null, or a value in the Collection is null
###### Returns
	true if all the values were added successfully
###### Functionality
	If no Collection was provided, the provided variable was null, or a value in the provided collection is null, the function.

##### void clear()

###### Functionality
	Removes all the elements from this collection

##### boolean contains(Object o)

###### Variables
	Object o:
		The value to find the existence of in this Collection
###### Throws
	NullPointerException() if no Object is provided
###### Returns
	true if the Object is found
	false otherwise

##### boolean containsAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to find the existence of in this Collection
###### Throws
	NullPointerException() if no Collection is provided
###### Returns
	False if a value in the provided Collection is null or not found in this Collection
	True otherwise

##### boolean isEmpty()

###### Returns
	True if this Collection contains no elements, False otherwise

##### abstract Iterator<E> iterator()

###### Returns
	an iterator over the elements contained in this Collection

##### boolean remove(Object o)

###### Variables
	Object o:
		the Object to remove if the first occurrence of it is found
###### Throws
	NullPointerException() if no Object is provided
###### Returns
	True if this Collection has been modified, False otherwise
###### Functionality
	If no Object is provided, the Collection throws a NullPointerException().
	Otherwise, the function will iterate through this Collection until the provided Object is found using a counter.
	Once the loop exits, the function will check if the counter is still in range.
	If not, the Object was not found, so the function returns false.
	Otherwise, the function will proceed to remove that first occurrence, and then return true so that the function does not keep removing values infinitely.

##### boolean removeAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to remove if found in this Collection
###### Throws
	NullPointerException() if no Object is provided or the provided variable is null
###### Returns
	True if this Collection has been modified, False otherwise
###### Functionality
	If no Collection is provided, the function will throw a NullPointerException().
	If a value in the provided Collection is found in this Collection, the function will proceed and remove it.
	In the end, after iterating to the end of this Collection, if this Collection has been changed, the function returns true.

##### boolean retainAll(Collection<?> c)

###### Variables
	Collection<?> c:
		Collection of values to keep if found in this Collection
###### Throws
	NullPointerException() if no Object is provided or the provided variable is null
###### Returns
	True if this Collection has been modified, False otherwise
###### Functionality
	If no Collection is provided, the function will throw a NullPointerException().
	If a value in the provided Collection is not found in this Collection, the function will proceed and remove it.
	In the end, after iterating to the end of this Collection, if this Collection has been changed, the function returns true.

##### int size()

###### Returns
	the number of elements in this Collection

##### Object[] toArray()

###### Returns
	an array containing all the elements in this Collection

##### <T> T[] toArray(T[] a)

###### Variables
	T[] a:
		Array into which to copy values from this Collection
###### Throws
	NullPointerException() if no array of type T is provided
###### Returns
	the provided array with values from this Collection copied into it in the order returned by this Collection's iterator

##### String toString()

###### Returns
	a String representation of this Collection

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### abstract class AbstractList<E> extends AbstractCollection<E> implements List<E>

#### Variables

##### protected int modCount

###### Functionality
	Counts the number of times this list has been structurally modified.

#### Constructor

##### protected AbstractList()

###### Functionality
	Sole constructor.

#### Functions

##### boolean add(E e)

###### Variables
	E e:
		the value to be added to the end of this list
###### Throws
	NullPointerException() if no value is provided
###### Returns
	True if the value was added to this AbstractList without thrown exceptions
###### Functionality
	Appends the specified element to the end of this list.

##### void add(int index, E element)

###### Variables
	int index:
		the location at which to add the provided value
	E element:
		the value to be added to the specified location
###### Throws
	NullPointerException() if no value is provided
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Functionality
	If no value is provided, the function throws NullPointerException().
	If the provided index is out of bounds, the function throws IndexOutOfBoundsException().
	Otherwise, it allocates space for the provided Object and inserts it into this AbstractList Object.

##### boolean addAll(int index, Collection<? extends E> c)

###### Variables
	int index:
		the location at which to start adding the Collection of values provided
	Collection<? extends E> c:
		the Collection of values to add, with the first value at the specified index
###### Throws
	NullPointerException() if no Collection is provided, the provided Collection variable doesn't exist, or the provided Collection has null values
###### Returns
	True if this AbstractList has been modified, False otherwise
###### Functionality
	If no Collection variable is provided, the provided Collection variable is inexistent, or any value in the provided Collection is null, the function throws NullPointerException().
	If the Collection is valid, but the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
	Otherwise, the function will first locate itself at the value BEFORE the specified index.
	Then, it will add each value such that it links the value to the previous and next values, giving itself room to fit in, and then fits itself in there.
	Finally, it will increment the size.

##### void clear()

###### Functionality
	Removes all elements from this List.

##### boolean equals(Object o)

###### Variables
	Object o: Object to compare with this Abstract List
###### Throws
	NullPointerException() if no Object is provided or the provided Object is null
###### Returns
	True if the provided Object matches exactly, false otherwise

##### abstract E get(int index)

###### Variables
	int index:
		the location at which to retrieve a value from
###### Throws
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	the value at the specified index if the index is valid

##### int hashCode()

###### Returns
	the hash code value for this list

##### int indexOf(Object o)

###### Variables
	Object o:
		the value to find the first occurrence of
###### Throws
	NullPointerException() if no Object is provided
###### Returns
	the location of the first occurrence of the provided Object or -1 if not found

##### Iterator<E> iterator()

###### Returns
	an iterator over the elements in this list in proper sequence

##### int lastIndexOf(Object o)

###### Variables
	Object o:
		the value to find the last occurrence of
###### Throws
	NullPointerException() if no Object is provided
###### Returns
	the location of the last occurrence of the provided Object or -1 if not found

##### ListIterator<E> listIterator()

###### Returns
	a list iterator over the elements in this List

##### ListIterator<E> listIterator(int index)

###### Variables
	int index:
		the location at which to start this list iterator from
###### Throws
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	a list iterator over the elements in this List, starting at the provided index

##### E remove(int index)

###### Variables
	int index:
		the location at which to remove a value from
###### Throws
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	the value previously at the provided index before removal

##### protected void removeRange(int fromIndex, int toIndex)

###### Variables
	int fromIndex:
		the location (inclusive of which) to start removing from
	int toIndex:
		the location (exclusive of which) to remove until
###### Throws
	IndexOutOfBoundsException() if any of the provided indices is out of bounds
	IllegalArgumentException() if toIndex is less than fromIndex
###### Functionality
	Removes all values that are within the provided range of indices in this Abstract List.

##### E set(int index, E element)

###### Variables
	int index:
		the location at which to change values
	E element:
		the replacement value
###### Throws
	NullPointerException() if no replacement value is provided
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	the value previously at the provided index
###### Functionality
	Replaces the element at the specified position in this list with the specified element.

##### List<E> subList(int fromIndex, int toIndex)

###### Variables
	int fromIndex:
		the index (inclusive of which) to start this subList from
	int toIndex:
		the index (exclusive of which) to end this subList
###### Throws
	IndexOutOfBoundsException() if any of thebprovided indices is out of bounds
	IllegalArgumentException() if fromIndex is greater than toIndex
###### Returns
	a view of the portion of this ist between the specified fromIndex, inclusive, and toIndex, exclusive

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### abstract class AbstractSequentialList<E> extends AbstractList<E>

#### Variables inherited from AbstractList

	modCount: number of times this AbstractSequentialList has been structurally modified

#### Constructors

##### protected AbstractSequentialList()

###### Functionality
	Sole constructor.

#### Functions

##### void add(int index, E element)

###### Variables
	int index:
		the location at which to add a value
	E element:
		the value to add at the specified location
###### Throws
	NullPointerException() if no element is provided or the provided element is null
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Functionality
	Inserts the specified element at the specified position in this list.

##### boolean addAll(int index, Collection<? extends E> c)

###### Variables
	int index:
		the location at which the first value of this Collection must go
	Collection<? extends E> c:
		Collection of values to add, starting at the provided inex
###### Throws
	NullPointerException() if no Collection variable is provided, the provided Collection variable is null, or any value in the provided Collection is null
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	True if this List has been modified, i.e. all the values in the provided collection are added, False if the provided Collection is empty
###### Functionality
	If no collection is provided or the provided collection variable is null or any value in the provided collection is null, then the function throws a NullPointerException().
	If a collection is provided, but the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
	Otherwise, starting at the provided index, the function adds the values to this List.

##### E get(int index)

###### Variables
	int index:
		the location at which to retrieve a value from
###### Throws
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
	the value at the provided index from this List

##### Iterator<E> iterator()

###### ###### Returns
	an iterator over the elements in this list

##### abstract ListIterator<E> listIterator(int index)

###### Returns
		a list iterator over the elements in this list

##### E remove(int index)

###### Variables
    int index:
        the location at which to remove a value from this List
###### Throws
    IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
    the value previously at the provided index, if the provided index is valid
###### Functionality
    If the provided index is out of bounds (i.e., less than 0 or greater than or equal to the size of this list), the function throws an IndexOutOfBoundsException().

##### E set(int index, E element)

###### Variables
    int index:
        the location at which to replace a value
    E element:
        the replacement value
###### Throws
    NullPointerException() if no value is provided
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
    the value previously at the provided index
###### Functionality
    If no element is provided or the provided is 'null', the function throws a NullPointerException()/
    If the provided index is out of bounds, the function throws an IntextOutOfBOundsException().
    Otherwise, it uses a variable to save the value currently at the specified index, and then replaces that existing value with the new element provided.
    Then, it returns the value previously at the specified index.

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable

#### Variables inherited from AbstractList

	modCount: number of times this AbstractSequentialList has been structurally modified
      NOTE: This is NOT implemented in this code, but is optional to implement if desired

#### Other Variables

##### private int size

###### Functionality:
    Keeps track of the number of elements in this ArrayList

##### private int capacity

###### Functionality:
    Keeps track of the number of elements the current array can hold

##### private E[] array

###### Functionality:
    Keeps track of the actual elements that are added to this ArrayList using an actual array

#### Constructors

##### public ArrayList()

###### Functionality:
    Default constructor for this class that initializes size to 0, capacity to 10, and the array representing this ArrayList to be a new array with capacity 10.

##### public ArrayList(Collection<? extends E> c)

###### Variables: 
    Collection<? extends E> c:
        Collection of values to initialize this ArrayList with
###### Throws:
    NullPointerException() if no Collection is provided, the provided Collection variable is null, or any value in the provided Collection is null
###### Functionality:
    If no Collection is provided, or the provided Collection variable is null, or a value IN the provided Collection variable is null, the constructor throws a NullPointerException().
    Otherwise it does the following:
        1) Set size to 0, capacity to 10, and array to be a new array that holds 'capacity' elements.
        2) If the provided Collection isn't empty, the constructor will initialize the ArrayList with values from the provided Collection, incrementing the size for each value added. However, if at any point, there is a null value in the Collection, the constructor will throw a NullPointerException().

##### public ArrayList(int initialCapacity)

###### Variables:
    int initialCapacity:
        the capacity to initialize this ArrayList with
###### Throws:
    IllegalArgumentException() if the provided capacity is less than or equal to 0
###### Functionality:
    If the provided initial capacity is less than or equal to 0, the function throws an IllegalArgumentException().
    Otherwise, the function will initialize the array that manages with this ArrayList with the provided capacity of elements.

#### Functions

##### private void ensureCapacity()

###### Functionality:
    If the variable size equals the variable capacity (i.e. the current array is filled), this function will create a new array that is 1.5 times the current size, and relocate all values in the existing array.
    Then, it will reassign the new array to the private array managing this ArrayList, allowing for more values to be easily added.

##### boolean add(E e)

###### Variables:
    E e:
        the value to be added to the end of this ArrayList
###### Throws:
    NullPointerException() if no value is provided
###### ###### Returns
    True if the value was successfully added (NOTE: False is never returned by this function, since if there was a failure, the function would throw an exception)
###### Functionality:
    If no value was provided or the provided value was null, the function throws a NullPointerException().
    Otherwise, it will call ensureCapacity() to make sure that there is enough space for the provided value in the array managing this ArrayList.
    Then it will use this.size to allocate the provided value into the array (i.e. this.array[this.size] = e).
    Finally, it will increment the size of this ArrayList.

##### void add(int index, E element)

###### Variables:
    int index:
        the location at which to add the specified element
    E element:
        the value to add to the specified index in this ArrayList
###### Throws:
    NullPointerException() if no element is provided
    IndexOutOfBoundsException() if the provided index is out of bounds
###### Functionality:
    If no value was provided or the provided value was null, the function throws a NullPointerException().
    If the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
    Otherwise, the function does the following:
        1) Call ensureCapacity() to make sure there is enough space.
        2) Shift elements from the end until the specified index.
        3) Allocate the new value into the specified index in the array representing this ArrayList.
        4) Increment the size of this ArrayList.

##### boolean addAll(Collection<? extends E> c)

###### Variables:
    Collection<? extends E> c:
        Collection of values to add to the end of this ArrayList
###### Throws:
    NullPointerException() if no Collection variable is provided, the provided Collection variable is 'null' or the provided Collection contains null elements
###### ###### Returns
    True if this ArrayList has been modified, False otherwise
###### Functionality:
    If no Collection variable is provided, the provided Collection variable is null, or the provided Collection variable contains a null value, the function throws a NullPointerException().
    If, on the other hand, the provided Collection is empty, the function returns false.
    Otherwise, the function will add the values in the provided Collection in the order returned by the Collection's iterator, to the end of this ArrayList, calling ensureCapacity() each time to make sure there is enough space to accommodate the value.

##### boolean addAll(int index, Collection<? extends E> c)

###### Variables:
    int index:
        the location at which to start adding values
    Collection<? extends E> c:
        Collection of values to add to the specified index in this ArrayList
###### Throws:
    NullPointerException() if no Collection variable is provided, the provided Collection variable is null or the provided Collection contains null values
    IndexOutOfBoundsException() if the provided index is out of bounds
###### ###### Returns
    False if the provided Collection is empty
    True otherwise
###### Functionality:
    Inserts all of the elements in the specified collection into this list, starting at the specified position.

##### void clear()

###### Functionality:
    Removes all the elements from this list.

##### Object clone()

###### ###### Returns
    a shallow copy of this ArrayList instance

##### boolean contains(Object o)

###### Variables:
    Object o:
        the Object to find the existence of in this ArrayList
###### Throws:
    NullPointerException() if no variable is provided or the provided variable is null
###### ###### Returns
    True if the provided Object is found
    False otherwise
###### Functionality:
    Returns true if this list contains the specified element.

##### boolean containsAll(Collection<?> c)

###### Variables:
    Collection<?> c:
        Collection of variables to check for existence in this ArrayList
###### Throws:
    NullPointerException() if no Collection is provided or the provided Collection variable is null
###### ###### Returns
    False if any value is null or cannot be found in this ArrayList
    True otherwise
###### Functionality:
    Returns true if this list contains all the values in the specified Collection.

##### boolean equals(Object o)

###### Variables:
    Object o:
        the Object to compare this ArrayList with for equality
###### Throws:
    NullPointerException() if no Object is provided or the provided Object variable is null
###### ###### Returns
    True if the Object matches exactly, False otherwise
###### Functionality:
    If no Object is provided, the function throws a NullPointerException().
    Otherwise, if an Object is an exact match, the function returns true.
    If not, but all the values match exactly, the function returns true.
    Otherwise, it returns false.

##### E get(int index)

###### Variables:
    int index:
        the location at which to retrieve a value from
###### Throws:
    IndexOutOfBoundsException() if the provided index is out of bounds
###### ###### Returns
    the value at the specified index

##### int indexOf(Object o)

###### Variables:
    Object o:
        the Object to find the location of the first occurrence of
###### Throws:
    NullPointerException() if no Object is provided or the provided Object is 'null'
###### ###### Returns
    the location of the first occurrence of the provided Object

##### boolean isEmpty()

###### ###### Returns
    true if this List contains no elements, false otherwise

##### Iterator<E> iterator()

###### ###### Returns
    an iterator over the elements in this list in proper sequence

##### int lastIndexOf(Object o)

###### Variables:
    Object o:
        the Object to find the location of the last occurrence of
###### Throws:
    NullPointerException() if no Object is provided or the provided Object is 'null'
###### ###### Returns
    the location of the last occurrence of the provided Object

##### ListIterator<E> listIterator()

###### ###### Returns
    a list iterator over the elements in this list

##### ListIterator<E> listIterator(int index)

###### Variables:
    int index:
        the location at which to start this list iterator
###### Throws:
    IndexOutOfBoundsException() if the provided index is out of bounds
###### ###### Returns
    a list iterator over the elements in this list, starting at the specified index

##### E remove(int index)

###### Variables:
    int index:
        the location at which to remove a value from this ArrayList
###### Throws:
    IndexOutOfBoundsException() if the provided index is out of bounds
###### ###### Returns
    the value previously at the provided index
###### Functionality:
    If the provided index is out of bounds, the function throws an IndexOutOfBoundsExceptino().
    Otherwise, it will save the value at the provided index in a variable and remove it from this ArrayList.
    Finally, it will decrement the size of this ArrayList and return the value that was removed.

##### boolean remove(Object o)

###### Variables:
    Object o:
        the Object to find the first occurrence of and remove
###### Throws:
    NullPointerException() if no Object is provided or the provided Object variable is defined as 'null'
###### ###### Returns
    True if this ArrayList has been modified, False otherwise
###### Functionality:
    Removes the first occurrence of the specified element from this list, if it is present.

##### boolean removeAll(Collection<?> c)

###### Variables:
    Collection<?> c:
        Collection of values to remove if found in this ArrayList
###### Throws:
    NullPointerException() if no Collection is provided or the provided Collection variable is null
###### ###### Returns
    True if this ArrayList has been modified, False otherwise
###### Functionality:
    Removes from this list all of its elements that are contained in the specified collection.

##### protected void removeRange(int fromIndex, int toIndex)

###### Variables:
    int fromIndex:
        the location, inclusive of which, to start removing values from
    int toIndex:
        the location, exclusive of which, to remove values until
###### Throws:
    IndexOutOfBoundsException() if either is out of bounds
    IllegalArgumentException() if the provided fromIndex is greater than the provided toIndex
###### Functionality:
    If any of the provided indices is out of bounds, the function throws an IndexOutOfBoundsException().
    Otherwise, if the provided fromIndex variable is greater than the provided toIndex variable, the function throws an IllegalArgumentException().
    If all is in range, the function removes values within that specific range and decrements size accordingly.

##### boolean retainAll(Collection<?> c)

###### Variables:
    Collection<?> c:
        Collection of values to keep if found in this ArrayList
###### Throws:
    NullPointerException() if no Collection is provided or the provided Collection variable is null
###### ###### Returns
    True if this ArrayList has been modified in any way, False otherwise
###### Functionality:
    If no Collection variable is provided or the provided Collection variable is null, the function throws a NullPointerException().
    Otherwise, if the function finds a value in this ArrayList that is NOT a part of the provided Collection, it will remove that value.
    In the end, the function will return True if this ArrayList has undergone changes due to calling this function, False otherwise.

##### E set(int index, E element)

###### Variables
    int index:
        the location at which to replace a value
    E element:
        the replacement value for the specified index
###### Throws
    NullPointerException() if no value is provided or the provided value is 'null'
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
    the value previously at the provided index
###### Functionality
    Replaces the element at the specified position in this list with the specified element.

##### int size()

###### Returns
    the number of elements in this ArrayList

##### Object[] toArray()

###### Returns
    an array containing all the elements in this ArrayList in proper sequence (from first to last element)

##### <T> T[] toArray(T[] a)

###### Variables
    T[] a:
        array of generic type T to copy values from this ArrayList into
###### Throws
    NullPointerException() if the provided array is out of bounds
###### Returns
    the provided array of generic type with values from this ArrayList copied into there

##### void trimToSize()

###### Functionality
    Trims the capacity of this ArrayList instance to be the list's current size.

##### String toString()

###### Returns
    a String representation of this ArrayList to output to the command line

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable

#### Internal Classes

##### private static class Node<E>

###### Variables
    Node<E> previous:
        a recursive call to have access to the previous Node in this chain of Nodes
    E data:
        the value in the current Node
    Node<E> next:
        a recursive call to have access to the next Node in this chain of Nodes

#### LinkedList class Variables

	private int size:
		Variable to keep track of the number of elements in this LinkedList
	private Node<E> head:
		Node variable to keep track of the start of this LinkedList
	private Node<E> tail:
		Node variable to keep track of the end of this LinkedList

#### Constructors

##### public LinkedList()

	Default constructor that initializes size to 0, head to null, and tail to null

##### public LinkedList(Collection<? extends E> c)

###### Variables
    Collection<? extends E> c:
        Collection of values to initialize this LinkedList with
###### Throws
    NullPointerException() if no Collection variable is provided, the provided Collection variable is null, or the provided Collection contains null values
###### Functionality
    If no Collection is provided or the provided Collection contains null values, the function will throw a NullPointerException() the moment that happens.
	Otherwise, the function does the default initialization for this LinkedList, and if the provided Object is not empty, initializes this LinkedList with those values.

#### Functions

##### boolean add(E e)

###### Variables
    E e:
        the value to be added to the end of this LinkedList
###### Throws
    NullPointerException() if no value is provided
###### Returns
    True if the value has been successfully linked to the end of this LinkedList
###### Functionality
    If no value is provided or the provided value is 'null', the function throws a NullPointerException().
	Otherwise, the function creates a new Node with the provided value, links it to the end of this LinkedList, and then moves the tail pointer to it. 

##### void add(int index, E element)

###### Variables
    int index:
        the location at which to add the Node containing the provided element
    E element:
        the value to embed into the Node added to the specified element
###### Throws
    NullPointerException() if no element is provided or the provided element is null
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Functionality
    If no element is provided or the provided element is 'null', the function throws a NullPointerException().
	If a valid element is provided, but the index is out of bounds, the function throws an IndexOutOfBoundsException().
    Otherwise, the function creates a Node with the specified element in it, and links the element to the specific index.

##### boolean addAll(Collection<? extends E> c)

###### Variables
    Collection<? extends E> c:
        Collection of values to add to the end of this LinkedList
###### Throws
    NullPointerException() if no Collection variable is provided, the provided Collection variable is defined as null, or the provided Collection variable contains null values
###### Returns
    False if the provided Collection is empty
    True otherwise after adding the values to the end of this LinkedList by using values returned by the Collection's iterator to create Nodes and link them
###### Functionality
    If no Collection variable is provided or the variable provided is defined as null, the function throws a NullPointerException().
	Otherwise, the function will create a new Node for each value, and link it to the end of this LinkedList class as the tail Node.

##### boolean addAll(int index, Collection<? extends E> c)

###### Variables
    int index:
		the location at which the first value returned by this Collection's iterator is placed
    Collection<? extends E> c:
        Collection of values to add to this LinkedList, with the first value at the provided index
###### Throws
    NullPointerException() if no Collection variable is provided, the provided Collection variable is defined as null, or the provided Collection variable contains null values
	IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
    False if the provided Collection is empty
	True if all the values in the provided Collection were added to the provided index successfully without throwing an exception
###### Functionality
    If no Collection variable is provided or the provided variable is null or any value in the provided Collection is null, the function throws a NullPointerException().
	If everything is fine with the Collection, but the provided index is out of bounds (i.e. index is less than 0 or greater than the size of this LinkedList), the function throws an IndexOutOfBoundsException().
    Otherwise, the function will navigate to the Node right before the provided index, and then add the values in the order i.e. the first value returned by this Collection's iterator will be placed at the provided index, with all the other values placed after it.
	Finally, if tanything was actually added, the function increments the size variable by the number of elements added and returns true.

##### void addFirst(E e)

###### Variables
    E e:
        the value to add to the beginning of this LinkedList
###### Throws
    NullPointerException() if no value is provided or the provided value is null
###### Functionality
    Inserts the specified element at the beginning of this list.

##### void addLast(E e)

###### Variables
    E e:
        the value to add the end of this LinkedList
###### Throws
    NullPointerException() if no value is provided or the provided value is null
###### Functionality
    Inserts the specified element to the end of this list.

##### void clear()

###### Functionality
    Removes all the elements from this LinkedList

##### Object clone()

###### Returns
    a shallow copy of this LinkedList

##### boolean contains(Object o)

###### Variables
    Object o:
        Object to find existence of in this LinkedList
###### Throws
    NullPointerException() if no variable or value is provided or the provided variable or value is null
###### Returns
    true if the provided Object is found, false otherwise

##### boolean containsAll(Collection<?> c)

###### Variables
    Collection<?> c:
		Collection of values to check the existence of in this LinkedList
###### Throws
    NullPointerException() if no Collection variable is provided or the provided Collection variable is null
###### Returns
    True if the provided Collection is empty or all values in the provided Collection are contained in this LinkedList, False if a value is not found

##### boolean equals(Object o)

###### Variables
    Object o:
		the Object to compare with this LinkedList
###### Throws
    NullPointerException() if no Object is provided or the provided Object variable is null
###### Returns
    True if the provided Object is an exact match to this LinkedList, False otherwise

##### Iterator<E> descendingIterator()

###### Returns
    an iterator over the elements in this deque in reverse sequential order

##### E element()

###### Throws
    NoSuchElementException() if head is null
###### Returns
    the head (first element) of this list
###### Functionality
    Retrieves, but does not remove, the head (first element) of this list.

##### E get(int index)

###### Variables
    int index:
        the location at which to retrieve a value from
###### Throws
    IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
    the value at the provided index, given that it is not out of bounds

##### E getFirst()

###### Throws
    NoSuchElementException() if this LinkedList is empty
###### Returns
    the value referred to by the Node at head

##### E getLast()

###### Throws
    NoSuchElementException() if this LinkedList is empty
###### Returns
    the value referred to by the Node at tail

##### int indexOf(Object o)

###### Variables
    Object o:
        the Object to find the location of the first occurrence of
###### Throws
    NullPointerException() if the provided Object is null
###### Returns
    the location of the first occurrence of the provided value, or -1 if it doesn't exist

##### boolean isEmpty()

###### Returns
    true if this list contains no elements, false otherwise

##### Iterator<E> iterator()

###### Returns
    an iterator over the elements in this list in proper sequence

##### int lastIndexOf(Object o)

###### Variables
    Object o:
        the Object to find the location of the last occurrence of
###### Throws
    NullPointerException() if the provided Object is null
###### Returns
    the location of the last occurrence of the provided value, or -1 if it doesn't exist

##### ListIterator<E> listIterator()

###### Returns
    a ListIterator over the elements in this LinkedList

##### ListIterator<E> listIterator(int index)

###### Variables
    int index:
        the location at which to start this ListIterator
###### Throws
    IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
    a ListIterator over the elements in this LinkedList, starting at the specified index

##### boolean offer(E e)

###### Variables
    E e:
        the value to offer as the tail (last element) to this LinkedList
###### Throws
	NullPointerException() if no value is provided or the provided value is 'null'
###### Returns
    True if this LinkedList has been modified, False otherwise
###### Functionality
    If no value is provided or the provided value is 'null', the function throws a NullPointerException().
	Otherwise, it creates a new Node with the provided value and adds it to the end of this LinkedList, making it the 'tail' Node.

##### boolean offerFirst(E e)

###### Variables
    E e:
        the value to offer to this LinkedList
###### Throws
    NullPointerException() if no value is provided or the provided value is 'null'
###### Returns
    True if this LinkedList has been modified, False otherwise
###### Functionality
    If no value is provided or the provided value is 'null', the function throws a NullPointerException().
    Otherwise, it creates a new Node with the provided value and adds it to the end of this LinkedList, making it the 'head' Node.

##### boolean offerLast(E e)

###### Variables
		E e:
			the value to offer as the tail (last element) to this LinkedList
###### Throws
		NullPointerException() if no value is provided or the provided value is 'null'
###### Returns
		True if this LinkedList has been modified, False otherwise
###### Functionality
		If no value is provided or the provided value is 'null', the function throws a NullPointerException().
		Otherwise, it creates a new Node with the provided value and adds it to the end of this LinkedList, making it the 'tail' Node.

##### E peek()

###### Throws
		NoSuchElementException() if this LinkedList is empty
###### Returns
		the head (first element) of this list
###### Functionality
		Retrieves, but does not remove, the head (first element) of this list.

##### E peekFirst()

###### Returns
		the first element of this list or null if this list is empty
###### Functionality
		Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.

##### E peekLast()

###### Returns
		the last element of this list or null if this list is empty
###### Functionality
		Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.

##### E poll()

###### Throws
		NoSuchElementException() if this LinkedList is empty
###### Returns
		the value at the Node previously at head (first element) of this list
###### Functionality
		Retrieves and removes the head (first element) of this list.

##### E pollFirst()

###### Returns
		the first element of this list or null if this list is empty
###### Functionality
		Retrieves and removes the first element of this list, or returns null if this list is empty.

##### E pollFirst()

###### Returns
		the last element of this list or null if this list is empty
###### Functionality
		Retrieves and removes the last element of this list, or returns null if this list is empty.

##### E pop()

###### Throws
		EmptyStackException() if the stack represented by this LinkedList is empty
###### Returns
		the value at the top of the stack represented by this LinkedList
###### Functionality
		If the LinkedList representing this stack is empty, the function throws an EmptyStackException().
		Otherwise, the function will proceed and remove the head Node from the LinkedList representing this stack, reassinging 'head' to the next available Node or null if that was the ONLY Node in this LinkedList.

##### void push(E e)

###### Variables
		E e:
			the value to be pushed onto the top of the stack represented by this LinkedList
###### Throws
		NullPointerException() if no value is provided or the provided value is null
###### Functionality
		If no value is provided, the function throws a NullPointerException().
		Otherwise, the function will create a new Node and then add the new Node as the head Node to the LinkedList representing this stack.

##### E remove()

###### Throws
		NoSuchElementException() if this LinkedList is empty
###### Returns
		the value in the Node previously at head
###### Functionality
		If this LinkedList is empty, the function throws a NoSuchElementException().
		Otherwise, the function proceeds to remove the Node at head by moving the head pointer to the next pointer and then cutting the links between the new head and the previous head.

##### E remove(int index)

###### Variables
		int index:
			the location at which to remove a value
###### Throws
		IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
		the value previously at the provided index
	Functionaliity:
		If the provided index is out of bounds, the function throws an IndexOutOfBoundsException().
		Otherwise, it removes the element at the specified position in this list.

##### boolean remove(Object o)

###### Variables
		Object o:
			the Object to find the first occurrence of and remove
###### Throws
		NullPointerException() if no Object is provided or the provided Object variable is defined as 'null'
###### Returns
		True if this LinkedList has been modified, False otherwise
###### Functionality
		Removes the first occurrence of the specified element from this list, if it is present.

##### boolean removeAll(Collection<?> c)

###### Variables
		Collection<?> c:
			Collection of values to remove if found in this LinkedList
###### Throws
		NullPointerException() if no Collection is provided or the provided Collection variable is null
###### Returns
		True if this ArrayList has been modified, False otherwise
###### Functionality
		Removes from this list all of its elements that are contained in the specified collection.

##### E removeFirst()

###### Throws
		NoSuchElementException() if this LinkedList is empty
###### Returns
		the value previously at the Node pointed to by head
###### Functionality
		If this LinkedList is empty, the function throws a NoSuchElementException().
		If there is only one value in this LinkedList, the function returns the value at the head Node, resetting head and tail to null.
		Otherwise, it will move the head variable to the next Node and then unlink this Node from the list.
		Finally, if all has gone through without an exception being thrown, it returns the value previously at the head Node.

##### boolean removeFirstOccurrence(Object o)

###### Variables
		Object o:
			the value to search for and remove the first occurrence of, if found
###### Throws
		NullPointerException() if no Object is provided
###### Returns
		true if this LinkedList has been modified, false otherwise
###### Functionality
		If no Object has been provided, the function throws a NullPointerException().
		Otherwise, the function will search for the first occurrence of the provided Object.
		If found, the function will proceed and remove it from this LinkedList.
		In the end, the function will return true if this LinkedList has been structurally modified, false otherwise.

##### E removeLast()

###### Throws
		NoSuchElementExceptino() if this LinkedList is empty
###### Returns
		the value previously at the Node pointed to by tail
###### Functionality
		If this LInkedList is empty, the function throws a NoSuchElementException().
		If there is only one value in this LinkedList, the function reutrns the value at the tail Node, resetting head and tail to null.
		Otherwise, it will move the tail variable to the previous Node and then unlink this Node from the list.
		Finally, if all has gone through without an exception being thrown, it returns the value previously at the tail Node.

##### boolean removeLastOccurrence(Object o)

###### Variables
		Object o:
			the value to search for and remove the last occurrence of, if found
###### Throws
		NullPointerException() if no Object is provided
###### Returns
		true if this LinkedList has been modified, false otherwise
###### Functionality
		If no Object has been provided, the function throws a NullPointerException().
		Otherwise, the function will search for the last occurrence of the provided Object.
		If found, the function will proceed and remove it from this LinkedList.
		In the end, the function will return true if this LInkedList has been structurally modified, false otherwise.

##### boolean removeAll(Collection<?> c)

###### Variables
		Collection<?> c:
			Collection of values to remove if found in this LinkedList
###### Throws
		NullPointerException() if no Collection is provided or the provided Collection variable is null
###### Returns
		True if this ArrayList has been modified, False otherwise
###### Functionality
		Removes from this list all of its elements that are contained in the specified collection.

##### boolean retainAll(Collection<?> c)

###### Variables
		Collection<?> c:
			Collection of values to keep if found in this LinkedList
###### Throws
		NullPointerException() if no Collection is provided or the provided Collection variable is null
###### Returns
		True if this ArrayList has been modified in any way, False otherwise
###### Functionality
		If no Collection variable is provided or the provided Collection variable is null, the function throws a NullPointerException().
		Otherwise, if the function finds a value in this LinkedList that is NOT a part of the provided Collection, it will remove that value.
		In the end, the function will return True if this LinkedList has undergone changes due to calling this function, False otherwise.

##### E set(int index, E element)

###### Variables
		int index:
			the location at which to switch values
		E element:
			the replacement value for the value in the Node at the specified index
###### Throws
		NullPointerException() if no element is provided
		IndexOutOfBoundsException() if the provided index is out of bounds
###### Returns
		the value previously at the specified index

##### int size()

###### Returns
		the number of elements in this LinkedList

##### Object[] toArray()

###### Returns
		an array containing all the elements in this list in proper sequence (from first to last element)

##### <T> T[] toArray(T[] a)

###### Variables
		T[] a:
			Generic array with elements of type T to copy values into

###### Throws
      NullPointerException() if no array variable is provided or the provided array variable is null
###### Returns
      Array 'a' with values from this LinkedList copied into it in the order returned by this LinkedList's iterator

##### String toString()

###### Returns
      a String implementation of this LinkedList

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))

### Main.java

#### Functions

##### static void main(String[] args)

###### Functionality 
    This function gives the user a chance to play around with the functions available to them.

[Return to Table of Contents] ([#table_of_contents](https://github.com/tun67213/DataStructuresRevision/blob/main/README.md#table-of-contents))
