package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/13 17:42
 */
public class Solution338 {

    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        res[0] = 0;
        for (int i = 0; i <= n; i++) {
            if ((i & 1) == 0){
                res[i] = res[i / 2];
            } else {
                res[i] = res[i - 1] + 1;
            }
        }
        return res;
    }

}
