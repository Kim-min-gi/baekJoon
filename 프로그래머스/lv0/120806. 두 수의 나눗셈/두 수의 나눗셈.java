class Solution {
    public int solution(int num1, int num2) {
        double a = num1 / (double)num2;
        a = a * 1000;
        return (int)a;
    }
}