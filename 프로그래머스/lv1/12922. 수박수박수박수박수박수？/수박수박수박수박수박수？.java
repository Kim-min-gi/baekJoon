class Solution {
    public String solution(int n) {
        String answer = "";
        String s = "수박";
        
        for(int i =0; i<n; i+=2){
            answer += s;
        }
        
        if(n % 2 != 0){
            answer = answer.substring(0,answer.length() - 1);
        }
        
        return answer;
    }
}