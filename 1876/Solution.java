import java.util.*;

class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length() - 2; i++){
            String subStr = s.substring(i, i+3);
            count += isGood(subStr) ? 1 : 0;
        }
        return count;
    }

    private boolean isGood(String s){
        Set<Character> uniqCharacters = new HashSet<>();
        for(char a: s.toCharArray()){
            uniqCharacters.add(a);
        }
        return uniqCharacters.size() == s.length();
    }

    public static void main(String args[]){
        Solution s = new Solution();
        System.out.println(s.countGoodSubstrings("xyzzaz")); // 1
        System.out.println(s.countGoodSubstrings("aababcabc")); // 4
        System.out.println(s.countGoodSubstrings("aaaaaaaaaaaaaaaaa")); // 0
        System.out.println(s.countGoodSubstrings("aa")); // 0
        System.out.println(s.countGoodSubstrings("a")); // 0
        System.out.println(s.countGoodSubstrings("aab")); // 0
        System.out.println(s.countGoodSubstrings("abc")); // 1
        System.out.println(s.countGoodSubstrings("abcd")); // 1
    }
}
