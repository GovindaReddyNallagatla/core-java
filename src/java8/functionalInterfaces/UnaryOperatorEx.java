package java8.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx { // Function with same type of input and Output

    static UnaryOperator<String> unaryOperator = s -> s.concat("default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java"));
    }
}
