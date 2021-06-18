import java.util.*;

class Solution {
    public int minPartitions(String n) {
        int maxDigit = 0;
        for (char a : n.toCharArray()) {
            int digit = a - '0';
            maxDigit = Math.max(maxDigit, digit);
            if (maxDigit == 9) {
                return 9;
            }
        }
        return maxDigit;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.minPartitions("32"));
        System.out.println(s.minPartitions("82734"));
        System.out.println(s.minPartitions("27346209830709182346"));
        System.out.println(s.minPartitions("12345678987654321"));
        System.out.println(s.minPartitions("1000009"));
    }
}
