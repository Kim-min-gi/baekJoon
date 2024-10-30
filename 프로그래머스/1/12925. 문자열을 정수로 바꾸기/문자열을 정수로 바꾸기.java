class Solution {
    public int solution(String s) {
        int answer = 0;
       
        answer = Integer.parseInt(s.replace("-",""));

        if (s.charAt(0) == '-'){
           answer *= -1;
        }
        
        return answer;
    }
}