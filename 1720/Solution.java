import java.util.*;

class Solution {
    public int[] decode(int[] encoded, int first) {
        int result [] = new int[encoded.length + 1];
        result[0] = first;
        for (int i = 0; i < encoded.length; i++) {
            result[i + 1] = encoded[i] ^ result[i];
        }
        return result;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.decode(new int[] {1, 2, 3}, 1))); // [1,0,2,1]
        System.out.println(Arrays.toString(s.decode(new int[] {1}, 1))); // [1,0]
        System.out.println(Arrays.toString(s.decode(new int[] {6, 2, 7, 3}, 4))); // [4,2,0,7,4]
    }
}
