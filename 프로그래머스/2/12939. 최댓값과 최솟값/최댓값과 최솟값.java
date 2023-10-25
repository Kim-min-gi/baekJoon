import java.util.*;
class Solution {
    public String solution(String s) {
        String[] list = s.split(" ");
        int max , min;
        max = min = Integer.parseInt(list[0]);
        
        for(int i=1; i<list.length; i++){
          max = Math.max(max,Integer.parseInt(list[i]));
          min = Math.min(min,Integer.parseInt(list[i]));
        }
        
        
        String answer = "" + min + " " + max;
        
        
        
        return answer;
    }
}