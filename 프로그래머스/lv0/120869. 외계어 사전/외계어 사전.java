class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(String dicWord : dic){
            int count = 0;
            for(String s : spell){
                if(dicWord.contains(s)) count++;
            }
            
            if(count == spell.length){
                answer = 1;
                break;
            }
            
        }
        
        return answer;
    }
}