package testing.stuff;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 1, 1, 2, 3, 7, 4, 2};
        a = new int[]{1, 2, 3};
        System.out.println(solution(a));
    }

    public static int solution(int[] A) {
        if (A.length == 0) return 1;

        Set<Integer> set = new HashSet<>();

        for (Integer i : A) {
            set.add(i);
        }

        for (int j = 1; j <= A.length; j++) {
            if (!set.contains(j)) {
                return j;
            }
        }
        return A.length + 1;
    }
}
