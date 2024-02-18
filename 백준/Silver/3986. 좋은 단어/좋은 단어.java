import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i=0; i<n; i++){
            String s = br.readLine();
            Stack<Character> stack = new Stack<>();

            for (int j =0; j<s.length(); j++){
                if (stack.isEmpty()){
                    stack.push(s.charAt(j));
                }else{

                    if (stack.peek() == s.charAt(j)){
                        stack.pop();
                    }else{
                        stack.push(s.charAt(j));
                    }

                }
            }

            if (stack.isEmpty()){
                count++;
            }

        }

        System.out.println(count);


    }

}