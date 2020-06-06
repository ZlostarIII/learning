package testing.hackerrank.prime;

import java.util.Arrays;

public class Prime {
    public void checkPrime(int... n) {
        Arrays.stream(n).filter(prime -> {
            if (prime == 0 || prime == 1) return false;
            for (int i = 2; i <= prime / 2; i++) {
                if (prime % i == 0) return false;
            }
            return true;
        }).forEach(prime -> System.out.print(prime + " "));
        System.out.println();
    }

    public void checkPrime2(int... n) {
        for (int i : n) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    boolean isPrime(int prime) {
        if (prime == 0 || prime == 1) return false;
        for (int i = 2; i <= prime / 2; i++) {
            if (prime % i == 0) return false;
        }
        return true;
    }
}

class Solution {

    public static void main(String[] args) {
        int n1 = 2;
        int n2 = 1;
        int n3 = 3;
        int n4 = 4;
        int n5 = 5;
        Prime ob = new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1, n2);
        ob.checkPrime(n1, n2, n3);
        ob.checkPrime(n1, n2, n3, n4, n5);

        ob.checkPrime2(n1);
        ob.checkPrime2(n1, n2);
        ob.checkPrime2(n1, n2, n3);
        ob.checkPrime2(n1, n2, n3, n4, n5);
    }

}
