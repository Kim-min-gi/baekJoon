import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a,b,c,h,mm;
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        h = a * 60 + b + c;
        mm = h % 60 ;
        h = (h / 60) % 24;
        
        System.out.println(h + " " + mm);
        
        
    }
    
}