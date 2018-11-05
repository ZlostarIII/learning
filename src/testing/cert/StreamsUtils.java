package testing.cert;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsUtils {
	public static void main(String[] args) {
		Stream<Integer> str = Stream.of(1, 2, 3, 4, 5).filter(s -> s % 2 == 1);
		str.forEach(System.out::println);

		String a = "Java";
		String b = "EE";
		BiFunction<String, String, ?> f = (a1, b1) -> a1.concat(b1);
		System.out.println(f.apply(a, b));

		Arrays.asList("Fred", "Flin", "Ron").stream().peek(System.out::println).allMatch(s -> s.startsWith("F"));

		Arrays.asList("Fred", "Jim", "Ron").stream().peek(System.out::println).allMatch(s -> s.startsWith("F"));

		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
	}
}
