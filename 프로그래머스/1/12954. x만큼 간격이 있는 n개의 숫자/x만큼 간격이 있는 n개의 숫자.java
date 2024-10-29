class Solution {
    public long[] solution(int x, int n) {
        long temp = x;
        long[] answer = new long[n];

        for (int i =0; i<n; i++){
            answer[i] = temp;
            temp += x;
        }
        
        
        return answer;
    }
}