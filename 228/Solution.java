import java.util.*;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        final int N = nums.length;
        List<String> ranges = new ArrayList<>();
        if (nums.length == 0) {
            return ranges;
        }
        if (nums.length == 1) {
            ranges.add("" + nums[0]);
            return ranges;
        }
        int start = nums[0];
        for (int i = 0; i < N - 1 ; i++) {
            int current = nums[i];
            if (current + 1 == nums[i + 1]) {
                continue;
            }
            ranges.add((start == current) ? "" + start :  "" + start + "->" + nums[i]);
            start = nums[i + 1];
        }
        ranges.add((start == nums[N - 1]) ? "" + start :  "" + start + "->" + nums[N - 1]);
        return ranges;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.summaryRanges(new int [] {0, 1, 2, 4, 5, 7})); // ["0->2","4->5","7"]
        System.out.println(s.summaryRanges(new int [] {0, 2, 3, 4, 6, 8, 9})); // ["0","2->4","6","8->9"]
        System.out.println(s.summaryRanges(new int [] {})); // []
        System.out.println(s.summaryRanges(new int [] { -1})); // ["-1"]
        System.out.println(s.summaryRanges(new int [] {0})); // ["0"]
        System.out.println(s.summaryRanges(new int [] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9})); // ["0->9"]
        System.out.println(s.summaryRanges(new int [] { -9, -8, -7, -6, -5, -4, -3, -2, -1, 0})); // ["-9->0"]
    }
}

