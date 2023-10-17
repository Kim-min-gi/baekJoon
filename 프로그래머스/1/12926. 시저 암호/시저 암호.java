import java.util.*;
class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        String answer = "";
        
        for(char c : arr){
            
            if(c == ' '){
                answer += c;
            }
            
            if(c >= 'a' && c <= 'z'){
                
                if(c+n > 'z'){ 
                    answer += (char)(c-26+n);
                 }
                else{ 
                    answer += (char)(c+n);
                 }
                
            }else if(c >= 'A' && c <= 'Z'){
                
                if(c+n > 'Z'){ 
                    answer += (char)(c-26+n);
                }
                else{
                    answer += (char)(c+n);
                }
                
            }
            
        }
        
        return answer;
    }
}