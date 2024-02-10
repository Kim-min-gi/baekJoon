import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s = br.readLine();
       int count = 0;
       char c = s.charAt(0);
       boolean check = true;

       for (int i =1; i<s.length(); i++){
           if (c != s.charAt(i) && check){
               count++;
               check = false;
           }

           if (c == s.charAt(i)){
               check = true;
           }
       }

        System.out.println(count);

    }
}