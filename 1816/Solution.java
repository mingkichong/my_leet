import java.util.*;

class Solution {
    public String truncateSentence(String s, int k) {
        String words[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length && i < k; i++) {
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.truncateSentence("Hello how are you Contestant", 4));
        System.out.println(s.truncateSentence("What is the solution to this problem", 4));
        System.out.println(s.truncateSentence("chopper is not a tanuki", 5));
    }
}

