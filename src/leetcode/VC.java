package leetcode;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class VC {

    public static String dis(String s){
        String v="",res="",c="";
        int fi=0,li=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                v+=s.charAt(i);
            }else {
                c+=s.charAt(i);
            }
        }
        String vl="",cl="";
         if(v.length()==0){
             vl="NA";
             fi=-1;
         }else {
             vl = Stream.of(v.split("")).sorted().collect(Collectors.joining());
             fi = s.indexOf(vl.charAt(0));
         }
         if(c.length()==0){
             cl="NA";
             li=-1;
         }else{
             cl = Stream.of(c.split("")).sorted().collect(Collectors.joining());
             li = s.lastIndexOf(cl.charAt(cl.length()-1));
         }
        res= vl+String.valueOf(fi)+cl+String.valueOf(li);
        return res;
    }

    public static void main(String[] args) throws java.lang.Exception{
        Scanner s=new Scanner(System.in);
        String inp = s.next();
        System.out.println(dis(inp));

    }
}
