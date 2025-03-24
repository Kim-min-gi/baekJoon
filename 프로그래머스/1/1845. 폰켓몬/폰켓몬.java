import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = nums.length / 2;

        // 중복제거하기
        HashSet<Integer> numsSet = new HashSet<>();

        for (int num : nums) {
            numsSet.add(num);
        }
        
        if (numsSet.size() < answer) {
          answer = numsSet.size();
        }
        
        return answer;
    }
}