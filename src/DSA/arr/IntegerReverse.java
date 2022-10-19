package DSA.arr;

public class IntegerReverse {

    public static int reversedInt(int n){
        int rev=0,rem=0;
        while(n!=0){
            rem = n % 10;
            rev = rev*10 + rem;
            n/=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        System.out.println(reversedInt(1234));
    }
}
