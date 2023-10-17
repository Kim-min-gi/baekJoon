import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> list = new HashSet<>();
        
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int a = numbers[i] + numbers[j];
                list.add(a);
            }
        }
        
        
        return list.stream().sorted().mapToInt(i->i).toArray();
    }
}