package cn.tianqb.leetcode;

/**
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * https://leetcode-cn.com/problems/climbing-stairs/
 *
 * 爬到第n个阶梯的方案肯定是爬到第n-1 和爬到第n-2的方案的和
 * 因为最后一步，要么是爬一个阶梯，即f(n-1)，要么是爬第二个阶梯，即f(n-2)
 * 所以可以得出f(n) = f(n-1) + f(n-2)
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/1 22:03
 */
public class Solution70 {
    public int climbStairs(int n) {
        int result = 1;

        int n2;// f(n-2)
        int n1 = 0;// f(n-1)
        for (int i = 1; i <= n; i++) {
            n2 = n1; // 当前位置的n-2 就是上个位置n-1
            n1 = result;// 当前位置的n-1 就是上个位置的总方案数
            result = n1 + n2;// 当前位置的总方案数等于f(n-1) + f(n-2)
        }

        return result;
    }
}
