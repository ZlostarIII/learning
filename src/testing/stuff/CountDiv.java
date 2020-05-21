package testing.stuff;

public class CountDiv {

    public static void main(String[] args) {
        int a = 1;
        int b = 2000000000;
        int k = 2;
//        System.out.println(solution(a, b, k));
        System.out.println(solution2(a, b, k));

        a = 1;
        b = 1;
        k = 11;
        System.out.println(solution(a, b, k));
        System.out.println(solution2(a, b, k));

        a = 6;
        b = 11;
        k = 2;
        System.out.println(solution(a, b, k));
        System.out.println(solution2(a, b, k));

        a = 2;
        b = 2;
        k = 10;
        System.out.println(solution(a, b, k));
        System.out.println(solution2(a, b, k));

        a = 2;
        b = 2;
        k = 1;
        System.out.println(solution(a, b, k));
        System.out.println(solution2(a, b, k));

        a = 11;
        b = 345;
        k = 17;
        System.out.println("a: " + a % k);
        System.out.println("b: " + b % k);
        System.out.println("ab: " + (a + b) % k);
        System.out.println(solution(a, b, k));
        System.out.println(solution2(a, b, k));
    }

    public static int solution(int A, int B, int K) {
        if (A > B) return 0;
        int j = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) j++;
        }
        return j;
    }

    private static int solution2(int A, int B, int K) {
        return A % K == 0 || B % K == 0 ? ((B - A) / K) + 1 : ((B - A) / K);
    }
}
