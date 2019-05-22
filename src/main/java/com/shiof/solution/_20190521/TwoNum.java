package com.shiof.solution._20190521;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * </p>
 *
 * @author spwang on 2019/5/21 8:29
 * @version 1.0.0
 * @since 1.0.0
 */
public class TwoNum {
    /**
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     *
     * @param nums   整数数组
     * @param target 目标值
     * @return 两个整数数组下标
     */
    public int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /**
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param nums   整数数组
     * @param target 目标值
     * @return 两个整数数组下标
     */
    public int[] solution2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
