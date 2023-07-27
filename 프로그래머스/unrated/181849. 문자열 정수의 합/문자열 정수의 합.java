class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for(int i = 0; i<num_str.length(); i++){
          char c = num_str.charAt(i);   // char 형태로 뽑아내기
          answer += c - '0';            // ascii 코드로 정수변환
        //answer += (int)(num_str.charAt(i)) - '0'; 한줄로 변경 가능
        }
        return answer;
    }
}