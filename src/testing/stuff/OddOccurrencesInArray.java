package testing.stuff;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class OddOccurrencesInArray {

    public static void main(String[] args) {
        int[] a = {999999, 9, 9, 999999, 6};
        int[] b = {3, 4, 1, 3, 4};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    public static int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer i : A) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        AtomicInteger res = new AtomicInteger();
        map.forEach((k, v) -> {
            if(v == 1) {
                res.set(k);
            }
        });

        return res.get();
    }
}
