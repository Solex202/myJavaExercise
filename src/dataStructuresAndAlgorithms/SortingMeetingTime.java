package dataStructuresAndAlgorithms;

public class SortingMeetingTime {

    public static Boolean checkMeetingTime(int [] [] meetingTimes){

        for (int i = 0; i < meetingTimes.length-1; i++) {
            int startTime1 = meetingTimes[i][0];
            int startTime2 = meetingTimes[i + 1][0];
            int endTime1 = meetingTimes[i][1];

            if(startTime1 == startTime2){
                return false;
            }

            if(endTime1 > startTime2){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {

        int [][] check = {{2,4}, {7,10}, {10,15}};
        System.out.println(SortingMeetingTime.checkMeetingTime(check));

    }
}
