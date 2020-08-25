package com.sgc.leetcode.array;

public class Offer53_MissingNumber {
    // 对于有序数组，大小为i的数应当处于下标为i的位置上，如果不在，说明在该数字之前发生了错位
    public int missingNumber(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2; // int mid =  left + ((right - left) >>> 1);
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
