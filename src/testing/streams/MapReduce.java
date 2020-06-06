package testing.streams;

import java.util.*;

public class MapReduce {

    public static void main(String[] args) {
        String[] myArray = {"this", "is", "a", "sentence"};
        String result = Arrays.stream(myArray)
                .reduce("", (a, b) -> a + " " + b);
        System.out.println(result);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int res = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(res);

        int myArr[] = {1, 2, 3, 3, 4, 5, 6};
        System.out.println(Arrays.stream(myArr).sum());

        String first = "Baeldung";
        String second = "Baeldung";
        System.out.println(first == second);

        int sum = 6;

        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] + myArr[j] == sum) {
                    System.out.println(myArr[i] + " and " + myArr[j]);
                }
            }
        }

        Map<Integer, Integer> m = new HashMap<>();
        for (int i : myArr) {
            int candidate = sum - i;
            if (m.containsKey(candidate)) {
                System.out.println("Summary: " + i + " and " + candidate);
            } else {
                m.put(i, candidate);
            }
        }
        m.entrySet().forEach(System.out::println);
    }

}
