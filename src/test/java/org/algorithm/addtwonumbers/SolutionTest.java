package org.algorithm.addtwonumbers;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;

    @BeforeEach
    void before() {
        solution = new Solution();
    }

    @Test
    void addTwoNumbers1() {
        ListNode listNode = solution.addTwoNumbers(ListNode.of(2, 4, 3), ListNode.of(5, 6, 4));
        int[] expectedValues = {7, 0, 8};
        for (int expectedValue : expectedValues) {
            assertEquals(expectedValue, listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    void addTwoNumbers2() {
        ListNode listNode = solution.addTwoNumbers(ListNode.of(0), ListNode.of(0));
        int[] expectedValues = {0};
        for (int expectedValue : expectedValues) {
            assertEquals(expectedValue, listNode.val);
            listNode = listNode.next;
        }
    }

    @Test
    void addTwoNumbers3() {
        ListNode listNode = solution.addTwoNumbers(ListNode.of(9, 9, 9, 9, 9, 9, 9), ListNode.of(9, 9, 9, 9));
        int[] expectedValues = {8, 9, 9, 9, 0, 0, 0, 1};
        for (int expectedValue : expectedValues) {
            assertEquals(expectedValue, listNode.val);
            listNode = listNode.next;
        }
    }
}