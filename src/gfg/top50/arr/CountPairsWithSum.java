package gfg.top50.arr;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class CountPairsWithSum {

    private static int sumPairCount(int[] a, int n, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int s = 0;
        // {1, 5, 7, 1}
        for (int i : a) {
            if (m.containsKey(k - i))
                s += m.get(k - i);

            if (!m.containsKey(i))
                m.put(i, 1);
            else
                m.put(i, m.get(i)+1);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sumPairCount(new int[]{1, 5, 7, 1}, 4, 6));
    }
}
