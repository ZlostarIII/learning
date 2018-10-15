package testing.stuff;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class TestThree {

	public static void main(String[] args) {

		int n = 5;

		List<Integer> result = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			result.add(i * 3);
		}

		result.forEach(i -> {
			System.out.println(i);
		});
		
		result.forEach(System.out::println);

		String joined = result.stream().map(Object::toString).collect(Collectors.joining(", "));

		System.out.println(joined);
	}

}
