import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        StringTokenizer st;
        
        while( (input =br.readLine()) != null){
            st = new StringTokenizer(input," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            System.out.println(a+b);
        }
        
        
    }
    
}