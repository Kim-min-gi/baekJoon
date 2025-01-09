



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;





public class Main {


    public static String getAnswer(int[] arr) {
        int[] tempArr = arr.clone();
        Arrays.sort(tempArr);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] != arr[i]) sb.append(i+1).append(" ");
        }

        return sb.toString();
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         st = new StringTokenizer();
        int n = Integer.parseInt(br.readLine());


        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];

        int index = 0;
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }


        System.out.println(getAnswer(arr));
//        for (int a : arr){
//            System.out.print(a + " ");
//        }
    }
}