class Solution {
    public int solution(String s) {
        String replaceS = s;
        String[] sArr = {"zero","one","two","three","four"
            ,"five","six","seven","eight","nine"};
        
        
        for(int i = 0; i<sArr.length; i++){
           replaceS = replaceS.replaceAll(sArr[i],String.valueOf(i)); 
        }
        
        return Integer.parseInt(replaceS);
    }
}