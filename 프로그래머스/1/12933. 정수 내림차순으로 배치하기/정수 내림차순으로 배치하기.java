import java.util.*;

class Solution {
    public long solution(long n) {
        String s = n+"";
        String[] sArr = s.split("");
        
        Arrays.sort(sArr);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<sArr.length; i++){
            sb.append(sArr[i]);
        }
        
        return Long.parseLong(sb.reverse().toString());
        
    }
}