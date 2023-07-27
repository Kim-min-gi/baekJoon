class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i = 0;
        while(n >= answer){         // n보다 answer이 커질때까지 반복
            answer += numbers[i];   // numbers 합산
            i++;
        }
        return answer;
    }
}