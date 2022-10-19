package gfg.top50.arr;

import java.util.Arrays;

/*
Here we use three pointers
low,mid,high

we traverse throught the array with low=0,mid=0and high=array last ele
and stop when the mid crosses the high

case array[mid] => 0 swap array[low] and array[mid] and loww++,mid++
case array[mid] => 1 just mid++
case array[mid] => 2 swap array[high] and array[mid] and high--
we assume that

-> all ele that are left to low pointer are 0s
         and
    all ele that are right to high pointer are 2s
*/
public class DutchNationalFlagAlgo {

    public static void sortColors(int[] a) {
        int low = 0, high = a.length - 1, mid = 0, temp;
        while (mid <= high) {
            switch (a[mid]) {
                case 0:
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                default:
                    break;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        sortColors(new int[] { 1, 2, 0, 2, 2, 1, 0, 2, 1, 1, 0, 2 });
    }
}
