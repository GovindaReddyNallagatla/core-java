package gfg.top50.arr;

import java.util.Arrays;

public class WaveArray {
    public static int[] waveform(int[] a){
        for(int i=0;i<=a.length-2;i=i+2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        return a;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(waveform(new int[]{1,2,3,4,5})));
    }
}
