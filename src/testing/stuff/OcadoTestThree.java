package testing.stuff;

import java.util.ArrayList;
import java.util.List;

public class OcadoTestThree {

    public static void main(String[] args) {
        String s = "aabbcc";
        int[] c = {1, 2, 1, 2, 1, 2};
    }

    private static int solution(String S, int[] C) {
        if (S.length() != C.length) return 0;

        char[] characters = S.toLowerCase().toCharArray();
        List<Character> list = new ArrayList<>();

        for (int i = 1; i < characters.length-1; i++) {
            System.out.println(characters[i] != characters[i+1]);
            if(characters[i] != characters[i+1]) {
                list.add(characters[i]);
            }
        }
        list.forEach(System.out::println);

        return 0;
    }

}
