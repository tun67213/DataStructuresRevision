package src.Java_SE_10;

import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
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
		this.head = null;
		this.tail = null;
	}

	/**
	 * @param c Collection of values to initialize this LinkedList with
	 * @throws NullPointerException if the provided variable is null or the provided Collection contains null values
	 * @code Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to initialize this LinkedList with");
		}
		this.size = 0;
		head = null;
		tail = null;
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

	/**
	 * @param index the location at which to add the specified element
	 * @param element the value to be added to the specified location
	 * @throws NullPointerException if no value is provided
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide an element to add to this LinkedList");
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
		else if(index < this.size / 2)
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
		else
		{
			Node<E> current = tail;
			for(int i = this.size - 1; i > index; i--)
			{
				current = current.previous;
			}
			newNode.next = current.next;
			newNode.previous = current;
			current.next.previous = newNode;
			current.next = newNode;
		}
		this.size++;
	}

	/**
	 * @param e the value to be added to the end of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @return true if the value provided was successfully added
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to this LinkedList");
		}
		Node<E> newNode = new Node<>(e);
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
		return true;
	}

	/**
	 * @param index the location from which to start adding values into this Collection
	 * @param c Collection of values to add to this LinkedList, starting at the specified index
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to add to this LinkedList");
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
		Node<E> newNode = null;
		E[] values = (E[]) c.toArray();
		if(head == null || index == this.size)
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
			Node<E> current = head;
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
	 * @param c Collection of values to add to the end of this LinkedList
	 * @throws NullPointerException if no Collection is provided or the provided Collection contains null values
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null || c.contains(null))
		{
			throw new NullPointerException("You MUST provide a non-null Collection of non-null values to add to this LinkedList");
		}
		Iterator<? extends E> iterator = c.iterator();
		Node<E> newNode = null;
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
		return true;
	}

	/**
	 * @param e the value to be added to the beginning of this LinkedList
	 * @throws NullPointerException if no value was provided or the provided value was 'null'
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to this LinkedList");
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
	 * @param e the value to be added to the end of this LinkedList
	 * @throws NullPointerException if no value was provided or the provided value was 'null'
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public void addLast(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to this LinkedList");
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
	 * @return false if the provided Object is null or not found, true if found
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
	 * @throws NullPointerException if no Collection of values is provided
	 * @return false if any value in the Collection is null or not found, true if the provided Collection is empty or all values are found
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a Collection of values to check the existence of in this LinkedList");
		}
		if(c.isEmpty())
		{
			return true;
		}
		if(c.contains(null))
		{
			return false;
		}
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			Node<E> current = head;
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
	 * @return an iterator over the elements in this deque in reverse sequential order
	 */
	@Override
	public Iterator<E> descendingIterator()
	{
		return new Iterator<E>()
		{
			private Node<E> current = tail;
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
				current = current.previous;
				return lastReturned.data;
			}

			@Override
			public void remove()
			{
				if(lastReturned == null)
				{
					throw new NullPointerException("You MUST call next() before calling remove()");
				}
				else if(lastReturned.previous == null && lastReturned.next == null)
				{
					head = null;
					tail = null;
					lastReturned = null;
				}
				else if(lastReturned.previous == null)
				{
					head = head.next;
					lastReturned.next = null;
					head.previous = null;
					lastReturned = null;
				}
				else if(lastReturned.next == null)
				{
					tail = tail.previous;
					lastReturned.previous = null;
					tail.next = null;
					lastReturned = null;
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
	 * @return the head (first element) of this list
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
	 * @param index the location from which to retrieve a value
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
	 * @return the location of the first occurrence of the provided Object, or -1 if the Object is null or not found
	 */
	@Override
	public int indexOf(Object o)
	{
		if(o == null)
		{
			return -1;
		}
		int index = 0;
		for(Node<E> current = head; !(current.data.equals(o)); current = current.next)
		{
			index++;
		}
		if(index == this.size)
		{
			return -1;
		}
		return index;
	}

	/**
	 * @return true if this LinkedList is empty, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		return this.size == 0;
	}

	/**
	 * @return an iterator over the elements in this list (in sequential order)
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<E>()
		{
			private Node<E> current = head;
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
					throw new NoSuchElementException("This iterator has reached the end of this LinkedList");
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
				size--;
				lastReturned = null;
			}

			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				for(Node<E> currentNode = current; currentNode != null; currentNode = currentNode.next)
				{
					action.accept(currentNode.data);
				}
			}
		};
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @return the location of the last occurrence of the provided Object, or -1 if the Object is null or not found
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
	 * @return a list-iterator of the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<E>()
		{
			private int currentIndex = 0;
			private Node<E> current = head;
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
					throw new NoSuchElementException("This iterator has reached the end of this LinkedList");
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
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This iterator has reached the beginning of this LinkedList");
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
				lastReturned = null;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to add into this LinkedList");
				}
				Node<E> newNode = new Node<>(e);
				if(current.previous == null)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
					current = head;
				}
				else
				{
					newNode.next = current;
					newNode.previous = current.previous;
					current.previous.next = newNode;
					current.previous = newNode;
					size++;
				}
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to set into this LinkedList");
				}
				if(lastReturned == null)
				{
					throw new IllegalStateException("You MUST call previous() or next() before calling set()");
				}
				lastReturned.data = e;
			}
		};
	}

	/**
	 * @param index the location from which to create the list iterator
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return a list-iterator of the elements in this list (in proper sequence), starting from the provided index
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
			private int currentIndex = index;
			private Node<E> current = head;
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
					throw new NoSuchElementException("This iterator has reached the end of this LinkedList");
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
				if(!hasPrevious())
				{
					throw new NoSuchElementException("This iterator has reached the beginning of this LinkedList");
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
				lastReturned = null;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to add into this LinkedList");
				}
				Node<E> newNode = new Node<>(e);
				if(current.previous == null)
				{
					head.previous = newNode;
					newNode.next = head;
					head = head.previous;
					current = head;
				}
				else
				{
					newNode.next = current;
					newNode.previous = current.previous;
					current.previous.next = newNode;
					current.previous = newNode;
					size++;
				}
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to set into this LinkedList");
				}
				if(lastReturned == null)
				{
					throw new IllegalStateException("You MUST call previous() or next() before calling set()");
				}
				lastReturned.data = e;
			}
		};
	}

	/**
	 * @param e the value to offer to this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if the value has been successfully added
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
	 * @param e the value to offer to this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if this value has been successfully added
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
	 * @param e the value to offer to this LinkedList
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @return true if this value has been successfully added
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
	 * @return the head (first element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the head (first element) of this list
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
	 * @return the tail (last element) of this list or null if this list is empty
	 * @code Retrieves, but does not remove, the tail (last element) of this list
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
	 * @return the previous head (first element) of this list or null if this list is empty
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
			removingNode.next = null;
			head.previous = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the previous head (first element) of this list or null if this list is empty
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
			removingNode.next = null;
			head.previous = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the previous tail (last element) of this list or null if this list is empty
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
		else
		{
			removingNode.previous = null;
			tail.next = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @return the value previously at the top of the stack
	 * @throws NoSuchElementException if the stack represented by this LinkedList is empty
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
	 * @param e the value to be pushed onto the stack
	 * @throws NullPointerException if no value is provided
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
	 * @return the value in the Node previously defined as head
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
	 * @return false if the provided Object is 'null' or not found, true if found and removed
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
	 * @return the value previously defined as head
	 * @throws NoSuchElementException if this LinkedList is empty
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
			head.previous = null;
			removingNode.next = null;
		}
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param o the Object to find and remove the first occurrence of
	 * @return false if the provided Object is null or not found, true if found and removed
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
			return false;
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
	 * @return the value previously defined as tail
	 * @throws NoSuchElementException if this LinkedList is empty
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
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param o the Object to find and remove the last occurrence of
	 * @return false if the provided Object is null or not found, true if found and removed
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
	 * @param element the replacement value for the specified location
	 * @throws NullPointerException if no value is provided or the provided value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a value to replace with at the specified index");
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
		E removingValue = current.data;
		current.data = element;
		return removingValue;
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
	public Spliterator<E> spliterator()
	{
		return new Spliterator<E>()
		{
			private Node<E> current = head;
			private final int expectedModCount = modCount;

			@Override
			public boolean tryAdvance(Consumer<? super E> action)
			{
				if(current == null)
				{
					return false;
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

			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				while(current != null)
				{
					action.accept(current.data);
					current = current.next;
				}
			}

			private void checkForConcurrentModification()
			{
				if(modCount != expectedModCount)
				{
					throw new ConcurrentModificationException();
				}
			}
		};
	}

	/**
	 * @param fromIndex the location, inclusive of which, to create the subList from
	 * @param toIndex the location, exclusive of which, to create the subList until
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @throws IllegalArgumentException if fromIndex is greater than toIndex
	 * @return a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive
	 */
	@Override
	public List<E> subList(int fromIndex, int toIndex)
	{
		if(fromIndex < 0 || toIndex > this.size)
		{
			throw new IndexOutOfBoundsException("fromIndex " + fromIndex + " and/or toIndex " + toIndex + " is out of bounds");
		}
		if(fromIndex > toIndex)
		{
			throw new IllegalArgumentException("fromIndex " + fromIndex + " > toIndex " + toIndex);
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
	 * @return an array over the elements in this list in proper sequence (from first to last element)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Object[] toArray()
	{
		E[] values = (E[]) new Object[this.size];
		int currentSize = 0;
		for(Node<E> current = head; current != null; current = current.next)
		{
			values[currentSize++] = current.data;
		}
		return values;
	}

	/**
	 * @param a an array of type T[] to copy values from this LinkedList into
	 * @throws NullPointerException if no array is provided
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 * @code Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
	 */
	@SuppressWarnings("unchecked")
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
		int currentSize = 0;
		for(Node<E> current = head; current != null; current = current.next)
		{
			a[currentSize++] = (T) current.data;
		}
		return a;
	}

	/**
	 * @return a String representation of this LinkedList that is readable to the user
	 */
	@Override
	public String toString()
	{
		StringBuilder buff = new StringBuilder();
		if(this.size == 0)
		{
			return buff.toString();
		}
		E value = head.data;
		boolean isString = value instanceof String;
		boolean isCharacter = value instanceof Character;
		for(Node<E> current = head; current != null; current = current.next)
		{
			if(isString)
			{
				buff.append("\"").append(current.data).append("\"");
			}
			else if(isCharacter)
			{
				buff.append("'").append(current.data).append("'");
			}
			else
			{
				buff.append(current.data);
			}
			if(current.next != null)
			{
				buff.append(" <--> ");
			}
		}
		return buff.toString();
	}
}
