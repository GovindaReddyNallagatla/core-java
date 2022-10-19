package java8.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import java8.data.Student;
import java8.data.StudentDataBase;

public class PredicateAndConsumerEx {

    static Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = s -> s.getGpa() > 3.9;

    static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gradeLevel > 3.9;

    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out
            .println(name + "  :  " + activities);

    // PREDICATE
    public static void printNamesAndActivities() {
        Consumer<Student> consumer = stu -> {
            if (p1.and(p2).test(stu)) {
                biConsumer.accept(stu.getName(), stu.getActivities());
            }
        };

        // BI-PREDICATE
        Consumer<Student> consumer1 = stu -> {
            if (biPredicate.test(stu.getGradeLevel(), stu.getGpa())) {
                biConsumer.accept(stu.getName(), stu.getActivities());
            }
        };

        StudentDataBase.getAllStudents().stream().forEach(consumer);

        StudentDataBase.getAllStudents().stream().filter(p1.and(p2))
                .forEach(s -> System.out.println(s.getName() + " : " + s.getActivities()));
    }

    public static void main(String[] args) {
        printNamesAndActivities();
    }
}
