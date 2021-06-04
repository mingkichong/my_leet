import java.util.*;

class Solution {
    public int numDifferentIntegers(String word) {
        StringBuilder sb = new StringBuilder();
        for (char a : word.toCharArray()) {
            sb.append((a >= '0' && a <= '9') ? a : " ");
        }
        Set<String> set = new HashSet<>();
        for (String numStr : sb.toString().split(" ")) {
            if (!numStr.equals("")) {
                set.add(trimLeadingZeroes(numStr));
            }
        }
        return set.size();
    }

    private String trimLeadingZeroes(String numStr) {
        int i = 0;
        while (i < numStr.length() - 1 && numStr.charAt(i) == '0') {
            i++;
        }
        return numStr.substring(i, numStr.length());
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.numDifferentIntegers("a123bc34d8ef34")); // 3
        System.out.println(s.numDifferentIntegers("leet1234code234")); // 2
        System.out.println(s.numDifferentIntegers("a1b01c001")); // 1
        System.out.println(s.numDifferentIntegers("abcdefg")); // 0
        System.out.println(s.numDifferentIntegers("1234567890987654321")); // 1
        System.out.println(s.numDifferentIntegers("0000001a1b000000000000001")); // 1
    }
}
