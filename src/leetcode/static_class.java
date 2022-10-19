package leetcode;

public class static_class {

    static {
        int i=2;
        System.out.println("I am from static block");
    }
    static String name  = "I am variable";

    public void test_method(){
        System.out.println(" I am from instance methond");
    }
    public static void main(String[] args) {
        System.out.println("I am from main method");
        static_class s= new static_class();
        s.test_method();

        System.out.println(static_class.name);
    }
}
