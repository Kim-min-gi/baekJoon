import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] arr1 = new int[arr.length];
        do{
            arr1 = Arrays.copyOf(arr,arr.length);

            for(int i=0; i<arr.length; i++){
                if(arr[i] >= 50 && arr[i] % 2 ==0) arr[i] = arr[i] / 2;
                else if(arr[i] < 50 && arr[i] % 2 !=0) arr[i] = arr[i] * 2 + 1;
            }
            
            answer++;
            
        }while(!Arrays.equals(arr,arr1));
        
        return answer;
    }
}