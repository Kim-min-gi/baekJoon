class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for(int i =1; i<numLog.length; i++){
          int log = numLog[i] - numLog[i-1];
          if(log == 1) answer += "w";
          else if(log == -1) answer += "s";
          else if(log == 10) answer += "d";
          else if(log == -10) answer += "a";
        }
        
        
        return answer;
    }
}