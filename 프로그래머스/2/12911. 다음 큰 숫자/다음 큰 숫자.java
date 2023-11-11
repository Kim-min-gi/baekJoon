class Solution {
    public int solution(int n) {
        int answer = n;
        int nCnt = Integer.bitCount(n);
        
        while(true){
            answer++;
            int resultCnt = Integer.bitCount(answer);
            if(nCnt == resultCnt) break;
            // String resultBinary = Integer.toBinaryString(answer).replaceAll("0","");
            // if(resultBinary.equals(nBinary)){
            //     break;
            // }

        }
        
        
        
        return answer;
    }
}