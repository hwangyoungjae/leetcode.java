package org.algorithm.addtwonumbers;

import java.util.List;

public class ListNode {
    public static ListNode of(int... args) {
        ListNode listNode = null;
        for (int i = args.length - 1; i >= 0; i--) {
            int val = args[i];
            listNode = new ListNode(val, listNode);
        }
        return listNode;
    }

    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
