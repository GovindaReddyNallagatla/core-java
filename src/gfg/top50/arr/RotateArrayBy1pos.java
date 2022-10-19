package gfg.top50.arr;

import java.util.Arrays;

public class RotateArrayBy1pos {

    private static int[] rotate(int[] a){
        int n=a.length;
        int t=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=t;
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{2,4,6,1,4,7})));
    }
}
