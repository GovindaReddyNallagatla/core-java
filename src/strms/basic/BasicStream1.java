package strms.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicStream1 {

    private static Stream<Integer> randomNums =Stream
            .generate(()->(new Random()).nextInt(20));
    private static Stream<Integer> arrayStream =
            Stream.of(new Integer[]{1,2,4,7,33,89,65,3});
    private static Stream<Integer> integerStream =
            Stream.of(1,3,67,33,44,89,23,40);
    // private static IntStream intStream = "123abAB".chars();

//    private static List<Integer> evenInts=integerStream
//            .filter(e->e%2==0)
//            .collect(Collectors.toList());

    private static Integer[] oddInts=integerStream
            .filter(e->e%2!=0)
            .toArray(Integer[]::new);

    static List<String> memberNames = new ArrayList<>();
    static {
        memberNames.add("Amitabh");
        memberNames.add("Shekhar");
        memberNames.add("Aman");
        memberNames.add("Rahul");
        memberNames.add("Shahrukh");
        memberNames.add("Salman");
        memberNames.add("Yana");
        memberNames.add("Lokesh");
    }

    public static void main(String[] args) {
//        randomNums
//                .limit(10) //Output is limited to 10 numbers
//                .forEach(i->System.out.print(i+" "));
//        System.out.println();
//        System.out.println("Stream of array");
//        arrayStream.forEach(i->System.out.print(i+" "));
//        System.out.println("intStream::");
//        intStream.forEach(i-> System.out.print(i+","));//49,50,51,97,98,65,66

//        System.out.println(Arrays.toString(oddInts));
//        memberNames.stream()
//                .filter(m -> m.startsWith("A"))
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
//
//        memberNames.stream()
//                .sorted()
//                .map(String::toUpperCase)
//                .forEach(System.out::println);


//        System.out.println(" --------------Matching------------ ");
//        System.out.println("anyMatch() :-"+
//                memberNames.stream()
//                        .anyMatch(m->m.startsWith("A")));// true
//
//        System.out.println("allMatch() :-"+
//                memberNames.stream()
//                        .allMatch(m->m.startsWith("A")));// false
//
//        System.out.println("noneMatch() :-"+
//                memberNames.stream()
//                        .noneMatch(m->m.startsWith("A")));// false
//
//        System.out.println("Count :- "+memberNames.stream().count());

//        reduce() : returns Optional
        System.out.println("reduce() :-");
        memberNames.stream()
                .reduce((s1,s2)->s1+"@"+s2)
                //Amitabh@Shekhar@Aman@Rahul@Shahrukh@Salman@Yana@Lokesh
                .ifPresent(System.out::println);

    }
}
