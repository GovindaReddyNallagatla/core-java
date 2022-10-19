package java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingandUnboxing {

    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 13).boxed().collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> ints) {
        return ints.stream().mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {

        List<Integer> intList = boxing();

        System.out.println("Boxing int to Integer : " + boxing());
        System.out.println("Unboxing Integers to ints and sum = " + unBoxing(intList));
    }

}
