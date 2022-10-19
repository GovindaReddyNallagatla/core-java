package basic;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestElementArray {

    private static void secondLargest(int[] a) {
        int largest = 0, secondLargest = 0;
        for (int i : a) {
            if (i > largest) {
                secondLargest = largest; //
                largest = i;
            } else if (i > secondLargest) {
                secondLargest = i;
            }
        }
        System.out.println("Second Largest : " + secondLargest);
    }

    public static void main(String[] args) {
        secondLargest(new int[]{23,43,1});

        List<Integer> list = new ArrayList<>(); // arraylist impl arraylistobject

    }
}
