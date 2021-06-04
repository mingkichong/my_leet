import java.util.*;

class Solution {
    public int maxRepeating(String sequence, String word) {
        String w = word;
        int count = 0;
        while (w.length() <= sequence.length()) {
            if (sequence.contains(w)) {
                count++;
            } else {
                break;
            }
            w += word;
        }
        return count;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.maxRepeating("ababc", "ab")); // 2
        System.out.println(s.maxRepeating("ababc", "ba")); // 1
        System.out.println(s.maxRepeating("ababc", "ac")); // 0
        System.out.println(s.maxRepeating("aaaaaaaaaaaaaa", "a")); // 14
        System.out.println(s.maxRepeating("a", "aaaaaaaaaaaaaa")); // 0
    }
}
