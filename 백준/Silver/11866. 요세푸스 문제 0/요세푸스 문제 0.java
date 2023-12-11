import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        Queue<Integer> que = new LinkedList<>();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for (int i =1; i<=N; i++){
            que.offer(i);
        }

        sb.append('<');

        while (que.size() > 1){

            for (int j=0; j<K-1; j++){
                que.offer(que.poll());
            }

            sb.append(que.poll()).append(", ");
        }

        sb.append(que.poll()).append('>');
        System.out.println(sb);

    }

}