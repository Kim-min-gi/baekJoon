



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;





public class Main {

    public static int getCount(int[] arr, int mid){
        int count = 1;
        int endPoint = arr[0];

        for (int i =1; i<arr.length; i++){
            if (arr[i] - endPoint >= mid){
                count++;
                endPoint = arr[i];
            }
        }

        return count;
    }


    public static int getAnswer(int n,int m,int[] arr){
        Arrays.sort(arr);
        int lt = 1;
        int rt = arr[n-1];
        int answer = 0;

        while (lt<=rt){
            int mid = (lt+rt) / 2;
            if (getCount(arr,mid) >= m){
                answer = mid;
                lt = mid + 1;
            }else{
                rt = mid - 1;
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



        System.out.println(getAnswer(n,m,arr));

//        for (int a : arr){
//            System.out.print(a + " ");
//        }



    }
}