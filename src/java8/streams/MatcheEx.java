package java8.streams;

import java8.data.StudentDataBase;

public class MatcheEx {

    public static boolean allmatch() {
        return StudentDataBase.getAllStudents().stream().allMatch(s -> s.getGpa() > 3.9); // false
    }

    public static boolean anymatch() {
        return StudentDataBase.getAllStudents().stream().anyMatch(s -> s.getGpa() > 3.9); // true
    }

    public static boolean nonematch() {
        return StudentDataBase.getAllStudents().stream().noneMatch(s -> s.getGpa() > 4.1); // true
    }

    public static void main(String[] args) {
        System.out.println(allmatch());
        System.out.println(anymatch());
        System.out.println(nonematch());
    }

}
