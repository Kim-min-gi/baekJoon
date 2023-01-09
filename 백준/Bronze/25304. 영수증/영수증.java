import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int kind = sc.nextInt();
        int chk = 0;
        for(int i=0; i<kind; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            chk = chk + (a*b);
        }
        
        if(chk == total){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        
        
    }
    
}