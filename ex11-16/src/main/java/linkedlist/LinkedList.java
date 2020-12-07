package linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

import arraylist.List;

public class LinkedList<E> implements List<E> {
	
	private int size;
	private Node<E> head;
	
	@Override
	public void add(E element) {
		// TODO Auto-generated method stub
		Node<E> newNode = new Node<E>(element);
		
		if(head == null)
			head = newNode;
		else {
			Node<E> last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		size++;
	}

	@Override
	public void add(int index, E element) {
		// TODO Auto-generated method stub
		//   (x)
		//   head          last
		//10  20            30   40   50
		//           25
		//          newNode
		//			(head)
		checkBoundsInclusive(index);
		if(index == size) {
			add(element);
			return;
		}
		Node<E> newNode = new Node<E>(element);
		Node<E> x = head;
		for(int i=0; i<index-1; i++) {
			x = x.next;
		}
		if(index == 0) {
			head = newNode;
			newNode.next = x;
		}else {
			newNode.next = x.next;
			x.next = newNode;
		}
		size++;
	}

	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		checkBoundsExclusive(index);
		Node<E> x = head;
		for(int i=0; i<index; i++)
			//System.out.println("     " + x.next);
			x = x.next;
		return x.data;
	}

	@Override
	public E remove(int index) {
		// TODO Auto-generated method stub
		//   (x)
		//   head          last
		//10  20            30   40   50
		//           25
		//          newNode
		//			(head)
		checkBoundsExclusive(index);
		E element;
		if(index == 0) {
			element = head.data;
			head = head.next;
		}else {
			Node<E> x = head;
			for(int i=0; i<index-1; i++)
				x = x.next;
			
			element = x.next.data;
			x.next = x.next.next;
		}
		size--;
		return element;
	}

	@Override
	public void removeAll() {
		// TODO Auto-generated method stub
		for(Node<E> x = head; x !=null;) {
			Node<E> next = x.next;
			x.data = null;
			x.next = null;
			x = next;
		}
		head = null;
		size = 0;		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	private class Node<E>{
		private Node<E> next;
		private E data;
		
		private Node(E element) {
			this.data = element;
			this.next = null;
		}
		private Node(E element, Node<E> next) {
			this.data = element;
			this.next = next;
		}
	}
	
	private void checkBoundsExclusive(int index) {
		if(index < 0 || index >= size) 
			throw new IndexOutOfBoundsException("Index:"+index+" Size:"+size);
	}
	private void checkBoundsInclusive(int index) {
		if(index < 0 || index > size) 
			throw new IndexOutOfBoundsException("Index:"+index+" Size:"+size);
	}

	//@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<E>() {
			
			private Node<E> pos = head;
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return (pos != null);
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if(pos == null)
					throw new NoSuchElementException();
				E data = pos.data;
				pos = pos.next;
				return data;
			}
			/*private Node nextOf = head;
			private Node lastOf;
			private int nextIndex = 0;
			private int size = size();			
			
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return nextIndex < size;
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				lastOf = nextOf;
				nextOf = nextOf.next;
				nextIndex++;
				return (E) lastOf.data;
			}*/
			
		};
	}
	
	

}

































