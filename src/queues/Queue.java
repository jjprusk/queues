package queues;

public class Queue<T> extends Deque<T> implements iQueue<T> {
	
	public Queue() {
		super();
	}
	
	public T add(T item) {
		return this.insertAtTail(item);
	}
	
	public T remove() {
		return this.removeAtHead();
	}
	
	public T peek() {
		return this.peekAtHead();
	}
}