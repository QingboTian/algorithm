package cn.tianqb.leetcode;

import java.util.*;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/21 15:57
 */
public class Solution15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // 下个数不能和上个数字相同
                continue;
            }
            for (int j = i + 1; j < length; j++) {
                if (j > (i + 1) && nums[j] == nums[j - 1]) {
                    continue;
                }
                int c = -(nums[i] + nums[j]);
                if (c < nums[j]) {
                    // 已经排过序了 若c小于b 则一定找不到第三个数
                    continue;
                }
                for (int k = j + 1; k < length; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    if (nums[k] > c) {
                        break;
                    }
                    if (nums[k] == c) {
                        List<Integer> item = new ArrayList<>();
                        item.add(nums[i]);
                        item.add(nums[j]);
                        item.add(nums[k]);
                        list.add(item);
                    }
                }
            }
        }
        return list;
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                // 下个数不能和上个数字相同
                continue;
            }
            int start = i + 1;
            int end = length - 1;
            while (start < end) {
                int target = -nums[i];
                int sum = nums[start] + nums[end];
                if (target == sum) {
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[start], nums[end])));
                    // 继续查找
                    start++;
                    end--;
                    // 首尾判断是否和上次的值相同
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                }
                if (target > sum) {
                    // 目标值大于当前bc的和 需要增加 故首部右移
                    start++;
                }
                if (target < sum) {
                    end--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(new Solution15().threeSum2(new int[]{-1,0,1,2,-1,-4}));
    }

}
