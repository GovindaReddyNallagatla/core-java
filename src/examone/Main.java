package examone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] a = new String[n];
        for(int i=0;i<n;i++) {
            a[i] = sc.nextLine();
        }

        for(String s:a){
            if(s.split(" ")[0].equals("Engineer")){
                Engineer e = new Engineer();
                e.setGrade(s.split(" ")[1]);
                e.setSalary(Integer.parseInt(s.split(" ")[2]));
                e.label();
            }else if(s.split(" ")[0].equals("Manager")){
                Manager m = new Manager();
                m.setGrade(s.split(" ")[1]);
                m.setSalary(Integer.parseInt(s.split(" ")[2]));
                m.label();
            }
        }
    }

}
