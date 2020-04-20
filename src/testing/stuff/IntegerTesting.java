package testing.stuff;

public class IntegerTesting {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(solveMeFirst(a, b));

        a = 2147483647;
        b = 2147483647;
        System.out.println(solveMeFirst(a, b));

        byte c = 127;
        byte d = 127;

//        c += d;
        c = (byte) (c + d);
        System.out.println(c);
    }

    static long solveMeFirst(int a, int b) {
        return (long) a + b;
    }
}
