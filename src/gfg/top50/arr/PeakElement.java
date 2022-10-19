package gfg.top50.arr;

public class PeakElement {

    public static int findPeakEle(int[] a) {
        int left = 0, right = a.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] > a[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // returns the index of the peak ele in the array
        // finds the last peak element in the array
        return left;
    }

    public static void main(String[] args) {
        System.out.println(findPeakEle(new int[] { 1, 1, 3, 5, 33, 5, 46, 7 }));
    }
}
