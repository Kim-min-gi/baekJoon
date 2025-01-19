import java.util.*;

class Solution {
    public int[] solution(int brown, int red) {
        int n = brown + red;
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);
                int quotient = n/i;
                if(i != quotient) list.add(quotient); 
            }
        }

        Collections.sort(list);

        int col = 0;
        int row = 0;

        for(int i : list)
            if((col = i) >= (row = (n/i))){
                if((col + col + row - 2 + row - 2) == brown) break;
            }

        return new int[]{col, row};
    }
}