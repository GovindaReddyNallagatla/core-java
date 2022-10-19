package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Top20 {

    static long factorial(long n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    static int factorialDP(int n) {
        int[] a = new int[n + 1];
        int i; // factorials array
        a[0] = 1;
        for (i = 1; i <= n; i++) {
            a[i] = i * a[i - 1];
        }
        return a[a.length - 1];
    }

    private static void reverseString1(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    private static void reverseString2(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }

    private static void primeOrNot(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    private static boolean isArmstrongNumber(int n) {
        int temp, digits = 0, lastDigit, sum = 0;
        temp = n;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            lastDigit = temp % 10;
            sum += Math.pow(lastDigit, digits);
            temp /= 10;
        }
        return sum == n ? true : false;
    }

    private static void findFreq(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (freq.containsKey(s.charAt(i))) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) + 1);
            } else {
                freq.put(s.charAt(i), 1);
            }
        }

        // While loop
        Iterator itr = freq.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println(me.getKey() + " -> " + me.getValue());
        }
        // Enhanced for loop
        // for(Map.Entry me:freq.entrySet()){
        // System.out.println(me.getKey()+" -> "+me.getValue());
        // }
        // System.out.println(freq);
    }

    private static void fibSeries(int n) {
        int first = 0, second = 0, next = 1;
        for (int i = 0; i < n; i++) {
            first = second;
            second = next;
            next = first + second;
            System.out.print(first + ",");
        }
    }



    public static void main(String[] args) {

        // System.out.println(factorialDP(16));
        // System.out.println(factorial(25));

        // System.out.println(isArmstrongNumber(153));

        // fibSeries(10);
        // reverseString2("Asdfg");
        // primeOrNot(23);
        // findFreq("edfrvdfgtret");
    }

}
