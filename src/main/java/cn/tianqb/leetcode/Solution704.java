package cn.tianqb.leetcode;

/**
 * 二分查找
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/9/6 13:26
 */
public class Solution704 {

    public int solution(int nums[], int target) {
        if (nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end   = nums.length - 1;
        int middle = (end - start) / 2;
        while (true) {
            if (nums[middle] == target) {
                return middle;
            }
            if (start == end) {
                return -1;
            }
            if (nums[middle] > target) {
                // left
                end = middle - 1;
                middle = (end - start) / 2;
            } else {
                // right
                start = middle + 1;
                middle = (end - start) / 2 + start;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,5};
        System.out.println(new Solution704().solution(nums, 0));
    }

}
