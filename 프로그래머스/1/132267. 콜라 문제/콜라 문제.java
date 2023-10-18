class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        
        while(true){
            if(n < a) break;
            
            temp = (n / a) * b;
            n = n % a + temp;
            answer += temp;
        }
        
        return answer;
    }
}