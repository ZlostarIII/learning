package testing.cert;

import java.util.*;

public class CollectionsUtils {
	public static void main(String[] args) {
		System.out.println("Deque:");
		Deque<String> deq = new LinkedList<>(); // Queue<String> q = new
												// ArrayDeque<>();
		deq.add("a1");
		deq.add("a2");
		deq.add("a3");
		deq.add("a4");
		deq.add("a5");

		System.out.println("poll: " + deq.poll());
		System.out.println("peek: " + deq.peek());
		System.out.println("poll: " + deq.poll());
		System.out.println("pop: " + deq.pop());

		deq.forEach(System.out::println);

		Queue<String> q = new ArrayDeque<>();
		q.add("a1");
		q.add("a2");
		q.add("a3");
		q.add("a4");
		q.add("a5");

		System.out.println();

		System.out.println("Queue:");
		q.stream().filter(s -> Integer.valueOf(s.substring(1)) % 2 == 0).forEach(System.out::println);

		System.out.println("poll: " + q.poll());
		System.out.println("peek: " + q.peek());
		System.out.println("poll: " + q.poll());
		System.out.println("pop: " + ((Deque<String>) q).pop());

		q.stream().filter(s -> Integer.valueOf(s.substring(1)) % 2 == 0).forEach(System.out::println);

		Map<Integer, String> m = new HashMap<>(2) {{
			put(1, "s1");
			put(2, "s2");
			put(3, "s3");
			put(4, "s4");
		}};

		System.out.println("Hashes: " + m.get(1).hashCode() + ", " + m.get(3).hashCode());
		System.out.println("Initial capacity is resized to: " + m.entrySet().size());
	}
}
