



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    static int n,m;
    static int[] chk;
    static int[] pm;

    public void getAnswer(int l,int[] arr){

        if (l == m){
            for (int x : pm) System.out.print(x + " ");
            System.out.println();
        }else{
            for (int i =0; i<n; i++){
                if (chk[i] == 0){
                    chk[i] = 1;
                    pm[l] = arr[i];
                    getAnswer(l+1,arr);
                    chk[i] = 0;
                }
            }
        }


    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int index = 0;
        int[] arr = new int[n];
        while (st.hasMoreTokens()){
            arr[index++] = Integer.parseInt(st.nextToken());
        }

        Main main = new Main();
        chk = new int[n];
        pm = new int[m];

        main.getAnswer(0,arr);


    }
}