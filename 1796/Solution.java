import java.util.*;

class Solution {
    public int secondHighest(String s) {
        boolean [] digits = new boolean[10];
        for (char a : s.toCharArray()) {
            if (a >= '0' && a <= '9') {
                digits[a - '0'] = true;
            }
        }
        boolean isSecond = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i]) {
                if (isSecond) {
                    return i;
                }
                isSecond = true;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.secondHighest("dfa12321afd")); // 2
        System.out.println(s.secondHighest("abc1111")); // -1
        System.out.println(s.secondHighest("abc19")); // 9
        System.out.println(s.secondHighest("abc")); // -1
        System.out.println(s.secondHighest("ck077")); // 0
    }
}

