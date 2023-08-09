class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aPlusb = Integer.parseInt("" + a + b);
        int c = 2 * a * b;
        
        answer = aPlusb > c ? aPlusb : c ;
        
        return answer;
    }
}