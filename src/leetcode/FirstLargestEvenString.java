package leetcode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstLargestEvenString {

    public static String findMax(String str){
        int n = str.length();
        int i=0,cur=0,maxlen=0,st=-1;
        while (i<n){
            if(str.charAt(i)==' '){
                if(maxlen<cur){
                    if(maxlen<cur){
                        maxlen=cur;
                        st=i-cur;
                    }
                }
                cur=0;
            }
            else {
                cur++;
            }
            i++;
        }
        if(cur%2==0){
            if(maxlen<cur){
                maxlen=cur;
                st=i-cur;
            }
        }
        if(st==-1){
            return "00";
        }
        return str.substring(st,st+maxlen);
    }


    public static void main(String[] args) {
        String s = "hey";
        String a = "this a sdf sdfsvs sdgasgasgs asgasgasef";
        System.out.println(findMax(a));
    }

}
