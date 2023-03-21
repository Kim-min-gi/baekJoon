class Solution {
    public int solution(int[] box, int n) {
    int answer = (box[0] / n) * (box[1] / n) * (box[2] / n); // w,h,d 선언 후 넣기해도 됨
        return answer;
    }
}