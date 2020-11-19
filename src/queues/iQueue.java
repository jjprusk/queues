package queues;

public interface iQueue<T> {

	T add(T item);
	T remove();
	T peek();
	boolean isEmpty();
}
