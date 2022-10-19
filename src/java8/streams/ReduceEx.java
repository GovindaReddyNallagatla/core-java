package java8.streams;

import java.util.Optional;
// import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import java8.data.Student;
import java8.data.StudentDataBase;

public class ReduceEx {

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
    }

    public static int getNoOfNoteBooks() {
        return StudentDataBase.getAllStudents().stream().filter((stu) -> stu.getGradeLevel() >= 3)
                .map(Student::getNoteBooks)
                // .reduce(0, (a, b) -> a + b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {

        int res = IntStream.rangeClosed(1, 7).filter(i -> i % 2 != 0).reduce(1, (a, b) -> a * b);
        System.out.println(res);// 1*3*5*7 => 105

        OptionalInt res1 = IntStream.rangeClosed(1, 7).filter(i -> i % 2 != 0).reduce((a, b) -> a * b);
        System.out.println(res1.isPresent());
        System.out.println(res1.getAsInt());

        if (getHighestGpaStudent().isPresent()) {
            System.out.println(getHighestGpaStudent().get());
        }

        System.out.println(getNoOfNoteBooks());
    }
}
