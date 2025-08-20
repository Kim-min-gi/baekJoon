class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int lastPaintNumber = 0;
        
        for(int number : section){
            if(lastPaintNumber <= number){
                lastPaintNumber = number + m;
                answer++;
            }
        }
        
        return answer;
    }
}