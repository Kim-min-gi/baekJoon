import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
      

        Map<Integer,Integer> map = new HashMap<>();

        for (int n : tangerine){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list,Collections.reverseOrder());

        for (int n : list){

            if (sum + n >= k){
                answer++;
                break;
            }else{
                sum += n;
                answer++;
            }

        }
        
        
        return answer;
    }
}