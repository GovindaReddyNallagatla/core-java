package leetcode;

import java.util.Arrays;

public class BubbleSortOptimized {

    public static void main(String[] args) {
        int[] arr={23,4,67,45,33,9};
        int i,j,temp,n=arr.length;
        for(i=0;i<n;i++){
            boolean swapped=false;
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
