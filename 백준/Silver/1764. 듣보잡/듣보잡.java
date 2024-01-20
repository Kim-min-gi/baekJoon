import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String,Integer> map = new HashMap<>();
        int nm = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        int count = 0;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();

        for (int i = 0; i<nm; i++){
            String name = br.readLine();
            map.put(name,map.getOrDefault(name,0) + 1);
        }


        for (String name : map.keySet()){
            if (map.get(name) == 2){
                list.add(name);
                count++;
            }
        }

        Collections.sort(list);

        for (String name : list){
            sb.append(name).append('\n');
        }

        System.out.println(count);
        System.out.println(sb);



    }

}