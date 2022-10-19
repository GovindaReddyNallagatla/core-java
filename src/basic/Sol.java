package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol {

    public static void soll(int N, int K, List<Integer> A){
        int res = 0;
        if(N==1 && K == 1) res=1;
        List<Integer> b = new ArrayList<>();
        for(int i=0;i<K;i++){
            b.addAll(A);//[1, 3, 1, 2, 1, 3, 1, 2, 1, 3, 1, 2]
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        soll(4,3, Arrays.asList(1,3,1,2));
    }

}
