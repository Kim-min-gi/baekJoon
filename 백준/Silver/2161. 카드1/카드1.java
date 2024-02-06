import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (int i =1; i<=N; i++){
            que.offer(i);
        }

        while (!que.isEmpty()) {
            sb.append(que.poll()).append(' ');
            if (!que.isEmpty()){
                que.offer(que.poll());
            }
        }


        System.out.println(sb);


    }

}