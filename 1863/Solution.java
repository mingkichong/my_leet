import java.util.*;

class Solution {
    public int subsetXORSum(int[] nums) {
        int count = (int) Math.pow(2, nums.length);
        int sum = 0;
        for (int countIndex = 0; countIndex < count; countIndex++) {
            String binary = addLeadingZeroes(Integer.toBinaryString(countIndex), nums.length);
            sum += XOR(nums, binary);
        }
        return sum;
    }

    private int XOR(int[] nums, String binary) {
        int xor = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                xor ^= nums[i];
            }
        }
        return xor;
    }

    private String addLeadingZeroes(String binary, int wantedLength) {
        String result = binary;
        for (int i = 0; i < wantedLength - binary.length(); i++) {
            result = "0" + result;
        }
        return result;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.subsetXORSum(new int [] {1}));
        System.out.println(s.subsetXORSum(new int [] {1, 3}));
        System.out.println(s.subsetXORSum(new int [] {5, 1, 6}));
        System.out.println(s.subsetXORSum(new int [] {3, 4, 5, 6, 7, 8}));
        System.out.println(s.subsetXORSum(new int [] {20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20}));
        System.out.println(s.subsetXORSum(new int [] {19, 20, 19, 20, 19, 20, 19, 20, 19, 20, 19, 20}));
    }
}
