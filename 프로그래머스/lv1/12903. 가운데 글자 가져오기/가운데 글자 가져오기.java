class Solution {
    public String solution(String s) {
        String answer = "";
        int start = 0;
        int end = 0;
        if(s.length() % 2 ==0){
            start = s.length() / 2 -1;
            end = s.length() / 2 + 1;
            answer = s.substring(start,end);
        }else{
            start = s.length() / 2;
            end = start + 1; 
            answer = s.substring(start,end);
        }
        
        return answer;
    }
}