package testing.stuff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.Map;

public class OcadoTestTwo {

    public static void main(String[] args) {
//        int[] a = {3, 2, -3, 2, 4, -4, 1, 2};
//        System.out.println(solution(a));
//
//        int[] b = {3, 2, -3, 2, 1, 2};
//        System.out.println(solution(b));
//
//        int[] c = {1, 1};
//        System.out.println(solution(c));
//
//        int[] d = {1};
//        System.out.println(solution(d));
//
//        int[] e = {};
//        System.out.println(solution(e));

        int[] f = {3, 2, -2, 5, -3};
        System.out.println(solution(f));

        int[] g = {1, 1, 2, -1, 2, -1};
        System.out.println(solution(g));
    }

    private static int solution(int[] a) {
        IntSummaryStatistics stats = Arrays.stream(a).summaryStatistics();
        int max2 = stats.getMax();

        Map<Integer, Integer> m = new HashMap<>();

        int current;
        for (Integer i : a) {
            current = -i;
            System.out.println("current: " + m.containsKey(current));
            System.out.println("i: " + i);
            if (m.containsKey(i)) {
                System.out.println("get: " + (m.get(i) == current));
                m.put(i, m.get(i) + 1);
            } else {
                m.put(i, 1);
            }
        }

        System.out.println((int) m.values().stream().filter(v -> v > 1).count());

        return (int) m.values().stream().filter(v -> v > 1).count();



//        int max = Integer.MIN_VALUE;
//        int current = 0;
//        for (Integer i : a) {
//            current = i;
//            if (max < i && i == -current) {
//                max = i;
//            }
//        }

//        return 0;
    }

}
