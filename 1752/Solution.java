import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count ++;
            }
        }
        return count < 2;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.check(new int[] {3, 4, 5, 1, 2})); // true
        System.out.println(s.check(new int[] {2, 1, 3, 4})); // false
        System.out.println(s.check(new int[] {1, 2, 3})); // true
        System.out.println(s.check(new int[] {1, 1, 1})); // true
        System.out.println(s.check(new int[] {})); // true
    }
}

