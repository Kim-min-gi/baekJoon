import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        for(int i = 1 ; i < N+1 ; i++) {
            int index = Integer.parseInt(st.nextToken());
            arr.add(i-index,i);
        }


        for(int i = 1 ; i < N +1 ; i++) {
            System.out.print(arr.get(i)+ " ");
        }

    }
}