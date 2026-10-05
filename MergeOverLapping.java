import java.util.ArrayList;
import java.util.Arrays;

public class MergeOverLapping {

    public static void main(String[] args) {

        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {9, 12}
        };

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= end) {

                end = Math.max(end, intervals[i][1]);

            } else {

                result.add(new int[]{start, end});

                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        result.add(new int[]{start, end});

        for (int[] interval : result) {

            System.out.println(
                "[" + interval[0] + ", " + interval[1] + "]"
            );
        }
    }
}