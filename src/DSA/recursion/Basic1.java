package DSA.recursion;

public class Basic1 {

    public String a() {
        return "a " + b();
    }

    public String b() {
        return "b " + c();
    }

    public String c() {
        return "C";
    }

    public static void main(String[] args) {
        Basic1 b = new Basic1();
        System.out.println(b.a());
    }
}
