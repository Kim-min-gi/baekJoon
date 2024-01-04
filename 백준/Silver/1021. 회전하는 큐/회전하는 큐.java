import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        LinkedList<Integer> dq = new LinkedList<>();

        for (int i =0; i<N; i++){
            dq.offer(i+1);
        }

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[M];


        for (int i = 0; i<M; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }


        for(int i =0;i<M;i++){
            int index = dq.indexOf(arr[i]);
            int half_index;

            if (dq.size() % 2 == 0){
                half_index = dq.size() / 2 - 1;
            }else{
                half_index = dq.size() / 2;
            }

            if(index <= half_index){
                for (int j =0; j<index; j++){
                    int tmp = dq.pollFirst();
                    dq.offerLast(tmp);
                    count++;
                }
            }else{
                for (int j =0 ; j< dq.size() - index; j++){
                    int tmp = dq.pollLast();
                    dq.offerFirst(tmp);
                    count++;
                }
            }
            dq.pollFirst();
        }

        System.out.println(count);

    }
}