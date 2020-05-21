package testing.stuff;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] a = {3, 8, 9, 7, 6};
        int[] d = {3, 8, 9, 7, 6};
        int[] b = {0, 0, 0};
        int[] c = {1, 2, 3, 4};
        int[] e = {};
        int k = 3;
        a = solution(a, k);
        k = 8;
        d = solution(d, k);
        k = 3;
        b = solution(b, k);
        k = 4;
        c = solution(c, k);
        k = 0;
        e = solution(e, k);
        for (Integer i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : d) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : c) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (Integer i : e) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] a, int k) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list.stream().allMatch(list.get(0)::equals));
        if (list.stream().allMatch(list.get(0)::equals)) {
            System.out.println("All equal");
            return a;
        }

        if (a.length == 0) {
            System.out.println("Empty array");
            return a;
        }

        if (k % a.length == 0) {
            System.out.println("No need to rotate");
            return a;
        }

        if (k > a.length) {
            k %= a.length;
            System.out.println(k);
        }

        int[] aa = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            aa[(i + k) % a.length] = a[i];
        }

        return aa;
    }
}
