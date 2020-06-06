package testing.stuff;

import java.util.*;

public class PaysafeOne {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        List<String> list = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");

        String s = String.join("", list);
        System.out.println(s);

        System.out.println(
                s.chars().filter(letter -> letter >= 'a' && letter <= 'z').distinct().count() == 26
        );

        List<String> pangram = new ArrayList<>();
        pangram.add("we promptly judged antique ivory buckles for the next prize");
        pangram.add("we promptly judged antique ivory buckles for the prizes");
        pangram.add("the quick brown fox jumps over the lazy dog");
        pangram.add("the quick brown fox jump over the lazy dog");

        StringBuilder result = new StringBuilder();

        for (String str : pangram) {
            if (str.chars().filter(letter -> letter >= 'a' && letter <= 'z').distinct().count() == 26) {
                result.append("1");
            } else {
                result.append("0");
            }
        }

        System.out.println(result);
    }
}
