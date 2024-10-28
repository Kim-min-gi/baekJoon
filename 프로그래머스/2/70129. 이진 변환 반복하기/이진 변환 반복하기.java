class Solution {
    public int[] solution(String s) {
  
        
        int[] answer = new int[2];

        while (!s.equals("1")){
            int length = 0;

            for (char c : s.toCharArray()){
                if (c == '1') length++;
                else answer[1]++;
            }

            s = Integer.toBinaryString(length);
            answer[0]++;
        }
        
        return answer;  
    }
}