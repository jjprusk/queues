package queues;

import java.util.Iterator; 

public class Deque<T> implements iDeque<T>, Iterable<T> {

	Node<T> head, tail;
	
	public T insertAtHead(T item) {
		Node<T> t = new Node<>(item);
		t.setNext(head);
		t.setPrev(null);
		/*
		 * Handle case where the queue is empty.
		 */
		if (head == null) {
			tail = t;
		} else {
			head.setPrev(t);
		}	
		head = t;
		return item;
	}
	
	public T insertAtTail(T item) {	 //***
		Node<T> t = new Node<>(item);
		t.setPrev(tail);
		t.setNext(null);
		if (head == null) {
			head = t;
		} else {
			tail.setNext(t);
		}
		tail = t;
		return item;
	}
	
	public T removeAtHead() {
		Node<T> t = head;
		/*
		 * Empty queue case.
		 */
		if (head == null) return null;
		head = head.getNext();
		/*
		 * Check for single entry queue.
		 */
		if (head == null) {
			tail = null;
		} else {
			head.setPrev(null);
		}
		return t.getData();
	}
	
	public T removeAtTail() {
		Node<T> t = tail;
		/*
		 * Empty queue case.
		 */
		if (head == null) return null;
		tail = t.getPrev();
		/*
		 * Check for single entry queue.
		 */
		if (tail == null) {
			head = null;
		} else {
			tail.setNext(null);
		}
		return t.getData();
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public T peekAtHead() {
		return head == null ? null : head.getData();
	}
	
	public T peekAtTail() {
		return tail == null ? null : tail.getData();
	}
	
	/*
	 * Internal Getters / Setters.
	 */
	protected Node<T> getHead() {
		return head;
	}
	
	protected Node<T> getTail() {
		return tail;
	}
	
    public Iterator<T> iterator() 
    { 
        return new QueueIterator<T>(this); 
    } 
}