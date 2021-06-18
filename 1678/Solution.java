import java.util.*;

class Solution {
    public String interpret(String command) {
        char chars[] = command.toCharArray();
        StringBuilder sb =  new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'G') {
                sb.append("G");
                continue;
            }

            if (chars[++i] == ')') {
                sb.append("o");
            } else {
                sb.append("al");
                i += 2;
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.interpret("G()(al)")); // "Goal"
        System.out.println(s.interpret("G()()()()(al)")); // "Gooooal"
        System.out.println(s.interpret("(al)G(al)()()G")); // "alGalooG"
    }
}

