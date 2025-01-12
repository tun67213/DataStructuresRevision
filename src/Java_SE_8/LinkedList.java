package src.Java_SE_8;

import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author arvindhvelrajan
 * @param <E> Generic variable for this class
 * @code This class implements LinkedList for Java SE 8
 */
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
{
	/**
	 * @code This internal class is to enable the class to create Nodes.
	 */
	private static class Node<E>
	{
		private Node<E> previous;
		private E data;
		private Node<E> next;

		private Node(E data)
		{
			this.previous = null;
			this.data = data;
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
	 * @throws NullPointerException if no Collection is provided
	 * @code Constructs a list containing the elements of the specified collection, in the order that they are returned by the collection's iterator.
	 */
	public LinkedList(Collection<? extends E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non null collection of values to initialize this LinkedList with");
		}
		this.size = 0;
		this.head = null;
		this.tail = null;
		if(!c.isEmpty())
		{
			Iterator<? extends E> iterator = c.iterator();
			while(iterator.hasNext())
			{
				E element = iterator.next();
				if(element == null)
				{
					throw new NullPointerException("You MUST provide a collection with non null elements to initialize this LinkedList with");
				}
				Node<E> newNode = new Node<>(element);
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
	 * @throws NullPointerException if no value is provided or the provided value is null
	 * @return true if the value has successfully been added to the end of this List
	 * @code Appends the specified element to the end of this list.
	 */
	@Override
	public boolean add(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to add to this LinkedList");
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
	 * @param index the location at which to add the specified value to this list
	 * @param element the value to be added to the specified location in this list
	 * @throws NullPointerException if no element is provided or the provided element is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @code Inserts the specified element at the specified position in this list.
	 */
	@Override
	public void add(int index, E element)
	{
		if(element == null)
		{
			throw new NullPointerException("You MUST provide a non-null element to add to this LinkedList");
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
	 * @param c Collection of values to add to the end of this list
	 * @throws NullPointerException if the provided Collection is null or any value in the provided Collection is null
	 * @return true if all the values have been successfully added, false if the provided Collection is empty
	 * @code Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection's iterator.
	 */
	@Override
	public boolean addAll(Collection<? extends E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add to this LinkedList");
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
				throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add to this LinkedList");
			}
			Node<E> newNode = new Node<>(value);
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
	 * @param index the location to start adding values from
	 * @param c Collection of values to add to this List, starting at the specified index
	 * @throws NullPointerException if the Collection variable is null or any value in the Collection is null
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return true if all the values have been successfully added, false if the provided Collection is empty
	 * @code Inserts all of the elements in the specified collection into this list, starting at the specified position.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addAll(int index, Collection<? extends E> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a non-null collection of non-null elements to add to this LinkedList");
		}
		if(index < 0 || index > this.size)
		{
			throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
		}
		Iterator<? extends E> iterator = c.iterator();
		if(index == this.size)
		{
			while(iterator.hasNext())
			{
				E value = iterator.next();
				if(value == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add to this LinkedList");
				}
				Node<E> newNode = new Node<>(value);
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
			E[] values = (E[]) c.toArray();
			for(int i = values.length - 1; i >= 0; i--)
			{
				E value = values[i];
				if(value == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add to this LinkedList");
				}
				Node<E> newNode = new Node<>(value);
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
				E value = iterator.next();
				if(value == null)
				{
					throw new NullPointerException("You MUST provide a non-null element to add to this LinkedList");
				}
				Node<E> newNode = new Node<>(value);
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
	 * @param e the value to add to the beginning of this LinkedList
	 * @throws NullPointerException if no value is provided
	 * @code Inserts the specified element at the beginning of this list.
	 */
	@Override
	public void addFirst(E e)
	{
		if(e == null)
		{
			throw new NullPointerException("You MUST provide a value to add to the beginning of this LinkedList");
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
	 * @code Inserts the specified element to the end of this list.
	 */
	@Override
	public void addLast(E e)
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
	 * @throws NullPointerException if no Object is provided
	 * @return true if the Object is found, false otherwise
	 */
	@Override
	public boolean contains(Object o)
	{
		if(o == null)
		{
			return false;
		}
		Node<E> current = head;
		// Iterate through this list with the condition that the value in the Node isn't what we are searching for
		while(current != null && !(current.data.equals(o)))
		{
			current = current.next;
		}
		// If current isn't null, that means that the data we are looking for has been found
		return current != null;
	}

	/**
	 * @param c Collection of values to find the existence of in this LinkedList
	 * @throws NullPointerException if no Collection variable is provided or the provided variable is null
	 * @return false if a value is not found or null, true if all values are found
	 */
	@Override
	public boolean containsAll(Collection<?> c)
	{
		if(c == null)
		{
			throw new NullPointerException("You MUST provide a collection of values to find the existence of in this LinkedList");
		}
		if(c.isEmpty())
		{
			return true;
		}
		Iterator<?> iterator = c.iterator();
		while(iterator.hasNext())
		{
			Object value = iterator.next();
			if(value == null)
			{
				return false;
			}
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
			private Node<E> lastCalled = null;

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
					throw new NoSuchElementException("Iterator has reached the end of this list");
				}
				lastCalled = current;
				current = current.previous;
				return lastCalled.data;
			}

			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				action.accept(current.data);
			}

			@Override
			public void remove()
			{
				if(lastCalled == null)
				{
					throw new NullPointerException("You MUST call next() before calling remove()");
				}
				else if(lastCalled.previous == null && lastCalled.next == null)
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
					lastCalled.previous.next = lastCalled.next.previous;
					lastCalled.next.previous = lastCalled.previous.next;
					lastCalled.next = null;
					lastCalled.previous = null;
				}
			}
		};
	}

	/**
	 * @return the head (first element) of this list
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
	 * @return the value at the specified index in this List
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
	 * @return the hash code value for this list
	 */
	@Override
	public int hashCode()
	{
		int hashCode = 1;
		for(Node<E> current = head; current != null; current = current.next)
		{
			E value = current.data;
			hashCode = 31 * hashCode + (value == null ? 0 : value.hashCode());
		}
		return hashCode;
	}

	/**
	 * @param o the Object to find the first occurrence of
	 * @throws NullPointerException if no Object is provided
	 * @return the location of the first occurrence of the provided Object or -1 if not found
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
	 * @return an iterator over the elements in this LinkedList, in sequential order
	 */
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<E>()
		{
			private Node<E> current = head;
			private Node<E> lastCalled = null;

			/**
			 * @param action the action to be performed on each value in this LinkedList
			 */
			@Override
			public void forEachRemaining(Consumer<? super E> action)
			{
				if(action == null)
				{
					throw new NullPointerException("Action cannot be null");
				}
				while(current != null)
				{
					action.accept(current.data);
					current = current.next;
				}
			}

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
					throw new NoSuchElementException("The iterator has reached the end of this list");
				}
				lastCalled = current;
				E value = lastCalled.data;
				current = current.next;
				return value;
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
	 * @return true if this list contains no elements, false otherwise
	 */
	@Override
	public boolean isEmpty()
	{
		return this.size == 0;
	}

	/**
	 * @param o the Object to find the last occurrence of
	 * @throws NullPointerException if no Object is provided or the provided Object is 'null'
	 * @return the location of the last occurrence of the specified Object or -1 if not found
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
	 * @return a list iterator over the elements in this list (in proper sequence)
	 */
	@Override
	public ListIterator<E> listIterator()
	{
		return new ListIterator<>()
		{
			private Node<E> current = head;
			private int currentIndex = 0;
			private Node<E> lastCalled = null;

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
					throw new NoSuchElementException("The iterator has reached the end of this list");
				}
				lastCalled = current;
				current = current.next;
				currentIndex++;
				return lastCalled.data;
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
					throw new NoSuchElementException("The iterator has reached the end of this list");
				}
				current = current.previous;
				currentIndex--;
				lastCalled = current;
				return lastCalled.data;
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
				if(lastCalled == null)
				{
					throw new NullPointerException("You MUST call previous() or next() before calling remove()");
				}
				else if(lastCalled.previous == null && lastCalled.next == null)
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
				size--;
				lastCalled = null;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a replacement value");
				}
				current.data = e;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to add at the current index");
				}
				Node<E> newNode = new Node<>(e);
				if(head == null)
				{
					head = newNode;
					tail = newNode;
				}
				else if(current.next == null)
				{
					tail.next = newNode;
					newNode.previous = tail;
					tail = tail.next;
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
		};
	}

	/**
	 * @param index the location at which to start the list
	 * @return a list iterator over the elements in this list (in proper sequence), starting at the specified position in this list
	 */
	@Override
	public ListIterator<E> listIterator(int index)
	{
		return new ListIterator<>()
		{
			private Node<E> current = head;
			private int currentIndex = index;
			private Node<E> lastCalled = null;

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
					throw new NoSuchElementException("The iterator has reached the end of this list");
				}
				lastCalled = current;
				current = current.next;
				currentIndex++;
				return lastCalled.data;
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
					throw new NoSuchElementException("The iterator has reached the end of this list");
				}
				current = current.previous;
				currentIndex--;
				lastCalled = current;
				return lastCalled.data;
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
				if(lastCalled == null)
				{
					throw new NullPointerException("You MUST call previous() or next() before calling remove()");
				}
				else if(lastCalled.previous == null && lastCalled.next == null)
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
				size--;
				lastCalled = null;
			}

			@Override
			public void set(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a replacement value");
				}
				current.data = e;
			}

			@Override
			public void add(E e)
			{
				if(e == null)
				{
					throw new NullPointerException("You MUST provide a value to add at the current index");
				}
				Node<E> newNode = new Node<>(e);
				if(head == null)
				{
					head = newNode;
					tail = newNode;
				}
				else if(current.next == null)
				{
					tail.next = newNode;
					newNode.previous = tail;
					tail = tail.next;
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
		};
	}

	/**
	 * @param e the value to add to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the provided value was added successfully
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
	 * @param e the value to add to the beginning of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the provided value was added successfully
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
	 * @param e the value to add to the end of this list
	 * @throws NullPointerException if no value is provided
	 * @return true if the provided value was added successfully
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
	 * @return the head (first element) of this list
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
	 * @return the head (first element) of this list or null
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
	 * @return the tail (last element) of this list or null
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
	 * @return the value in the node previously defined as head, or null if this LinkedList is empty
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
	 * @return the value in the node previously defined as head, or null if this list is empty
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
	 * @return the value in the node previously defined as tail, or null if this list is empty
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
	 * @return the value previously at the top of the stack represented by this LinkedList
	 * @code Removes and returns the value previously at the top of the stack represented by this LinkedList
	 */
	@Override
	public E pop()
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
	 * @param e the value to be added to the top of the stack represented by this LinkedList
	 * @throws NullPointerException if no value is provided
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
	 * @return the value in the node previously defined as head before removal
	 * @throws NoSuchElementException if this LinkedList is empty
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
		head.previous = null;
		this.size--;
		return removingNode.data;
	}

	/**
	 * @param index the location at which to remove a value from
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously at the specified index in this LinkedList
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
	 * @throws NullPointerException if no Object is provided
	 * @return true if this List has been modified, false otherwise
	 * @code Removes the first occurrence of the specified element from this list, if it is present.
	 */
	@Override
	public boolean remove(Object o)
	{
		if(o == null)
		{
			throw new NullPointerException("You MUST provide an Object to remove the first occurrence of from this LinkedList");
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
	 * @return the value previously the first value in this list
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
	 * @throws NullPointerException if no Object is provided or the provided Object is null
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code The method searches for the first occurrence of the specified object in the list.
	 *       If found, it removes the element and updates the list. If the object is not found,
	 *       the method returns false after searching the entire list.
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
	 * @return the value in the Node previously at tail
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
	 * @throws NullPointerException if no Object is provided or the provided Object is null
	 * @return true if this LinkedList has been modified, false otherwise
	 * @code Removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
	 */
	@Override
	public boolean removeLastOccurrence(Object o)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param index the location at which to replace a value
	 * @param element the replacement value
	 * @throws NullPointerException if no replacement value is provided or the provided replacement value is 'null'
	 * @throws IndexOutOfBoundsException if the provided index is out of bounds
	 * @return the value previously in the Node at the specified index
	 * @code Replaces the element at the specified position in this list with the specified element.
	 */
	@Override
	public E set(int index, E element)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return the number of elements in this list
	 */
	@Override
	public int size()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a late-binding and fail-fast Spliterator over the elements in this list
	 */
	@Override
	public Spliterator<E> spliterator()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return an array containing all of the elements in this list in proper sequence (from first to last element)
	 */
	@Override
	public Object[] toArray()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @param a an array of type T into which to copy all the values from this LinkedList into
	 * @throws NullPointerException if no array is provided
	 * @return the provided array with values from this LinkedList copied into it
	 */
	@Override
	public <T> T[] toArray(T[] a)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/**
	 * @return a String representation of this LinkedList
	 */
	@Override
	public String toString()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
