package testing.cert;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
	}
}
