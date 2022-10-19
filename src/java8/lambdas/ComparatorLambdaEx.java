package java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaEx {

    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {// 0 -> o1 == o2
                                                        // 1 -> o1 > o2// -1 -> 01 < o2
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(3, 2));// 1

        Comparator<Integer> comparator2 = (a, b) -> a.compareTo(b);
        System.out.println(comparator2.compare(8, 4));// 1
    }
}
