package java8.streams;

import java.util.*;
import java.util.stream.Collectors;

import java8.data.Student;
import java8.data.StudentDataBase;

public class StreamFlatMapEx {

    public static List<String> activities() {
        return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream)
                .collect(Collectors.toList());
    }

    public static List<String> distinctActivities() {
        return StudentDataBase.
                getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static Long countDistinctActivities() {
        return StudentDataBase.getAllStudents().stream().map(Student::getActivities).flatMap(List::stream).distinct()
                .count();
    }

    public static List<String> sortDistinctActivities() {
        return StudentDataBase.
                getAllStudents().stream()
                .map(Student::getActivities).flatMap(List::stream).distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(activities());
        System.out.println("\n distinct \n"+distinctActivities());
        System.out.println(countDistinctActivities());
        System.out.println("\n SORTED \n"+sortDistinctActivities());
    }
}
