import java.util.*;

class Solution {
    public boolean checkZeroOnes(String s) {
        int [] longestLengths = new int[2];
        char prev = s.charAt(0);
        int currentLength = 1;
        longestLengths[s.charAt(0) - '0'] = currentLength;
        for (int i = 1; i < s.length(); i++) {
            if (prev == s.charAt(i)) {
                currentLength++;
                longestLengths[prev - '0'] = Math.max(currentLength, longestLengths[prev - '0']);
            } else {
                longestLengths[prev - '0'] = Math.max(currentLength, longestLengths[prev - '0']);
                currentLength = 1;
            }
            prev = s.charAt(i);
        }
        longestLengths[prev - '0'] = Math.max(currentLength, longestLengths[prev - '0']);
        return longestLengths[1] > longestLengths[0];
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.checkZeroOnes("1101"));        // true
        System.out.println(s.checkZeroOnes("111000"));      // false
        System.out.println(s.checkZeroOnes("110100010"));   // false
        System.out.println(s.checkZeroOnes("1"));           // true
        System.out.println(s.checkZeroOnes("0"));           // false
        System.out.println(s.checkZeroOnes("111111111"));   // true
        System.out.println(s.checkZeroOnes("000000000"));   // false
        System.out.println(s.checkZeroOnes("0100011100"));  // false
        System.out.println(s.checkZeroOnes("10"));          // false
        System.out.println(s.checkZeroOnes("100000000"));   // false
        System.out.println(s.checkZeroOnes("011111111"));   // true
    }
}
