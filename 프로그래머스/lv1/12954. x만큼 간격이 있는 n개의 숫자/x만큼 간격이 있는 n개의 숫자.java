class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus = x;
        
        for(int i =0; i<answer.length; i++){
            answer[i] = plus;
            plus += x;
        }
        
        
        return answer;
    }
}