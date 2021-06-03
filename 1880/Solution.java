import java.util.*;

class Solution {
    final static boolean DEBUG = true;
    final static boolean RANDOM_INPUT = true;

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (getValue(firstWord) + getValue(secondWord)) == getValue(targetWord);
    }

    private int getValue(String word){
        int value = 0;
        for(char c : word.toCharArray()){
            int cValue = c - 'a';
            value *= 10;
            value += cValue;
        }
        return value;
    }

    public static void main(String args[]){
        Solution s = new Solution();
        // String firstWord = "acb";
        // String secondWord = "cba";
        // String targetWord = "cdb";
        String firstWord = "a";
        String secondWord = "a";
        String targetWord = "a";
        System.out.println(s.isSumEqual(firstWord, secondWord, targetWord));
    }
}

