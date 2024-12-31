



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {




    public static String getAnswer(String n,String s) {
        Map<Character,Integer> map = new HashMap<>();
        String answer = "YES";

        for (char c : n.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c : s.toCharArray()){
            if (!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c,map.get(c)-1);
        }

        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String s = br.readLine();

        System.out.println(getAnswer(n,s));
    }
}