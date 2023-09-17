import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length == 1 ? 1 : arr.length - 1;
        int[] answer = new int[length];
        int min = arr[0];
        
        
        if(answer.length == 1){
            answer[0] = -1;
        }else {

            for(int i : arr){
                if(min > i){
                    min = i;
                }
            }


            int index = 0;
            for(int k=0; k<arr.length; k++){
                if(min != arr[k]){
                    answer[index] = arr[k];
                    index++;
                }
            }
            
        }
        
        return answer;
    }
}