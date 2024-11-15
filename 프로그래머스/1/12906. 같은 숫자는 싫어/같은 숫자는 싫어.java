import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> list = new ArrayList<>();

        int index = arr[0];
        list.add(arr[0]);

        for (int num : arr){
            if (index != num){
                list.add(num);
                index = num;
            }
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}