package testing.stuff;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PaysafeTwo {
    public static void main(String[] args) {

//        Map<Integer, Character> weights = new HashMap<>();
//        weights.put(1, 'A');
//        int previousWeight = 0;
//        int currentWeight;
//        for (int i = 2; i <= 26; i++) {
//            currentWeight = i * previousWeight + previousWeight;
//            weights.put(currentWeight, (char) ('A' + i - 1));
//            previousWeight = currentWeight;
//        }
//        weights.entrySet().forEach(v -> System.out.println(v));

//        Map<Character, Integer> letters = new TreeMap<>();
//        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
//        int index = 1;
//        for (char c : alphabet) {
//            letters.put(c, index);
//            index = 2 * index + 1;
//        }
////        letters.entrySet().forEach(System.out::println);
//
//        int weight = 60;
//
//        List<Integer> list = letters.values().stream().filter(v -> v < weight).collect(Collectors.toList());
//        list.forEach(System.out::println);

        Map<Character, Integer> letters = new TreeMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] reversed = new char[alphabet.length];

        for (int i = alphabet.length - 1, k = 0; i >= 0; i--, k++) {
            reversed[k] = alphabet[i];
        }
        int index = 1;
        for (char c : alphabet) {
            letters.put(c, index);
            index = 2 * index + 1;
        }
        StringBuilder sb = new StringBuilder();
        int weight = 30;
        for (Character c : reversed) {
            if (weight > letters.get(c)) {
                sb.append(c);
                weight = weight - letters.get(c);
            }
        }
        if (weight > 0) {
            for (Character c : reversed) {
                if (weight > letters.get(c)) {
                    sb.append(c);
                    weight = weight - letters.get(c);
                }
            }
        }
        System.out.println(sb.reverse().toString());
    }
}
