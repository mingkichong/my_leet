import java.util.*;

class Solution {
    public String restoreString(String s, int[] indices) {
        char characters[] = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            characters[indices[i]] = s.charAt(i);
        }
        return new String(characters);
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.restoreString("codeleet", new int[] {4, 5, 6, 7, 0, 2, 1, 3})); // leetcode
        System.out.println(s.restoreString("abc", new int[] {0, 1, 2})); // abc
        System.out.println(s.restoreString("aiohn", new int[] {3, 1, 4, 2, 0})); // nihao
        System.out.println(s.restoreString("aaiougrt", new int[] {4, 0, 2, 6, 7, 3, 1, 5})); // arigatou
        System.out.println(s.restoreString("art", new int[] {1, 0, 2})); // rat
    }
}
