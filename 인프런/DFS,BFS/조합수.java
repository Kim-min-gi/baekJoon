



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;




public class Main {

//    static int n,m;
//    static int[] chk;
//    static int[] pm;

    public static int getAnswer(int n,int r){
        if (n == r || r == 0) return 1;
        else return getAnswer(n-1,r-1) + getAnswer(n-1,r);

    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int answer = getAnswer(n,r);

        System.out.println(answer);
    }
}