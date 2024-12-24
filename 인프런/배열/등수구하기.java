import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {




    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        Integer[] aArr = Arrays.stream(br.readLine().split(" ")).map(Integer::valueOf).toArray(Integer[]::new);

        StringBuilder sb = new StringBuilder();

        for (int i =0; i<aArr.length; i++){
            int score = 1;
            for (int j =0; j<aArr.length; j++){
                if (aArr[i] < aArr[j]) score++;
            }
            sb.append(score).append(" ");
        }



        System.out.println(sb);


    }
}