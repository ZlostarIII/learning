package testing.stuff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {
    public static void main(String[] args) {
        int[] a = {3, 2, 6, 1, 4, 5, 1, 2};
        System.out.println(solution(a));

        int[] b = {1, 1, 1, 1, 2, 2, 4};
        System.out.println(solution(b));

        int[] c = {};
        System.out.println(solution(c));
    }

    private static int solution(int[] a) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : a) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        map.forEach((k, v) -> {
            System.out.println(k + ", " + v);
        });

        return a.length == 0 ? 0 : (int) Arrays.stream(a).boxed().distinct().count();
    }
}
