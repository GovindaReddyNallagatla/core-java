package basic;

import java.util.Arrays;

class LongestIncreasingSubsequenceRecursion {

    private static int longestIncreasingSubsequenceEndingAt(int[] a, int i) {
        if (i == 0) {
            return 1;
        }
        int lisEndingHere = 1;
        for (int j = 0; j < i; j++) {
            if (a[i] > a[j]) {
                lisEndingHere = Math.max(lisEndingHere, longestIncreasingSubsequenceEndingAt(a, j) + 1);
            }
        }
        return lisEndingHere;
    }

    private static int findLengthOfLongestIncreasingSubsequence(int[] a, int n) {
        int lis = 1;
        for (int i = 0; i < n; i++) {
            lis = Math.max(lis, longestIncreasingSubsequenceEndingAt(a, i));
        }
        return lis;
    }

    public static void main(String[] args) {
        System.out.printf("Length of longest increasing subsequence = %d%n",
                findLengthOfLongestIncreasingSubsequence(new int[]{3,9,9,1,10,4,3,3,10,8}, 10-1));

    }
}
