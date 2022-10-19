package leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/
public class BuyAndSellStocks {

    public static int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    private static int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        /*
         * for(int i=0;i<len;i++){
         * for(int j=i+1;j<len;j++){
         * if(nums[j] ==target - nums[i]){
         * return new int[]{i,j};
         * }
         * }
         * }
         * return null;
         */

        // 2.
        // key - element's value
        // value - element's index
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement))
                return new int[] { i, map.get(complement) };
            map.put(nums[i], i);
        }
        return null;
    }

    /* this code works for only one element is present
     more than one time
     index	0	1	2	3	4	5	6
       arr	2	6	4	1	3	1	5
    arr[0] = 2 –> arr[2] = 4 –> arr[4] = 3 –> arr[3] = 1 –> arr[1] = 6 –> arr[6] = 5 –> arr[5] = 1. 
    */
    public static void checkForDuplicates(int[] a) {
        int tortoise = a[0];
        int hare = a[0];
        while(true){
            tortoise = a[tortoise];
            // hare moves with twice the speed of tortoise
            hare = a[a[hare]];
            if(tortoise == hare)
                break;
        }
        // loop to get to the start point of the cycle
        // as start point will be the duplicate element
        while(tortoise!=hare){
            tortoise = a[tortoise];
            hare = a[hare];
        }
        //System.out.println(tortoise);// duplicate element
        System.out.println("Yes");
    }

    public static void main(String[] args) {
        // System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
        //System.out.println(Arrays.toString(twoSum(new int[] { 3,3, 2, 4 }, 6)));
        checkForDuplicates(new int[]{2,6,4,1,3,1,5,1});
    }

}
