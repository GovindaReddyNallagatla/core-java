package DSA.arr;

import java.util.Arrays;

//Reverse an array
// no extra memory
public class ReverseArray {

    private static void swap(int[] a,int f,int s){
        int temp=a[f];
        a[f]=a[s];
        a[s]=temp;
    }

    private static int[] reverseArray(int[] a){
        int lowIndex=0;
        int highIndex = a.length-1;
        while(lowIndex<highIndex){
            swap(a,lowIndex,highIndex);
            lowIndex++;
            highIndex--;

        }
        return a;
    }

    public static void main(String[] args) {

        int a[]  = {1,2,3,4};
        // in place -> NO EXTRA MEMORY
        // O(N/2) -> O(N)
        System.out.println(Arrays.toString(reverseArray(a)));
    }

}
