//Given two integer arrays startTime and endTime and given an integer queryTime.
//
//The ith student started doing their homework at the time startTime[i] and finished it at time endTime[i].
//
//Return the number of students doing their homework at time queryTime. More formally, return the number of students where queryTime lays in the interval [startTime[i], endTime[i]] inclusive.
public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime hc = new NumberOfStudentsDoingHomeworkAtAGivenTime();

        // Test case 1
        int[] startTime1 = {1, 2, 3};
        int[] endTime1 = {3, 2, 7};
        int queryTime1 = 4;
        System.out.println(hc.busyStudent(startTime1, endTime1, queryTime1)); // Expected output: 1

        // Test case 2
        int[] startTime2 = {4};
        int[] endTime2 = {4};
        int queryTime2 = 4;
        System.out.println(hc.busyStudent(startTime2, endTime2, queryTime2)); // Expected output: 1

        // Test case 3
        int[] startTime3 = {1, 1, 1, 1};
        int[] endTime3 = {1, 3, 2, 4};
        int queryTime3 = 7;
        System.out.println(hc.busyStudent(startTime3, endTime3, queryTime3)); // Expected output: 0
    }
}


