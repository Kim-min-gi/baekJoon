import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {




    public static String getAnswer(int n,int k,int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int lt = 0;
        for (int i =0; i<k-1; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


        for (int i=k-1; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            sb.append(map.size()).append(" ");
            map.put(arr[lt],map.getOrDefault(arr[lt],0)-1);
            if (map.get(arr[lt]) == 0) map.remove(arr[lt]);
            lt++;
        }


        return sb.toString();
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        System.out.println(getAnswer(n,k,arr));
    }
}