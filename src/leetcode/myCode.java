package leetcode;

import java.util.Scanner;

class myCode {
    public static String dis(String s1,String s2,int d){
        String r="";
        if(s1.length()<d||s2.length()<d){
            r=s1+s2;
        }
        int r1=s1.length()%d,r2=s2.length()%d;
        for(int i=0;i<s1.length()-d||i<s2.length()-d;i=i+d){
            if(i<s1.length())
                r+=s1.substring(i,i+d);
            if(i<s2.length())
                r+=s2.substring(i,i+d);
        }
        return r+s1.substring(s1.length()-d)+s2.substring(s2.length()-r2);
    }
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        String[] sa = new String[3];
        for(int i=0;i<3;i++){
            sa[i]=sc.next();
        }
        System.out.println(dis(sa[0],sa[1],Integer.parseInt(sa[2])));

    }

}
