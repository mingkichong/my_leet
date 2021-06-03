import java.util.*;

class Solution {
    public int maximumPopulation(int[][] logs) {
        int [] histogram = new int[2050 - 1950 + 1];
        int max = 0;
        for (int [] log : logs) {
            for (int i = log[0]; i < log[1]; i++) {
                histogram[i - 1950]++;
                max = Math.max(max, histogram[i - 1950]);
            }
        }
        for (int i = 0; i < histogram.length; i++) {
            if (max == histogram[i]) {
                return i + 1950;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.maximumPopulation(new int [][] { {1993, 1999}, {2000, 2010} })); //1993
        System.out.println(s.maximumPopulation(new int [][] { {1950, 1961}, {1960, 1971}, {1970, 1981}})); // 1960
    }
}
