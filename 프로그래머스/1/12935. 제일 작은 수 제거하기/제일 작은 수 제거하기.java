import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length == 1 ? 1 : arr.length -1;
        int[] answer = new int[length];
        
        if(arr.length == 1){
            answer[0] = -1;
        }else{
            
            int min = arr[0];
            int i = 0;
            
            for(int num : arr){
                if(min > num) min = num;
            }
            
            for(int k=0; k<arr.length; k++){
                if(min != arr[k]){
                    answer[i] = arr[k];
                    i++;
                }
            }
        }
        
        return answer;
    }
}