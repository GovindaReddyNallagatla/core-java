package java8.functionalInterfaces;

import java.util.Optional;

import java8.data.Student;
import java8.data.StudentDataBase;

public class Test1 {

    public static void main(String[] args) {

        Optional<Student> stu = StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getName().equalsIgnoreCase("da")).findAny();
        if (stu.isPresent()) {
            System.out.println(stu);
        } else {
            System.out.println("No");
        }
    }

}
