package cn.tianqb.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/distribute-candies
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/1 9:38
 */
public class Solution575 {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int candy : candyType) {
            set.add(candy);
        }
        if (set.size() >= candyType.length / 2) {
            return candyType.length / 2;
        }
        return set.size();
    }

    public static void main(String[] args) {
        System.out.println(new Solution575().distributeCandies(new int[]{1, 1, 2, 2, 3, 3}));
        System.out.println(new Solution575().distributeCandies(new int[]{1, 1, 2, 3}));
    }
}
