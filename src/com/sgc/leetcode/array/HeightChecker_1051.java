package com.sgc.leetcode.array;

import java.util.Arrays;

public class HeightChecker_1051 {
    // 思路1
    public int heightChecker(int[] heights) {
        // 统计移动人数
        int count = 0;
        // 对数组heights复制
        int[] heights2 = Arrays.copyOf(heights, heights.length);
        // 对新数组heights2排序
        Arrays.sort(heights2);
        // 遍历数组
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != heights2[i]) {
                count++;
            }
        }
        return count;
    }
    /**
     * 分析时间和空间复杂度与
     *
     *
     *
     */

    // 思路2


}
