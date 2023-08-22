import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String first = my_string.substring(0,s);
        String subString = my_string.substring(s,e+1);
        StringBuffer sb = new StringBuffer(subString);
        
        sb.reverse();
        
        String answer = first + sb.toString() + my_string.substring(first.length()+sb.length());
        
        return answer;
    }
}