package testing.stuff;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MaxDoubleSliceSum {
    public static void main(String[] args) {
        int[] a = {3, 2, 6, -1, 4, 5, -1, 2};
        System.out.println(solution(a));

//        System.out.println(stats);
//        System.out.println(stats.getCount());
//        System.out.println(stats.getMax());
//        System.out.println(stats.getMin());
//        System.out.println(stats.getSum());
//        System.out.println(stats.getSum() - stats.getMax() - stats.getMin());
//        System.out.println(stats.getSum() - a[0] - a[a.length - 1]);
//        System.out.println(stats.getSum() - a[0] - a[a.length - 1] - stats.getMin());
//
//        if(a[1] < 0) {
//            System.out.println(stats.getSum() - a[1] - a[a.length - 1] - stats.getMin());
//        } else if(a[a.length - 2] < 0) {
//            System.out.println(stats.getSum() - a[0] + a[a.length - 2] - stats.getMin());
//        } else if(a[1] < 0 && a[a.length - 2] < 0) {
//            System.out.println(stats.getSum() + a[1] + a[a.length - 2] - stats.getMin());
//        }


        int[] b = {3, -1, 6, -1, 4, 5, -1, 2};
        System.out.println(solution(b));

        int[] c = {3, -1, 6, -1, 4, 5, 10, 2};
        System.out.println(solution(c));

        int[] d = {-1, -1, 2, 2, 3, 4, 5, 6};
        System.out.println(solution(d));

        int[] e = {-1, 1, 2, 2, 3, 4, 5, 6};
        System.out.println(solution(e));

    }

    private static int solution(int[] a) {
        if (a.length == 0) return 0;

        IntSummaryStatistics stats = Arrays.stream(a).summaryStatistics();
        if (a[1] < 0 && a[a.length - 2] < 0) {
            System.out.println("Here 1");
            return (int) (stats.getSum() + a[1] + a[a.length - 2] - stats.getMin());
        } else if (a[a.length - 2] < 0) {
            System.out.println("Here 2");
            return (int) (stats.getSum() - a[0] + a[a.length - 2] - stats.getMin());
        } else if (a[1] < 0) {
            System.out.println("Here 3");
            return (int) (stats.getSum() + a[1] - a[a.length - 1] - stats.getMin());
        }

        return (int) (stats.getSum() - a[0] - a[a.length - 1] - stats.getMin());
    }
}
