import java.util.*;

class Solution {
    public String sortSentence(String s) {
        String[] tokens = s.split(" ");
        SortedMap<Integer, String> map = new TreeMap<>();
        for (String token : tokens) {
            String word = token.substring(0, token.length() - 1);
            int order = Integer.parseInt(token.substring(token.length() - 1, token.length()));
            map.put(order, word);
        }
        StringBuilder sb = new StringBuilder();
        for (String word : map.values()) {
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.sortSentence("is2 sentence4 This1 a3"));   // "This is a sentence"
        System.out.println(s.sortSentence("Myself2 Me1 I4 and3"));      // "Me Myself and I"
    }
}
