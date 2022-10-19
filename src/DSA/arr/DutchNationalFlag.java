package DSA.arr;

import java.util.Arrays;

// Given an array of integers 0,1,2(3 ints) sort them in linear time complexity and constant space
//Dijkstra Algo
public class DutchNationalFlag {

    public static int[] sortedArray(int[] a){
        int i=0,j=0;
        int pivot=1;// pivot is the middle number of 3 given numbers
        int k=a.length-1;
        // O(N) linear time complexity
        while(j<=k){
            if(a[j]<pivot){
                swap(a,i,j);
                i++;
                j++;
            }else if (a[j]>pivot){
                swap(a,j,k);
                k--;
            }else {
                j++;
            }
        }
        return a;
    }

    public static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedArray(new int[]{1,2,0,1,0,2,1,2,0})));
    }

}
