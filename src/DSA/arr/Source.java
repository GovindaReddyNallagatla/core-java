package DSA.arr;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class State {

    public HashMap<String,String> stateMap;

    public State() {
        stateMap=new HashMap<>();
    }

    public HashMap<String,String> addStateCapital(String stateName,String capital){
        this.stateMap.put(stateName,capital);
        return this.stateMap;
    }

    public String getCapital(String stateName){
        if(stateMap.containsKey(stateName)){
            return stateMap.get(stateName);
        }
        return null;
    }

    public String getState(String capital){
        for(Map.Entry<String, String> entry: stateMap.entrySet()) {
            if(entry.getValue() == capital) {
                return entry.getKey();
            }
        }
        return null;
    }

    public HashMap<String,String> swapKeyValue(){
        Map<String, String> newMap = stateMap.entrySet()
                .stream().collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
        return (HashMap<String, String>) newMap;
    }

    @Override
    public String toString() {
        return "State{" +
                "stateMap=" + stateMap +
                '}';
    }


}

public class Source{
    public static void main(String[] args) {

        State s = new State();
        s.addStateCapital("Manipur","Imphal");
        s.addStateCapital("UP","Lucknow");
        System.out.println(s.getCapital("UP"));
        System.out.println(s.getState("Imphal"));
        System.out.println(s.swapKeyValue());

    }
}
