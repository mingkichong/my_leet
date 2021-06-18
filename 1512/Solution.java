import java.util.*;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int count = 0;
        for (int n : map.values()) {
            count += gaussian(n);
        }
        return count;
    }

    private int gaussian(int n) {
        return n * (n - 1) / 2;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.numIdenticalPairs(new int [] {1, 2, 3, 1, 1, 3})); // 4
        System.out.println(s.numIdenticalPairs(new int [] {1, 1, 1, 1})); // 6
        System.out.println(s.numIdenticalPairs(new int [] {1, 2, 3})); // 0
        System.out.println(s.numIdenticalPairs(new int [] {})); // 0
        int nums[] = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 1;
        }
        System.out.println(s.numIdenticalPairs(nums));
    }
}
