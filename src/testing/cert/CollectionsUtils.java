package testing.cert;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsUtils {
	private static transient Map<Integer, String> m;

	@SuppressWarnings("serial")
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

		m = new HashMap<>(2) {
			{
				put(1, "s1");
				put(2, "s2");
				put(3, "s3");
			}
		};

		int i = 1;
		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			System.out.println("Hash of element " + entry.getValue() + ", " + i + " is " + entry.getValue().hashCode());
			i++;
		}

		m.forEach((key, value) -> {
			System.out.println("Hash of element " + value + " is " + value.hashCode());
		});

		m.entrySet().stream().filter(e -> e.getValue().startsWith("s"))
				.peek(e -> System.out.println("Lambda: " + e.getValue())).collect(Collectors.toList());

		Map<Integer, String> sameKeys = new HashMap<>(2) {
			{
				put(1, "s1");
				put(1, "s2");
				put(1, "s3");
			}
		};

		sameKeys.forEach((key, value) -> {
			System.out.println("Hash of elements of sameKeys: " + value + " is " + value.hashCode());
		});

		Set<Integer> set = new HashSet<>() {
			{
				add(1);
				System.out.println(add(2));
				System.out.println(add(2));
				System.out.println(add(2));
				add(3);
			}
		};

		set.forEach(System.out::println);

		Set<? extends Object> setOfObject = new HashSet<String>(); // Set<Object> setOfObject = new HashSet<String>(); won't compile
	}
}
