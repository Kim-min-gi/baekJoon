import java.util.*;
class Solution
{
    public int solution(String s)
    {
       
        Stack<Character> stack = new Stack<>();
      
        for(char word : s.toCharArray()){
           
            if(!stack.isEmpty() && word==stack.peek()){
                stack.pop();
           
            }else{
                stack.push(word);
            }
        }
      
        return stack.size() > 0 ? 0 : 1;
    }
}