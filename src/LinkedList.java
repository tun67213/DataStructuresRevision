package src;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

// To return back to the README.md for this file, click here: https://github.com/tun67213/DataStructuresRevision/blob/main/README.md
/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
    /**
     * @param <E> Generic parameter for private class
     */
    private static class Node<E>
    {
        private Node<E> previous;
        private E data;
        private Node<E> next;

        public Node(E value)
        {
            this.previous = null;
            this.data = value;
            this.next = null;
        }
    }

    private int size;
    private Node<E> head;
    private Node<E> tail;

    /**
     * @code Constructs an empty list.
     */
    public LinkedList()
    {
        this.size = 0;
        head = null;
        tail = null;
    }

    /**
     * @param c Collection of values to initialize this LinkedList with
     * @throws NullPointerException if the provided Collection variable is null or any value in the provided Collection is null
     * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
     */
    public LinkedList(Collection<? extends E> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a non-null Collection");
        }
        Iterator<? extends E> iterator = c.iterator();
        Node<E> newNode;
        this.size = 0;
        this.head = null;
        this.tail = null;
        if(!c.isEmpty())
        {
            while(iterator.hasNext())
            {
                E value = iterator.next();
                if(value == null)
                {
                    throw new NullPointerException("Your collection cannot contain non-null elements");
                }
                newNode = new Node<>(value);
                if(head == null)
                {
                    head = newNode;
                    tail = newNode;
                }
                else
                {
                    tail.next = newNode;
                    newNode.previous = tail;
                    tail = tail.next;
                }
                this.size++;
            }
        }
    }

    /**
     * @param e the value to add to the end of this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value has been added successfully
     * @code Appends the specified element to the end of this list.
     */
    @Override
    public boolean add(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a non-null value to add to the end of this LinkedList");
        }
        Node<E> newNode = new Node<>(e);
        if(tail == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
        this.size++;
        return true;
    }

    /**
     * @param index the location at which to add the specified element in this LinkedList
     * @param element the value to add at the specified location in this list
     * @throws NullPointerException if no element is provided or the provided element is null
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @code Inserts the specified element at the specified position in this list.
     */
    @Override
    public void add(int index, E element)
    {
        if(element == null)
        {
            throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
        }
        if(index < 0 || index > this.size)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<E> newNode = new Node<>(element);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else if(index == 0)
        {
            head.previous = newNode;
            newNode.next = head;
            head = head.previous;
        }
        else if(index == this.size)
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
        else
        {
            Node<E> current = head;
            for(int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.previous = current;
            current.next.previous = newNode;
            current.next = newNode;
        }
        this.size++;
    }

    /**
     * @param c Collection of values to add to the end of this LinkedList in the order returned by the collection's iterator
     * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or the Collection variable contains null values
     * @return true if all the values were successfully added, false if the provided Collection is empty
     * @code Appends all the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
     */
    @Override
    public boolean addAll(Collection<? extends E> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a Collection of values to add to this LinkedList");
        }
        if(c.isEmpty())
        {
            return false;
        }
        Iterator<? extends E> iterator = c.iterator();
        while(iterator.hasNext())
        {
            E value = iterator.next();
            if(value == null)
            {
                throw new NullPointerException("Your collection cannot contain null elements");
            }
            Node<E> newNode = new Node<>(value);
            if(tail == null)
            {
                head = newNode;
                tail = newNode;
            }
            else
            {
                tail.next = newNode;
                newNode.previous = tail;
                tail = tail.next;
            }
            this.size++;
        }
        return true;
    }

    /**
     * @param index the location at which to start adding values from this Collection
     * @param c Collection of values to add to this LinkedList starting at the specified index
     * @throws NullPointerException if no Collection is provided, the provided Collection variable is null, or any value in the provided Collection is null
     * @return true if all the values were successfully added, false if the provided Collection is empty
     * @code Inserts all the elements in the specified collection into this list, starting at the specified position.
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean addAll(int index, Collection<? extends E> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a Collection of values to add to this LinkedList");
        }
        if(index < 0 || index > this.size)
        {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        Iterator<? extends E> iterator = c.iterator();
        Node<E> current;
        Node<E> newNode;
        E[] values = (E[]) c.toArray();
        if(head == null || index == this.size)
        {
            while(iterator.hasNext())
            {
                E value = iterator.next();
                if(value == null)
                {
                    throw new NullPointerException("Your collection cannot contain null elements");
                }
                newNode = new Node<>(value);
                if(head == null)
                {
                    head = newNode;
                    tail = newNode;
                }
                else
                {
                    tail.next = newNode;
                    newNode.previous = tail;
                    tail = tail.next;
                }
                this.size++;
            }
        }
        else if(index == 0)
        {
            for(int i = values.length - 1; i >= 0; i--)
            {
                newNode = new Node<>(values[i]);
                head.previous = newNode;
                newNode.next = head;
                head = head.previous;
                this.size++;
            }
        }
        else
        {
            current = head;
            for(int i = 0; i < index - 1; i++)
            {
                current = current.next;
            }
            while(iterator.hasNext())
            {
                E value = iterator.next();
                if(value == null)
                {
                    throw new NullPointerException("Your collection cannot contain null elements");
                }
                newNode = new Node<>(value);
                newNode.next = current.next;
                newNode.previous = current;
                current.next.previous = newNode;
                current.next = newNode;
                this.size++;
            }
        }
        return true;
    }

    /**
     * @param e the value to add to the beginning of this List
     * @throws NullPointerException if no value is provided or the provided value is null
     * @code Inserts the specified element at the beginning of this list.
     */
    @Override
    public void addFirst(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a value to insert as the head Node of this LinkedList");
        }
        Node<E> newNode = new Node<>(e);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            head.previous = newNode;
            newNode.next = head;
            head = head.previous;
        }
        this.size++;
    }

    /**
     * @param e the value to add to the end of this List
     * @throws NullPointerException if no value is provided or the provided value is null
     * @code Inserts the specified element to the end of this list.
     */
    @Override
    public void addLast(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a value to insert as the tail Node of this LinkedList");
        }
        Node<E> newNode = new Node<>(e);
        if(tail == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
        this.size++;
    }

    /**
     * @code Removes all the elements from this list.
     */
    @Override
    public void clear()
    {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * @return a shallow copy of this LinkedList
     */
    @Override
    public Object clone()
    {
        LinkedList<E> list = new LinkedList<>();
        for(Node<E> current = head; current != null; current = current.next)
        {
            list.add(current.data);
        }
        return list;
    }

    /**
     * @param o the Object to find the existence of in this LinkedList
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return true if the provided Object has been found, false otherwise
     */
    @Override
    public boolean contains(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find the existence of in this LinkedList");
        }
        Node<E> current = head;
        while(current != null && !current.data.equals(o))
        {
            current = current.next;
        }
        return current != null;
    }

    /**
     * @param c Collection of values to find the existence of in this LinkedList
     * @throws NullPointerException if no Collection is provided or the Collection variable provided is null
     * @return false if any value in the provided Collection is null or cannot be found in this LinkedList, true otherwise
     */
    @Override
    public boolean containsAll(Collection<?> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a Collection of values to find the existence of in this LinkedList");
        }
        if(c.isEmpty())
        {
            return true;
        }
        Iterator<?> iterator = c.iterator();
        while(iterator.hasNext())
        {
            Node<E> current = head;
            Object itNode = iterator.next();
            while(current != null && !current.data.equals(itNode))
            {
                current = current.next;
            }
            if(current == null)
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @return an iterator over the elements in this deque in reverse sequential order
     */
    @Override
    public Iterator<E> descendingIterator()
    {
        return new Iterator<>()
        {
            private Node<E> current;
            private Node<E> lastReturned = null;

            {
                this.current = tail;
            }

            @Override
            public boolean hasNext()
            {
                return current != null;
            }

            @Override
            public E next()
            {
                if(!hasNext())
                {
                    throw new NoSuchElementException("Iterator has reached the end of its iteration");
                }
                lastReturned = current;
                current = current.previous;
                return lastReturned.data;
            }

            @Override
            public void remove()
            {
                if(lastReturned == null)
                {
                    throw new IllegalStateException("You MUST call next() before calling remove");
                }
                else if(lastReturned.previous == null && lastReturned.next == null)
                {
                    head = null;
                    tail = null;
                    current = null;
                }
                else if(lastReturned.previous == null)
                {
                    head = head.next;
                    lastReturned.next = null;
                    head.previous = null;
                }
                else if(lastReturned.next == null)
                {
                    tail = tail.previous;
                    lastReturned.previous = null;
                    tail.next = null;
                }
                else
                {
                    lastReturned.previous.next = lastReturned.next;
                    lastReturned.next.previous = lastReturned.previous;
                    lastReturned.previous = null;
                    lastReturned.next = null;
                }
                size--;
                lastReturned = null;
            }
        };
    }

    /**
     * @throws NoSuchElementException if this List is empty
     * @return the value at the head (first element)
     */
    @Override
    public E element()
    {
        if(head == null)
        {
            throw new NoSuchElementException("This LinkedList is empty");
        }
        return head.data;
    }

    /**
     * @param index the location at which to retrieve a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the element at the specified position in this list
     */
    @Override
    public E get(int index)
    {
        if(index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        Node<E> current = head;
        for(int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current.data;
    }

    /**
     * @return the first element in this list
     */
    @Override
    public E getFirst()
    {
        if(head == null)
        {
            throw new NoSuchElementException("This LinkedList is empty");
        }
        return head.data;
    }

    /**
     * @return the last element in this list
     */
    @Override
    public E getLast()
    {
        if(tail == null)
        {
            throw new NoSuchElementException("This LinkedList is empty");
        }
        return tail.data;
    }

    /**
     * @param o the Object to find the location of the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return the index of the first occurrence of the specified element in this list or -1 if not found
     */
    @Override
    public int indexOf(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find the first occurrence of in this LinkedList");
        }
        Node<E> current = head;
        for(int i = 0; i < this.size; i++)
        {
            if(current.data.equals(o))
            {
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    /**
     * @return true if this LinkedList contains no values, false otherwise
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
        return new Iterator<>()
        {
            private Node<E> current;
            private Node<E> lastReturned = null;

            @Override
            public boolean hasNext()
            {
                return current != null;
            }

            @Override
            public E next()
            {
                if(!hasNext())
                {
                    throw new NoSuchElementException("Iterator has reached the end of its iteration");
                }
                lastReturned = current;
                current = current.next;
                return lastReturned.data;
            }

            @Override
            public void remove()
            {
                if(lastReturned == null)
                {
                    throw new IllegalStateException("You MUST call next() before calling remove");
                }
                else if(lastReturned.previous == null && lastReturned.next == null)
                {
                    head = null;
                    tail = null;
                }
                else if(lastReturned.previous == null)
                {
                    head = head.next;
                    lastReturned.next = null;
                    head.previous = null;
                }
                else if(lastReturned.next == null)
                {
                    tail = tail.previous;
                    lastReturned.previous = null;
                    tail.next = null;
                }
                else
                {
                    lastReturned.previous.next = lastReturned.next;
                    lastReturned.next.previous = lastReturned.previous;
                    lastReturned.previous = null;
                    lastReturned.next = null;
                }
                lastReturned = null;
                size--;
            }
        };
    }

    /**
     * @param o the Object to find the location of the last occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is null
     * @return the index of the last occurrence of the specified element in this list or -1 if not found
     */
    @Override
    public int lastIndexOf(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find the location of the last occurrence of");
        }
        Node<E> current = tail;
        for(int i = this.size - 1; i >= 0; i--)
        {
            if(current.data.equals(o))
            {
                return i;
            }
        }
        return -1;
    }

    /**
     * @return a list-iterator over the elements in this list (in proper sequence)
     */
    @Override
    public ListIterator<E> listIterator()
    {
        return new ListIterator<>()
        {
            private int currentIndex;
            private Node<E> current;
            private Node<E> lastReturned;

            {
                currentIndex = 0;
                current = head;
                lastReturned = null;
            }

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
                    throw new NoSuchElementException("Iterator has reached the end of its iteration");
                }
                E value = current.data;
                lastReturned = current;
                current = current.next;
                currentIndex++;
                return value;
            }

            @Override
            public int nextIndex()
            {
                return currentIndex;
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
                    throw new NoSuchElementException("Iterator has reached the end of its iteration");
                }
                current = current.previous;
                currentIndex--;
                lastReturned = current;
                return current.data;
            }

            @Override
            public int previousIndex()
            {
                return currentIndex - 1;
            }

            @Override
            public void set(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a value to set for the current index");
                }
                if(lastReturned == null)
                {
                    throw new NoSuchElementException("You MUST call next() before calling set");
                }
                lastReturned.data = e;
            }

            @Override
            public void add(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a value to add to this LinkedList");
                }
                Node<E> newNode = new Node<>(e);
                if(lastReturned == null)
                {
                    head = newNode;
                    tail = newNode;
                    lastReturned = head;
                }
                else if(lastReturned.previous == null && lastReturned.next == null)
                {
                    tail.next = newNode;
                    newNode.next = tail;
                    tail = tail.next;
                    lastReturned = tail;
                }
                else
                {
                    newNode.next = lastReturned.next;
                    newNode.previous = lastReturned;
                    lastReturned.next.previous = newNode;
                    lastReturned.next = newNode;
                    lastReturned = lastReturned.next;
                }
                size++;
            }

            @Override
            public void remove()
            {
                if(lastReturned == null)
                {
                    throw new NoSuchElementException("You MUST call next() or previous() before calling remove");
                }
            }
        };
    }

    /**
     * @param index the location at which to start this listIterator from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return a list-iterator over the elements in this list (in proper sequence), starting at the specified position in this list
     */
    @Override
    public ListIterator<E> listIterator(int index)
    {
        if(index < 0 || index > this.size)
        {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return new ListIterator<>()
        {
            private int currentIndex;
            private Node<E> current;
            private Node<E> lastReturned;

            {
                currentIndex = index;
                current = head;
                lastReturned = null;
            }

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
                    throw new NoSuchElementException("Iterator has reached the end of its iteration");
                }
                E value = current.data;
                lastReturned = current;
                current = current.next;
                currentIndex++;
                return value;
            }

            @Override
            public int nextIndex()
            {
                return currentIndex;
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
                    throw new NoSuchElementException("Iterator has reached the end of its iteration");
                }
                current = current.previous;
                currentIndex--;
                lastReturned = current;
                return current.data;
            }

            @Override
            public int previousIndex()
            {
                return currentIndex - 1;
            }

            @Override
            public void set(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a value to set for the current index");
                }
                if(lastReturned == null)
                {
                    throw new NoSuchElementException("You MUST call next() before calling set");
                }
                lastReturned.data = e;
            }

            @Override
            public void add(E e)
            {
                if(e == null)
                {
                    throw new NullPointerException("You MUST provide a value to add to this LinkedList");
                }
                Node<E> newNode = new Node<>(e);
                if(lastReturned == null)
                {
                    head = newNode;
                    tail = newNode;
                    lastReturned = head;
                }
                else if(lastReturned.previous == null && lastReturned.next == null)
                {
                    tail.next = newNode;
                    newNode.next = tail;
                    tail = tail.next;
                    lastReturned = tail;
                }
                else
                {
                    newNode.next = lastReturned.next;
                    newNode.previous = lastReturned;
                    lastReturned.next.previous = newNode;
                    lastReturned.next = newNode;
                    lastReturned = lastReturned.next;
                }
                size++;
            }

            @Override
            public void remove()
            {
                if(lastReturned == null)
                {
                    throw new NoSuchElementException("You MUST call next() or previous() before calling remove");
                }
            }
        };
    }

    /**
     * @param e the value to offer to this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value was successfully added as the tail element of this list
     * @code Adds the specified element as the tail (last element) of this list.
     */
    @Override
    public boolean offer(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a value to offer to this LinkedList");
        }
        Node<E> newNode = new Node<>(e);
        if(tail == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
        this.size++;
        return true;
    }

    /**
     * @param e the value to offer to this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value was successfully added as the head element of this list
     * @code Inserts the specified element at the front of this list.
     */
    @Override
    public boolean offerFirst(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a value to offer to this LinkedList");
        }
        Node<E> newNode = new Node<>(e);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            head.previous = newNode;
            newNode.next = head;
            head = head.previous;
        }
        this.size++;
        return true;
    }

    /**
     * @param e the value to offer to this LinkedList
     * @throws NullPointerException if no value is provided or the provided value is null
     * @return true if the value was successfully added as the tail element of this list
     * @code Inserts the specified element at the end of this list.
     */
    @Override
    public boolean offerLast(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a value to offer to this LinkedList");
        }
        Node<E> newNode = new Node<>(e);
        if(tail == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
            tail = tail.next;
        }
        this.size++;
        return true;
    }

    /**
     * @throws NoSuchElementException if this List is empty
     * @return the head (first element) of this list
     * @code Retrieves, but does not remove, the head (first element) of this list.
     */
    @Override
    public E peek()
    {
        if(head == null)
        {
            throw new NoSuchElementException("This LinkedList is empty");
        }
        return head.data;
    }

    /**
     * @return the first element of this list or null if this list is empty
     * @code Retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
     */
    @Override
    public E peekFirst()
    {
        if(head == null)
        {
            return null;
        }
        return head.data;
    }

    /**
     * @return the last element of this list or null if this list is empty
     * @code Retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
     */
    @Override
    public E peekLast()
    {
        if(tail == null)
        {
            return null;
        }
        return tail.data;
    }

    /**
     * @throws NoSuchElementException if this List is empty
     * @return the value in the Node previously at head
     * @code Retrieves and removes the head (first element) of this list.
     */
    @Override
    public E poll()
    {
        if(head == null)
        {
            return null;
        }
        Node<E> removingNode = head;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        else
        {
            head.previous = null;
            removingNode.next = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @return the value in the Node previously at head or null if this List is empty
     * @code Retrieves and removes the first element of this list, or returns null if this list is empty.
     */
    @Override
    public E pollFirst()
    {
        if(head == null)
        {
            return null;
        }
        Node<E> removingNode = head;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        else
        {
            head.previous = null;
            removingNode.next = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @return the value in the Node previously at tail or null if this List is empty
     * @code Retrieves and removes the last element of this list, or returns null if this list is empty.
     */
    @Override
    public E pollLast()
    {
        if(tail == null)
        {
            return null;
        }
        Node<E> removingNode = tail;
        tail = tail.previous;
        if(tail == null)
        {
            head = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @return the value at the top of the stack represented by this list
     * @throws EmptyStackException if the stack represented by this list is empty
     * @code Pops an element from the top stack represented by this list. The removed element is essentially the Node at head.
     */
    @Override
    public E pop()
    {
        if(head == null)
        {
            throw new EmptyStackException();
        }
        Node<E> removingNode = head;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        else
        {
            removingNode.next = null;
            head.previous = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @param e the value to be added onto the stack represented by this list
     * @throws NullPointerException if no value is provided
     * @code Pushes an element onto the stack represented by this list.
     */
    @Override
    public void push(E e)
    {
        if(e == null)
        {
            throw new NullPointerException("You MUST provide a value to push to this LinkedList");
        }
        Node<E> newNode = new Node<>(e);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            head.previous = newNode;
            newNode.next = head;
            head = head.previous;
        }
        this.size++;
    }

    /**
     * @return the value in the Node previously at head
     * @throws NoSuchElementException if this LinkedList is empty
     * @code Retrieves and removes the head (first element) of this list.
     */
    @Override
    public E remove()
    {
        if(head == null)
        {
            throw new NoSuchElementException("This LinkedList is empty");
        }
        Node<E> removingNode = head;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @param index the location at which to remove a value from
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value previously at the provided index
     * @code Removes the element at the specified position in this list.
     */
    @Override
    public E remove(int index)
    {
        if(index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        Node<E> removingNode = head;
        for(int i = 0; i < index; i++)
        {
            removingNode = removingNode.next;
        }
        if(removingNode.previous == null && removingNode.next == null)
        {
            head = null;
            tail = null;
        }
        else if(removingNode.previous == null)
        {
            head = head.next;
            removingNode.next = null;
            head.previous = null;
        }
        else if(removingNode.next == null)
        {
            tail = tail.previous;
            removingNode.previous = null;
            tail.next = null;
        }
        else
        {
            removingNode.previous.next = removingNode.next;
            removingNode.next.previous = removingNode.previous;
            removingNode.previous = null;
            removingNode.next = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @param o the Object to find and remove the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if this LinkedList has been modified, false otherwise
     * @code Removes the first occurrence of the specified element from this list, if it is present.
     */
    @Override
    public boolean remove(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find and remove the first occurrence of");
        }
        Node<E> removingNode = head;
        while(removingNode != null && !removingNode.data.equals(o))
        {
            removingNode = removingNode.next;
        }
        if(removingNode == null)
        {
            return false;
        }
        else if(removingNode.previous == null && removingNode.next == null)
        {
            head = null;
            tail = null;
        }
        else if(removingNode.previous == null)
        {
            head = head.next;
            removingNode.next = null;
            head.previous = null;
        }
        else if(removingNode.next == null)
        {
            tail = tail.previous;
            removingNode.previous = null;
            tail.next = null;
        }
        else
        {
            removingNode.previous.next = removingNode.next;
            removingNode.next.previous = removingNode.previous;
            removingNode.previous = null;
            removingNode.next = null;
        }
        this.size--;
        return true;
    }

    /**
     * @return the first element from this list
     * @throws NoSuchElementException if this List is empty
     * @code Removes and returns the first element from this list.
     */
    @Override
    public E removeFirst()
    {
        if(head == null)
        {
            throw new NoSuchElementException("This LinkedList is empty");
        }
        Node<E> removingNode = head;
        head = head.next;
        if(head == null)
        {
            tail = null;
        }
        else
        {
            removingNode.next = null;
            head.previous = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @param o the Object to find and remove the first occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if this List has been modified, false otherwise
     * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
     */
    @Override
    public boolean removeFirstOccurrence(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide an object to find and remove the first occurrence of");
        }
        Node<E> removingNode = head;
        while(removingNode != null && !removingNode.data.equals(o))
        {
            removingNode = removingNode.next;
        }
        if(removingNode == null)
        {
            return false;
        }
        else if(removingNode.previous == null && removingNode.next == null)
        {
            head = null;
            tail = null;
        }
        else if(removingNode.previous == null)
        {
            head = head.next;
            removingNode.next = null;
            head.previous = null;
        }
        else if(removingNode.next == null)
        {
            tail = tail.previous;
            removingNode.previous = null;
            tail.next = null;
        }
        else
        {
            removingNode.previous.next = removingNode.next;
            removingNode.next.previous = removingNode.previous;
            removingNode.previous = null;
            removingNode.next = null;
        }
        this.size--;
        return true;
    }

    /**
     * @return the last element from this list
     * @throws NoSuchElementException if this List is empty
     * @code Removes and returns the last element from this list.
     */
    @Override
    public E removeLast()
    {
        if(tail == null)
        {
            throw new NoSuchElementException("This LinkedList is empty");
        }
        Node<E> removingNode = tail;
        tail = tail.previous;
        if(tail == null)
        {
            head = null;
        }
        else
        {
            removingNode.previous = null;
            tail.next = null;
        }
        this.size--;
        return removingNode.data;
    }

    /**
     * @param o the Object to find and remove the last occurrence of
     * @throws NullPointerException if no Object is provided or the provided Object is 'null'
     * @return true if this List has been modified, false otherwise
     * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
     */
    @Override
    public boolean removeLastOccurrence(Object o)
    {
        if(o == null)
        {
            throw new NullPointerException("You MUST provide a value to find and remove the last occurrence of");
        }
        Node<E> removingNode = tail;
        while(removingNode != null && !removingNode.data.equals(o))
        {
            removingNode = removingNode.previous;
        }
        if(removingNode == null)
        {
            return false;
        }
        else if(removingNode.previous == null && removingNode.next == null)
        {
            head = null;
            tail = null;
        }
        else if(removingNode.previous == null)
        {
            head = head.next;
            removingNode.next = null;
            head.previous = null;
        }
        else if(removingNode.next == null)
        {
            tail = tail.previous;
            removingNode.previous = null;
            tail.next = null;
        }
        else
        {
            removingNode.previous.next = removingNode.next;
            removingNode.next.previous = removingNode.previous;
            removingNode.previous = null;
            removingNode.next = null;
        }
        this.size--;
        return true;
    }

    /**
     * @param c Collection of values to remove if found in this List
     * @throws NullPointerException if no Collection is provided or the provided Collection is 'null'
     * @return true if this List has been modified, false otherwise
     * @code If no Collection is provided, the function throws a NullPointerException(). Otherwise, if any value in this List is found in the provided Collection, the function removes it from this List. In the end, if the List has been changed in any way, the function returns true.
     */
    @Override
    public boolean removeAll(Collection<?> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a collection of values to remove from this LinkedList");
        }
        if(c.isEmpty())
        {
            return false;
        }
        Node<E> current = head;
        boolean modified = false;
        while(current != null)
        {
            if(c.contains(current.data))
            {
                if(current.previous == null && current.next == null)
                {
                    head = null;
                    tail = null;
                    return true;
                }
                else if(current.previous == null)
                {
                    head = head.next;
                    current.next = null;
                    head.previous = null;
                    current = head;
                }
                else if(current.next == null)
                {
                    tail = tail.previous;
                    current.previous = null;
                    tail.next = null;
                    current = tail;
                }
                else
                {
                    Node<E> newCurrent = current.previous;
                    current.previous.next = current.next;
                    current.next.previous = current.previous;
                    current.previous = null;
                    current.next = null;
                    current = newCurrent;
                }
                this.size--;
                modified = true;
            }
            current = current.next;
        }
        return modified;
    }

    /**
     * @param c Collection of values to keep if found in this List
     * @throws NullPointerException if no Collection is provided
     * @return true if this List has been modified, false otherwise
     * @code If no Collection is provided, the function throws a NullPointerException(). Otherwise, if any value in this List is not found in the provided Collection, the function removes it from this List. In the end, if the list has been changed in any way, the function returns true.
     */
    @Override
    public boolean retainAll(Collection<?> c)
    {
        if(c == null)
        {
            throw new NullPointerException("You MUST provide a collection of values to retain in this LinkedList");
        }
        if(c.isEmpty())
        {
            this.size = 0;
            this.head = null;
            this.tail = null;
            return true;
        }
        Node<E> current = head;
        boolean modified = false;
        while(current != null)
        {
            if(!c.contains(current.data))
            {
                if(current.previous == null && current.next == null)
                {
                    this.size = 0;
                    head = null;
                    tail = null;
                    return true;
                }
                else if(current.previous == null)
                {
                    head = head.next;
                    current.next = null;
                    head.previous = null;
                    current = head;
                }
                else if(current.next == null)
                {
                    tail = tail.previous;
                    current.previous = null;
                    tail.next = null;
                    current = tail;
                }
                else
                {
                    Node<E> removingNode = current;
                    current = current.previous;
                    removingNode.previous.next = removingNode.next;
                    removingNode.next.previous = removingNode.previous;
                    removingNode.previous = null;
                    removingNode.next = null;
                }
                this.size--;
                modified = true;
            }
            current = current.next;
        }
        return modified;
    }

    /**
     * @param index the location at which to replace a value
     * @param element the replacement value for the specified index
     * @throws NullPointerException if no replacement value is provided
     * @throws IndexOutOfBoundsException if the provided index is out of bounds
     * @return the value at the specified index BEFORE replacement
     * @code Replaces the element at the specified position in this list with the specified element.
     */
    @Override
    public E set(int index, E element)
    {
        if(element == null)
        {
            throw new NullPointerException("You MUST provide a replacement value");
        }
        if(index < 0 || index >= this.size)
        {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        Node<E> current = head;
        for(int i = 0; i < index; i++)
        {
            current = current.next;
        }
        E value = current.data;
        current.data = element;
        return value;
    }

    /**
     * @return the number of elements in this list
     */
    @Override
    public int size()
    {
        return this.size;
    }

    /**
     * @return an array containing all the elements in this list in proper sequence (from first to last element)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object[] toArray()
    {
        E[] newArray = (E[]) new Object[this.size];
        Node<E> current = head;
        for(int i = 0; i < this.size; i++)
        {
            newArray[i] = current.data;
            current = current.next;
        }
        return newArray;
    }

    /**
     * @param a an array of type T into which to copy values from this LinkedList into
     * @throws NullPointerException if no array of type T is provided
     * @throws ClassCastException if T is not of the same type as E
     * @return an array containing all the elements in this list in proper sequence (from first to last element); the runtime of the returned array is that of the specified array
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> T[] toArray(T[] a)
    {
        if(a == null)
        {
            throw new NullPointerException("You MUST provide an array of type T to copy values from this LinkedList into");
        }
        if(a.length < this.size)
        {
            a = (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), this.size);
        }
        Node<E> current = head;
        for(int i = 0; i < this.size; i++)
        {
            a[i] = (T) current.data;
            current = current.next;
        }
        return a;
    }

    /**
     * @return a String representation of this LinkedList that is easier for the user to understand
     */
    @Override
    public String toString()
    {
        StringBuilder buff = new StringBuilder();
        for(Node<E> current = head; current != null; current = current.next)
        {
            buff.append(current.data);
            if(current.next != null)
            {
                buff.append(" <--> ");
            }
        }
        return buff.toString();
    }
}
