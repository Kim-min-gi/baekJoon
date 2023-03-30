import java.util.Arrays;
class Solution {
    public int[] solution(int[] emergency) {
        int[] array2 = emergency.clone();
        int[] answer = new int[emergency.length];
        Arrays.sort(array2);
        for(int i =0; i< emergency.length; i++){
            for (int j =0; j< array2.length; j++){
                if(emergency[i] == array2[j]){
                    answer[i] = emergency.length - j;
                }
            }
        }
        return answer;
    }
}