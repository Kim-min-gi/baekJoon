



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static int getAnswer(String s) {
        Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if (Character.isDigit(c)) stack.push(c - '0');
            else{
                int m = stack.pop();
                int n = stack.pop();

                if (c == '+') stack.push(n+m);

                if (c == '-') stack.push(n-m);

                if (c == '*') stack.push(n*m);

                if (c == '/') stack.push(n/m);
            }
        }

        return stack.pop();
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();


        System.out.println(getAnswer(s));
    }
}