import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = my_string.toLowerCase();
        char[] c = answer.toCharArray();
        Arrays.sort(c);
        answer = new String(c);
        return answer;
    }
}