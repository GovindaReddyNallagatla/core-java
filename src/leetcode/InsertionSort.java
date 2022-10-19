package leetcode;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int a[] = { 9, 14, 3, 2, 43, 11, 58, 22 };
        int n=a.length;
//        int i,j,temp,n=a.length;
//        for(i=1;i<n;i++){
//            temp=a[i];
//            j=i-1;
//            while ((j>=0 && temp<=a[j])){
//                a[j+1]=a[j];
//                j--;
//            }
//            a[j+1]=temp;
//        }

        for(int ui=1;ui<n;ui++){
            int newEle = a[ui];
            int p;
            for(p=ui;p>0 && a[p-1]>newEle;p--){
                a[p]=a[p-1];
            }
            a[p]=newEle;
        }

        System.out.println(Arrays.toString(a));
    }
}
