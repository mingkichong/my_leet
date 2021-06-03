import java.util.*;

class Solution {
    public int numberOfMatches(int numTeams) {
        return numTeams - 1;
        // int totalMatches = 0;
        // while(numTeams != 1){
        //     if(numTeams % 2 == 0){
        //         totalMatches += numTeams / 2;
        //         numTeams = numTeams / 2;
        //     } else {
        //         totalMatches += (numTeams - 1) / 2;
        //         numTeams = (numTeams - 1) / 2 + 1;
        //     }
        // }
        // return totalMatches;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        // System.out.println(s.numberOfMatches(7));   // 6
        // System.out.println(s.numberOfMatches(14));  // 13
        for (int i = 1; i <= 200; i++) {
            System.out.println(s.numberOfMatches(i) == (i - 1));
        }
    }
}
