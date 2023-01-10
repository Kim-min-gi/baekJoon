import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int total = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i=1; i<=total; i++){
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": ");
            bw.write(a + " + " + b + " = " + (a+b) + "\n");
        }
        
        br.close();
        bw.flush();
        bw.close();
        
        
    }
    
    
}