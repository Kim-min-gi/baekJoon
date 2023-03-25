class Solution {
    public int solution(int num, int k) {
        String nums = Integer.toString(num);
        String k1 = Integer.toString(k);
        if(nums.indexOf(k1) == -1){
            return -1;
        }{
            return nums.indexOf(k1) + 1;
        }
        
        
    }
}