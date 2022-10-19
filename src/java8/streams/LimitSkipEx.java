package java8.streams;

import java.util.Optional;
import java.util.stream.IntStream;

public class LimitSkipEx {

    public static int limitRes() {
        return IntStream.of(2, 3, 4, 5, 6).limit(2).reduce((x, y) -> x + y).getAsInt();// 2+3 = 5
    }

    public static int skiptRes() {
        return IntStream.of(2, 3, 4, 5, 6).skip(2).reduce((x, y) -> x + y).getAsInt();// 4+5+6 = 15
    }

    public static void main(String[] args) {
        System.out.println(limitRes());
        System.out.println(skiptRes());
    }

}
