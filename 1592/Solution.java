import java.util.*;

class Solution {
    public String reorderSpaces(String text) {
        StringTokenizer st = new StringTokenizer(text);
        StringBuilder sb = new StringBuilder();
        int wordCount = st.countTokens();
        int spaceCount = countSpaces(text);
        if (wordCount == 1) {
            sb.append(st.nextToken());
            for (int i = 0; i < spaceCount; i++) {
                sb.append(" ");
            }
            return sb.toString();
        }
        int gapSpaces = spaceCount / (wordCount - 1);
        int appendedSpaces = 0;
        for (int wordIndex = 0; wordIndex < wordCount - 1; wordIndex++) {
            sb.append(st.nextToken());
            for (int i = 0; i < gapSpaces; i++) {
                sb.append(" ");
                appendedSpaces++;
            }
        }
        sb.append(st.nextToken());
        for (int i = 0; i < spaceCount - appendedSpaces; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    private int countSpaces(String text) {
        int count = 0;
        for (char a : text.toCharArray()) {
            if (a == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(">>" + s.reorderSpaces("  this   is  a sentence ") + "<<"); // "this   is   a   sentence"
        System.out.println(">>" + s.reorderSpaces(" practice   makes   perfect") + "<<"); // "practice   makes   perfect "
        System.out.println(">>" + s.reorderSpaces("hello   world") + "<<"); // "hello   world"
        System.out.println(">>" + s.reorderSpaces("  walks  udp package   into  bar a") + "<<"); // "walks  udp  package  into  bar  a "
        System.out.println(">>" + s.reorderSpaces("a") + "<<"); // "a"
        System.out.println(">>" + s.reorderSpaces("     a ") + "<<"); // "a"
        System.out.println(">>" + s.reorderSpaces("a b c ") + "<<"); // "a"
    }
}

