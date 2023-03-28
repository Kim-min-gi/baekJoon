class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String s = "";
        for(int i =0; i<array.length; i++){
           s += array[i];
        }
        
        for(int j =0; j<s.length(); j++){
            if(s.charAt(j) == '7') answer++;
        }
        return answer;
    }
}