package hackerrank.interviewprep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class PlusMinus {

    private static void plusMinus(List<Integer> arr) {
        // Write your code here
        int l = arr.size();
        float p=0,n=0,z=0;
        for(int i=0;i<l;i++){
            if(arr.get(i)>0){
                p++;
            }else if(arr.get(i)<0){
                n++;
            }else{
                z++;
            }
        }
        //DecimalFormat df = new DecimalFormat("#.######");
        System.out.println(String.format("%.6f",p/l));
    }

    public static void minAndmax(List<Integer> arr){
        Collections.sort(arr);
        long max = (long)arr.get(4)+(long)arr.get(3)+(long)arr.get(2)+(long)arr.get(1);
        long min = (long)arr.get(0)+(long)arr.get(3)+(long)arr.get(2)+(long)arr.get(1);
        System.out.print(min+" "+max);
    }

    public static String timeConversion(String s) {
        // 12:01:04AM
        String q = s.substring(8);
        String middle = s.substring(2,8);
        String hr = s.substring(0,2);
        if(q.equals("AM") && hr.equals("12")){
            hr="00";
        }else if(q.equals("PM") && hr.equals("12")){
            hr="12";
            return hr+middle;
        }
        if(q.equals("PM")){
            int h = Integer.parseInt(hr)+12;
            hr=String.valueOf(h);
        }
        return hr+middle;
    }


    /**
     * strings=[ab,ab,abc]
     * queries=[ab,abc,bc]
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> l = new ArrayList<>();
        int count = 0;
        // Write your code here
        for(int i=0;i<queries.size();i++){
            for(int j=0;j<strings.size();j++){
                if(queries.get(i).equals(strings.get(j))){
                    count++;
                    System.out.println(queries.get(i)+"   "+strings.get(j)+"  "+count);
                }
            }
            l.add(count);
            count=0;
        }
        return l;
    }

    public static int lonelyinteger(List<Integer> a) {
        // Write your code
        int res = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(Integer i:a){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else {
                m.put(i,1);
            }
        }
        for(Map.Entry e:m.entrySet()){
            if((int)e.getValue()==1){
                res = (int)e.getKey();
            }
        }
        return res;
    }

    public static long flippingBits(long n) {
        // Write your code here

        return 0;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        PlusMinus.plusMinus(arr);
//
//        bufferedReader.close();
        //minAndmax(Arrays.asList(256741038,623958417,467905123,714532089,938071625));

        //System.out.println(timeConversion("12:01:04AM"));
        //System.out.println(matchingStrings(Arrays.asList("ab","ab","abc"),Arrays.asList("ab","abc","bc")));
        System.out.println(lonelyinteger(Arrays.asList(1,2,3,3,1,2,4)));

    }


}
