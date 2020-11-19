package queues;

public class Stack<T> extends Deque<T> implements iStack<T> {
		
	public Stack() {
		super();
	}
		
	public T push(T item) {
		return this.insertAtTail(item);
	}
		
	public T pop() {
		return this.removeAtTail();
	}
	
	public T peek() {
		return this.peekAtTail();
	}
}