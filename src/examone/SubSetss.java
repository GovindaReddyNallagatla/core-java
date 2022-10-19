package examone;

import java.util.*;

public class SubSetss {

    public static void subStrings(String s){
        int n = s.length();
        List<String> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                l.add(s.substring(i,j));
            }
        }
        System.out.println(l);
    }

    public static int divisibleSubSeq(List<Integer> a){
        List<List<Integer>> ls = subsets(a);
        int res=0;
        for(int i=1;i<ls.size();i++){
            if(ls.get(i).stream().reduce(0,(p,q)->p+q)%ls.get(i).get(0)==0){
                res++;
            }
        }
        return res;
    }

    public static List<List<Integer>> subsets(List<Integer> nums){
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.size();
        int size = 1<<n;//1*2^n
        for(int i=0;i<size;i++){
            List<Integer> c = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((i >> j) & 1)==1){
                    c.add(nums.get(j));
                }
            }
            output.add(c);
        }
        return output;
    }

    public static void main(String[] args) {
        subStrings("abc");
        System.out.println(divisibleSubSeq(Arrays.asList(1,1,1,1,1)));
    }
}
