package com.sgc.leetcode;

/**
 * @Author: shengguangcheng
 * @DATE: 2020/8/10 20:50
 * @Func 剑指 Offer 53 - II. 0～n-1中缺失的数字
 */

public class Test {
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
