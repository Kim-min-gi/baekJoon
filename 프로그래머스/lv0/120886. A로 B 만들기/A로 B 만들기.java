import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        char[] a = after.toCharArray();
        char[] b = before.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String a1 = new String(a);
        String b1 = new String(b);
        
        if(b1.equals(a1)){
            answer = 1;
        }
        
        
        return answer;
    }
}