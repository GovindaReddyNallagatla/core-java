package java8.streams;

import java.util.*;
import java.util.stream.Collectors;

import java8.data.Student;
import java8.data.StudentDataBase;


public class StreamsComparatorEx {

    public static List<Student> sortStudentsByName() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentsByGpa() {
        return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        sortStudentsByName().forEach(s -> System.out.println(s));
        System.out.println("---------------------");
        sortStudentsByGpa().forEach(s -> System.out.println(s));
    }
}
