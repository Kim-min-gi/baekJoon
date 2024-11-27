class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
       
        for (char c : s.toCharArray()){

            if (c != ' ') {
                int asc;

                char base = Character.isLowerCase(c) ? 'a' : 'A';

                int newPosition = (c- base + n) % 26;
                char alp = (char) (base + newPosition);

                sb.append(alp);

            }else{
                sb.append(" ");
            }

        }
        
        
        
        return sb.toString();
    }
}