import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Solution {
    
    static LocalTime videoTime;
    static LocalTime posTime;
    static LocalTime opStartTime;
    static LocalTime opEndTime;
    
    
    public static LocalTime toTime(String[] arr){
        int m = Integer.parseInt(arr[0]);
        int sec = Integer.parseInt(arr[1]);

        return LocalTime.of(0,m,sec);
    }


    public static void movePrev(){
        int min = posTime.getMinute();
        int sec = posTime.getSecond();

        if (min == 0 && sec < 10){
            posTime = LocalTime.of(0,0,0);
            return;
        }

        posTime = posTime.minusSeconds(10);
    }

    public static void moveNext(){
        posTime = posTime.plusSeconds(10);

        if (posTime.isAfter(videoTime)){
            posTime = videoTime;
        }
    }

    public static void skipOp(){

        if (!posTime.isBefore(opStartTime) && !posTime.isAfter(opEndTime)){
            posTime = opEndTime;
        }

    }
    
    
    
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] videoLen = video_len.split(":");
        String[] posSplit = pos.split(":");
        String[] opStart = op_start.split(":");
        String[] opEnd = op_end.split(":");

        videoTime = toTime(videoLen);
        posTime = toTime(posSplit);
        opStartTime = toTime(opStart);
        opEndTime = toTime(opEnd);

        skipOp();

        for (String s : commands){
            if (s.equals("prev")) movePrev();
            else moveNext();

            skipOp();
        }

        return posTime.format(DateTimeFormatter.ofPattern("mm:ss"));
    }
}