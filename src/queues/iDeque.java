package queues;

public interface iDeque<T> {

	T insertAtTail(T item);
	T insertAtHead(T item);
	T removeAtHead();
	T removeAtTail();
	T peekAtHead();
	T peekAtTail();
	boolean isEmpty();
}