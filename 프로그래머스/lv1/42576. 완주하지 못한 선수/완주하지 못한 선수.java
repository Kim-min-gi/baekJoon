import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> list = new HashMap<>();
        
        for(String s : participant){
            list.put(s,list.getOrDefault(s,0) + 1);
        }
        
        for(String com : completion){
            list.put(com,list.get(com) - 1);
        }
        
        for(String key : list.keySet()){
            if(list.get(key) != 0)  answer = key;
        }
        
        
        
        return answer;
    }
}