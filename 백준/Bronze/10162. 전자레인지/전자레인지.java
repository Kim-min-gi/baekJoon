import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] times = {300,60,10};

        int t = Integer.parseInt(br.readLine());

        for (int i =0; i < times.length; i++){
              if (t / times[i] >= 0){
                  int num = t / times[i];
                  sb.append(num).append(' ');
                  t = t % times[i];
              }
        }

        if (t > 0){
            sb.setLength(0);
            sb.append(-1);
        }

        System.out.println(sb);

    }

}