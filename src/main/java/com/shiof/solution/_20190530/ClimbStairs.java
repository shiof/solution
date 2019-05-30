package com.shiof.solution._20190530;

/**
 * <a href="https://leetcode-cn.com/problems/climbing-stairs/solution/pa-lou-ti-by-leetcode/">70. 爬楼梯</a>
 * <p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * <p>
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * @author spwang on 2019/5/30 15:16
 * @version 1.0.0
 * @since 1.0.0
 */
public class ClimbStairs {
    /**
     * 动态规划
     * <p>
     * 这个问题可以被分解为一些包含最优子结构的子问题，即它的最优解可以从其子问题的最优解来有效地构建，我们可以使用动态规划来解决这一问题。
     * <p>
     * 第 ii 阶可以由以下两种方法得到：
     * <p>
     * 在第 (i-1)(i−1) 阶后向上爬一阶。
     * <p>
     * 在第 (i-2)(i−2) 阶后向上爬 22 阶。
     * <p>
     * 所以到达第 ii 阶的方法总数就是到第 (i-1)(i−1) 阶和第 (i-2)(i−2) 阶的方法数之和。
     * <p>
     * 令 dp[i]dp[i] 表示能到达第 ii 阶的方法总数：
     * <p>
     * dp[i]=dp[i-1]+dp[i-2]
     * <p>
     * 时间复杂度：O(n)O(n)，单循环到 nn 。
     * 空间复杂度：O(n)O(n)，dpdp 数组用了 nn 的空间。
     *
     * @param n n 阶楼梯
     * @return 有多少种不同的方法
     */
    public int solution(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * 斐波那契公式
     * <p>
     * 时间复杂度：O(log(n))O(log(n))，powpow 方法将会用去 log(n)log(n) 的时间。
     * <p>
     * 空间复杂度：O(1)O(1)，使用常量级空间。
     *
     * @param n n 阶楼梯
     * @return 有多少种不同的方法
     */
    public int solution2(int n) {
        double sqrt5 = Math.sqrt(5);
        double fibn = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
        return (int) (fibn / sqrt5);
    }
}
