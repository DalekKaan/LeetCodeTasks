package ru.r1b.solution.task56;

import java.util.Arrays;

/**
 * 56. Merge Intervals
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (i1,i2) -> Integer.compare(i1[0], i2[0]));

        int reduced = 0;
        for (int i = 0; i < intervals.length-1; i++) {
            if (intersects(intervals[i], intervals[i+1])) {
                merge(intervals[i+1], intervals[i]);
                intervals[i] = null;
                reduced++;
            }
        }

        int[][] out = new int[intervals.length - reduced][2];
        int counter = 0;
        for (int[] interval : intervals) {
            if (interval != null) {
                out[counter++] = interval;
            }
        }
        return out;

    }

    private void merge(int[] int1, int[] int2) {
        int1[0] = Math.min(int1[0], int2[0]);
        int1[1] = Math.max(int1[1], int2[1]);
    }

    private boolean intersects(int[] int1, int[] int2) {
        return _intersects(int1, int2) || _intersects(int2, int1);
    }

    private boolean _intersects(int[] int1, int[] int2) {
        return (int1[0] >= int2[0] && int1[0] <= int2[1]) || (int1[1] >= int2[0] && int1[1] <= int2[1]);
    }
}
