import java.util.*;
class Solution {
    public String solution(String s) {
        String[] list = s.split(" ");
        int max = -99999;
        int min = 99999;
        
        for(int i=0; i<list.length; i++){
          max = Math.max(max,Integer.parseInt(list[i]));
          min = Math.min(min,Integer.parseInt(list[i]));
        }
        
        
        String answer = "" + min + " " + max;
        
        
        
        return answer;
    }
}