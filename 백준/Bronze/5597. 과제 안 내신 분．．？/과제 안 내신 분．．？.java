import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[31];
        
        for(int i =0; i<28; i++){
            int a = Integer.parseInt(br.readLine());
            arr[a] = true;
        }
        
        for(int j=1; j<=30; j++){
            if(!arr[j]){
                System.out.println(j);
            }
        }
        
    }
}