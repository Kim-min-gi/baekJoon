import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        
        boolean[] a = new boolean[10001];
        
        for(int i=1; i<10001; i++){
            int n = number(i);
            
            if(n < 10001){
                a[n] = true;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =1; i<10001; i++){
            if(!a[i]){
                sb.append(i).append('\n');
            }
        }
        
        System.out.println(sb);
    }
    
    public static int number(int num){
        int sum = num;
        
        while(num != 0){
            sum = sum + (num % 10) ;
            num = num / 10;
        }
        
        return sum;
    }
    
    
    
}