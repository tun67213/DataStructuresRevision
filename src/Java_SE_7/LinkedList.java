package Java_SE_7;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class adds all methods associated with LinkedList for Java SE 7.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code The following internal class is a structure used to maintain this linked list
	 */
	private class Node
	{
		private Node previous;
		private E data;
		private Node next;

		public Node(E value)
		{
			this.previous = null;
			this.data = value;
			this.next = null;
		}
	}

	/**
	 * @code The following variables manage the structure of this linked list.
	 */
	private int size;
	private Node head;
	private Node tail;

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
	 * @param c Collection of values to initialize this linked list with
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a collection of non-null values to initialize this linked list with");
		}
		this.size = 0;
		head = null;
		tail = null;
		Node newNode;
		if(!c.isEmpty())
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				newNode = new Node(iterator.next());
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
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has successfully been added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("Please provide a non-null value to add to this linked list");
		}
		Node newNode = new Node(e);
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
	 * @param index the location at which to add the specific value
	 * @param element the value to be added to this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("Please provide a non-null value to add to this linked list");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		Node newNode = new Node(element);
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
			Node currentNode = head;
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
	 * @param c Collection of values to add to this list
	 * @throws NullPointerException if no collection is provided or the provided collection contains null values
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("Please provide a collection with non-null elements to add into this linked list");
		}
		if(c.isEmpty())
		{
			return false;
		}
		Iterator<? extends E> iterator = c.iterator();
		while(iterator.hasNext())
		{
			Node newNode = new Node(iterator.next());
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
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("Please provide a collection with non-null elements to add into this linked list");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds");
		}
		Node currentNode, newNode;
		boolean addedValue = false;
		Iterator<? extends E> iterator = c.iterator();
		if(head == null || index == this.size)
		{
			while(iterator.hasNext())
			{
				newNode = new Node(iterator.next());
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
			boolean oneAdded = false;
			currentNode = head;
			while(iterator.hasNext())
			{
				newNode = new Node(iterator.next());
				if(!oneAdded)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
					currentNode = head;
				}
				else
				{
					newNode.previous = currentNode;
					newNode.next = currentNode.next;
					currentNode.next.previous = newNode;
					currentNode.next = newNode;
					currentNode = currentNode.next;
				}
				this.size++;
			}
		}
		else
		{
			currentNode = head;
			for(int i = 0; i < index - 1; i++)
			{
				currentNode = currentNode.next;
			}
			while(iterator.hasNext())
			{
				newNode = new Node(iterator.next());
				newNode.next = currentNode.next;
				newNode.previous = currentNode;
				currentNode.next.previous = newNode;
				currentNode.next = newNode;
				currentNode = currentNode.next;
				this.size++;
			}
		}
		return true;
	}

	/**
	 * @param e the value to be added
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to add to this linked list");
		}
		Node newNode = new Node(e);
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
	 * @param e the value to be added
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("Please provide a non-null element to add to this linked list");
		}
		Node newNode = new Node(e);
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
		for(Node current = head; current != null; current = current.next)
		{
			list.add(current.data);
		}
		return list;
	}

	/**
	 * @param o the value to find the existence of
	 * @return true if this list contains the value, false otherwise
	 * @code Returns true if this list contains the specified element.
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			return false;
		}
		Node current = head;
		while(current != null && !(current.data.equals(o)))
		{
			current = current.next;
		}
		return current != null;
	}

	/**
	 * @param c Collection of values to find the existence of
	 * @throws NullPointerException if no collection is provided
	 * @return true if all the values in the collection are non-null and contained in this list, false otherwise
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to find the existence of in this linked list");
		}
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext())
		{
			Object current = iterator.next();
			Node currentNode = head;
			while(currentNode != null && !(currentNode.data.equals(current)))
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
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	@Override
	public Iterator<E> descendingIterator()
	{
		return new Iterator<>()
		{
			Node current;
			Node previouslyReturned;

			{
				current = tail;
				previouslyReturned = null;
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
					throw new NoSuchElementException("This iterator has no more elements to iterate through");
				}
				previouslyReturned = current;
				current = current.previous;
				return previouslyReturned.data;
			}

			@Override
			public void remove()
			{
				if(previouslyReturned == null)
				{
					throw new IllegalStateException("You must call next() once before calling remove");
				}

				if(previouslyReturned.previous == null && previouslyReturned.next == null)
				{
					head = null;
					tail = null;
				}
				else if(previouslyReturned.previous == null)
				{
					head = previouslyReturned.next;
					head.previous = null;
					previouslyReturned.next = null;
				}
				else if(previouslyReturned.next == null)
				{
					tail = previouslyReturned.previous;
					tail.next = null;
					previouslyReturned.previous = null;
				}
				else
				{
					previouslyReturned.previous.next = previouslyReturned.next;
					previouslyReturned.next.previous = previouslyReturned.previous;
					previouslyReturned.previous = null;
					previouslyReturned.next = null;
				}

				size--;
				previouslyReturned = null;
			}
		};
	}

	/**
	 * @return the head (first element) of this list
	 * @throws NoSuchElementException if this list is empty
	 */
	@Override
	public E element()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This linked list is empty");
		}
		return head.data;
	}

	/**
	 * @param o the Object to compare with this list
	 * @return true if the hash code for this list matches the hash code for the provided Object, false otherwise
	 * @code Compares the specified object with this list for equality.
	 */
	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}

		if(!(o instanceof List<?>))
		{
			return false;
		}

		List<?> other = (List<?>) o;

		if(this.size != other.size())
		{
			return false;
		}

		Node current = head;
		Iterator<?> iterator = other.iterator();

		while(current != null)
		{
			Object otherValue = iterator.next();

			if(!current.data.equals(otherValue))
			{
				return false;
			}

			current = current.next;
		}

		return true;
	}

	/**
	 * @param index the location from which to retrieve a value
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
		Node returningNode = head;
		if(index == this.size - 1)
		{
			returningNode = tail;
		}
		else if(index != 0)
		{
			for(int i = 0; i < index; i++)
			{
				returningNode = returningNode.next;
			}
		}
		return returningNode.data;
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
			throw new NoSuchElementException("This linked list is empty");
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
			throw new NullPointerException("This linked list is empty");
		}
		return tail.data;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @return the index of the first occurrence of the provided Object or -1 if the Object is not contained in this list
	 */
	@Override
	public int indexOf(Object o)
	{
		if(o == null)
		{
			return -1;
		}
		Node currentNode = head;
		for(int i = 0; i < this.size; i++)
		{
			if(currentNode.data.equals(o))
			{
				return i;
			}
			currentNode = currentNode.next;
		}
		return -1;
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
	 * @return an iterator over the elements in this list in sequential order
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<>()
		{
			private Node current;
			private Node previouslyCalled;

			{
				this.current = head;
				this.previouslyCalled = null;
			}

			/**
			 * @return true if the iteration has more elements
			 * false otherwise
			 * @code Returns true if the iteration has more elements.
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
					throw new NoSuchElementException("This iterator has reached the end of this linked list");
				}
				previouslyCalled = current;
				current = current.next;
				return previouslyCalled.data;
			}

			/**
			 * @code Removes from the underlying collection the last element returned by this iterator.
			 */
			@Override
			public void remove()
			{
				if(previouslyCalled == null)
				{
					throw new NullPointerException("You must call next() before calling remove()");
				}
				else if(previouslyCalled.previous == null && previouslyCalled.next == null)
				{
					size = 0;
					head = null;
					tail = null;
				}
				else
				{
					if(previouslyCalled.previous == null)
					{
						head = head.next;
						previouslyCalled.next = null;
						head.previous = null;
					}
					else if(previouslyCalled.next == null)
					{
						tail = tail.previous;
						previouslyCalled.previous = null;
						tail.next = null;
					}
					else
					{
						previouslyCalled.previous.next = previouslyCalled.next;
						previouslyCalled.next.previous = previouslyCalled.previous;
						previouslyCalled.previous = null;
						previouslyCalled.next = null;
					}
					size--;
					previouslyCalled = null;
				}
			}
		};
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the index of the last occurrence of the provided Object or -1 if the Object is not contained in this list
	 */
	@Override
	public int lastIndexOf(Object o)
	{
		if(o == null)
		{
			return -1;
		}
		Node currentNode = tail;
		int currentIndex = this.size - 1;
		while(currentNode != null && !(currentNode.data.equals(o)))
		{
			currentNode = currentNode.previous;
			currentIndex--;
		}
		return currentIndex;
	}

	/**
	 * @return a list-iterator over the elements in this list
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<>()
		{
			private Node current;
			private Node previouslyCalled;
			private int currentIndex;

			{
				this.current = head;
				this.previouslyCalled = null;
				this.currentIndex = 0;
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
				previouslyCalled = current;
				current = current.next;
				currentIndex++;
				return previouslyCalled.data;
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
				previouslyCalled = current;
				currentIndex--;
				return previouslyCalled.data;
			}

			@Override
			public int previousIndex()
			{
				return currentIndex - 1;
			}

			@Override
			public void add(E o)
			{
				if(o == null)
				{
					throw new NullPointerException("You must provide a value to add into this linked list");
				}
				Node newNode = new Node(o);
				if(current.previous == null)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
				}
				else
				{
					newNode.previous = current.previous;
					newNode.next = current;
					current.previous.next = newNode;
					current.previous = newNode;
				}
				size++;
			}

			@Override
			public void remove()
			{
				if(previouslyCalled == null)
				{
					throw new NullPointerException("You must call next() before calling remove()");
				}
				else if(previouslyCalled.previous == null && previouslyCalled.next == null)
				{
					head = null;
					tail = null;
				}
				else if(previouslyCalled.previous == null)
				{
					head = head.next;
					previouslyCalled.next = null;
					head.previous = null;
				}
				else if(previouslyCalled.next == null)
				{
					tail = tail.previous;
					previouslyCalled.previous = null;
					tail.next = null;
				}
				else
				{
					previouslyCalled.previous.next = previouslyCalled.next;
					previouslyCalled.next.previous = previouslyCalled.previous;
					previouslyCalled.previous = null;
					previouslyCalled.next = null;
				}
				size--;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null value to set into this list");
				}
				if(previouslyCalled == null)
				{
					throw new NullPointerException("You MUST call next before calling set");
				}
				previouslyCalled.data = e;
			}
		};
	}

	/**
	 * @param index the location at which to create this list-iterator from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index (" + index + ") is out of bounds. Condition: 0 <= index <= this.size");
		}
		return new ListIterator<>()
		{
			private Node current;
			private Node previouslyCalled;
			private int currentIndex;

			{
				this.current = head;
				this.previouslyCalled = null;
				this.currentIndex = index;

				for(int i = 0; i < currentIndex; i++)
				{
					this.current = current.next;
				}
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
				previouslyCalled = current;
				current = current.next;
				currentIndex++;
				return previouslyCalled.data;
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
				previouslyCalled = current;
				currentIndex--;
				return previouslyCalled.data;
			}

			@Override
			public int previousIndex()
			{
				return currentIndex - 1;
			}

			@Override
			public void add(E o)
			{
				if(o == null)
				{
					throw new NullPointerException("You must provide a value to add into this linked list");
				}
				Node newNode = new Node(o);
				if(current.previous == null)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
				}
				else
				{
					newNode.previous = current.previous;
					newNode.next = current;
					current.previous.next = newNode;
					current.previous = newNode;
				}
				size++;
			}

			@Override
			public void remove()
			{
				if(previouslyCalled == null)
				{
					throw new NullPointerException("You must call next() before calling remove()");
				}
				else if(previouslyCalled.previous == null && previouslyCalled.next == null)
				{
					head = null;
					tail = null;
				}
				else if(previouslyCalled.previous == null)
				{
					head = head.next;
					previouslyCalled.next = null;
					head.previous = null;
				}
				else if(previouslyCalled.next == null)
				{
					tail = tail.previous;
					previouslyCalled.previous = null;
					tail.next = null;
				}
				else
				{
					previouslyCalled.previous.next = previouslyCalled.next;
					previouslyCalled.next.previous = previouslyCalled.previous;
					previouslyCalled.previous = null;
					previouslyCalled.next = null;
				}
				size--;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null value to set into this list");
				}
				if(previouslyCalled == null)
				{
					throw new NullPointerException("You MUST call next before calling set");
				}
				previouslyCalled.data = e;
			}
		};
	}

	/**
	 * @param e the element to add to this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has successfully been added
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("Please offer a non-null value");
		}
		Node newNode = new Node(e);
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
	 * @param e the element to add to the front of this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the front of this list.
	 */
	@Override
	public boolean offerFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to offer to this list");
		}
		Node newNode = new Node(e);
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
	 * @param e the element to add to the end of this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has been successfully added
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public boolean offerLast(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("Please offer a non-null value");
		}
		Node newNode = new Node(e);
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
	 * @return the previous head for this list or null if the list is initially empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E poll()
	{
		if(head == null)
		{
			return null;
		}
		Node removingNode = head;
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
	 * @return the previous head for this list or null if the list is empty
	 * @code Retrieves and removes the first element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollFirst()
	{
		if(head == null)
		{
			return null;
		}
		Node removingNode = head;
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
	 * @return the previous tail for this list or null if this list is empty
	 * @code Retrieves and removes the last element of this list, or returns null if this list is empty.
	 */
	@Override
	public E pollLast()
	{
		if(tail == null)
		{
			return null;
		}
		Node removingNode = tail;
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
	 * @return the value previously at the top of the stack, or null if this list is empty
	 * @throws EmptyStackException if this linked list is empty
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		if(head == null)
		{
			throw new EmptyStackException();
		}
		Node removingNode = head;
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
	 * @param e the value to push onto the top of the stack represented by this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("Please provide a non-null value to add onto the stack");
		}
		Node newNode = new Node(e);
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
	 * @return the value previously at the top of this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Retrieves and removes the head (first element) of this list.
	 */
	@Override
	public E remove()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This linked list is empty");
		}
		Node removingNode = head;
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
	 * @param index the location at which to remove a value from this list
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
		Node removingNode = head;
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
		Node removingNode = head;
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
	 * @return the value previously the first element of this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Removes and returns the first element from this list.
	 */
	@Override
	public E removeFirst()
	{
		if(head == null)
		{
			throw new NoSuchElementException("This list is empty");
		}
		Node removingNode = head;
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
	 * @param o the Object to find the first occurrence of
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
		Node removingNode = head;
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
	 * @return the value previously the last element of this list
	 * @throws NoSuchElementException if this list is empty
	 * @code Removes and returns the last element from this list.
	 */
	@Override
	public E removeLast()
	{
		if(tail == null)
		{
			throw new NoSuchElementException("This list is empty");
		}
		Node removingNode = tail;
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
	 * @param o the Object to find the last occurrence of
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
		Node removingNode = tail;
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
	 * @param c Collection of values to remove if contained in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 */
	@Override
	public boolean removeAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to remove if contained in this list");
		}
		if(c.isEmpty())
		{
			return false;
		}
		boolean listModified = false;
		Node currentNode = head;
		Node removingNode;
		while(currentNode != null)
		{
			if(c.contains(currentNode.data))
			{
				if(currentNode.previous == null && currentNode.next == null)
				{
					this.size = 0;
					head = null;
					tail = null;
					return true;
				}
				else if(currentNode.previous == null)
				{
					removingNode = head;
					head = head.next;
					removingNode.next = null;
					head.previous = null;
					currentNode = head;
				}
				else if(currentNode.next == null)
				{
					removingNode = tail;
					tail = tail.previous;
					removingNode.previous = null;
					tail.next = null;
					currentNode = tail;
				}
				else
				{
					removingNode = currentNode;
					currentNode = currentNode.previous;
					removingNode.previous.next = removingNode.next;
					removingNode.next.previous = removingNode.previous;
					removingNode.previous = null;
					removingNode.next = null;
				}
				this.size--;
				listModified = true;
				removingNode = null;
			}
			else
			{
				currentNode = currentNode.next;
			}
		}
		return listModified;
	}

	/**
	 * @param fromIndex the location, inclusive of which, to remove values from
	 * @param toIndex the location, exclusive of which, to remove values until
	 * @throws IndexOutOfBoundsException if either index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @code Removes from this list the values contained within the specified indices.
	 */
	@Override
	public void removeRange(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 || toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") and/or toIndex (" + toIndex + ") is/are out of bounds");
		}
		if(fromIndex > toIndex)
		{
			throw new IllegalArgumentException("fromIndex (" + fromIndex + ") cannot be greater than toIndex (" + toIndex + ")");
		}
		int numberOfRemovals = toIndex - fromIndex;
		Node removingNode;
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
			}
		}
		else
		{
			removingNode = head;
			for (int i = 0; i < fromIndex; i++)
			{
				removingNode = removingNode.next;
			}

			Node beforeRemovingNode = removingNode.previous;
			Node firstRemovingNode = removingNode;

			for (int i = fromIndex; i < toIndex - 1; i++)
			{
				removingNode = removingNode.next;
			}

			Node afterRemovingNode = removingNode.next;

			beforeRemovingNode.next = afterRemovingNode;
			afterRemovingNode.previous = beforeRemovingNode;

			removingNode = firstRemovingNode;
			for (int i = fromIndex; i < toIndex; i++)
			{
				Node nextRemovingNode = removingNode.next;
				removingNode.previous = null;
				removingNode.next = null;
				removingNode = nextRemovingNode;
				this.size--;
			}
		}
	}

	/**
	 * @param c Collection of values to keep if found in this list
	 * @throws NullPointerException if no collection is provided
	 * @return true if this list has been structurally modified, false otherwise
	 * @code Retains only the elements in this list that are contained in the specified collection.
	 */
	@Override
	public boolean retainAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to retain if contained in this list");
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
		Node current = head;
		Node removingNode;
		boolean listModified = false;
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
				if(removingNode.previous == null)
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
				listModified = true;
				this.size--;
			}
			else
			{
				current = current.next;
			}
		}
		return listModified;
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified location in this list
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
		Node current = head;
		for(int i = 0; i < index; i++)
		{
			current = current.next;
		}
		E oldValue = current.data;
		current.data = element;
		return oldValue;
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
	 * @return an array containing all of the elements in this list
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @param a an array of type T[] whose runtime we must mimic
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 * @throws NullPointerException if no array is provided
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}

	/**
	 * @return a String representation of this LinkedList that is readable to the human eye
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not implemented yet");
	}
}
