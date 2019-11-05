package com.shiof.solution._20190522;

/**
 * <a href="https://leetcode-cn.com/problems/search-insert-position/">35. 搜索插入位置</a>
 * <p>
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * <p>
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 *
 * @author spwang on 2019/5/22 16:39
 * @version 1.0.0
 * @since 1.0.0
 */
public class SearchInsert {
    public int solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
