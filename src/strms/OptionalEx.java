package strms;

import java.util.Optional;

public class OptionalEx {

    public static void main(String[] args) {

        Optional<String> s1 = Optional.ofNullable("Hello world");
        // Creates empty Optional Object
        Optional<String> s2 = Optional.ofNullable(null);
        // Nullpointer Exception
        Optional<String> s3 = Optional.of(null);

        System.out.println(s1);// Optional[Hello world]
        System.out.println(s1.get());// Hello World
        System.out.println(s1.isPresent());// true
        System.out.println(s2.isPresent());// false

        /*
        * orElse
        * orElseGet
        * orElseThrow
        * */

        //orElse


    }

}
