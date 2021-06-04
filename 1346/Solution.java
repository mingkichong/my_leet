import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i] * 2, i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]) && map.get(arr[i]) != i) {
                return true;
            }
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

