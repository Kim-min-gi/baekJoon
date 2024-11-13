import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] sortArr = arr.clone();
        Arrays.sort(sortArr);
        int min = sortArr[0];

        int[] answer = arr.length == 1 ? new int[]{-1} : Arrays.stream(arr).filter(num -> num != min).toArray();
        
        return answer;
    }
}