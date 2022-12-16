package org.algorithm.reverseinteger;

public class Solution {
    public int reverse(int x) {
        int pop;
        long rev = 0L;
        while (x != 0) {
            pop = x % 10;
            x = x / 10;
            rev = rev * 10 + pop;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) rev;
    }
}
