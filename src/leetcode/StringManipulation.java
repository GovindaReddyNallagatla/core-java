package leetcode;

public class StringManipulation {

    public static void display(String a,String b){
        String sa[] = a.split("");
        String sb[]=b.split("");
        String op1="",op2="";
        for(int i=0;i<a.length();i++){
            if(b.indexOf(sa[i])<0){
                op1+=sa[i];
            }
        }
        System.out.println(op1);
    }

    public static void main(String[] args) {
        display("BANGALORE","BC");//ANGALORE
        display("BC","ABC");//null
        display("BC","BANGALORE");//C
    }

}
