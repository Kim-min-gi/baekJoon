



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static int getAnswer(String s) {
        Stack<Character> stack = new Stack<>();
        int answer = 0;

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(') stack.push(s.charAt(i));
            else{
                stack.pop();
                if (s.charAt(i-1) == '(') answer += stack.size();
                else answer++;
            }
        }

        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        System.out.println(getAnswer(s));
    }
}