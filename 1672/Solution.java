import java.util.*;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int [] row : accounts) {
            int sum = 0;
            for (int val : row) {
                sum += val;
            }
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.maximumWealth(new int [][] {{1, 2, 3}, {3, 2, 1}})); // 6
        System.out.println(s.maximumWealth(new int [][] {{1, 5}, {7, 3}, {3, 5}})); // 10
        System.out.println(s.maximumWealth(new int [][] {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}})); // 17
    }
}

