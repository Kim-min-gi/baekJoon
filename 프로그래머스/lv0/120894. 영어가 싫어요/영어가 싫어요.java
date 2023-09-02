class Solution {
    public long solution(String numbers) {
        String[] numbersString = {"zero", "one", "two", "three", "four", 
                                  "five", "six", "seven", "eight", "nine"};
   
        for(int i=0; i<numbersString.length; i++){
            numbers = numbers.replaceAll(numbersString[i],String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}