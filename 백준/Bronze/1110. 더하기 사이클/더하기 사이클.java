import java.io.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int sum = num;
        int count = 0;
        int a,b;
        
        while(true){
            
                a = sum / 10;
                b = sum % 10;
                sum = a+b;
                sum = b*10 + sum%10;
                count++;
            
                if(num == sum){  
                    break;
                }
            
        }
         System.out.println(count);
        
    }
    
}