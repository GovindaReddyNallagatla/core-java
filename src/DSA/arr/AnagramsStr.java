package DSA.arr;

import java.util.Arrays;

public class AnagramsStr {

    private static boolean isAnagrams(char[] a,char[] b){
        Arrays.sort(a);
        Arrays.sort(b);

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // O(NlogN)
        System.out.println(isAnagrams("apple".toCharArray(),"leppa".toCharArray()));
    }
}
