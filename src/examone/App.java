package examone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
* 5
* 1 2
* 2 4
* 2 4
* 5 3
* 3 5
*
* */
public class App {

    public static int noOfFactors(int n){
        int f = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                f++;
            }
        }
        return f;
    }

    public static int facQueries(int Q,List<List<Integer>> Queries){
        int sum=0;
        for(int i=0;i<Queries.size();i++){
            List<Integer> l = Queries.get(i);
            int k = l.get(1);
            int n = l.get(0);
            //
            for(int j=1;j<=n;j++){
                if(noOfFactors(j)==k){
                    sum++;
                }
            }
    }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = Integer.parseInt(sc.nextLine().trim());
        List<List<Integer>> Queries = new ArrayList<>(Q);
        for(int i=0;i<Q;i++){
            Queries.add(
                    Arrays.asList(sc.nextLine().trim().split(" "))
                            .stream().map(s->Integer.parseInt(s)).collect(Collectors.toList())
            );
        }
        int res=facQueries(Q,Queries);
        System.out.println(res);
    }
}
