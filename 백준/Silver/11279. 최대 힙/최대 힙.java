import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> qr = new PriorityQueue(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num != 0){
                qr.offer(num);
            }else{
                if(qr.isEmpty()){
                    sb.append(0).append('\n');
                }else{
                    sb.append(qr.poll()).append('\n');
                }
            }

        }

        System.out.println(sb);

    }
}