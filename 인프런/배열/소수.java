



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Main {



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num + 1];
        int count = 0;

        for (int i =2; i<arr.length; i++){
            if (arr[i] == 0) {
                count++;
                for (int j = i; j<arr.length; j+=i){
                    arr[j] = 1;
                }
            }
        }


        System.out.println(count);





    }





}