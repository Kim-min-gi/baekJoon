class Solution {
    public String solution(String my_string, int[] indices) {
        char[] cArray = my_string.toCharArray();
        
        for(int i =0; i<indices.length; i++){
            cArray[indices[i]] = '-';
        }

        String answer = String.valueOf(cArray).replace("-","");
        
        return answer;
    }
}