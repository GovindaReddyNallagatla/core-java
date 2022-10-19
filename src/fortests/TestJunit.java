package fortests;

public class TestJunit {

    public String sayHello(){
        return "Hii...";
    }

    public static void main(String[] args) {
        TestJunit tj=new TestJunit();
        System.out.println(tj.sayHello());
    }
}
