package basic;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int constructArray(int n){
        List<Integer> a = new ArrayList<>();
        a.add(n);
        for(int i=n-1;i>0;i--)
            if(n%i==0) a.add(i);
        for(int i=0;i<a.size()-1;i++)
            if(!check(a.get(i),a.get(i+1))) a.remove(a.get(i));
        return a.size();
    }
    public static boolean check(int a, int b){
        if(a%b==0) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(constructArray(3));
    }

}
