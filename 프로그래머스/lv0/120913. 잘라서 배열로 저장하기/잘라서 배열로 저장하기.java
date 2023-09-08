class Solution {
    public String[] solution(String my_str, int n) {
        
        int length = my_str.length() % n != 0 ? 
            my_str.length() / n + 1 : my_str.length() / n;
        
        String[] answer = new String[length];
        
        int index = 0;
        
        for(int i =0; i<my_str.length(); i+=n){
            if(i+n < my_str.length()){
                answer[index] = my_str.substring(i,i+n);
            }else{
                answer[index] = my_str.substring(i,my_str.length());
            }
            
            index++;
        }
        
        
        return answer;
    }
}