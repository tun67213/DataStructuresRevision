package src.Java_SE_9;

import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class implements the methods associated with LinkedList for Java SE 9.
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code This added class will be used to create the Nodes that manage this LinkedList
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

	// The following are the local variables to be used ONLY in this class
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
	 * @throws NullPointerException if the provided Collection contains any null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to initialize this LinkedList with");
		}
		this.size = 0;
		this.head = null;
		this.tail = null;
		if(!c.isEmpty())
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
	 * @param e the value to be added to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value has been successfully added to this LinkedList
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to the end of this LinkedList");
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
	 * @param index the location at which to add the specified element to this LinkedList
	 * @param element the value to be added to the specified index in this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a value to add to the specified index in this LinkedList");
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
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is null, or if the provided Collection contains null values
	 * @return true if all the values have been successfully added to the end of this LinkedList, false if the provided Collection is empty
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
		while(iterator.hasNext())
		{
			Node<E> newNode = new Node<>(iterator.next());
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
	 * @param index the location at which to start adding values from the provided Collection into this LinkedList
	 * @param c Collection of values to add to this LinkedList
	 * @throws NullPointerException if no Collection variable is provided, the provided Collection variable is defined as 'null', or the provided Collection contains null values
	 * @return true if all the values have been successfully added to this LinkedList, starting from the specified index
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
		Iterator<? extends E> iterator = c.iterator();
		if(head == null || index == this.size)
		{
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
		else
		{
			E[] values = (E[]) c.toArray();
			if(index == 0)
			{
				for(int i = values.length - 1; i >= 0; i--)
				{
					Node<E> newNode = new Node<>(values[i]);
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
			}
			else
			{
				Node<E> current = head;
				for(int i = 0; i < index - 1; i++)
				{
					current = current.next;
				}
				while(iterator.hasNext())
				{
					Node<E> newNode = new Node<>(iterator.next());
					newNode.next = current.next;
					newNode.previous = current;
					current.next.previous = newNode;
					current.next = newNode;
					this.size++;
				}
			}
		}
		return true;
	}

	/**
	 * @param e the value to add to the beginning of this LinkedList
	 * @throws NullPointerException if no value is provided
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
	 * @param e the value to add to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * d@code Appends the specified element to the end of this list.
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
	 * @code Removes all the elements from this list.
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
	 * @param o the Object to find the existence of in this LinkedList
	 * @return true if this list contains the specified element, false if provided Object is null or not found
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
	 * @param c Collection of values to find the existence of in this ArrayList
	 * @throws NullPointerException if no Collection variable is provided
	 * @return false if the Collection contains null values or cannot find a value in this ArrayList
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of values to check for existence");
		}
		if(c.isEmpty())
		{
			return true;
		}
		if(c.contains(null))
		{
			return false;
		}
		for(Node<E> current = head; current != null; current = current.next)
		{
			if(!c.contains(current.data))
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
		return new Iterator<E>()
		{
			private Node<E> current = tail;

			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				for(Node<E> update = current; update != null; update = update.previous)
				{
					action.accept(update.data);
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
				if(!hasNext())
				{
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				E value = current.data;
				current = current.previous;
				return value;
			}
		};
	}

	/**
	 * @return the head (first element) of this list
	 * @throws NoSuchElementException if this LinkedList is empty
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
	 * @return the value at the specified index in this LinkedList
	 * @implNote This method uses a for-loop that ONLY iterates from the front of the LinkedList in order to avoid computational overhead.
	 */
	@Override
	public E get(int index)
	{
		if(index < 0 || index >= this.size)
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
	 * @throws NoSuchElementException if this LinkedList is empty
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
	 * @throws NoSuchElementException if this LinkedList is empty
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
	 * @param o the Object to find the first occurrence of
	 * @return the location of the first occurrence of the provided Object or -1 if the provided Object is null or not found
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
		}
		return -1;
	}

	/**
	 * @return an iterator over the elements in this LinkedList in sequential order
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<E>()
		{
			private Node<E> current = head;
			private Node<E> lastCalled = null;

			/**
			 * @return true if this iterator has more values to present
			 */
			@Override
			public boolean hasNext()
			{
				return current != null;
			}

			/**
			 * @throws NoSuchElementException if the iterator has reached the end of this list
			 * @return the next value to be returned
			 */
			@Override
			public E next()
			{
				if(!hasNext())
				{
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				lastCalled = current;
				current = current.next;
				return lastCalled.data;
			}

			/**
			 * @throws NoSuchElementException if next() has not been called yet
			 */
			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				for(Node<E> currentNode = current; currentNode != null; currentNode = currentNode.next)
				{
					action.accept(currentNode.data);
				}
			}

			/**
			 * @throws NoSuchElementException if next() has not been called yet
			 */
			@Override
			public void remove()
			{
				if(lastCalled == null)
				{
					throw new NoSuchElementException("You MUST call next() before calling remove()");
				}
				if(lastCalled.previous == null && lastCalled.next == null)
				{
					head = null;
					tail = null;
				}
				else if(lastCalled.previous == null)
				{
					head = head.next;
					lastCalled.next = null;
					head.previous = null;
				}
				else if(lastCalled.next == null)
				{
					tail = tail.previous;
					lastCalled.previous = null;
					tail.next = null;
				}
				else
				{
					lastCalled.previous.next = lastCalled.next;
					lastCalled.next.previous = lastCalled.previous;
					lastCalled.previous = null;
					lastCalled.next = null;
				}
				lastCalled = null;
			}
		};
	}

	/**
	 * @return true if this LinkedList contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		return this.size == 0;
	}

	/**
	 * @param o the Object to find the location of the last occurrence of
	 * @return the location of the last occurrence of the provided Object or -1 if the provided Object is null or not found
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
			current = current.previous;
		}
		return -1;
	}

	/**
	 * @return a list iterator over the elements in this list (in sequential order)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<E>()
		{
			private Node<E> current = head;
			private int currentIndex = 0;
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
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				lastReturned = current;
				current = current.next;
				currentIndex++;
				return lastReturned.data;
			}

			@Override
			public boolean hasPrevious()
			{
				return current.previous != null;
			}

			@Override
			public E previous()
			{
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				current = current.previous;
				currentIndex--;
				lastReturned = current;
				return lastReturned.data;
			}

			@Override
			public int nextIndex()
			{
				return currentIndex;
			}

			@Override
			public int previousIndex()
			{
				return currentIndex - 1;
			}

			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new NullPointerException("You MUST call next() or previous before calling remove()");
				}
				if(lastReturned.previous == null && lastReturned.next == null)
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

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to add to the LinkedList represented by this ListIterator");
				}
				Node<E> newNode = new Node<>(e);
				if(head == null)
				{
					head = newNode;
					tail = newNode;
				}
				else if(lastReturned.next == null)
				{
					tail.next = newNode;
					newNode.previous = tail;
					tail = tail.next;
				}
				else
				{
					newNode.next = lastReturned.next;
					newNode.previous = lastReturned;
					lastReturned.next.previous = newNode;
					lastReturned.next = newNode;
				}
				size++;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null replacement value");
				}
				lastReturned.data = e;
			}
		};
	}

	/**
	 * @param index the location at which to start iterating from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list iterator over the elements in this list (in sequential order), starting at the specified index
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		return new ListIterator<E>()
		{
			private Node<E> current = head;
			private int currentIndex = index;
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
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				lastReturned = current;
				current = current.next;
				currentIndex++;
				return lastReturned.data;
			}

			@Override
			public boolean hasPrevious()
			{
				return current.previous != null;
			}

			@Override
			public E previous()
			{
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This iterator has reached the end of this list");
				}
				current = current.previous;
				currentIndex--;
				lastReturned = current;
				return lastReturned.data;
			}

			@Override
			public int nextIndex()
			{
				return currentIndex;
			}

			@Override
			public int previousIndex()
			{
				return currentIndex - 1;
			}

			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new NullPointerException("You MUST call next() or previous before calling remove()");
				}
				if(lastReturned.previous == null && lastReturned.next == null)
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

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to add to the LinkedList represented by this ListIterator");
				}
				Node<E> newNode = new Node<>(e);
				if(head == null)
				{
					head = newNode;
					tail = newNode;
				}
				else if(lastReturned.next == null)
				{
					tail.next = newNode;
					newNode.previous = tail;
					tail = tail.next;
				}
				else
				{
					newNode.next = lastReturned.next;
					newNode.previous = lastReturned;
					lastReturned.next.previous = newNode;
					lastReturned.next = newNode;
				}
				size++;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a non-null replacement value");
				}
				lastReturned.data = e;
			}
		};
	}

	/**
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if the provided value is 'null'
	 * @return true if the value is successfully added to this LinkedList
	 * @code Adds the specified element as the tail (last element) of this list.
	 */
	@Override
	public boolean offer(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to offer to this LinkedList");
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
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if the provided value is 'null'
	 * @return true if the value is successfully added to this LinkedList
	 * @code Inserts the specified element at the front of this list.
	 */
	@Override
	public boolean offerFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to offer to this LinkedList");
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
	 * @param e the value to be offered to this LinkedList
	 * @throws NullPointerException if the provided value is 'null'
	 * @return true if the value is successfully added to this LinkedList
	 * @code Inserts the specified element at the end of this list.
	 */
	@Override
	public boolean offerLast(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null value to offer to this LinkedList");
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
	 * @return the value in the Node previously at head or null if this LinkedList is empty
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
	 * @return the value in the Node previously at head or null if this LinkedList is empty
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
	 * @return the value in the Node previously at tail or null if this LinkedList is empty
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
		if(tail.previous == null)
		{
			head = null;
			tail = null;
		}
		else
		{
			tail = tail.previous;
			removingNode.previous = null;
			tail.next = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the value in the Node previously at head
	 * @throws EmptyStackException if the stack represented by this LinkedList is empty
	 * @code Pops an element from the stack represented by this list.
	 */
	@Override
	public E pop()
	{
		if(head == null)
		{
			throw new EmptyStackException();
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
	 * @param e the value to be pushed onto the stack represented by this list
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @code Pushes an element onto the stack represented by this list.
	 */
	@Override
	public void push(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to push onto the stack represented by this LinkedList");
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
		if(index == this.size - 1)
		{
			removingNode = tail;
			tail = tail.previous;
			removingNode.previous = null;
			tail.next = null;
		}
		else if(index != 0)
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
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is 'null' or could not be found in this LinkedList, true if found and removed
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
	 * @return the value in the Node previously at the top of this LinkedList
	 * @throws NoSuchElementException if this LinkedList is null
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
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is null or could not be found in this List, true if found and removed
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
	 * @return the value in the Node previously at the bottom of this LinkedList
	 * @throws NoSuchElementException if this LinkedList is null
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
		if(tail.previous == null)
		{
			head = null;
			tail = null;
		}
		else
		{
			tail = tail.previous;
			removingNode.previous = null;
			tail.next = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param o the Object to find and remove the last occurrence of
	 * @return false if the provided Object is null or could not be found in this List, true if found and removed
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
	 * @param index the location at which to replace a value
	 * @param element the replacement value for the specified index
	 * @throws NullPointerException if no replacement value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a replacement value for set()");
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
	 * @return a late-binding and fail-fast Spliterator over the elements in this list
	 */
	@Override
	public Spliterator<E> spliterator()
	{
		return new Spliterator<E>()
		{
			private Node<E> current = head;
			private long expectedModCount = modCount;

			@Override
			public boolean tryAdvance(Consumer<? super E> action)
			{
				if(current == null)
				{
					return false;
				}
				if(modCount != expectedModCount)
				{
					throw new ConcurrentModificationException("The list was modified while traversing");
				}
				action.accept(current.data);
				current = current.next;
				return true;
			}

			@Override
			public Spliterator<E> trySplit()
			{
				return null;
			}

			@Override
			public long estimateSize()
			{
				return size;
			}

			@Override
			public int characteristics()
			{
				return Spliterator.ORDERED | Spliterator.SIZED | Spliterator.NONNULL | Spliterator.IMMUTABLE;
			}
		};
	}

	/**
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
	@Override
	public Object[] toArray()
	{
		Object[] newArray = new Object[this.size];
		Node<E> current = head;
		for(int i = 0; i < this.size; i++)
		{
			newArray[i] = current.data;
			current = current.next;
		}
		return newArray;
	}

	/**
	 * @param a an array of type T to copy values from this LinkedList into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array of type T with values from this ArrayList copied into it
	 */
	@SuppressWarnings("unchecked")
	@Override
	public <T> T[] toArray(T[] a)
	{
		if(a == null)
		{
			throw new NullPointerException("You MUST provide a non-null array Object to toArray");
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
	 * @return a String representation of this LinkedList
	 */
	@Override
	public String toString()
	{
		boolean isAString = head.data instanceof String;
		boolean isACharacter = head.data instanceof Character;

		StringBuilder buff = new StringBuilder();
		for(Node<E> current = head; current != null; current = current.next)
		{
			if(isAString)
			{
				buff.append("\"");
			}
			else if(isACharacter)
			{
				buff.append("'");
			}
			buff.append(current.data);
			if(isAString)
			{
				buff.append("\"");
			}
			else if(isACharacter)
			{
				buff.append("'");
			}
			if(current.next != null)
			{
				buff.append(" <--> ");
			}
		}
		return buff.toString();
	}
}
