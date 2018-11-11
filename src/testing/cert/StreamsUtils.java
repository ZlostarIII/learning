package testing.cert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
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

        Integer[] i = {1, 2, 3, 4};
        Arrays.asList(i).stream().filter(s -> s % 2 == 0).forEach(System.out::println);
        List<Integer> list = Arrays.asList(i);
//        list.add(5); // throws UnsupportedOperationException
        list.forEach(System.out::println);

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(i));
        list2.add(5);
        list2.forEach(System.out::println);

        int[] k = {1, 2, 3, 4};
        Arrays.asList(k).stream().forEach(System.out::println);


        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>() {{
            add("Fred");
//            add("Flin");
            add("Jim");
            add("Ron");
        }};

        stringPriorityQueue.stream().peek(System.out::println).allMatch(s -> s.startsWith("F"));
    }
}
