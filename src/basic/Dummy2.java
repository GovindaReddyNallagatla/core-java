package basic;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Dummy2 {

    public static void dis(){
        System.out.println("zero"+0);
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        l1.add(null);
        System.out.println(l1.hashCode());
        for(String s:l1){
            System.out.println(s);
            for(String ss:l2){
                System.out.println(s+" "+ss);
            }
        }
    }

    public static void main(String[] args) {
        dis();
    }
}
