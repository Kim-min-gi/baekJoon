import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] stringArray = Arrays.stream(numbers).mapToObj(String::valueOf)
                .toArray(String[]::new);


        Arrays.sort(stringArray,(a,b) -> (b+a).compareTo(a+b));

        if (stringArray[0].equals("0")){
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(stringArray).forEach(sb::append);
        
        return sb.toString();
    }
}