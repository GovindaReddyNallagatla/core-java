package gfg.top50.arr;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Largefactorial {

    private static BigInteger fact1(int n){
        BigInteger[] a=new BigInteger[n+1];
        a[0]=BigInteger.ONE;
        for(int i=1;i<=n;i++)
        {
            a[i] = BigInteger.valueOf(i).multiply(a[i-1]);
        }

        return a[a.length-1];
    }

    private static BigInteger fact2(int n){
        if(n==1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(fact2(n-1));
    }

    private static BigInteger fact3(int n){
        LinkedList<Integer> l=new LinkedList<>();
        l.addFirst(1);
        return BigInteger.ONE;
    }

    private static BigDecimal f1(int n){
        return Stream.iterate(1,i->i+1).limit(n)
                .map(i->BigDecimal.valueOf(i))
                .collect(Collectors.toList())
                .parallelStream()
                .reduce((p,c)->p.multiply(c))
                .get();
    }

    public static void factorial(int limit) {
        // Stage 1: Build the list.
        List<Integer> list = new LinkedList<Integer>();
        for(int i = 1; i <= limit; i++) {
            list.add(i);
        }
        //Stage 2: Calculate the factorial.
        BigDecimal factorial = new BigDecimal(1);
        BigDecimal factor = null;
        for(int n : list) {
            factor = new BigDecimal(n);
            factorial = factorial.multiply(factor);
        }
        System.out.println(factorial);
    }



    public static void main(String[] args) {
        //System.out.println(fact1(10000));
        System.out.println("Factorial of 100000 is::");

        //factorial(100000);
        long start=System.currentTimeMillis();
        System.out.println(f1(100000));//13.464 SEC
        long end=System.currentTimeMillis();
        System.out.println("Execution time "+(end-start));
        System.out.println("Ends here");
        //System.out.println(fact2(10000));
    }
}
