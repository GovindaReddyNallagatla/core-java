package java8.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import java8.data.Student;
import java8.data.StudentDataBase;

public class FunctionEx {

    static Function<String, String> f1 = s -> s.toUpperCase();
    static Function<String, String> f2 = s -> s.toUpperCase().concat("default");

    static Function<List<Student>, Map<String, Double>> f3 = students -> {
        Map<String, Double> map1 = new HashMap<>();
        // students.forEach(s -> map1.put(s.getName(), s.getGpa()));
        students.forEach(s -> {
            if (PredicateStudentEx.p1.test(s)) {
                map1.put(s.getName(), s.getGpa());
            }
        });
        return map1;
    };


    public static void main(String[] args) {

        System.out.println(f1.andThen(f2).apply("java8")); // first f1 and then f2
        System.out.println(f1.compose(f2).apply("java8")); // first f2 and then f1

        System.out.println(f3.apply(StudentDataBase.getAllStudents()));
    }
}
