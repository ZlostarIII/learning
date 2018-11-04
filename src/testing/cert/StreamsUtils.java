package testing.cert;

import java.util.stream.Stream;

public class StreamsUtils {
	public static void main(String[] args) {
		Stream<Integer> str = Stream.of(1, 2, 3, 4, 5).filter(s -> s % 2 == 1);
		str.forEach(System.out::println);
	}
}
