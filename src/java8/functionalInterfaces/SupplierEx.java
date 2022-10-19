package java8.functionalInterfaces;

import java.util.Arrays;
import java.util.function.Supplier;

import java8.data.Student;

public class SupplierEx {// no input -> gives output

    public static void main(String[] args) {

        Supplier<Student> stuSuplier = () -> new Student("name", 4, 2.5, "gender",
                Arrays.asList("swimming", "basketball", "volleyball"));
        System.out.println(stuSuplier.get());
    }
}
