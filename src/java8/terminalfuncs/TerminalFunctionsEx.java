package java8.terminalfuncs;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import java8.data.Student;
import java8.data.StudentDataBase;

public class TerminalFunctionsEx {

    public static List<String> mapping_ex() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
    }

    public static long counting_ex() {
        return StudentDataBase.getAllStudents().stream().filter(s -> s.getGender().equals("male"))
                .collect(Collectors.counting());
    }

    public static String joining_ex() {
        return StudentDataBase.getAllStudents().stream().map(Student::getName).collect(Collectors.joining("-"));
    }

    public static Optional<Student> minBy_ex() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {

        System.out.println(" mapping_ex() -> " + mapping_ex());// mapping_ex() -> [Adam, Jenny, Emily, Dave, Sophia,
                                                               // James]

        System.out.println(" counting_ex() -> " + counting_ex());

        System.out.println("joining_ex() -> " + joining_ex());// Adam-Jenny-Emily-Dave-Sophia-James

        System.out.println("minBy_ex() -> " + minBy_ex());// Optional[Student{name='Sophia', gradeLevel=4, gpa=3.5,
                                                          // gender='female', activities=[swimming, dancing, football]}]
    }

}
