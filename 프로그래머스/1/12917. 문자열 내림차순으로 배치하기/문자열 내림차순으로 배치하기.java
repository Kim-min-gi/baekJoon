import java.util.*;
class Solution {
    public String solution(String s) {
        
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        StringBuilder sb = new StringBuilder(new String(sArr));
        
        return sb.reverse().toString();
        
    }
}