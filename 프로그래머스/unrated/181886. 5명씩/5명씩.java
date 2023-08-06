class Solution {
    public String[] solution(String[] names) {
        int length = names.length % 5 != 0 ? names.length / 5 + 1 : names.length / 5;
        String[] answer = new String[length];
        int index = 0;
        for(int i =0; i<names.length; i+=5){
            answer[index] = names[i];
            index++;
        }
        return answer;
    }
}