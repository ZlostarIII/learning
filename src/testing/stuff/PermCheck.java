package testing.stuff;

import java.util.Arrays;
import java.util.HashSet;
import java.util.OptionalLong;
import java.util.Set;

public class PermCheck {

    public static void main(String[] args) {
        int[] a = {2, 3, 7, 4, 2};
        int[] b = {2, 3, 7, 2, 4};
        System.out.println(solution(a, b));

        a = new int[]{1};
        b = new int[]{};
        System.out.println(solution(a, b));

        a = new int[]{1, 2};
        b = new int[]{1};
        System.out.println(solution(a, b));

        a = new int[]{2, 1, 3, 4, 6, 5};
        System.out.println(solution2(a));

        a = new int[]{2, 1, 3, 6, 5};
        System.out.println(solution2(a));

        a = new int[]{};
        System.out.println(solution2(a));

        a = new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8};
        System.out.println(solution2(a));

        a = new int[]{1, 1, 3, 4, 5, 6};
        System.out.println(solution2(a));
    }

    private static int solution2(int[] A) {
        if (A.length == 0) return 0;

        Set<Integer> set = new HashSet<>();

        for (Integer i : A) {
            set.add(i);
        }

        int k = 0;
        for (int j = 1; j <= A.length; j++) {
            if (!set.contains(j)) {
                k = j;
            }
        }

        if(k != 0) return 0;

        OptionalLong b = Arrays.stream(A).mapToLong(m -> m).max();

        if (b.getAsLong() == A.length) return 1;
        else
            return 0;
    }

    private static int solution(int[] a, int[] b) {
        if (a.length == 0 || a.length != b.length) return 0;

        return Arrays.deepEquals(Arrays.stream(a).sorted().boxed().toArray(),
                Arrays.stream(b).sorted().boxed().toArray()) ? 1 : 0;
    }
}
