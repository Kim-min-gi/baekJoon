import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> map = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int max = 0;

        for(int i =0; i<n; i++){
            String key = br.readLine();
            if (map.containsKey(key)){
                map.put(key,map.get(key) + 1);
            }else{
                map.put(key,1);
            }
            max = Math.max(max,map.get(key));
        }

        List<String> list = new ArrayList<>();

        for (String key : map.keySet()){
            if (max == map.get(key)){
                list.add(key);
            }
        }

        Collections.sort(list);

        System.out.println(list.get(0));


    }


}