

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int answer = 1;

        while (true){
            int count = 0;

            for (int num : arr){
                if (answer % num == 0) count++;
            }

            if (count >= 3){
                break;
            }

            answer++;
        }

        System.out.println(answer);




    }


}