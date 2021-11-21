package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/20 23:51
 */
public class Solution397 {

    public int integerReplacement(int n) {
        // 边界值
        if (n == 1) {
            return 0;
        }

        int count = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                // 偶数
                n = n >> 1;
                count++;
            } else {
                // 奇数
                if (n == 3) {
                    // 奇数中的特殊值 直接减1
                    n = n - 1;
                    count++;
                    continue;
                }
                if ((n & 2) == 2) {
                    // xxx11 & 10
                    // 正确的写法应该是 n = (n >> 1) + 1， 具体的原因下面分析
                    n = (n + 1) >> 1;
                    count += 2;
                } else {
                    // xxx01 & 10
                    n = n >> 1;
                    count += 2;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution397().integerReplacement(2147483647));
        System.out.println(Integer.MAX_VALUE);
    }


}
