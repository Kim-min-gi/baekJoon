import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<String,Integer> list = new HashMap<>();
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>();
        
        for(int i =0; i<genres.length; i++){
            if(!list.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                list.put(genres[i],plays[i]);
                map.put(i,plays[i]);
                music.put(genres[i],map);
            }else{
                music.get(genres[i]).put(i,plays[i]);
                list.put(genres[i], list.get(genres[i]) + plays[i]);
            }
        }
        
        List<String> keyset = new ArrayList(list.keySet());
        Collections.sort(keyset, (s1, s2) -> list.get(s2) - (list.get(s1)));
        
         for(String key : keyset) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());
 
            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
 
            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }
 
        return answer.stream().mapToInt(i -> i).toArray();
        
    }
}