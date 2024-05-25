class Solution {
    boolean solution(String s) {
      boolean answer;
      int count = 0;
        
      for (int i =0; i<s.length(); i++){
            char c = s.toLowerCase().charAt(i);
            if (c == 'p') count ++;
            if (c == 'y') count --;
      }
        
      if (count == 0) answer = true;
      else answer = false;
      
    
       return answer;
        
    }
}