package Java_SE_6;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with LinkedList for Java SE 6.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code Class creates way to manage this LinkedList.
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

	// The following private variables will manage this LinkedList class
	private int size;		// Used to track the number of elements in this LinkedList
	private Node<E> head;	// Used to track the beginning of this LinkedList
	private Node<E> tail;	// Used to track the end of this LinkedList

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
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null values to initialize this LinkedList with");
		}
		this.size = 0;
		head = null;
		tail = null;
		Node<E> newNode;
		if(!c.isEmpty())
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				newNode = new Node<>(iterator.next());
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
	 * @param e the value to be added to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has been successfully added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
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
	 * @param index the location at which to add the specified value into this list
	 * @param element the value to add to this list
	 * @throws NullPointerException if no value is provided
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
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
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
	 * @param c Collection of values to add to the end of this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's Iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null values to add to this LinkedList");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		Node<E> newNode;
		while(iterator.hasNext())
		{
			newNode = new Node<>(iterator.next());
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
	 * @param index the location at which to start adding values into this list
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this ArrayList has been structurally modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null values to add to this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		Node<E> newNode, current;
		if(head == null || index == this.size)
		{
			while(iterator.hasNext())
			{
				newNode = new Node<>(iterator.next());
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
		}
		else if(index == 0)
		{
			boolean addedOne = false;
			current = head;
			while(iterator.hasNext())
			{
				newNode = new Node<>(iterator.next());
				if(!addedOne)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
					addedOne = true;
					current = head;
				}
				else
				{
					newNode.next = current.next;
					newNode.previous = current;
					current.next.previous = newNode;
					current.next = newNode;
					current = current.next;
				}
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
				newNode = new Node<>(iterator.next());
				newNode.next = current.next;
				newNode.previous = current;
				current.next.previous = newNode;
				current.next = newNode;
				current = current.next;
				this.size++;
			}
		}
		return true;
	}

	/**
	 * @param e the value to add to the beginning of this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
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
	 * @param e the value to add to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
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
	 * @code Removes all of the elements from this list.
	 */
	@Override
	public void clear()
	{
		this.size = 0;
		head = null;
		tail = null;
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
	 * @param o the Object to find the existence of in this list
	 * @return true if this list contains the specified element, false if the provided element is null or not contained in this list
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			return false;
		}
		Node<E> current = head;
		while(current != null && !(current.data.equals(o)))
		{
			current = current.next;
		}
		return current != null;
	}

	/**
	 * @param c Collection of values to find the existence of in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if all the values in the provided collection are non-null and contained in this list, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to find the existence of");
		}
		if(c.contains(null))
		{
			return false;
		}
		Iterator<?> iterator = c.iterator();
		Node<E> current;
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			current = head;
			while(current != null && !(current.data.equals(value)))
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
	 * @param o the Object to compare with this list for equality
	 * @return true if this list matches the provided Object, false otherwise
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null)
		{
			return false;
		}
		if(!(o instanceof LinkedList<?>))
		{
			return false;
		}
		LinkedList<?> other = (LinkedList<?>) o;
		if(this.size != other.size)
		{
			return false;
		}
		for(int i = 0; i < this.size; i++)
		{
			Object thisElement = this.get(i);
			Object otherElement = other.get(i);
			if(thisElement == null && otherElement != null)
			{
				return false;
			}
			else if(!(thisElement.equals(otherElement)))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @return an iterator over the elements in this list in reverse sequential order
	 */
	@Override
	public Iterator<E> descendingIterator()
	{
		return new Iterator<>()
		{
			private Node<E> current;
			private Node<E> lastReturned;

			{
				this.current = tail;
				this.lastReturned = null;
			}

			/**
			 * @return true if the iteration has more elements, false otherwise
			 */
			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			/**
			 * @return the next element in the iteration
			 */
			@Override
			public E next()
			{
				if(current == null)
				{
					throw new NoSuchElementException("This iterator has reached the end of this LinkedList");
				}
				lastReturned = current;
				current = current.previous;
				return lastReturned.data;
			}

			/**
			 * @code Removes from the underlying collection the last element returned by the iterator.
			 */
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
	 * @return the head (first element) of this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list.
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
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
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
	 * @throws NoSuchElementException if this list is empty
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
	 * @throws NoSuchElementException if this list is empty
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
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		int hash = 1;
		for(Node<E> current = head; current != null; current = current.next)
		{
			hash = 31 * hash + ((current.data == null) ? 0 : current.data.hashCode());
		}
		return hash;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int indexOf(Object o)
	{
		if(o == null)
		{
			return -1;
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
	 * @return an iterator over the elements in this list
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<>()
		{
			private Node<E> current;
			private Node<E> lastReturned;

			{
				this.current = head;
				this.lastReturned = null;
			}

			/**
			 * @return true if the iteration has more elements, false otherwise
			 */
			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			/**
			 * @return the next element in the iteration
			 * @throws NoSuchElementException if hasNext() returns false
			 */
			@Override
			public E next()
			{
				if(current == null)
				{
					throw new NoSuchElementException("This iterator has reached the end of this LinkedList");
				}
				lastReturned = current;
				current = current.next;
				return lastReturned.data;
			}

			/**
			 * @code Removes from the underlying collection the last element returned by the iterator.
			 * @throws IllegalStateException if called multiple times
			 */
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
				size--;
				lastReturned = null;
			}
		};
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
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the specified Object or -1 if the provided Object is null or not contained in this list
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		if(o == null)
		{
			return -1;
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
	 * @return a list iterator over the elements in this list
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<>()
		{
			private Node<E> current;
			private Node<E> lastReturned;
			private int currentIndex;

			{
				this.current = head;
				this.lastReturned = null;
				this.currentIndex = 0;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add");
				}
				Node<E> newNode = new Node<>(e);
				if(head == null)
				{
					head = newNode;
					tail = newNode;
				}
				else if(current.previous == null)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
				}
				else
				{
					newNode.next = current;
					newNode.previous = current.previous;
					current.previous.next = newNode;
					current.previous = newNode;
				}
				lastReturned = null;
				size++;
				currentIndex++;
			}

			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			@Override
			public E next()
			{
				if(current == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				lastReturned = current;
				current = current.next;
				currentIndex++;
				return lastReturned.data;
			}

			@Override
			public int nextIndex()
			{
				return currentIndex;
			}

			@Override
			public boolean hasPrevious()
			{
				return current.previous != null;
			}

			@Override
			public E previous()
			{
				if(current.previous == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the beginning of this list");
				}
				current = current.previous;
				currentIndex--;
				lastReturned = current;
				return lastReturned.data;
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
					throw new NullPointerException("You MUST provide a non-null element to set");
				}
				if(lastReturned == null)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				lastReturned.data = e;
			}

			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling remove()");
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
				size--;
			}
		};
	}

	/**
	 * @param index the location from which to create this list iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list, starting at the specified index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		return new ListIterator<>()
		{
			private Node<E> current;
			private Node<E> lastReturned;
			private int currentIndex;

			{
				this.current = head;
				this.lastReturned = null;
				this.currentIndex = index;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add");
				}
				Node<E> newNode = new Node<>(e);
				if(head == null)
				{
					head = newNode;
					tail = newNode;
				}
				else if(current.previous == null)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
				}
				else
				{
					newNode.next = current;
					newNode.previous = current.previous;
					current.previous.next = newNode;
					current.previous = newNode;
				}
				lastReturned = null;
				size++;
				currentIndex++;
			}

			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			@Override
			public E next()
			{
				if(current == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				lastReturned = current;
				current = current.next;
				currentIndex++;
				return lastReturned.data;
			}

			@Override
			public int nextIndex()
			{
				return currentIndex;
			}

			@Override
			public boolean hasPrevious()
			{
				return current.previous != null;
			}

			@Override
			public E previous()
			{
				if(current.previous == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the beginning of this list");
				}
				current = current.previous;
				currentIndex--;
				lastReturned = current;
				return lastReturned.data;
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
					throw new NullPointerException("You MUST provide a non-null element to set");
				}
				if(lastReturned == null)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling set()");
				}
				lastReturned.data = e;
			}

			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new IllegalStateException("You MUST call next() or previous() before calling remove()");
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
				size--;
			}
		};
	}

	/**
	 * @param e the value to add to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to offer");
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
	 * @param e the value to be added to the beginning of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the front of this list.
	 */
	@Override
	public boolean offerFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to offerFirst");
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
	 * @param e the value to be added to the end of thi slist
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public boolean offerLast(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to offer");
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
	 * @return the head (first element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list.
	 */
	@Override
	public E peek()
	{
		if(head == null)
		{
			return null;
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
	 * @return the value previously the head (first element) of this list, or null if this list is empty
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
		removingNode.next = null;
		if(head != null)
		{
			head.previous = null;
		}
		else
		{
			tail = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the value previously the head (first element) of this list, or null if this list is empty
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
		removingNode.next = null;
		if(head != null)
		{
			head.previous = null;
		}
		else
		{
			tail = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the value previously the tail (last element) of this list, or null if this list is empty
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
		removingNode.previous = null;
		if(tail != null)
		{
			tail.next = null;
		}
		else
		{
			head = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the value previously at the top of the stack
	 * @throws NoSuchElementException if this list is empty
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		Node<E> removingNode = head;
		head = head.next;
		removingNode.next = null;
		if(head != null)
		{
			head.previous = null;
		}
		else
		{
			tail = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param e the value to be added to the top of the stack
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to push onto the stack represented by this LinkedList");
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
	 * @return the value previously at the top of this stack
	 * @throws NoSuchElementException if this list is empty
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
		removingNode.next = null;
		if(head != null)
		{
			head.previous = null;
		}
		else
		{
			tail = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Removes the element at the specified position in this list.
	 */
	@Override
	public E remove(int index)
	{
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		Node<E> removingNode = head;
		if(index != 0)
		{
			for(int i = 0; i < index; i++)
			{
				removingNode = removingNode.next;
			}
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
	 * @param o the Object to find the first occurrence of
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		if(o == null)
		{
			return false;
		}
		Node<E> removingNode = head;
		while(removingNode != null && !(removingNode.data.equals(o)))
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
	 * @throws NoSuchElementException if this list is empty
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
		removingNode.next = null;
		if(head != null)
		{
			head.previous = null;
		}
		else
		{
			tail = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param o the Object to find and remove
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeFirstOccurrence(Object o)
	{
		if(o == null)
		{
			return false;
		}
		Node<E> removingNode = head;
		while(removingNode != null && !(removingNode.data.equals(o)))
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
	 * @throws NoSuchElementException if this list is empty
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
		removingNode.previous = null;
		if(tail != null)
		{
			tail.next = null;
		}
		else
		{
			head = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param o the Object to find and remove
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeLastOccurrence(Object o)
	{
		if(o == null)
		{
			return false;
		}
		Node<E> removingNode = tail;
		while(removingNode != null && !(removingNode.data.equals(o)))
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
	 * @param fromIndex the location (inclusive of which) to remove values from
	 * @param toIndex the location (exclusive of which) to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if the provided fromIndex is greater than the provided toIndex
	 * @code Removes from this list all of the elements whose index is between fromIndex, inclusive, and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 || toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") and/or toIndex (" + toIndex + ") is/are out of bounds");
		}
		else if(fromIndex > toIndex)
		{
			throw new IllegalArgumentException("fromIndex (" + fromIndex + ") cannot be greater than toIndex (" + toIndex + ")");
		}
		else if(fromIndex == toIndex)
		{
			return;
		}
		Node<E> current = head, removingNode;
		if(fromIndex == 0 && toIndex == this.size)
		{
			this.size = 0;
			head = null;
			tail = null;
		}
		else if(fromIndex == 0)
		{
			for(int i = fromIndex; i < toIndex; i++)
			{
				removingNode = head;
				head = head.next;
				removingNode.next = null;
				head.previous = null;
				this.size--;
			}
		}
		else if(toIndex == this.size)
		{
			for(int i = fromIndex; i < toIndex; i++)
			{
				removingNode = tail;
				tail = tail.previous;
				removingNode.previous = null;
				tail.next = null;
				this.size--;
			}
		}
		else
		{
			for(int i = 0; i < fromIndex - 1; i++)
			{
				current = current.next;
			}
			for(int i = fromIndex; i < toIndex; i++)
			{
				removingNode = current.next;
				removingNode.previous.next = removingNode.next;
				removingNode.next.previous = removingNode.previous;
				removingNode.previous = null;
				removingNode.next = null;
				this.size--;
			}
		}
	}

	/**
	 * @param c Collection of values to remove
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Removes values in this list that are contained in the specified collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to remove if contained in this LinkedList");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Node<E> current = head, removingNode;
		boolean modified = false;
		while(current != null)
		{
			if(c.contains(current.data))
			{
				removingNode = current;
				if(removingNode.previous == null && removingNode.next == null)
				{
					this.size = 0;
					head = null;
					tail = null;
					return true;
				}
				else if(removingNode.previous == null)
				{
					head = head.next;
					removingNode.next = null;
					head.previous = null;
					current = head;
				}
				else if(removingNode.next == null)
				{
					tail = tail.previous;
					removingNode.previous = null;
					tail.next = null;
					current = tail;
				}
				else
				{
					current = current.previous;
					removingNode.previous.next = removingNode.next;
					removingNode.next.previous = removingNode.previous;
					removingNode.previous = null;
					removingNode.next = null;
				}
				modified = true;
				this.size--;
			}
			else
			{
				current = current.next;
			}
		}
		return modified;
	}

	/**
	 * @param c Collection of values to retain
	 * @throws NullPointerException if no collection is provided
	 * @return true if thi slist has been structurally modified, false otherwise
	 * @code Retains only values in this list that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to remove if contained in this LinkedList");
		}
		if(c.isEmpty())
		{
			this.size = 0;
			head = null;
			tail = null;
			return true;
		}
		Node<E> current = head, removingNode;
		boolean modified = false;
		while(current != null)
		{
			if(!(c.contains(current.data)))
			{
				removingNode = current;
				if(removingNode.previous == null && removingNode.next == null)
				{
					this.size = 0;
					head = null;
					tail = null;
					return true;
				}
				else if(removingNode.previous == null)
				{
					head = head.next;
					removingNode.next = null;
					head.previous = null;
					current = head;
				}
				else if(removingNode.next == null)
				{
					tail = tail.previous;
					removingNode.previous = null;
					tail.next = null;
					current = tail;
				}
				else
				{
					current = current.previous;
					removingNode.previous.next = removingNode.next;
					removingNode.next.previous = removingNode.previous;
					removingNode.previous = null;
					removingNode.next = null;
				}
				modified = true;
				this.size--;
			}
			else
			{
				current = current.next;
			}
		}
		return modified;
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified location
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a non-null replacement value");
		}
		if(index < 0 || index >= this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		Node<E> current = head;
		E value;
		for(int i = 0; i < index; i++)
		{
			current = current.next;
		}
		value = current.data;
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
	 * @param fromIndex the location from which to create this subList
	 * @param toIndex the location until which to create this subList
	 * @throws IndexOutOfBoundsException if either or both indices is/are out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 || toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") and/or toIndex (" + toIndex + ") is/are out of bounds");
		}
		if(fromIndex > toIndex)
		{
			throw new IllegalArgumentException("fromIndex (" + fromIndex + ") cannot be greater than toIndex (" + toIndex + ")");
		}
		LinkedList<E> list = new LinkedList<>();
		Node<E> current = head;
		for(int i = 0; i < fromIndex; i++)
		{
			current = current.next;
		}
		for(int i = fromIndex; i < toIndex; i++)
		{
			list.add(current.data);
			current = current.next;
		}
		return list;
	}

	/**
	 * @return an array containing all of the elements in this list
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @param a an array of type T whose runtime must be mimicked for the returning array
	 * @throws NullPointerException if no array is provided or the variable provided is null
	 * @return an array containing all of the elements in this list in the correct order
	 * @code Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}

	/**
	 * @return a String representation of this ArrayList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet.");
	}
}
