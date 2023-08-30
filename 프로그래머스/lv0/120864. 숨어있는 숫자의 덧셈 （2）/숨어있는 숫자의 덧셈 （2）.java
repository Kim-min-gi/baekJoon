class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] ms = my_string.split("[a-zA-Z]+");
        for(int i=0; i<ms.length; i++) {
                if(ms[i].matches("[0-9]+")) answer+=Integer.parseInt(ms[i]);     
            }
        return answer;
    }
}