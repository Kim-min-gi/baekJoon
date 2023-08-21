class Solution {
    public String solution(int[] numLog) {
        // String answer = "";
        // for(int i =1; i<numLog.length; i++){
        //   int log = numLog[i] - numLog[i-1];
        //   if(log == 1) answer += "w";
        //   else if(log == -1) answer += "s";
        //   else if(log == 10) answer += "d";
        //   else if(log == -10) answer += "a";
        // }
        // return answer;
        String answer = "";
        for(int i=1; i<numLog.length; i++){
            int j = numLog[i-1] - numLog[i];
            switch(j){
                case -1 : answer+='w'; break;
                case 1 : answer+='s'; break;
                case -10 : answer+='d'; break;
                case 10 : answer+='a'; break;
            }
        }
        return answer;
    }
}