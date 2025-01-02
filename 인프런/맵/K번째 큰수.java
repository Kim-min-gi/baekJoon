



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static int getAnswer(int n,int k,int[] arr) {
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());
        int answer = -1;

        for (int i =0; i<n-2; i++){
            for (int j=i+1; j<n-1; j++){
                for (int m =j+1; m<n; m++){
                    tset.add(arr[i] + arr[j] + arr[m]);
                }
            }
        }

        int index = 0;
        for (int a : tset){
            index++;
            if (index == k) return a;
        }

        return answer;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }


        System.out.println(getAnswer(n,k,arr));
    }
}