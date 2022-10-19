package DSA.arr;

import java.util.ArrayList;
import java.util.List;

public class Sol {

    public static int getmaxColors(List<Integer> prices,int money){
        int max = 0;
        int left =0;
        int right = 0;
        while (right < prices.size()) {
            int temp = left;
            int total = 0;
            while (temp < right) {
                total += prices.get(temp);
                if (temp+1 == right) {
                    total+=prices.get(right);
                    break;
                }
                temp++;
            }
            if (total <= money) {
                max = Math.max(max, right-left+1);
            }

            if (total >money) {
                left++;

            } else {
                right++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

//        int[] arr={2,3,5,1,1,2,1};
        int[] arr={10,10,10};
        List<Integer> l=new ArrayList<>();
        for(int i:arr){l.add(i);}
        System.out.println(getmaxColors(l,5));
    }
}
