import java.util.*;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int peakIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            if (arr[i - 1] > arr[i]) {
                peakIndex = i - 1;
                break;
            }
        }
        // System.out.println(peakIndex);
        if (peakIndex == 0) {
            return false;
        }
        for (int j = peakIndex + 1; j < arr.length; j++) {
            if (arr[j] == arr[j - 1] || arr[j - 1] < arr[j]) {
                return false;
            }
        }
        return true;
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
        System.out.println(s.validMountainArray(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 1})); // false
        System.out.println(s.validMountainArray(new int[] {1, 2, 3, 4, 0, 4, 3, 2, 1})); // false
        System.out.println(s.validMountainArray(new int[] {1, 100, 1})); // false

    }
}

