import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

    //    static int answer = Integer.MIN_VALUE;
    static int n,m;


    public void getAnswer(int l,int[] pm){

        if (l == m){
            for (int num : pm) System.out.print(num + " ");
            System.out.println();
        }else{
            for (int i=1; i<=n; i++){
                pm[l] = i;
                getAnswer(l+1,pm);
            }
        }



    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        Main main = new Main();

        int[] pm = new int[m];


        main.getAnswer(0,pm);




    }
}