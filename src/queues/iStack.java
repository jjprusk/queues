package queues;

public interface iStack<T> {

		T push(T item);
		T pop();
		T peek();
		boolean isEmpty();
	}
