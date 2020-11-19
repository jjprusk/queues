package testqueues;

import queues.Deque;
import queues.Queue;
import queues.Stack;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		
		System.out.println("---test1, insertAtHead---"); /////
		Deque<Item> d = new Deque<>();
		d.insertAtHead(new Item("item1"));
		d.insertAtHead(new Item("item2"));
		d.insertAtHead(new Item("item3"));
		for(Item item : d) System.out.println(item);
		
		System.out.println("---test2, insertAtTail---");  /////
		Deque<Item> d1 = new Deque<>();
		d1.insertAtTail(new Item("item1"));
		d1.insertAtTail(new Item("item2"));
		d1.insertAtTail(new Item("item3"));
		for(Item item : d1) System.out.println(item);
		
		System.out.println("-Mixed insertions--"); /////
		Deque<Item> d2 = new Deque<>();
		d2.insertAtHead(new Item("item1"));
		d2.insertAtTail(new Item("item2"));
		d2.insertAtHead(new Item("item3"));
		for(Item item : d2) System.out.println(item);
		
		System.out.println("---test3, insertAtHead integer---");
		Deque<Integer> d3 = new Deque<>();
		d3.insertAtHead(1);
		d3.insertAtHead(2);
		d3.insertAtHead(3);
		d3.insertAtHead(4);
		for(Integer item : d3) System.out.format("item: %d\n", item);

		System.out.println("---test4, insertAtTail double---");
		Deque<Double> d4 = new Deque<>();
		d4.insertAtTail(1.4);
		d4.insertAtTail(2.567);
		d4.insertAtTail(3.1417);
		d4.insertAtTail(4.101);
		for(Double item : d4) System.out.format("item: %f\n", item);
		
		// Use deque 1
		System.out.println("---test5, removeAtHead---");
		for(Item item : d1) System.out.format("item: %s\n", item);
		System.out.println(d1.removeAtHead());
		for(Item item : d1) System.out.format("item: %s\n", item);
		System.out.println(d1.removeAtHead());
		for(Item item : d1) System.out.format("item: %s\n", item);
		System.out.println(d1.removeAtHead());
		for(Item item : d1) System.out.format("item: %s\n", item);
		System.out.println(d1.removeAtHead());
		System.out.println("Deque empty: "+d1.isEmpty());
		/*
		 * Use deque 4
		 */	
		System.out.println("---test6, removeAtTail---");
		for(Double item : d4) System.out.format("item: %f\n", item);
		System.out.println(d4.removeAtTail());
		for(Double item : d4) System.out.format("item: %f\n", item);
		System.out.println(d4.removeAtTail());
		for(Double item : d4) System.out.format("item: %f\n", item);
		System.out.println(d4.removeAtTail());
		for(Double item : d4) System.out.format("item: %f\n", item);
		System.out.println(d4.removeAtTail());
		for(Double item : d4) System.out.format("item: %f\n", item);
		System.out.println(d4.removeAtTail());
		
		System.out.println("---test7, queue---");
		Queue<String> queue = new Queue<>();
		queue.add("One");
		queue.add("two");
		queue.add("three");
		queue.add("four");
		System.out.format("item: %s\n", queue.peek());
		for(String s : queue) System.out.format("item: %s\n", s);
		queue.remove();
		queue.remove();
		System.out.format("item: %s\n", queue.peek());
		for(String s : queue) System.out.format("item: %s\n", s);
		
		System.out.println("---test8, stack---");
		Stack<String> stack = new Stack<>();
		stack.push("item1");
		stack.push("item2");
		stack.push("item3");
		System.out.format("item: %s\n", stack.peek());
		for(String s : stack) System.out.format("item: %s\n", s);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("Stack empty: "+stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println("Stack empty: "+stack.isEmpty());
	}
}