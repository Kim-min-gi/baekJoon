import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static String getAnswer(String s, String s2) {
        String answer = "NO";
        Queue<Character> que = new LinkedList<>();


        for (char c : s.toCharArray()){
            que.offer(c);
        }


        for (char c : s2.toCharArray()){
            if (!que.isEmpty() && c == que.peek()) que.poll();
        }

        if (que.isEmpty()) answer = "YES";

        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s2 = br.readLine();


        System.out.println(getAnswer(s,s2));
    }
}