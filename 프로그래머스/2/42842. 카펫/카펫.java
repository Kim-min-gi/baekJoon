
class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int size = brown + yellow;
        
        for(int i =3; i<size; i++){
            
            int num = size / i;
            
            if(size % i == 0 && num >= 3){
                int col = Math.max(i,num);
                int row = Math.min(i,num);
                
                int center = (col-2) * (row-2);
                
                if(center == yellow){
                    answer[0] = col;
                    answer[1] = row;
                    return answer;
                }
            }
        }
        
        
        return answer;
    }
}