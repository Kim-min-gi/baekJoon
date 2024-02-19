import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main{


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int result = 0;

        if (n != 0){
            result = 1;
            st = new StringTokenizer(br.readLine());
            int weight = 0;

            while (st.hasMoreTokens()){
                int book_weigt = Integer.parseInt(st.nextToken());
                weight += book_weigt;
                if (weight > m){
                    result++;
                    weight = book_weigt;
                }
            }
        }




        System.out.println(result);

    }

}