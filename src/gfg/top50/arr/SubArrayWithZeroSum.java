package gfg.top50.arr;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

    public static boolean findSubArray(int[] a) {
        Set<Integer> s = new HashSet<>();
        int sum = 0;
        for (int i : a) {
            sum += i;
            if (sum == 0 || i == 0 || s.contains(sum)) {
                return true;
            }
            s.add(sum);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(findSubArray(new int[] { 1, 2, 3, 4, 2, -6 }));
    }
}
