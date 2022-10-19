package strms.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class BasicStream2 {

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

        //findFirst() ==> return the first element from the stream and
        // then it will not process any more elements.
//        System.out.println("findFirst() >> "+memberNames.stream()
//                .filter(m->m.startsWith("L"))
//                .findFirst()
//                .get()
//        );

//        System.out.println("StreamIterated :- ");
//        Stream.iterate(10,n->n+2).limit(10)
//                        .forEach(System.out::println);

//        System.out.println("doubleStream := ");
//        (new Random()).doubles(3).forEach(System.out::println);

        Arrays.stream("as#sd#rf#sc".split("#"))
                .forEach(System.out::println);

        Pattern.compile(",").splitAsStream("a,b,c")
                .skip(1 )
                .forEach(System.out::println);
    }
}
