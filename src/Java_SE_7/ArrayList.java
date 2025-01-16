package src.Java_SE_7;

import java.util.NoSuchElementException;

// To return back to the README.md for this file, click here: https://github.com/tun67213/DataStructuresRevision/blob/main/README.md
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, Serializable
{
    private int size;
    private int capacity;
    private E[] array;

    /**
     * @code Default constructor for this class
     */
    @SuppressWarnings("unchecked")
    public ArrayList()
    {
        this.size = 0;
        this.capacity = 10;
        this.array = (E[]) new Object[this.capacity];
    }

    /**
     * @param c Collection of values to initialize this ArrayList with
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or any variable in the provided Collection is null
     * @code This constructor creates a new ArrayList and initializes it with values from this Collection, in the order returned by this Collection's iterator.
     */
    @SuppressWarnings("unchecked")
    public ArrayList(Collection<? extends E> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a non-null collection of values to initialize this ArrayList with");
        }
        this.size = 0;
        this.capacity = c.size() + c.size() / 2;
        if(c.isEmpty())
        {
            this.capacity = 10;
        }
        this.array = (E[]) new Object[this.capacity];
        Iterator<? extends E> iterator = c.iterator();
        while(iterator.hasNext())
        {
            this.array[this.size] = iterator.next();
            this.size++;
        }
    }

    /**
     * @param initialCapacity capacity to initialize this ArrayList with
     * @throws IllegalArgumentException if the provided index is less than or equal to 0
     * @code This constructor will initialize this ArrayList with an initialCapacity number of values allocated in the array
     */
    @SuppressWarnings("unchecked")
    public ArrayList(int initialCapacity)
    {
        if(initialCapacity <= 0)
        {
            throw new IllegalArgumentException("You MUST provide a non-zero, non-negative initial capacity");
        }
        this.size = 0;
        this.capacity = initialCapacity;
        this.array = (E[]) new Object[this.capacity];
    }

    /**
     * @code Makes sure that the array representing this ArrayList has enough capacity, and if not, expands the storage.
     */
    @SuppressWarnings("unchecked")
    private void ensureCapacity()
    {
        if(this.size == this.capacity)
        {
            int newCapacity = this.capacity + this.capacity / 2;
            E[] newArray = (E[]) new Object[newCapacity];
            System.arraycopy(this.array, 0, newArray, 0, this.size);
            this.capacity = newCapacity;
            this.array = newArray;
        }
    }

    /**
     * @code Helper function to check bounds and throw exceptions if necessary
     */
    private void checkBounds(int index)
    {
        if(index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.size);
        }
    }
    private void checkBounds(int fromIndex, int toIndex)
    {
        if(fromIndex < 0 && toIndex > this.size)
        {
            throw new IndexOutOfBoundsException("Indices " + fromIndex + " and " + toIndex + " are out of bounds");
        }
        if(fromIndex < 0)
        {
            throw new IndexOutOfBoundsException("Index " + fromIndex + " is out of bounds");
        }
        if(toIndex > this.size)
        {
            throw new IndexOutOfBoundsException("Index " + toIndex + " is out of bounds");
        }
        if(fromIndex >= toIndex)
        {
            throw new IllegalArgumentException("Index " + fromIndex + " cannot be greater than or equal to Index " + toIndex);
        }
    }

    /**
     * @param e the value to be added to the end of this ArrayList
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if this value has been added successfully
     * @code Appends the specified element to the end of this list.
     */
    @Override
    public boolean add(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a value to add to this ArrayList");
        }
        ensureCapacity();
        this.array[this.size] = e;
        this.size++;
        return true;
    }

    /**
     * @param index the location at which to add the specified element
     * @param element the value to be added to the specified element in the array representing this ArrayList
     * @throws NullPointerException if no value is provided or the provided value is 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @code If no element is provided or the provided element is null, the function throws a NullPointerException(). if the provided index is out of bounds, the function throws an IndexOutOfBoundsException(). Otherwise, it calls ensureCapacity(), shifts elements over to the right to allocate the value provided, and then inserts it into the provided index by assigning it there.
     */
    @Override
    public void add(int index, E element)
    {
        if(element == null)
        {
            throw new NullPointerException("You MUST provide a value to add to this ArrayList");
        }
        checkBounds(index);
        ensureCapacity();
        for(int i = this.size; i > index; i--)
        {
            this.array[i] = this.array[i - 1];
        }
        this.array[index] = element;
        this.size++;
    }

    /**
     * @param c Collection of values to add to the end of this ArrayList
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or any value in the provided Collection variable is 'null'
     * @return true if values have been added to this ArrayList, modifying it, false if the provided Collection is empty
     * @code If no Collection variable is provided, the provided Collection variable is defined as 'null' or the provided Collection variable contains 'null' values, the function throws a NullPointerException(). Otherwise, the function adds the values in the provided Collection in the order returned by the Collection's iterator to the end of this ArrayList, calling ensureCapacity() each time.
     */
    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a Collection of values to add to this ArrayList");
        }
        if(c.isEmpty())
        {
            return false;
        }
        if(c.contains(null))
        {
            throw new NullPointerException("You MUST provide a Collection of non-null values to add to this ArrayList");
        }
        Iterator<? extends E> iterator = c.iterator();
        while(iterator.hasNext())
        {
            E value = iterator.next();
            this.array[this.size] = value;
            this.size++;
        }
        return true;
    }

    /**
     * @param index the location at which the FIRST value of this Collection must go
     * @param c Collection of values to add to the specified index in this ArrayList
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is 'null' or the provided Collection variable contains values that are 'null'
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return true if this ArrayList has been modified, false if the provided Collection is empty
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(int index, Collection<? extends E> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a Collection of values to add to this ArrayList");
        }
        if(c.contains(null))
        {
            throw new NullPointerException("You MUST provide a Collection of non-null values to add to this ArrayList");
        }
        checkBounds(index);
        if(c.isEmpty())
        {
            return false;
        }
        E[] values = (E[]) c.toArray();
        for(int i = values.length - 1; i >= 0; i--)
        {
            ensureCapacity();
            for(int j = this.size; j > index; j--)
            {
                this.array[j] = this.array[j - 1];
            }
            this.array[index] = values[i];
            this.size++;
        }
        return true;
    }

    /**
     * @code Removes all the elements from this list.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void clear()
    {
        this.size = 0;
        this.capacity = 10;
        this.array = (E[]) new Object[this.capacity];
    }

    /**
     * @return a shallow copy of this ArrayList
     */
    @Override
    public Object clone()
    {
        ArrayList<E> list = new ArrayList<>();
        for(int i = 0; i < this.size; i++)
        {
            list.add(this.array[i]);
        }
        return list;
    }

    /**
     * @param o the Object to find the existence of in this Arraylist
     * @throws NullPointerException if the provided element is 'null'
     * @return true if this list contains the specified element, false otherwise
     */
    @Override
    public boolean contains(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find the existence of in this ArrayList");
        }
        int i = 0;
        while(i < this.size && !(this.array[i].equals(o)))
        {
            i++;
        }
        return i < this.size;
    }

    /**
     * @param c Collection of values to find the existence of in this ArrayList
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is null
     * @return false if a value in the provided Collection is 'null' or could not be found in this Arraylist, true if all values were found
     */
    @Override
    public boolean containsAll(Collection<?> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a Collection of values to check the existence of in this ArrayList");
        }
        Iterator<?> iterator = c.iterator();
        while(iterator.hasNext())
        {
            Object value = iterator.next();
            int i = 0;
            while(i < this.size && !(this.array[i].equals(value)))
            {
                i++;
            }
            if(i >= this.size)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @param index the location at which to retrieve a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the specified index in this List
     */
    @Override
    public E get(int index)
    {
        checkBounds(index);
        return this.array[index];
    }

    /**
     * @param o the Object to find the location of the first occurrence of
     * @throws NullPointerException if the provided index is out of bounds
     * @return the location of the first occurrence of the provided index or -1 if not found
     */
    @Override
    public int indexOf(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find the location of the first occurrence of");
        }
        int i = 0;
        while(i < this.size && !(this.array[i].equals(o)))
        {
            i++;
        }
        return (i >= this.size) ? -1 : i;
    }

    /**
     * @return true if this list contains no elements, false otherwise
     */
    @Override
    public boolean isEmpty()
    {
        return this.size == 0;
    }

    /**
     * @return an iterator over the elements in this list, in proper sequence
     */
    @Override
    public Iterator<E> iterator()
    {
        return new Iterator<E>()
        {
            private int currentIndex = 0;
            private int lastCalled = -1;

            @Override
            public boolean hasNext()
            {
                return currentIndex < size;
            }

            @Override
            public E next()
            {
                if(!hasNext())
                {
                    throw new NoSuchElementException("This iterator has reached the end of this ArrayList");
                }
                E value = array[this.currentIndex];
                lastCalled = this.currentIndex;
                this.currentIndex++;
                return value;
            }

            @Override
            public void remove()
            {
                if(lastCalled == -1)
                {
                    throw new IllegalStateException("You MUST call next() before performing a removal");
                }
                for(int i = lastCalled; i < size - 1; i++)
                {
                    array[i] = array[i + 1];
                }
                size--;
                currentIndex = lastCalled;
                lastCalled = -1;
            }
        };
    }

    /**
     * @param o the Object to find the last occurrence of
     * @throws NullPointerException if no Object is provided
     * @return the location of the last occurrence of the provided Object or -1 if not found
     */
    @Override
    public int lastIndexOf(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find the last index of");
        }
        int i = this.size - 1;
        while(i >= 0 && !this.array[i].equals(o))
        {
            i--;
        }
        return i;
    }

    /**
     * @return a list iterator over the elements in this list (in proper sequence)
     */
    @Override
    public ListIterator<E> listIterator()
    {
        return new ListIterator<E>()
        {
            private int currentIndex = 0;
            private int lastCalled = -1;

            @Override
            public boolean hasNext()
            {
                return currentIndex < size;
            }

            @Override
            public E next()
            {
                if(!hasNext())
                {
                    throw new NoSuchElementException("This iterator has reached the end of this ArrayList");
                }
                E value = array[this.currentIndex];
                lastCalled = this.currentIndex;
                this.currentIndex++;
                return value;
            }

            @Override
            public boolean hasPrevious()
            {
                return currentIndex > 0;
            }

            @Override
            public E previous()
            {
                if(!hasPrevious())
                {
                    throw new NoSuchElementException("This iterator has reached the beginning of this ArrayList");
                }
                this.currentIndex--;
                lastCalled = this.currentIndex;
                return array[this.currentIndex];
            }

            @Override
            public int nextIndex()
            {
                return this.currentIndex;
            }

            @Override
            public int previousIndex()
            {
                return this.currentIndex - 1;
            }

            @Override
            public void remove()
            {
                if(lastCalled == -1)
                {
                    throw new IllegalStateException("You MUST call next() or previous() before performing a removal");
                }
                for(int i = lastCalled; i < size - 1; i++)
                {
                    array[i] = array[i + 1];
                }
                size--;
                currentIndex = lastCalled;
                lastCalled = -1;
            }

            @Override
            public void set(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a replacement value");
                }
                if(lastCalled == -1)
                {
                    throw new IllegalStateException("You MUST call next() or previous() before performing set()");
                }
                array[lastCalled] = e;
            }

            @Override
            public void add(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a value to add to this ArrayList");
                }
                ensureCapacity();
                for(int i = size; i > currentIndex; i--)
                {
                    array[i] = array[i - 1];
                }
                array[currentIndex] = e;
                size++;
                lastCalled = -1;
            }
        };
    }

    /**
     * @param index the location at which to start this List Iterator from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in this list
     */
    @Override
    public ListIterator<E> listIterator(int index)
    {
        checkBounds(index);
        return new ListIterator<E>()
        {
            private int currentIndex = index;
            private int lastCalled = -1;

            @Override
            public boolean hasNext()
            {
                return currentIndex < size;
            }

            @Override
            public E next()
            {
                if(!hasNext())
                {
                    throw new NoSuchElementException("This iterator has reached the end of this ArrayList");
                }
                E value = array[this.currentIndex];
                lastCalled = this.currentIndex;
                this.currentIndex++;
                return value;
            }

            @Override
            public boolean hasPrevious()
            {
                return currentIndex > 0;
            }

            @Override
            public E previous()
            {
                if(!hasPrevious())
                {
                    throw new NoSuchElementException("This iterator has reached the beginning of this ArrayList");
                }
                this.currentIndex--;
                lastCalled = this.currentIndex;
                return array[this.currentIndex];
            }

            @Override
            public int nextIndex()
            {
                return this.currentIndex;
            }

            @Override
            public int previousIndex()
            {
                return this.currentIndex - 1;
            }

            @Override
            public void remove()
            {
                if(lastCalled == -1)
                {
                    throw new IllegalStateException("You MUST call next() or previous() before performing a removal");
                }
                for(int i = lastCalled; i < size - 1; i++)
                {
                    array[i] = array[i + 1];
                }
                size--;
                currentIndex = lastCalled;
                lastCalled = -1;
            }

            @Override
            public void set(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a replacement value");
                }
                if(lastCalled == -1)
                {
                    throw new IllegalStateException("You MUST call next() or previous() before performing set()");
                }
                array[lastCalled] = e;
            }

            @Override
            public void add(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a value to add to this ArrayList");
                }
                ensureCapacity();
                for(int i = size; i > currentIndex; i--)
                {
                    array[i] = array[i - 1];
                }
                array[currentIndex] = e;
                size++;
                lastCalled = -1;
            }
        };
    }

    /**
     * @param index the location at which to remove a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the specified index prior to removal
     * @code If the provided index is out of bounds, the function throws an IndexOutOfBoundsException(). Otherwise, the function saves the value at the specified index, removes it, and then returns that removed value back to the user.
     */
    @Override
    public E remove(int index)
    {
        checkBounds(index);
        E removingValue = this.array[index];
        for(int i = index; i < this.size - 1; i++)
        {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
        return removingValue;
    }

    /**
     * @param o the Object to find and remove the first occurrence of
     * @throws NullPointerException if the provided index is out of bounds
     * @return true if this ArrayList has been modified, false otherwise
     * @code If no Object is provided or the provided Object is 'null' the function throws a NullPointerException(). Otherwise, if the provided Object is found, it removes the first occurrence of it from this List and returns true.
     */
    @Override
    public boolean remove(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find and remove the first occurrence of");
        }
        int currentIndex = 0;
        while(currentIndex < this.size && !(this.array[currentIndex].equals(o)))
        {
            currentIndex++;
        }
        if(currentIndex >= this.size)
        {
            return false;
        }
        for(int i = currentIndex; i < this.size - 1; i++)
        {
            this.array[i] = this.array[i + 1];
        }
        this.size--;
        return true;
    }

    /**
     * @param c Collection of values to remove if located in this ArrayList
     * @throws NullPointerException if no Collection is provided or the provided Collection variable is null.
     * @return true if this ArrayList has been modified, false otherwise.
     * @code If no Collection variable is provided, the function throws a NullPointerException(). Otherwise, the function runs through the values in the order returned by its iterator, and if a value is found in this List, the function will remove it from this ArrayList. In the end, if this ArrayList has been structurally modified, the function returns true.
     */
    @Override
    public boolean removeAll(Collection<?> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a collection of values to remove from this ArrayList");
        }
        int i = 0;
        boolean modified = false;
        while(i < this.size)
        {
            E value = this.array[i];
            if(c.contains(value))
            {
                for(int j = i; j < this.size - 1; j++)
                {
                    this.array[j] = this.array[j + 1];
                }
                modified = true;
                i--;
                this.size--;
            }
            i++;
        }
        return modified;
    }

    /**
     * @param fromIndex the index, inclusive of which, to start removing from
     * @param toIndex the index, exclusive of which, to remove values until
     * @throws IndexOutOfBoundsException if either index is out of bounds
     * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
     * @code Removes from this list all the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
     */
    @Override
    protected void removeRange(int fromIndex, int toIndex)
    {
        checkBounds(fromIndex, toIndex);
        for(int i = fromIndex; i < toIndex; i++)
        {
            for(int j = fromIndex; j < this.size - 1; j++)
            {
                this.array[j] = this.array[j + 1];
            }
            this.size--;
        }
    }

    /**
     * @param c Collection of values to keep if found in this ArrayLIst
     * @throws NullPointerException if no Collection variable is provided or the provided Collection variable is 'null'
     * @return true if this ArrayList has been modified, false otherwise
     * @code If no Collection is provided or the variable provided is defined as 'null' the function throws a NullPointerException(). Otherwise, if a value in this ArrayList isn't contained in the provided Collection, the function removes it. In the end, if at least one value was removed, the function returns true. Otherwise, the function returns false.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean retainAll(Collection<?> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a Collection of values to keep if found in this ArrayList");
        }
        if(c.isEmpty())
        {
            this.size = 0;
            this.capacity = 10;
            this.array = (E[]) new Object[this.capacity];
            return true;
        }
        int i = 0;
        boolean modified = false;
        while(i < this.size)
        {
            if(!c.contains(this.array[i]))
            {
                for(int j = i; j < this.size - 1; j++)
                {
                    this.array[j] = this.array[j + 1];
                }
                modified = true;
                i--;
                this.size--;
            }
            i++;
        }
        return modified;
    }

    /**
     * @param index the location at which to replace value
     * @param element the replacement value for this ArrayList
     * @throws NullPointerException if no element is provided or the provided element is null
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value previously at the specified index
     * @code Replaces the element at the specified position in this list with the specified element.
     */
    @Override
    public E set(int index, E element)
    {
        if(element == null)
        {
            throw new NullPointerException("You MUST provide a replacement value");
        }
        checkBounds(index);
        E value = this.array[index];
        this.array[index] = element;
        return value;
    }

    /**
     * @return the number of elements in this ArrayList
     */
    @Override
    public int size()
    {
        return this.size;
    }

    /**
     * @param fromIndex the index (inclusive of) from which to create this new List
     * @param toIndex the index (exclusive of) to create this new List until
     * @throws IndexOutOfBoundsException if any of these indices are out of bounds
     * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
     * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
     */
    @Override
    public List<E> subList(int fromIndex, int toIndex)
    {
        checkBounds(fromIndex, toIndex);
        ArrayList<E> list = new ArrayList<>();
        for(int i = fromIndex; i < toIndex; i++)
        {
            list.add(this.array[i]);
        }
        return list;
    }

    /**
     * @return an array containing all the elements in this list in proper sequence (from first to last element)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object[] toArray()
    {
        E[] newArray = (E[]) new Object[this.size];
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        return newArray;
    }

    /**
     * @param a array into which to copy values from this ArrayList
     * @throws NullPointerException if no array variable is provided or the provided variable is null
     * @return the provided array with values from this List accommodated into it
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a)
    {
        if(a == null)
        {
            throw new NullPointerException("You MUST provide an array to copy values from this ArrayList into");
        }
        if(a.length < this.size)
        {
            a = (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), this.size);
        }
        for(int i = 0; i < this.size; i++)
        {
            a[i] = (T) this.array[i];
        }
        return a;
    }

    /**
     * @code Trims the capacity of this ArrayList instance to be the list's current size.
     */
    @SuppressWarnings("unchecked")
    public void trimToSize()
    {
        int newCapacity = this.size;
        if(this.capacity != newCapacity)
        {
            E[] newArray = (E[]) new Object[newCapacity];
            System.arraycopy(this.array, 0, newArray, 0, this.size);
            this.capacity = newCapacity;
            this.array = newArray;
        }
    }

    /**
     * @return a String representation of this ArrayList
     */
    @Override
    public String toString()
    {
        StringBuilder buff = new StringBuilder();
        buff.append("[");
        for(int i = 0; i < this.size; i++)
        {
            buff.append(this.array[i]);
            if(i != this.size - 1)
            {
                buff.append(", ");
            }
        }
        buff.append("]");
        return buff.toString();
    }
}
