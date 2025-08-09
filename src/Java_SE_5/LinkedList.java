package Java_SE_5;

import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This interface implements LinkedList for Java SE 5.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Queue<E>, Cloneable, Serializable
{
	/**
	 * @code This in-built Node class will be used to manage this LinkedList.
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

	// The following methods will manage this LinkedList
	private int size;
	private Node<E> head;
	private Node<E> tail;

	/**
	 * @code Constructs an empty list.
	 */
	public LinkedList()
	{
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	/**
	 * @param c Collection of values to initialize this LinkedList with
	 * @throws NullPointerException if no collection is provided, the provided variable is defined as null, or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null values to initialize this LinkedList with");
		}
		this.size = 0;
		this.head = null;
		this.tail = null;
		if(!(c.isEmpty()))
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				Node<E> newNode = new Node<>(iterator.next());
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
	 * @param o the element to add to the end of this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is 'null'
	 * @return true if the provided element has been successfully added into this LinkedList
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
		}
		Node<E> newNode = new Node<>(o);
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
	 * @param index the location at which to add the specified value
	 * @param element the value to be added to the specified location in this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is null
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
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
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
			Node<E> currentNode = head;
			for(int i = 0; i < index - 1; i++)
			{
				currentNode = currentNode.next;
			}
			newNode.next = currentNode.next;
			newNode.previous = currentNode;
			currentNode.next.previous = newNode;
			currentNode.next = newNode;
		}
		this.size++;
	}

	/**
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no collection is provided, the provided variable is defined as null, or the provided collection contains null values
	 * @return true if this LinkedList has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add into this LinkedList");
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
	 * @param index the location at which to start adding values into this LinkedList
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided, the provided collection variable is defined as null, or the provided collection contains null values
	 * @return true if all values from the provided collection are added to this list, false if the provided collection is empty
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add into this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		Node<E> newNode, current = head;
		if(head == null)
		{
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
		else if(index == 0)
		{
			boolean addedOne = false;
			while(iterator.hasNext())
			{
				newNode = new Node<>(iterator.next());
				if(!addedOne)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
					current = head;
					addedOne = true;
				}
				else
				{
					newNode.next = current.next;
					newNode.previous = current;
					current.next.previous = newNode;
					current.next = newNode;
				}
				this.size++;
			}
		}
		else if(index == this.size)
		{
			while(iterator.hasNext())
			{
				newNode = new Node<>(iterator.next());
				tail.next = newNode;
				newNode.previous = tail;
				tail = tail.next;
				this.size++;
			}
		}
		else
		{
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
	 * @param o the element to add to the beginning of this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @code Inserts the given element at the beginning of this list.
	 */
	public void addFirst(E o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add into this LinkedList");
		}
		Node<E> newNode = new Node<>(o);
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
	 * @param o the element to add to the end of this LinkedList
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @code Inserts the given element at the beginning of this list.
	 */
	public void addLast(E o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add into this LinkedList");
		}
		Node<E> newNode = new Node<>(o);
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
	 * @return true if the provided Object is non-null and found, false if null or not found in this LinkedList
	 * @code Returns true if this list contains the specified element.
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
	 * @param c Collection of values to find the existence of in this LinkedList
	 * @throws NullPointerException if no collection is provided, the provided variable is defined as null, or the provided collection contains null values
	 * @return true if all the values in the provided collection are contained in this LinkedList, false if the provided collection contains null values or values not contained in this LinkedList
	 * @code Returns true if this list contains all the elements in the specified element.
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of elements to find the existence of in this LinkedList");
		}
		if(c.contains(null))
		{
			return false;
		}
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			Node<E> currentNode = head;
			while(currentNode != null && !(currentNode.data.equals(value)))
			{
				currentNode = currentNode.next;
			}
			if(currentNode == null)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * @return the head (first element) of this LinkedList
	 * @throws NoSuchElementException if this LinkedList is empty
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
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		Node<E> current = head;
		if(index == this.size - 1)
		{
			current = tail;
		}
		else
		{
			for(int i = 0; i < index; i++)
			{
				current = current.next;
			}
		}
		return current.data;
	}

	/**
	 * @return the first element of this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Returns the first element in this list.
	 */
	public E getFirst()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		return head.data;
	}

	/**
	 * @return the last element of this list
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Returns the last element in this list.
	 */
	public E getLast()
	{
		if(tail == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		return tail.data;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the first occurrence of the provided Object, or -1 if the provided Object is null or not found in this LinkedList
	 * @code Returns the index in this list of the first occurrence of the specified element, or -1 if the List does not contain this element.
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
	 * @return an iterator over the elements in this LinkedLIst
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
			 * @code Returns true if the iteration has more elements.
			 */
			@Override
			public boolean hasNext()
			{
				return this.current != null;
			}

			/**
			 * @return the next element in the iteration
			 * @throws NoSuchElementException if this iterator has reached the end of this list
			 * @code Returns the next element in the iteration.
			 */
			@Override
			public E next()
			{
				if(this.current == null)
				{
					throw new NoSuchElementException("This iterator has reached the end of this LinkedList");
				}
				lastReturned = current;
				current = current.next;
				return lastReturned.data;
			}

			/**
			 * @code Removes from the underlying collection the last element returned by the iterator.
			 * @throws IllegalStateException if called before calling next() or consecutively calling
			 */
			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new IllegalStateException("You MUST call next() before calling remove()");
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
			}
		};
	}

	/**
	 * @return true if the provided LinkedList is empty, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		return this.size == 0;
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the last occurrence of the provided Object, or -1 if the provided Object is null or not found in this LinkedLIst
	 * @code Returns the index in this list of the last occurrence of the specified element, or -1 if the list does not contain this element.
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
	 * @return a list-iterator of the elements in this list
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

			/**
			 * @param o the element to be added to this List Iterator
			 * @throws NullPointerException if no element is provided or the provided element is null
			 * @code Inserts the specified element into the list (optional operation).
			 */
			@Override
			public void add(E o)
			{
				if(o == null)
				{
					throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
				}
				Node<E> newNode = new Node<>(o);
				if(current.previous == null)
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
				size++;
			}

			/**
			 * @return true if this list iterator has more elements when traversing the list in the forward direction, false otherwise
			 */
			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			/**
			 * @return true if this list iterator has more elements when traversing the list in the reverse direction, false otherwise
			 */
			@Override
			public boolean hasPrevious()
			{
				return current.previous != null;
			}

			/**
			 * @return the next element in the list
			 * @throws NoSuchElementException if hasNext() returns false
			 */
			@Override
			public E next()
			{
				if(this.current == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				lastReturned = current;
				current = current.next;
				currentIndex++;
				return lastReturned.data;
			}

			/**
			 * @return the index of the element that would be returned by a subsequent call to next
			 */
			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			/**
			 * @return the previous element in the list
			 * @throws NoSuchElementException if hasPrevious() returns false
			 */
			@Override
			public E previous()
			{
				if(current.previous == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				currentIndex--;
				current = current.previous;
				lastReturned = current;
				return lastReturned.data;
			}

			/**
			 * @return the index of the element that would be returned by a subsequent call to previous
			 */
			@Override
			public int previousIndex()
			{
				return this.currentIndex - 1;
			}

			/**
			 * @code Removes from the list the last element that was returned by next or previous.
			 * @throws IllegalStateException if lastReturned is null
			 */
			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new IllegalStateException("Call previous() or next() before calling remove()");
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

			/**
			 * @param o the replacement element for the last returned value
			 * @throws NullPointerException if no element is provided or the provided element is null
			 * @code Replaces the last element returned by next or previous with the specified element (optional operation).
			 */
			public void set(E o)
			{
				if(o == null)
				{
					throw new NullPointerException("You MUST provide a non-null replacement value");
				}
				lastReturned.data = o;
			}
		};
	}

	/**
	 * @param index the location from which to create this LinkedList from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list
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
			private Node<E> current;
			private Node<E> lastReturned;
			private int currentIndex;

			{
				this.current = head;
				this.lastReturned = null;
				this.currentIndex = index;
			}

			/**
			 * @param o the element to be added to this List Iterator
			 * @throws NullPointerException if no element is provided or the provided element is null
			 * @code Inserts the specified element into the list (optional operation).
			 */
			@Override
			public void add(E o)
			{
				if(o == null)
				{
					throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
				}
				Node<E> newNode = new Node<>(o);
				if(current.previous == null)
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
				size++;
			}

			/**
			 * @return true if this list iterator has more elements when traversing the list in the forward direction, false otherwise
			 */
			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			/**
			 * @return true if this list iterator has more elements when traversing the list in the reverse direction, false otherwise
			 */
			@Override
			public boolean hasPrevious()
			{
				return current.previous != null;
			}

			/**
			 * @return the next element in the list
			 * @throws NoSuchElementException if hasNext() returns false
			 */
			@Override
			public E next()
			{
				if(this.current == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				lastReturned = current;
				current = current.next;
				currentIndex++;
				return lastReturned.data;
			}

			/**
			 * @return the index of the element that would be returned by a subsequent call to next
			 */
			@Override
			public int nextIndex()
			{
				return this.currentIndex;
			}

			/**
			 * @return the previous element in the list
			 * @throws NoSuchElementException if hasPrevious() returns false
			 */
			@Override
			public E previous()
			{
				if(current.previous == null)
				{
					throw new NoSuchElementException("This list-iterator has reached the end of this list");
				}
				currentIndex--;
				current = current.previous;
				lastReturned = current;
				return lastReturned.data;
			}

			/**
			 * @return the index of the element that would be returned by a subsequent call to previous
			 */
			@Override
			public int previousIndex()
			{
				return this.currentIndex - 1;
			}

			/**
			 * @code Removes from the list the last element that was returned by next or previous.
			 * @throws IllegalStateException if lastReturned is null
			 */
			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new IllegalStateException("Call previous() or next() before calling remove()");
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

			/**
			 * @param o the replacement element for the last returned value
			 * @throws NullPointerException if no element is provided or the provided element is null
			 * @code Replaces the last element returned by next or previous with the specified element (optional operation).
			 */
			public void set(E o)
			{
				if(o == null)
				{
					throw new NullPointerException("You MUST provide a non-null replacement value");
				}
				lastReturned.data = o;
			}
		};
	}

	/**
	 * @param o the Object to add to the end of this LinkedList
	 * @throws NullPointerException if no Object is provided or the provided Object is null
	 * @return true if the provided Object is successfully added, false otherwise
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this LinkedList");
		}
		Node<E> newNode = new Node<>(o);
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
		return (head == null) ? null : head.data;
	}

	/**
	 * @return the value previously the head (first element) of this list
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
		if(head.next == null)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = head.next;
			removingNode.next = null;
			head.previous = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the value previously the head (first element) of this list
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
	 * @param index the location at which to remove a value from this list
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this list
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
		if(head.next == null)
		{
			head = null;
			tail = null;
		}
		else if(index == 0)
		{
			head = head.next;
			removingNode.next = null;
			head.previous = null;
		}
		else if(index == this.size - 1)
		{
			removingNode = tail;
			tail = tail.previous;
			removingNode.previous = null;
			tail.next = null;
		}
		else
		{
			for(int i = 0; i < index; i++)
			{
				removingNode = removingNode.next;
			}
			removingNode.previous.next = removingNode.next;
			removingNode.next.previous = removingNode.previous;
			removingNode.previous = null;
			removingNode.next = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param o the Object to remove the first occurrence of
	 * @return true if the provided Object is non-null, contained in this LinkedLIst, and removed, false if null or not found in this LinkedList
	 * @code Removes the first occurrence of the specified element in this list.
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
	 * @return the value previously the first element of this LinkedList
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Removes and returns the first element from this list.
	 */
	public E removeFirst()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		Node<E> removingNode = head;
		head = head.next;
		removingNode.next = null;
		if(head == null)
		{
			tail = null;
		}
		else
		{
			head.previous = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the value previously the last element of this LinkedList
	 * @throws NoSuchElementException if this LinkedList is empty
	 * @code Removes and returns the last element from this list.
	 */
	public E removeLast()
	{
		if(tail == null)
		{
			throw new NoSuchElementException("This LinkedList is empty");
		}
		Node<E> removingNode = tail;
		tail = tail.previous;
		removingNode.previous = null;
		if(tail == null)
		{
			head = null;
		}
		else
		{
			tail.next = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param c Collection of values to remove if contained in this LinkedList
	 * @throws NullPointerException if no collection is provided
	 * @return true if this LinkedList has been structurally modified, false otherwise
	 * @code Removes from this LinkedList any value that is contained in the provided collection.
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to remove if found in this LinkedList");
		}
		if(this.size == 0 || c.isEmpty())
		{
			return false;
		}
		Node<E> current = head;
		Node<E> removingNode;
		boolean modifiedList = false;
		while(current != null)
		{
			if(c.contains(current.data))
			{
				modifiedList = true;
				removingNode = current;
				if(current.previous == null && current.next == null)
				{
					this.size = 0;
					head = null;
					tail = null;
					current = null;
				}
				else if(current.previous == null)
				{
					head = head.next;
					removingNode.next = null;
					head.previous = null;
					current = head;
				}
				else if(current.next == null)
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
				this.size--;
			}
			current = current.next;
		}
		return modifiedList;
	}

	/**
	 * @param fromIndex the location (inclusive of which) to start removing a value from
	 * @param toIndex the location (exclusive of which) to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this List all of the elements whose index is between fromIndex, inclusive and toIndex, exclusive.
	 */
	@Override
	protected void removeRange(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 || toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("The provided fromIndex and/or toIndex is out of bounds");
		}
		if(fromIndex > toIndex)
		{
			throw new IllegalArgumentException("The provided fromIndex (" + fromIndex + ") is greater than the provided toIndex (" + toIndex + ")");
		}
		Node<E> removingNode;
		if(fromIndex == 0 && toIndex == this.size)
		{
			this.size = 0;
			head = null;
			tail = null;
		}
		else if(fromIndex == 0)
		{
			for(int i = 0; i < toIndex; i++)
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
			Node<E> current = head;
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
	 * @param c Collection of values to retain if contained in this LinkedList
	 * @throws NullPointerException if no collection is provided
	 * @return true if this LinkedList has been structurally modified, false otherwise
	 * @code Retains in this LinkedList any value that is contained in the provided collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to remove if found in this LinkedList");
		}
		if(this.size == 0)
		{
			return false;
		}
		if(c.isEmpty())
		{
			this.size = 0;
			head = null;
			tail = null;
			return true;
		}
		Node<E> current = head;
		Node<E> removingNode;
		boolean modifiedList = false;
		while(current != null)
		{
			if(!c.contains(current.data))
			{
				modifiedList = true;
				removingNode = current;
				if(current.previous == null && current.next == null)
				{
					this.size = 0;
					head = null;
					tail = null;
					current = null;
				}
				else if(current.previous == null)
				{
					head = head.next;
					removingNode.next = null;
					head.previous = null;
					current = head;
				}
				else if(current.next == null)
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
				this.size--;
			}
			current = current.next;
		}
		return modifiedList;
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the provided index
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this LinkedList
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
	 * @return an array containing all of the elements in this list in correct order
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param a an array of type T into which to copy values from this LinkedList into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this list in the correct order
	 * @code Returns an array containing all of the elements in this list in the correct order; the runtime type of the returned array is that of the specified array.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a String representation of this LinkedList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
