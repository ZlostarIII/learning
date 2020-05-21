package testing.stuff;

import java.util.Arrays;

public class Distinct {

    public static void main(String[] args) {
        int[] a = {3, 2, 6, -1, 4, 5, -1, 2};
        System.out.println(solution(a));

        int[] b = {1, 1, 1, 1, 2, 2, 4};
        System.out.println(solution(b));

        int[] c = {};
        System.out.println(solution(c));
    }

    private static int solution(int[] a) {
        return a.length == 0 ? 0 : (int) Arrays.stream(a).boxed().distinct().count();
    }
}
