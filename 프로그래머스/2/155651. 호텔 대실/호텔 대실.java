import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int[][] arr = new int[book_time.length][2];

        for (int i =0; i<arr.length; i++){
            int startTime = Integer.parseInt(book_time[i][0].replaceAll(":",""));
            int endTime = Integer.parseInt(book_time[i][1].replaceAll(":","")) + 10;

            if (endTime % 100 >= 60){
                endTime += 40;
            }

            arr[i][0] = startTime;
            arr[i][1] = endTime;

        }

        Arrays.sort(arr,(a,b) -> {
            if (a[0] > b[0]) return 1;
            else if (a[0] < b[0]) return -1;
            else {
                if (a[1] > b[1]) return 1;
                else return -1;
            }
        });

        PriorityQueue<Integer> room = new PriorityQueue<>();


        for (int[] time : arr){

            if (room.isEmpty()){
                room.add(time[1]);
                continue;
            }

            int endTime = room.peek();
            if (time[0] >= endTime){
                room.poll();
                room.add(time[1]);
            }else{
                room.add(time[1]);
            }

        }

        return room.size();

    }
}