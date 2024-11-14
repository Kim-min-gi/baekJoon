class Solution {
    
    public static int countDivisor(int number){
        int count = 0;
        for (int i =1; i<=number; i++){
            if (number % i == 0) count++;
        }

        return count;
    }
    
    
    public int solution(int left, int right) {
         int sum = 0;


         while (left <= right){
            if(countDivisor(left) % 2 == 0) sum += left;
            else sum -= left;

            left++;
         }
        
         return sum;
    }
}