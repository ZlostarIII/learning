package testing.stuff;

import java.util.HashMap;
import java.util.Map;

public class OcadoTestOne {
    public static void main(String[] args) {

        String a = "HeLLo";
        String b = "hello";

        System.out.println(solution(a));

        a = "anagram";
        b = "margnaa";
        System.out.println(solution(a));

        a = "anadramm";
        b = "mardnaaa";
        System.out.println(solution(a));

        a = "aaaa";
        System.out.println(solution(a));

        a = "";
        System.out.println(solution(a));

    }

    private static int solution(String a) {
        Map<Character, Integer> m1 = new HashMap<>();

        for (Character c : a.toLowerCase().toCharArray()) {
            if (m1.containsKey(c)) {
                m1.put(c, m1.get(c) + 1);
            } else {
                m1.put(c, 1);
            }
        }
        m1.values().forEach(System.out::print);
        System.out.println();

        return (int) m1.values().stream().filter(v -> v % 2 != 0).count();
    }
}
