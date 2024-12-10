import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = false;

         Stack<Character> stack = new Stack<>();

       for (char c : s.toCharArray()){
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty() && c == ')') return answer;
                stack.pop();
            }
        }
        
        if (stack.isEmpty()) answer = true;
        
        return answer;
    }
}