import java.util.*;

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        char [] s1Chars = s1.toCharArray();
        Arrays.sort(s1Chars);
        char [] s2Chars = s2.toCharArray();
        Arrays.sort(s2Chars);
        if (!String.valueOf(s1Chars).equals(String.valueOf(s2Chars))) {
            return false;
        }

        int diffCount = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
            }
        }
        return diffCount == 2;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.areAlmostEqual("bank", "kanb")); // true
        System.out.println(s.areAlmostEqual("attack", "defend")); // false
        System.out.println(s.areAlmostEqual("kelb", "kelb")); // true
        System.out.println(s.areAlmostEqual("abcd", "dcba")); // false
        System.out.println(s.areAlmostEqual("caa", "aaz")); // false
    }
}

