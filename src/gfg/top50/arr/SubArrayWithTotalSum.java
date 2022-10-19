package gfg.top50.arr;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithTotalSum {

    private static ArrayList<Integer> subarraySum(int[] arr, int n, int s){
        ArrayList<Integer> isOutput= new ArrayList<>();
        int sum = 0;
        int left = 0 ;
        for (int i = 0; i<=n-1; i++){
            sum = sum + arr[i];
            while(sum >= s){
                if(sum == s){
                    isOutput.add(left+1);
                    isOutput.add(i+1);
                    return isOutput;
                }
                sum = sum - arr[left];
                left =left+1;
            }
        }
        isOutput.add(-1);
        return isOutput;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3,7,5},5,12));// 2,4
        System.out.println(subarraySum(new int[]{1,2,3,4,5,6,7,8,9,10},10,15));// 1,5
        int[] a={2,3,1,4,6};
        int sum= Arrays.stream(a).sum();
    }
}
