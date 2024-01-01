import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int A = Math.abs(a);
                int B = Math.abs(b);

                if(A>B){
                    return A-B;
                }else if(A == B){
                    if (a > b) return 1;
                    else return -1;
                }else{
                    return -1;
                }
            }
        });

        for (int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());

            if(num != 0){
                que.offer(num);
            }else{
                if(!que.isEmpty()){
                    sb.append(que.poll()).append('\n');
                }else{
                    sb.append(0).append('\n');
                }

            }

        }

        System.out.println(sb);

    }
}