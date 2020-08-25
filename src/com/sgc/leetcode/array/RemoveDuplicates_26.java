package com.sgc.leetcode.array;

public class RemoveDuplicates_26 {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0; // 慢指针
        int j = 1; // 快指针
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                nums[i + 1] = nums[j];
                i++;
            }
            j++;
        }
        return i + 1;
    }

    /**
     * 思路优化：此时数组中没有重复元素，按照上面的方法，每次比较时nums[i]都不等于nums[j]，
     * 因此就会将j指向的元素原地复制一遍，这个操作其实是不必要的。因此我们可以添加一个小判断，
     * 当 j - i > 1 时，才进行复制。
     */
    public int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0; // 慢指针
        int j = 1; // 快指针
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                if(j - i > 1) {
                    nums[i + 1] = nums[j];
                }
                i++;
            }
            j++;
        }
        return i + 1;
    }
}
