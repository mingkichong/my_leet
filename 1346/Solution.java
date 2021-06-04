import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] * 2) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.checkIfExist(new int [] {10, 2, 5, 3})); // true
        System.out.println(s.checkIfExist(new int [] {7, 1, 14, 11})); // true
        System.out.println(s.checkIfExist(new int [] {3, 1, 7, 11})); // false
        System.out.println(s.checkIfExist(new int [] { 0 })); // false
    }
}
