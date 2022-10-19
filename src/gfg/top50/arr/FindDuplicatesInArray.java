package gfg.top50.arr;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArray {

    // In O(N) time
    // O(1) space complexity
    private static List<Integer> duplicates(int[] a) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++)
            a[a[i] % a.length] = a[a[i] % a.length] + a.length;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= a.length * 2)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(duplicates(new int[] { 1, 3, 5, 3, 3, 5, 7, 8, 9, 7 }));
    }
}
