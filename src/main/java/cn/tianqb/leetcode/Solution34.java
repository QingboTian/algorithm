package cn.tianqb.leetcode;

/**
 * 以下这种实现方式 时间复杂度最坏为O(n/2)
 * leetcode 要求O(logn) 即查找左右边界分别使用二分法
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/11/28 16:18
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int left = 0, right = nums.length -1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                break;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            }
            if (target < nums[mid]) {
                right = mid - 1;
            }
        }

        if (nums[mid] != target) {
            return new int[]{-1, -1};
        }

        left = mid;
        right = mid;
        while (true) {
            boolean flag = true;
            if (left > 0 && nums[left - 1] == nums[mid]) {
                left--;
                flag = false;
            }
            if (right < nums.length - 1 && nums[right + 1] == nums[mid]) {
                right++;
                flag = false;
            }
            if (flag) {
                break;
            }
        }
        return new int[]{left, right};
    }

    public static void main(String[] args) {
//        new Solution34().searchRange(new int[]{5,7,7,8,8,10}, 8);
    }
}
