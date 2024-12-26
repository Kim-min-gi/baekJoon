



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {




    public static ArrayList<Integer> getAnswer(int n, int m, int[] a , int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0,p2 = 0;

        while (p1 < n && p2 < m){
            if (a[p1] < b[p2]) list.add(a[p1++]);
            else list.add(b[p2++]);
        }

        while (p1 < n){
            list.add(a[p1++]);
        }

        while (p2 < m){
            list.add(b[p2++]);
        }

        return list;
    }







    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = Integer.parseInt(br.readLine());
        int[] mArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();



        for (int a : getAnswer(n,m,nArr,mArr)){
            System.out.print(a + " ");
        }


    }
}