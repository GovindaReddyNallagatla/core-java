package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Sol1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ans = 0;
        int n=s.nextInt();
        String sal = s.next();
        String[] a = sal.split(",");
        int[] na = new int[n];
        for(int i=0;i<n;i++)
            na[i] = Integer.parseInt(a[i]);
        Arrays.sort(na);
        System.out.println(Arrays.toString(na));
        if(n%2==0){
            ans = na[n/2 - 1]+na[n/2];
        }else {
            ans = na[(n-1)/2];
        }
        System.out.println(ans);
    }

}
