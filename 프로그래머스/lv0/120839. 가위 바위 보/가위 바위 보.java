class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] a =rsp.toCharArray();
        for(int i =0; i<a.length; i++){
            if (a[i] == '2'){
                answer += "0";
            }else if (a[i] == '0'){
                answer += "5";
            }else if (a[i] == '5'){
                answer += "2";
            }
        }
        return answer;
    }
}