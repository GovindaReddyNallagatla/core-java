package basic;

import java.util.Arrays;

public class UserMainCode {

    public  String isPermutation(String input1,String input2){
        String[] s1 = input1.split("");
        String[] s2 = input2.split("");
        String res = "";
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            if(s1[i].equalsIgnoreCase(s2[i])){
                res= "yes";
            }else {
                res= "no";
            }
        }
        return res;
    }


    public static int checkConsecutive(int input1,int[] input2){
        int res=0;
        Arrays.sort(input2);
        int f = input2[0],l=input2[input1-1];
        int ls = l*(l+1)/2;
        int fs= (f-1)*(f)/2;
        int sum = Arrays.stream(input2).sum();
        if(sum == ls-fs) {
            return 1;
        }else {
            return 0;
        }
    }



    public static void main(String[] args) {
        //System.out.println(isPermutation("zdx","daz"));
        System.out.println(checkConsecutive(6,new int[]{1,9,2,4,0,3}));
    }
}
