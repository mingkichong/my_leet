import java.util.*;

class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if (nums[start] == target) {
            return 0;
        }
        int leftDistance = Integer.MAX_VALUE;
        for (int i  = 1; start - i >= 0; i++) {
            if (nums[start - i] == target) {
                leftDistance = i;
                break;
            }
        }
        int rightDistance = Integer.MAX_VALUE;
        for (int i  = 1; start + i < nums.length; i++) {
            if (nums[start + i] == target) {
                rightDistance = i;
                break;
            }
        }
        return Math.min(leftDistance, rightDistance);
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.getMinDistance(new int [] {1, 2, 3, 4, 5}, 5, 3)); // 1
        System.out.println(s.getMinDistance(new int [] {1}, 1, 0)); // 0
        System.out.println(s.getMinDistance(new int [] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0)); // 1
    }
}

