class Solution {
    public boolean solution(int x) {
      String s = x + "";
      String[] sArr = s.split("");
      int sum = 0;
        
      for(int i =0; i<sArr.length; i++){
          sum += Integer.parseInt(sArr[i]);
      }
        
      if(x % sum == 0) return true;  
        return false;
      
    }
}