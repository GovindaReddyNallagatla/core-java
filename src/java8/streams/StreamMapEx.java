package java8.streams;

import java.util.List;
import java.util.Locale;

import java8.data.Student;
import java8.data.StudentDataBase;

import static java.util.stream.Collectors.toList;
// import static java.util.stream.Collectors.toMap;
// import static java.util.stream.Collectors.toSet;

public class StreamMapEx {

    public static List<String> namesList() {
        return StudentDataBase.
                getAllStudents().stream()
                .map(s->s.getName())
                .map(s->s.toUpperCase())
//                .map(Student::getName)
//                .map(String::toUpperCase)
                .collect(toList());// [ADAM, JENNY, EMILY, DAVE, SOPHIA, JAMES]
    }

    public static void main(String[] args) {
        System.out.println(namesList());
    }
}
