import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean check = true;
        Arrays.sort(phone_book);
        
        for(int i =0; i<phone_book.length -1 ; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                check = false;
            }
        }

        return check;
        
    }
}