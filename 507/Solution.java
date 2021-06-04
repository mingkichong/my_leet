import java.util.*;

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        Set<Integer> divisors = getDivisors(num);
        int sum = 0;
        for (int divisor : divisors) {
            sum += divisor;
        }
        return sum == num;
    }

    private Set<Integer> getDivisors(int num) {
        Set<Integer> divisors = new HashSet<>();
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if (num / i != num) {
                    divisors.add(num / i);
                }
            }
        }
        return divisors;
    }

    public static void main(String args[]) {
        Solution s = new Solution();
        System.out.println(s.checkPerfectNumber(28)); // true
        System.out.println(s.checkPerfectNumber(6)); // true
        System.out.println(s.checkPerfectNumber(496)); // true
        System.out.println(s.checkPerfectNumber(8128)); // true
        System.out.println(s.checkPerfectNumber(2)); // false
        System.out.println(s.checkPerfectNumber(1)); // false
    }
}
