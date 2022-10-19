package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToMapList {

    public static final String fruits="fruits:apple,banana,grapes";
    public static final String veg="veg:carrot,potato";

    public static void getList(String key){
       Arrays.asList(fruits, veg)
                .stream()
                .collect(Collectors.toMap(s -> s.substring(0, s.indexOf(':')),
                        s -> Arrays.asList(s.substring(s.indexOf(':') + 1).split(","))))
               .get(key)
               .forEach(System.out::println);
               //.forEach((k,v)-> System.out.println(k +" -> "+v));
               //.entrySet().forEach(System.out::println) // only for keys
    }

    public static void main(String[] args) {
        getList("fruits");
    }
}
