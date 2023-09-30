import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for(int i =1; i<arr.length; i++){
            if(arr[i-1] == arr[i]){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return list.stream().mapToInt(j->j).toArray();
    }
}