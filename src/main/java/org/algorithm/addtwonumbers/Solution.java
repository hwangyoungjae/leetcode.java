package org.algorithm.addtwonumbers;

import java.util.Arrays;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int[] arr = new int[0];

        int newVal;
        int remainVal = 0;
        int idx = 0;
        while (true) {
            newVal = remainVal;
            if (l1 != null) {
                newVal += l1.val;
            }

            if (l2 != null) {
                newVal += l2.val;
            }

            if (newVal >= 10) {
                remainVal = newVal / 10;
                newVal -= remainVal * 10;
            } else {
                remainVal = 0;
            }

            arr = Arrays.copyOfRange(arr, 0, idx + 1);
            arr[idx] = newVal;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 == null && l2 == null) {
                if (remainVal > 0) {
                    arr = Arrays.copyOfRange(arr, 0, idx + 2);
                    arr[idx + 1] = remainVal;
                }
                break;
            }
            idx++;
        }
        ListNode listNode = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i];
            listNode = new ListNode(val, listNode);
        }
        return listNode;
    }
}

