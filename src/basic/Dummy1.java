package basic;

import java.util.*;
public class Dummy1 {

    public static int[] solve(int n,int[] a){
        for(int i=0;i<n-1;i++){
            if(a[i]<a[i+1]){
                a[i] = a[i+1];
            }
        }
        return a;
    }

    public static void countMaxChacolates(int money,int price,int wrappers){
        int ccount = 0;
        int wleft = 0;
        if(money<price)
            return;
        int first = money/price;
        first = first + (first-1)/(wrappers);
        System.out.println(first);
    }

    public static void main(String[] args) {

        countMaxChacolates(39,1,3);

       /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] r = solve(n,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }*/
    }
}

/*
*
    public static void maxGroups(){
        List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        Map<Boolean, List<Integer>> groups =
                intList.stream().collect(Collectors.partitioningBy(s -> s > 6));
        List<List<Integer>> subSets = new ArrayList<List<Integer>>(groups.values());
        List<Integer> lastPartition = subSets.get(1);
        System.out.println(lastPartition);
    }

    public static void solve(int N, List<Integer> A){
        Collections.sort(A);
        int m = 0;
        Map<Integer,List<Integer>> map = new LinkedHashMap<>();

        System.out.println(A);
    }

* */