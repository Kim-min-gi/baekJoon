import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        int min = min(a) + min(b);
        int max = max(a) + max(b);

        System.out.println(min + " " +max);


    }

    static int min(String s ){
        return Integer.parseInt(s.replaceAll("6","5"));
    }

    static int max(String s){
        return Integer.parseInt(s.replaceAll("5","6"));
    }
}