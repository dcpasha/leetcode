import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
//        int[][] arr = new int[5][2];
//        int[][] arr2d = new int[][]{{1, 3}, {6, 9}};
//        System.out.println(Arrays.deepToString(arr2d));
//        int[][] arr = insert(new int[][]{{1, 3}, {6, 9}}, new int[] {2, 5});
        int[][] arr = insert(new int[][]{{1, 2}, {3, 5}, {6,7}, {8, 10}, {12,16} }, new int[] {4, 8});
        System.out.println(Arrays.deepToString(arr));
//        System.out.println(arr[0][0]);
    } // end main

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new LinkedList<>();
        int i = 0, n = intervals.length;
        // Add intervals that come before the newInterval
        while(i < n && (intervals[i][1] < newInterval[0])) {
            list.add(intervals[i]);
            i++;
        }
        // Figure out rhe overlapping intervals
        while(i < n && (intervals[i][0] <= newInterval[1])) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        list.add(newInterval);

        // Add non overlapping intervals after the newInt
        while(i < n) {
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }


}
