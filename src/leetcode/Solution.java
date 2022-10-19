package leetcode;

import java.util.Scanner;

public class Solution {

    public static int encryptedData(int data,int key){
        int answer = 0;
        String s = Integer.toString(data);
        String s1 = s+s;
        if(key>s.length()){
            key = (s.length())%key-1;
        }
        String res = s.substring(key)+s1.substring(0,key);
        answer =  Integer.parseInt(res);
        return answer;
        }

//        public static int[] maxRevenue(int[][] salesRecord){
//        int[] answer = new int[100];
//            for (int i = 0; i < salesRecord.length; i++) {
//                // Start with first element of the row
//                int max = salesRecord[i][0];
//                for (int j = 0; j < salesRecord[i].length; j++) {
//                    if(max < salesRecord[i][j]){
//                        max = salesRecord[i][j];
//                    }
//                    answer[i] = max;
//                }
//                return answer;
//        }


    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int data = in.nextInt();
//        int key = in.nextInt();
        System.out.println(encryptedData(12345,5));
        int result = encryptedData(56726,14);
        System.out.println(result);



//        int[] a = maxRevenue(salesRecord);
//        for(int i=0;i<a.length;i++){
//            System.out.println(String.format("%d %d %d",a[i]));
//        }



    }
}
