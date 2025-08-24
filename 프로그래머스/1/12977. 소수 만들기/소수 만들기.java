import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
        
        for(int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k = j+1; k<nums.length; k++){
                    if(isPrimeNumber(nums[i] + nums[j] + nums[k])){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
    
    static public boolean isPrimeNumber(int num){
        if(num < 2) return false;
        
        for(int i=2; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
}