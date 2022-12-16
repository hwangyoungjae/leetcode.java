package org.algorithm.longestsubstringwithoutrepeatingcharacters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private final static Solution solution = new Solution();

    @Test
    void lengthOfLongestSubstring1() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void lengthOfLongestSubstring2() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void lengthOfLongestSubstring3() {
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void lengthOfLongestSubstring4() {
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
    }

    @Test
    void lengthOfLongestSubstring5() {
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
    }
}