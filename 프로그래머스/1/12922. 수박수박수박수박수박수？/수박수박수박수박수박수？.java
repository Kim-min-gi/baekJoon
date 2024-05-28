class Solution {
    public String solution(int n) {
        String s = "수박";
        String answer = "";
        
        for(int i =0; i<n; i+=2){
            answer += s;
        }
        
        if(n % 2 != 0){
            answer = answer.substring(0,answer.length() - 1);
        }
        
        return answer;
        
    }
}