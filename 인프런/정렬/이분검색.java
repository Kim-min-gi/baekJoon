



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;





public class Main {

    public static int getAnswer(int m,int[] arr){
        Arrays.sort(arr);
        int lt = 0;
        int rt = arr.length - 1;
        int answer = 0;

        while (lt<=rt){
            int mid = (lt + rt)/2;
            if(arr[mid] == m){
                answer = mid+1;
                break;
            }

            if (arr[mid] > m) rt = mid-1;
            else lt = mid+1;
        }

        return answer;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }


        System.out.println(getAnswer(m,arr));



    }
}