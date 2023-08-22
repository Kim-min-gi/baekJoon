class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int length = my_string.length() / m;
        char[][] cArray = new char[length][m];
        int index = 0;
        for(int i =0; i<length; i++){
            for(int j=0; j<m; j++){
                cArray[i][j] = my_string.charAt(index);
                index++;
            }
        }
        
        for(int i =0; i<length; i++){
            answer += cArray[i][c-1];
        }
        
        return answer;
    }
}