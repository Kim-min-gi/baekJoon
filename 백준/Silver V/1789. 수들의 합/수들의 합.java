import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long sum = 0;
        int count = 0;

        while (true){
            sum += count;

            if (sum > n){
                break;
            }else{
                count++;
            }

        }

        System.out.println(count-1);


    }

}