import java.util.*;

class Solution {    
    public int[] solution(String[] genres, int[] plays) {
        
        //많이 재생된 장르
        Map<String,Integer> map = new HashMap<>();
        
        int index = 0;
        for(String s : genres){
            map.put(s,map.getOrDefault(s,0) + plays[index++]);
        }
        
        
        List<String> genList = new ArrayList<>(map.keySet());
        Collections.sort(genList, (o1,o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        
        List<Integer> answerList = new ArrayList<>();
        genList.forEach(g -> {
             Map<Integer,Integer> map2 = new HashMap<>();
             for(int i =0; i<genres.length; i++){
                 if(g.equals(genres[i])){
                     map2.put(i,plays[i]);
                 }
             }
            
            
             List<Integer> playList = new ArrayList<>(map2.keySet());
             Collections.sort(playList, (o1,o2) -> (map2.get(o2).compareTo(map2.get(o1))));
            
             answerList.add(playList.get(0));
             if(playList.size() > 1){
                 answerList.add(playList.get(1));
             }
            
        });
        
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
    
        return answer;
        
    }
}