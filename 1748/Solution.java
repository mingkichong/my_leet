import java.util.*;

class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                sum += entry.getKey();
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.sumOfUnique(new int[] { 1 })); // 1
        System.out.println(s.sumOfUnique(new int[] { 1, 2, 3, 2 })); // 4
        System.out.println(s.sumOfUnique(new int[] { 1, 1, 1, 1, 1 })); // 0
        System.out.println(s.sumOfUnique(new int[] { 1, 2, 3, 4, 5 })); // 15
    }
}

