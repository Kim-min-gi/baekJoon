import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringBuilder sb = new StringBuilder();
        int leng = Integer.parseInt(br.readLine());
        String quiz[] = new String[leng];
        
        for(int i =0; i<leng; i++){
            quiz[i] = br.readLine();
        }
        
        for(int j=0; j<leng; j++){
            int sum = 0;
            int cnt = 0;
            
            for(int k=0; k<quiz[j].length(); k++){
                    if(quiz[j].charAt(k) == 'O')
                    {
                        cnt++;
                    }else{
                        cnt = 0;
                    }
                    sum += cnt;
                 
                }
            sb.append(sum).append('\n');
        }
        
        System.out.println(sb);
        
    }
}