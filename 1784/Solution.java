import java.util.*;

class Solution {
    public boolean checkOnesSegment(String s) {
        int count = 0;
        for (String segment : s.split("0")) {
            if (!segment.equals("")) {
                count++;
            }
        }
        return count == 1;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.checkOnesSegment("1001")); // false
        System.out.println(s.checkOnesSegment("110")); // true
    }
}

