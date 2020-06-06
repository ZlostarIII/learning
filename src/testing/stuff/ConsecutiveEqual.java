package testing.stuff;

import testing.hackerrank.prime.Prime;

import java.util.Arrays;

public class ConsecutiveEqual {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 3, 5, 5, 5, 5, 5, 5, 6, 0, 5, 5, 12, 12, 2, 2, 2, 12, 0};

//        numbers = new int[]{3, 3, 3, 3, 3};
//        numbers = new int[]{2, 2, 3, 3};
//        numbers = new int[]{2, 3, 3, 5, 3, 3, 3};
        System.out.println(Arrays.toString(findConsecutive(numbers)));
    }

    private static int[] findConsecutive(int[] numbers) {
        if (numbers.length <= 1) {
            return new int[]{numbers.length == 0 ? 0 : numbers[0], numbers.length};
        }
        int currNumber = 0;
        int actualMax = 0;
        int currentMax = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentMax++;
            } else {
                currentMax = 1;
            }
            if (currentMax > actualMax) {
                currNumber = numbers[i - 1];
                actualMax = currentMax;
            }
        }
        return new int[]{currNumber, actualMax};
    }
}
