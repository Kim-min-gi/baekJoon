class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (!s.equals("1")){
            answer[0]++;

            for(char c : s.toCharArray()){
                if (c == '0') answer[1]++;
            }

            s = s.replaceAll("0","");
            int sLeng = s.length();

            s = Integer.toBinaryString(sLeng);

        }
        
        return answer;
    }
}