class Solution {
    public int solution(int n) {
        int answer = n;
        int nCnt = Integer.bitCount(n);
        
        while(true){
            answer++;
            int resultCnt = Integer.bitCount(answer);
            if(nCnt == resultCnt) break;

        }
        
        
        
        return answer;
    }
}