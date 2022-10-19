package java8.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import java8.data.Student;
import java8.data.StudentDataBase;

public class BiFunctionEx {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students,
            stuPredicate) -> {
        Map<String, Double> stuMap = new HashMap<>();
        students.forEach(s -> {
            if (stuPredicate.test(s)) {
                stuMap.put(s.getName(), s.getGpa());
            }
        });
        return stuMap;
    });

    public static void main(String[] args) {

        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentEx.p1));
    }
}
