package testing.hackerrank.comparator;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Solution {
    private static List<String> names = Arrays.asList("Donald", "Theresa", "Vladimir", "Angela", "Emmanuel", "Shinzo", "Jacinda", "Kim");
    private static List<Integer> amounts = Arrays.asList(10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 100000000);

    public static void main(String[] args) {

        int n = names.size();
        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(names.get(new Random().nextInt(n)).toLowerCase(),
                    amounts.get(new Random().nextInt(amounts.size())));
        }

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
