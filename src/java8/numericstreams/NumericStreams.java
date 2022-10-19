package java8.numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreams {

    public static int findSumOfInts(List<Integer> listInts) {
        return listInts.stream().reduce(0, (x, y) -> x + y); // Unboxing Integer to int type here..
    }

    public static int findSumOfIntsWithoutUnboxing() {
        return IntStream.rangeClosed(1, 6).sum();
    }

    public static void main(String[] args) {
        System.out.println(findSumOfInts(Arrays.asList(1, 2, 3, 4, 5, 6)));
        System.out.println(findSumOfIntsWithoutUnboxing());

        int sum1 = IntStream.rangeClosed(1, 100).sum();

        OptionalInt max = IntStream.rangeClosed(1, 100).max();
        System.out.println(max.isPresent() ? max : "no max found");

        OptionalInt min = IntStream.rangeClosed(30, 122).min();
        // int min1 = IntStream.rangeClosed(30, 122).min().getAsInt();
        System.out.println(min.isPresent() ? min : "no min found");

        OptionalDouble average = IntStream.range(1, 20).average();
        System.out.println(average.isPresent() ? average : "no average found");
    }

}
