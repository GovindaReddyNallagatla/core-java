package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PossibleCount {

    static void count(int X) {
        int noOfPrimes = 0;
        for (int i = 1; i <= X; i++) {
            int A = i;
            int Z = digits(A);
            int S = sumOfDigitsRaisedToZ(A);
            if (isPrime(S) && digits(S) == Z) {
                noOfPrimes++;
                System.out.println(noOfPrimes + "--" + S);
            }
        }
        System.out.println(noOfPrimes);
    }

    static int digits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    static int sumOfDigitsRaisedToZ(int a) {
        int sum = 0;
        int d = digits(a);

        while (a != 0) {
            int rem = a % 10;
            sum += (int) Math.pow(rem, d);
            a /= 10;
        }
        return sum;
    }

    static int sumOfPrimeFactors(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    static boolean isPrime(int a) {
        if (a <= 1)
            return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }

    static int countOfUniqueChars(int n, String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }

    public static void main(String[] args) {

        // count(2283);
        // System.out.println(sumOfDigitsRaisedToZ(2283));//4209
        // System.out.println(isPrime(2689));

         Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println(sumOfPrimeFactors(n));

        int l = sc.nextInt();
        String s = sc.next();
        System.out.println(countOfUniqueChars(l, s));
    }
}
