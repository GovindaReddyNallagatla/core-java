package DSA.arr;

import java.util.Date;

public class Palindrom {

    public static boolean isPalindrome(String s){
        int firstIndex = 0;
        int lastIndex = s.length()-1;
        while(firstIndex<lastIndex){
            if(s.charAt(firstIndex)!=s.charAt(lastIndex))
                return false;
            firstIndex++;
            lastIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        // O(N) time complexity
        System.out.println(isPalindrome("asdfdsa"));
        System.out.println(new Date());
    }
}
