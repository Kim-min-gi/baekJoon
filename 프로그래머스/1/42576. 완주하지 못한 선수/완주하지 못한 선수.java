import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer> list = new HashMap<>();
        
        for(String key : participant){
            list.put(key,list.getOrDefault(key,0)+1);
        }
        
        for(String key : completion){
            list.put(key,list.get(key)-1);
        }
        
        for(String key : list.keySet()){
            if(list.get(key) != 0) answer = key;
        }
        
       
        return answer;
    }
}