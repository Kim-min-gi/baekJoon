import java.util.*;
class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        
        Arrays.sort(sArr, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        
        for(String a : sArr){
            sb.append(a);
        }
        
        return sb.toString();
        
    }
} 