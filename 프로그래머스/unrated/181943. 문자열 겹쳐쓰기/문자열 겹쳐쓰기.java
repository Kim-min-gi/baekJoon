class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        char[] arr = my_string.toCharArray();

        for(int i = 0; i<overwrite_string.length(); i++){
            arr[s] = overwrite_string.charAt(i);
            s++;
        }
        answer = String.valueOf(arr);
        

        return answer;
    }
}