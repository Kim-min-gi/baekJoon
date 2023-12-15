import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCase = Integer.parseInt(br.readLine());

        for (int i =0; i<testCase; i++){
            st = new StringTokenizer(br.readLine());

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> que = new LinkedList<>();

            st  = new StringTokenizer(br.readLine());


            for (int j = 0; j<N; j++){
                int num = Integer.parseInt(st.nextToken());

                que.add(new int[] {j,num});
            }

            int cnt = 0;

            while (true){
                int[] arr = que.poll();
                boolean chk = true;

                for (int[] a : que){
                    if (a[1] > arr[1]){
                        chk = false;
                        break;
                    }
                }

                if (chk){
                    cnt++;
                    if (arr[0] == M) break;
                }else{
                    que.add(arr);
                }

            }

            System.out.println(cnt);

        }


    }
}