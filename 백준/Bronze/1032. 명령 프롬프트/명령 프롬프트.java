import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<N; i++){
            arr[i] = br.readLine();
        }

        int length = arr[0].length();

        for (int i = 0; i<length; i++){

            char c = arr[0].charAt(i);
            boolean check = true;

            for (int j = 1; j<N; j++){
                if (c != arr[j].charAt(i)){
                    check = false;
                    break;
                }
            }

            if (check){
                sb.append(c);
            }else{
                sb.append("?");
            }

        }

        System.out.println(sb);


    }

}