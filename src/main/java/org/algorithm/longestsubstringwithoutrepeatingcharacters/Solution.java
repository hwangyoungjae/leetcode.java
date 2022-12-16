package org.algorithm.longestsubstringwithoutrepeatingcharacters;

import java.util.Arrays;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxValue = 0;
        int[] arr = new int[0];
        int dupIndex;

        for (int c : s.toCharArray()) {
            dupIndex = indexOf(arr, c);

            if (dupIndex > -1) {
                arr = Arrays.copyOfRange(arr, dupIndex + 1, arr.length);
                arr = append(arr, c);
            } else {
                arr = append(arr, c);
            }
            maxValue = max(maxValue, arr.length);
        }

        return maxValue;
    }

    private int[] append(int[] arr, int c) {
        int[] newArr = Arrays.copyOfRange(arr, 0, arr.length + 1);
        newArr[newArr.length - 1] = c;
        return newArr;
    }

    private int max(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    private int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
