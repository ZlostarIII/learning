package testing.stuff;

import java.util.Arrays;

public class StringSplitter {

    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?";
        s = "He is";
        String[] split = splitString(s);

        System.out.println(split.length);
        for (String str : split) {
            System.out.print(str + "\n");
//            System.out.println(str.replaceAll("\n", ""));
        }

//        int[] a = {1, 3, 6, 4, 1, 2};
//        a = new int[]{1, 3, 6, 4, 1, 2};
//        a = new int[]{1, 2, 3};
//        a = new int[]{-1, -2};
//        Arrays.sort(a);
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < a.length - 1; i++) {
//            max = Math.abs(a[i]);
//        }
//        System.out.println(max);
//        System.out.println((max > 0) ? max + 1 : 1);
    }

    private static String[] splitString(String s) {
//        return s.split("\\s|\\W");
        return s.split("\\s");
    }

}
