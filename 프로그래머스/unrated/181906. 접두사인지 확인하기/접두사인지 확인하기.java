class Solution {
    public int solution(String my_string, String is_prefix) {
        int anwesr = 0;
        if(my_string.startsWith(is_prefix)){
            anwesr = 1;
        }
        return anwesr;
    }
}