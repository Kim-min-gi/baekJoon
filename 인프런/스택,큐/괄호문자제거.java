



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static String getAnswer(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();


        for (char c : s.toCharArray()){
            if (c == '(') stack.push(c);
            else{
                if (c == ')') stack.pop();

                if (stack.isEmpty() && c != ')') sb.append(c);
            }
        }

        return sb.toString();
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        System.out.println(getAnswer(s));
    }
}