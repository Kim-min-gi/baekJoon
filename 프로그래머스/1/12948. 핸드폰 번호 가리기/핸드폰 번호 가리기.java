class Solution {
    public String solution(String phone_number) {
        String fourNumber = phone_number.substring(phone_number.length()-4);
        StringBuilder sb = new StringBuilder();

        for (int i =0; i<phone_number.length()-4; i++){
            sb.append("*");
        }

        sb.append(fourNumber);
        
        return sb.toString();
    }
}