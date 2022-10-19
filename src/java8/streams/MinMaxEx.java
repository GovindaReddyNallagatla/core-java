package java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class MinMaxEx {

    public static int getMaxInt() {
        return IntStream.of(6, 7, 8, 9, 12).reduce(0, (x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMax(List<Integer> integers) {
        return integers.stream().reduce((x, y) -> x > y ? x : y);
    }

    public static Optional<Integer> findMin(List<Integer> integers) {
        return integers.stream().reduce((x, y) -> x < y ? x : y);
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        List<Integer> integerList1 = Arrays.asList(6, 7, 8, 9, 12);
        System.out.println(getMaxInt());

        if (findMax(integerList).isPresent()) {
            System.out.println(findMax(integerList).get());
        } else {
            System.out.println("List is empty");
        }

        if (findMin(integerList1).isPresent()) {
            System.out.println(findMin(integerList1).get());
        } else {
            System.out.println("List is empty");
        }

    }
}
