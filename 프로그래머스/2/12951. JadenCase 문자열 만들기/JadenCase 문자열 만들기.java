import java.util.*;
class Solution {
    public String solution(String s) {
        String[] list = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        
        for(int i =0; i<list.length; i++){
            
            if(flag == true){
                sb.append(list[i].toUpperCase());
            }else{
                sb.append(list[i]);
            }
            
            if(list[i].equals(" ")){
                flag = true;
            }else{
                flag = false;
            }
            
            
        }
        

        
        return sb.toString();
    }
}