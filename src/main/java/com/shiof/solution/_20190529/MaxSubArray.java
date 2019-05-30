package com.shiof.solution._20190529;

/**
 * <a href="https://leetcode-cn.com/problems/maximum-subarray/">53. 最大子序和</a>
 * <p>
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * @author spwang on 2019/5/29 16:06
 * @version 1.0.0
 * @since 1.0.0
 */
public class MaxSubArray {
    public int solution(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        int res = nums[0];
        for (int num : nums) {
            sum = sum > 0 ? sum + num : num;
            res = Math.max(res, sum);
        }
        return res;
    }
}