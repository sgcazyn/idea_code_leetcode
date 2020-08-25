package com.sgc.leetcode.array;

public class FindLengthOfLCIS_674 {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int result = 1;
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return 1;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] > nums[i]) {
                count++;
            } else {
                count = 1;
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
