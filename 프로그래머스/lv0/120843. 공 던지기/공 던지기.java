class Solution {
    public int solution(int[] numbers, int k) {
        // 던지는 사람을 구하므로 k-1, 받는 사람을 구하면 그냥 k
        return numbers[2 * (k - 1) % numbers.length];  
    }
}