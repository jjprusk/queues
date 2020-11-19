package queues;
/*
 * The Node class is the key data structure for creating a double linked list.
 */
public class Node<T> {

	Node<T> prev = null, next = null;
	T data = null;
	
	public Node(T item) {
		data = item;
	}
	
	public T getData() {
		return data;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> node) {
		next = node;
	}
	
	public Node<T> getPrev() {
		return prev;
	}
	
	public void setPrev(Node<T> node) {
		 prev = node;
	}
}
