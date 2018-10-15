package testing.stuff;

import java.util.Optional;
import java.util.function.Function;

public class FunctionalTest {

	@FunctionalInterface
	public static interface Service extends Function<String, Optional<Integer>> {
		public default Optional<Integer> doWork(String value) {
			System.out.println("apply a doWork: " + value);

			return apply(value);
		}
	}

	static Service service() {
		return (value) -> {
			try {
				System.out.println("apply b service: " + value.toString());

				return Optional.of(Integer.valueOf(value));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			return Optional.empty();
		};
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Optional<Integer> applyA = service().apply("1");

		Optional<Integer> applyB = service().doWork("1");

	}
}