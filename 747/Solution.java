import java.util.*;

class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int maxIndex = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == maxIndex) {
                continue;
            }
            if (max < 2 * nums[i]) {
                return -1;
            }
        }
        return maxIndex;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.dominantIndex(new int [] {3, 6, 1, 0})); // 1
        System.out.println(s.dominantIndex(new int [] {1, 2, 3, 4})); // -1
        System.out.println(s.dominantIndex(new int [] {1})); // 0
        System.out.println(s.dominantIndex(new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 18})); // 0
    }
}

