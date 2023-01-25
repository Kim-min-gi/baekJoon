import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int arr[];
        
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i =0; i<num; i++){
            
            st = new StringTokenizer(br.readLine());
            
            int stdNum = Integer.parseInt(st.nextToken());
            arr = new int[stdNum];
            double sum = 0;
            
            for(int j=0; j<stdNum; j++){
               int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
            }
            
            double avg = (sum/stdNum);
            double count = 0;
            
            for(int k=0; k<stdNum; k++){
                if(arr[k] > avg) count++;
            }
            
            System.out.printf("%.3f%%\n",(count/stdNum)*100);
        }

    }
    
}