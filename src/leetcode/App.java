package leetcode;

import java.util.*;
public class App {

    public static int[] solution(int[] data,int n){
        if(n==0)
            return null;
        Map<Integer,Integer> m = new LinkedHashMap<>();
        for(int i:data){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else {
                m.put(i,1);
            }
            if(m.get(i)>n){
                m.remove(i);
            }
        }
        //Set set = m.entrySet();
        for(Map.Entry e:m.entrySet()){
            System.out.println(e.getKey()+" - "+e.getValue());
        }
        return data;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,2,3,3,4,5,5},1));
    }

}
