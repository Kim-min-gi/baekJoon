



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    int[] dis = {1,-1,5};
    int[] chk;
    Queue<Integer> queue = new LinkedList<>();

    public int getAnswer(int n,int m){
        chk = new int[10001];
        chk[n] = 1;
        queue.offer(n);
        int level = 0;

        while (!queue.isEmpty()){
            int length = queue.size();
            for (int i=0; i<length; i++){
                int x = queue.poll();

                for (int j=0; j<3; j++){
                    int nx = x + dis[j];
                    if (nx == m) return level + 1;

                    if (nx >= 1 && nx <= 10000 && chk[nx] == 0){
                        chk[nx] = 1;
                        queue.offer(nx);
                    }

                }

            }

            level++;
        }


        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Main main = new Main();

        System.out.println(main.getAnswer(n,m));




    }
}