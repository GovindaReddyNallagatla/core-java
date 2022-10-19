package DSA.arr;

import java.util.*;

class Rain {
    public static int getmaxColors(List<Integer> prices,int money){
        int count =0;
        for(int i =0;i< prices.size();i++){
            int total =0;
            for(int j =i; j<prices.size();j++){
                total += prices.get(i);
                if(total<= money){
                    count = Math.max(count , ((j-i)+1));
                }
            }
        }
        return count;
    }
public static void main (String[] args) {
    int[] arr={2,3,5,1,1,2,1};
    List<Integer> l=new ArrayList<>();
    for(int i:arr){l.add(i);}
    System.out.println(getmaxColors(l,7 ));
}
}