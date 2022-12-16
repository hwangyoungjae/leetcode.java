package org.algorithm.reverseinteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverse() {
        Solution solution = new Solution();
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
        assertEquals(0, solution.reverse(1534236469));
    }
}