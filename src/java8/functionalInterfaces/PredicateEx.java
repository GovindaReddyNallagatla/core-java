package java8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateEx {

    static Predicate<Integer> p1 = a -> a % 2 == 0;
    static Predicate<Integer> p2 = a -> a % 5 == 0;

    public static void main(String[] args) {

        System.out.println(p1.test(10));
        System.out.println("Predicate AND result : " + p1.and(p2).test(20));
        System.out.println("Predicate OR result : " + p1.or(p2).test(20));
        System.out.println("Predicate NEGATE result : " + p1.and(p2).negate().test(20));

    }
}
