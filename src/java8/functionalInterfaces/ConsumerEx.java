package java8.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import java8.data.Student;
import java8.data.StudentDataBase;

public class ConsumerEx {

    static Consumer<Student> c2 = student -> System.out.println(student.getName());
    static Consumer<Student> c3 = student -> System.out.println(student.getActivities());
    static Consumer<Student> c1 = student -> System.out.println(student);

    public static void printStudents() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c1);
        // StudentDataBase.getAllStudents().forEach(System.out::println);
    }

    public static void nameAndActivities() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2.andThen(c3)); // Consumer Chaining
    }

    public static void nameAndActivitiesUsingCondition() {
        StudentDataBase.getAllStudents().stream().forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                c2.andThen(c3).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        // Consumer<String> c1 = (c) -> System.out.println(c.toUpperCase());
        // c1.accept("java8");
        // printStudents();
        // nameAndActivities();

        nameAndActivitiesUsingCondition();
    }
}
