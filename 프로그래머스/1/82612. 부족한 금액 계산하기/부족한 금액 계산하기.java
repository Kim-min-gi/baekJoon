class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;
        long answer = 0;
        
        for(int i =1; i<=count; i++){
            sum += (long) price * i;
        }
        
        answer = money - sum;
        
        if(answer < 0) answer = (long) Math.abs(answer);
        else answer = 0;
        
        
        return answer;
        
    }
}