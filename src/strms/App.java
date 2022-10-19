package strms;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        IntStream
                .range(0,101) // 0 - 100
                //.rangeClosed(0,100)
                //.of(1,2,3,4)
                .filter(x -> x%2==0)
                .forEach(System.out::println);
    }


}
