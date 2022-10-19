package basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountFreq {

    public static int count(String s){
        int count=0;
        String[] sa = s.replaceAll(" ","").split("");
        Arrays.sort(sa);
        for(int i=0;i<sa.length-1;i++){
            if(sa[i].equals(sa[i+1])){
                count++;
            }
        }
        System.out.println(Arrays.toString(sa));
        return count;
    }

    public static void check(String s){
        int c=0;
        String[] sa = s.replaceAll(" ","").split("");
        Map<String,Integer> m = new HashMap<>();
        for(String e:sa)
            if (m.containsKey(e)) {
                m.put(e, m.get(e) + 1);
            } else {
                m.put(e, 1);
            }
        for(Map.Entry e:m.entrySet())
            if((int)e.getValue()==1) c++;
        if(sa.length/2==c){
            System.out.println("All the guidelines are followed by "+s);
        }else{
            System.out.println(s+" does not follow the guidelines given");
        }

    }



    public static void main(String[] args) {
        System.out.println(count("Wifi Pizza sleep"));
        check("Wifi Pizza sleep");
    }
}
