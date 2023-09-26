class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total = 0;
        int priceSum = price;
        
        for(int i = 0; i<count; i++){
            total += priceSum;
            priceSum += price;
        }
        
        answer = ((long)money - total) * -1;
        
        
        return answer < 0 ? 0 : answer;
    }
}