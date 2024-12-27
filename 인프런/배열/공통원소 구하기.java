



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;


public class Main {




    public static ArrayList<Integer> getAnswer(int[] arr, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0,p2 = 0;
        Arrays.sort(arr);
        Arrays.sort(arr2);

        while (p1 < arr.length && p2 < arr2.length){
            if (arr[p1] == arr2[p2]) {
                list.add(arr[p1]);
                p1++;
                p2++;
            }
            else if (arr[p1] < arr2[p2]) p1++;
            else p2++;
        }


        return list;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine());
        index = 0;
        while (st.hasMoreTokens()){
            arr2[index++] = Integer.parseInt(st.nextToken());
        }


        for (int a : getAnswer(arr,arr2)){
            System.out.print(a + " ");
        }



    }
}