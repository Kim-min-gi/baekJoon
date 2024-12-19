import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char c =  br.readLine().charAt(0);
        int count = 0;

        s = s.toUpperCase();
        c = Character.toUpperCase(c);

        for (int i =0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }

        System.out.println(count);

    }

}