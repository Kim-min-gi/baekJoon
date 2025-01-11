



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;





public class Main {

    public static int getCount(int[] arr, int mid){
        int count = 1, sum = 0;
        for (int x : arr){
            if (sum+x > mid){
                count++;
                sum = x;
            }else sum += x;
        }

        return count;
    }


    public static int getAnswer(int m,int[] arr){
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int answer = 0;

        while (lt<=rt){
            int mid = (lt+rt) / 2;
            if (getCount(arr,mid) <= m){
                answer = mid;
                rt = mid - 1;
            }else{
                lt = mid + 1;
            }
        }

        return answer;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }



        System.out.println(getAnswer(m,arr));

//        for (int a : arr){
//            System.out.print(a + " ");
//        }



    }
}