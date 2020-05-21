package testing.stuff;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class InterviewTask1 {

    int version = 0;
    int[] x;
    int index;

    ArrayList<TreeMap<Integer, Integer>> snaps;

    public static void main(String[] args) {
        int[] x = {1, 5, 7, 2, 5, 9};
        // map to contain first element change

        InterviewTask1 interviewTask1 = new InterviewTask1(x);
    }

    public InterviewTask1(int[] x) {
        this.x = x;
    }

    public void snap() {
        if(x[index] != query(version, index)) {
            snaps.add((TreeMap<Integer, Integer>) new TreeMap<>().put(version, x[index]));
        }

        version += 1;
    }

    public void changeElementAt(int index, int value) {
        x[index] = value;
    }

    public int query(int snapId, int idx) {
        // 1, 5, 10
        // snap = 7
        return snaps.get(idx).ceilingKey(snapId);
    }
}
