import java.util.*;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int peakIndex = 0;
        int left = 0, right = arr.length - 1;
        for (; left < arr.length - 1; left++) {
            if (arr[left] >= arr[left + 1]) {
                break;
            }
        }
        for (; right > 0; right--) {
            if (arr[right - 1] <= arr[right]) {
                break;
            }
        }
        return left == right && left != 0 & right != arr.length - 1;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.validMountainArray(new int[] {2, 1})); // false
        System.out.println(s.validMountainArray(new int[] {3, 5, 5})); // false
        System.out.println(s.validMountainArray(new int[] {0, 3, 2, 1})); // true
        System.out.println(s.validMountainArray(new int[] {0, 1, 2, 3, 4, 5})); // false
        System.out.println(s.validMountainArray(new int[] {5, 4, 3, 2, 1, 0})); // false
        System.out.println(s.validMountainArray(new int[] {1, 1, 1, 1})); // false
        System.out.println(s.validMountainArray(new int[] {5, 4, 3, 2, 1, 2, 3, 4, 5})); // false
        System.out.println(s.validMountainArray(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1})); // true
        System.out.println(s.validMountainArray(new int[] {1, 2, 3, 4, 0, 4, 3, 2, 1})); // false
        System.out.println(s.validMountainArray(new int[] {1, 100, 1})); // true
    }
}

