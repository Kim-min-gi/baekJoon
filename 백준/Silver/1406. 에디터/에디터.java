import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        int M = Integer.parseInt(br.readLine());

        Stack<String> lStack = new Stack<>();
        Stack<String> rStack = new Stack<>();

        String[] arr = s.split("");
        for (String str : arr){
            lStack.push(str);
        }

        for (int i =0; i<M; i++){
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c){
                case 'L' :
                        if (!lStack.isEmpty()){
                            rStack.push(lStack.pop());
                        }
                    break;

                case 'D' :
                        if (!rStack.isEmpty()){
                            lStack.push(rStack.pop());
                        }
                    break;

                case 'B' :
                        if (!lStack.isEmpty()){
                            lStack.pop();
                        }

                    break;

                case 'P':
                        char temp = command.charAt(2);
                        lStack.push(String.valueOf(temp));
                    break;

                default: break;
            }

        }

        while (!lStack.isEmpty()){
            rStack.push(lStack.pop());
        }

        while (!rStack.isEmpty()){
            bw.write(rStack.pop());
        }

        bw.flush();
        bw.close();


    }

}