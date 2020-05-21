package testing.stuff;

public class FrogJmp {

    public static void main(String[] args) {
        System.out.println(solution(10, 100, 30));
        System.out.println(solution(10, 12, 30));
        System.out.println(solution(10, 1400000000, 30));
    }

    public static int solution(int X, int Y, int D) {
        return solution3(X, Y, D);
    }

    public static int solution(int X, int Y, int D, int jumps) {
        if (X >= Y) {
            return jumps;
        }
        return solution(X + D, Y, D, jumps + 1);
    }

    public static int solution2(int X, int Y, int D, int jumps) {
        if (X >= Y / 2) {
            return jumps * 2 + 1;
        }
        return solution2(X + D, Y, D, jumps + 1);
    }

    public static int solution3(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y - X) / D);
    }
}
