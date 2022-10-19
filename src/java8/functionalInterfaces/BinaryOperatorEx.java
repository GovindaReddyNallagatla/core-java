package java8.functionalInterfaces;

import java.util.*;
import java.util.function.BinaryOperator;

public class BinaryOperatorEx { // BiFunction with same type of input and output

    static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;
        System.out.println(binaryOperator.apply(3, 4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("Result of maxBy : " + maxBy.apply(3, 6));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("Result of minBy : " + minBy.apply(3, 6));
    }
}
