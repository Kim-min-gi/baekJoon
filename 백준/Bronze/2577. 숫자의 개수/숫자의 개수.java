import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a = Long.parseLong(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int[] arr = new int[10];

        long result = a * b * c;

        while (result > 0){
            int temp = (int) (result % 10);
            arr[temp] += 1;
            result /= 10;
        }

        for (int cnt : arr){
            System.out.println(cnt);
        }


    }

}