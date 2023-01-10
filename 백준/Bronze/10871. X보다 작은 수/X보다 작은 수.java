import java.util.StringTokenizer;
import java.io.*;

public class Main{
       public static void main(String[] args) throws IOException{
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           StringTokenizer st = new StringTokenizer(br.readLine());
           int total = Integer.parseInt(st.nextToken());
           int num = Integer.parseInt(st.nextToken());
           
           StringBuilder sb = new StringBuilder();
           st = new StringTokenizer(br.readLine());
           
           
           for(int i=0; i<total; i++){
               int vals = Integer.parseInt(st.nextToken());
               
               if(num > vals){
                   sb.append(vals).append(' ');
               }
           }
           System.out.println(sb);
       }
}