class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        if(arr1Length < arr2Length){
            return -1;
        }else if(arr1Length > arr2Length){
            return 1;
        }else{
            int arr1Sum = 0;
            int arr2Sum = 0;
            for(int i : arr1){
                arr1Sum += i;
            }
            
            for(int j : arr2){
                arr2Sum += j;
            }
            
            if(arr1Sum == arr2Sum){
                return 0;
            }else if(arr1Sum > arr2Sum){
                return 1;
            }else{
                return -1;
            }
            
        }
        
        
    }
}