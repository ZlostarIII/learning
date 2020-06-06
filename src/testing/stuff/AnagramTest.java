package testing.stuff;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramTest {

    public static void main(String[] args) {
        System.out.println(Integer.parseInt("10"));

        System.out.println(isPalindrome("madam"));

        String a = "HeLLo";
        String b = "hello";

        System.out.println(isAnagram(a, b));
        System.out.println(isAnagram2(a, b));

        a = "anagram";
        b = "margnaa";
        System.out.println(isAnagram(a, b));
        System.out.println(isAnagram2(a, b));

        a = "anadramm";
        b = "mardnaaa";
        System.out.println(isAnagram(a, b));
        System.out.println(isAnagram2(a, b));

    }

    public static String isPalindrome(String a) {
        String b = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }
        return (a.equals(b) ? "yes" : "no");
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a.toLowerCase().chars().mapToObj(item -> (char) item)
                .sorted()
                .collect(Collectors.toList())
                .forEach(System.out::print);

        System.out.println();

        b.toLowerCase().chars().sorted()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList())
                .forEach(System.out::print);

        System.out.println();

        Set<List<Character>> set = new HashSet<>();
        set.add(a.toLowerCase().chars().sorted()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList()));

        return !set.add(b.toLowerCase().chars().sorted()
                .mapToObj(item -> (char) item)
                .collect(Collectors.toList()));
    }

    public static boolean isAnagram2(String a, String b) {
        Map<Character, Integer> m1 = new HashMap<>();

        for (Character c: a.toLowerCase().toCharArray()) {
            if(m1.containsKey(c)) {
                m1.put(c, m1.get(c) + 1);
            } else {
                m1.put(c, 1);
            }
        }

        m1.values().stream().filter(v -> v > 1).count();

        for (Character c: b.toLowerCase().toCharArray()) {
            if(m1.containsKey(c)) {
                m1.put(c, m1.get(c) - 1);
            } else {
                m1.put(c, 1);
            }
        }

        m1.values().forEach(System.out::print);
        System.out.print(":");
        System.out.print(m1.values().stream().filter(m -> !m.equals(0)).count() + ":");
        m1.keySet().forEach(System.out::print);
        System.out.print("\n");

        return m1.values().stream().allMatch(m -> m.equals(0));
    }

}
