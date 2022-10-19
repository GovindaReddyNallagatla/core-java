package java8.prac;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App1 {

    public static void main(String[] args) {
        int max = IntStream.
                rangeClosed(1,45)
                .max()
                .getAsInt();

        int min = IntStream.
                rangeClosed(1,45)
                .min()
                .getAsInt();

        double avg = IntStream.range(1,42).average().getAsDouble();

        int sum = IntStream.range(1,20).sum();

        // BOXING -> primitive to Wrapper classes
        List<Integer> boxed = IntStream.rangeClosed(1,20).boxed().collect(Collectors.toList());
        // UNBOXING
        // Wrapper class to primitive stream
        IntStream ins=boxed.stream().mapToInt(Integer::intValue);

        // int to Integer class objs
        List<Integer> intToObj = IntStream.rangeClosed(1,34).mapToObj(i->Integer.valueOf(i)).collect(Collectors.toList());

        long sum1 = IntStream.
                rangeClosed(1, 23)
                .mapToLong(i -> i).sum();

        // iterate
        Stream.iterate(40,i -> i+2).limit(10)
                .forEach(a->System.out.print(a+","));
        //generate
        Stream.generate(() -> "element").limit(10).forEach(System.out::println);

    }
}
