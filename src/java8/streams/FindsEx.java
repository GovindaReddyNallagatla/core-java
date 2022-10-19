package java8.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java8.data.Student;
import java8.data.StudentDataBase;

public class FindsEx {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream().filter(s -> s.getGpa() >= 3.9).findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream().filter(s -> s.getGender().equals("female")).findFirst();
    }

    // public static void main(String[] args) {
    //     System.out.println(findAnyStudent());

    //     Map<Integer, Double> map = IntStream.range(10, 20).boxed()
    //             .collect(Collectors.toUnmodifiableMap(t -> t, t -> Math.pow(t, 3)));

    //     // Vector<Integer> v = IntStream.range(10,
    //     // 20).boxed().collect(Collectors.tounmodifiablev)

    //     Set<Integer> v = IntStream.range(10, 20).boxed().collect(Collectors.toUnmodifiableSet());

    //     List<Integer> v1 = IntStream.range(10, 20).boxed().collect(Collectors.toUnmodifiableList());

    // }

}
