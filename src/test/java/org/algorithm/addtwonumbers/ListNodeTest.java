package org.algorithm.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void ofCase1() {
        ListNode listNode = ListNode.of(2, 4, 3);
        assertEquals(2, listNode.val);
        assertEquals(4, listNode.next.val);
        assertEquals(3, listNode.next.next.val);
        assertNull(listNode.next.next.next);
    }

    @Test
    void ofCase2() {
        ListNode listNode = ListNode.of(5, 6, 4);
        assertEquals(5, listNode.val);
        assertEquals(6, listNode.next.val);
        assertEquals(4, listNode.next.next.val);
        assertNull(listNode.next.next.next);
    }

    @Test
    void ofCase3() {
        ListNode listNode = ListNode.of(0);
        assertEquals(0, listNode.val);
        assertNull(listNode.next);
    }
}