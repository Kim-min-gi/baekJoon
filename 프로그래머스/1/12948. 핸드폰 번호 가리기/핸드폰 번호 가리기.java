class Solution {
    public String solution(String phone_number) {
    
        String usingNumber = phone_number.substring(phone_number.length()-4);

        String text = phone_number.substring(0,phone_number.length()-4);

        text = text.replaceAll("[0-9]","*");

        StringBuilder answer = new StringBuilder();
        answer.append(text).append(usingNumber);
        
        return answer.toString();
    }
}