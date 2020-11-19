package queues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QueuesTest {

	class Item {
		String name;
		public Item(String name) {
			this.name = name;
		}
		public String toString() {
			return name;
		}
	}
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testInsertAtHead() {
		Deque<Item> d = new Deque<>();
		d.insertAtHead(new Item("item0"));
		d.insertAtHead(new Item("item1"));
		d.insertAtHead(new Item("item2"));
		int i = 2;
		for(Item item : d) {
			assertEquals("item"+Integer.toString(i--), item.toString());
		}
		// integer
		Deque<Integer> d1 = new Deque<>();
		d1.insertAtHead(0);
		d1.insertAtHead(1);
		d1.insertAtHead(2);
		i = 2;
		for(Integer x : d1) {
			assertEquals(i--,x);
		}
		// double
		Deque<Double> d2 = new Deque<>();
		d2.insertAtHead(1.1);
		d2.insertAtHead(2.2);
		d2.insertAtHead(3.3);
		d2.insertAtHead(4.4);
		i = 4;
		for(Double x : d2) {
			assertEquals(1.1 * i--,x,.0001);
		}
	}

	@Test
	void testInsertAtTail() {
		Deque<Item> d = new Deque<>();
		d.insertAtTail(new Item("item0"));
		d.insertAtTail(new Item("item1"));
		d.insertAtTail(new Item("item2"));
		int i = 0;
		for(Item item : d) {
			assertEquals("item"+Integer.toString(i++), item.toString());
		}
		// integer
		Deque<Integer> d1 = new Deque<>();
		d1.insertAtTail(0);
		d1.insertAtTail(1);
		d1.insertAtTail(2);
		i = 0;
		for(Integer x : d1) {
			assertEquals(i++,x);
		}
		// double
		Deque<Double> d2 = new Deque<>();
		d2.insertAtTail(1.1);
		d2.insertAtTail(2.2);
		d2.insertAtTail(3.3);
		d2.insertAtTail(4.4);
		i = 1;
		for(Double x : d2) {
			assertEquals(1.1 * i++,x,.0001);
		}
	}
	
	@Test
	void mixedInsertions() {
		Deque<String> d = new Deque<>();
		d.insertAtHead("item0");
		d.insertAtTail("item1");
		d.insertAtHead("item2");
		int i = 0;
		for(String s : d) {
			switch (i) {
				case 0:
					assertEquals("item2", s);
					break;
				case 1:
					assertEquals("item0", s);
					break;
				case 2:
					assertEquals("item1", s);
					break;
			}
			i++;
		}
	}

	@Test
	void testRemoveAtHead() {
		Deque<Integer> d = new Deque<>();
		d.insertAtHead(0);
		d.insertAtHead(1);
		d.insertAtHead(2);
		assertEquals(d.removeAtHead(),2);
		assertEquals(d.removeAtHead(),1);
		assertEquals(d.removeAtHead(),0);
		assertTrue(d.isEmpty());
	}

	@Test
	void testRemoveAtTail() {
		Deque<Integer> d = new Deque<>();
		d.insertAtHead(0);
		d.insertAtHead(1);
		d.insertAtHead(2);
		assertEquals(d.removeAtTail(),0);
		assertEquals(d.removeAtTail(),1);
		assertEquals(d.removeAtTail(),2);
		assertTrue(d.isEmpty());
	}

	@Test
	void testIsEmpty() {
		Deque<Item> d = new Deque<>();
		assertTrue(d.isEmpty());
	}

	@Test
	void testPeekAtHead() {
		Deque<Integer> d = new Deque<>();
		d.insertAtHead(0);
		d.insertAtHead(1);
		d.insertAtHead(2);
		assertEquals(d.peekAtHead(),2);
	}

	@Test
	void testPeekAtTail() {
		Deque<Integer> d = new Deque<>();
		d.insertAtHead(0);
		d.insertAtHead(1);
		d.insertAtHead(2);
		assertEquals(d.peekAtTail(),0);
	}
	
	@Test
	void testQueue() {
		Queue<String> q = new Queue<>();
		assertTrue(q.isEmpty());
		assertNull(q.remove());
		q.add("one");
		q.add("two");
		q.add("three");
		q.add("four");
		assertEquals("one", q.peek());
		assertEquals("one", q.remove());
		assertEquals("two", q.remove());
		assertEquals("three", q.remove());
		assertEquals("four", q.remove());
		assertTrue(q.isEmpty());
		assertNull(q.remove());
	}
	
	@Test
	void testStack() {
		Stack<String> s = new Stack<>();
		assertTrue(s.isEmpty());
		assertNull(s.pop());
		s.push("one");
		s.push("two");
		s.push("three");
		assertEquals("three", s.peek());
		assertEquals("three", s.pop());
		assertEquals("two", s.pop());
		assertEquals("one", s.pop());
		assertTrue(s.isEmpty());
		assertNull(s.pop());
	}
}
