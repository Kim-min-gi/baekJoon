



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {




    public static char getAnswer(int n,String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        char answer = ' ';
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

            Integer i = map.get(c);
            if (max < i){
                max = i;
                answer = c;
            }
        }


        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(getAnswer(n,s));


    }
}