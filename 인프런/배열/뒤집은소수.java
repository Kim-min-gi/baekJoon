



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Main {


    public static void toReverseString(String[] sArr){

        StringBuilder sb;

        for (int i = 0; i<sArr.length; i++){
            sb = new StringBuilder(sArr[i]);

            sArr[i] = sb.reverse().toString();
        }

    }


    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] sArr = br.readLine().split(" ");


        toReverseString(sArr);

        StringBuilder sb = new StringBuilder();
        for (String s : sArr){
            int num = Integer.parseInt(s);
            if (isPrime(num) && num != 1) sb.append(num).append(" ");
        }

        System.out.println(sb);




    }





}