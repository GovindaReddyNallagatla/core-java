package basic;


interface B{ void show();}
interface A{ void show();}
abstract class C{
    // void show(){System.out.println("Abstract");}
    abstract void show();
}

//class AS extends C implements A,B{
//
//    @Override
//    public void show() {
//        System.out.println(" from AS");
//    }
//}

class AS extends C {

    @Override
    public void show() {
        System.out.println(" from AS");
    }


}
public class sfsf {

    public static int countSetBits(int n){
        int count = 0;
        String b = Integer.toBinaryString(n); // 11001

        for(int i=0;i<b.length();i++){
            if(b.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }

    public static int setBitsCount(int n){

        int count = 0;
        while(n>0){
            count = count + (n&1);
            n = n >> 1;
        }
        return count;
    }

    public static String convertString(String s){
        String res = "";
        for(int i=0;i<s.length();i++){
            res += ((int)s.charAt(i) - 96);
        }
        return res;
    }



    public static void main(String[] args) {
//        B b = new AS();
//        b.show();

        // new AS().show();
        // System.out.println(countSetBits(25));
      //  System.out.println(setBitsCount(25));
//        System.out.println((3 & 1)+"  "+(2 & 1));
//        System.out.println(Integer.toBinaryString(1)+"  "+(1 & 1));
//        System.out.println(convertString("abcd"));
    }
}
