class Solution {
    public String solution(int[] food) {
        String answer = "";
        StringBuilder builder = new StringBuilder(answer);
        String reverseBuilder = "";
        
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                builder.append(i);
            }
        }
        
        reverseBuilder = builder.toString();
        builder.append(0);
        builder.reverse();
        reverseBuilder += builder.toString();
       
        
        
        return reverseBuilder;
    }
}