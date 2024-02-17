import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int state = 0;
        int count = 0;

        for(int i =0; i<n; i++){

            int next_milk = Integer.parseInt(st.nextToken());

            if (state == next_milk){
                state++;
                count++;
                if (state > 2){
                    state = 0;
                }
            }


        }

        System.out.println(count);

    }

}