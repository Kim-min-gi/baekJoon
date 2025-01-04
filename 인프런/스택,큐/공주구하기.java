import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static int getAnswer(int n, int k) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();

        for (int i =1; i<=n; i++){
            que.offer(i);
        }

        int index = 0;
        while (!que.isEmpty()){
            index++;
            if (index % k == 0) {
                que.poll();
            } else {
                que.offer(que.poll());
            }

            if (que.size() == 1) answer = que.poll();

        }


        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());


        System.out.println(getAnswer(n,k));
    }
}