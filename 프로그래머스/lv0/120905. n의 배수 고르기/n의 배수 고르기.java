class Solution {
    public int[] solution(int n, int[] numlist) { 
        int[] search = new int[numlist.length];
        int count = 0;
        for(int i =0; i<numlist.length; i++){
            if(numlist[i] % n == 0){
                search[count] = numlist[i];
                count++;
            }
        }
        
        int[] answer = new int[count];
        for(int j=0; j<count; j++){
            answer[j] = search[j];
        }
        return answer;
    }
}