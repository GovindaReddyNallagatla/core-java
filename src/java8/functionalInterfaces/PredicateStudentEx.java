package java8.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import java8.data.Student;
import java8.data.StudentDataBase;

public class PredicateStudentEx {

    static Predicate<Student> p1 = stu -> stu.getGradeLevel() >= 3;

    public static void filterStuByGradeLevel() {
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (p1.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStuByGradeLevel();
    }

}
