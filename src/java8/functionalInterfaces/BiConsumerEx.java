package java8.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import java8.data.StudentDataBase;

public class BiConsumerEx {

    public static void namesAndActivities() {

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out
                .println(name + "    :    " + activities);
        StudentDataBase.getAllStudents().stream()
                .forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        namesAndActivities();
    }
}
