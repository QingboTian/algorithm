package cn.tianqb.leetcode;

/**
 * 版本大小
 *
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/9/1 10:36
 */
public class Solution165 {

    public int solution(String version1, String version2) {
        String separator = "\\.";
        String[] version1Arr = version1.split(separator);
        String[] version2Arr = version2.split(separator);

        int maxLength = Math.max(version1Arr.length, version2Arr.length);
        for (int i = 0; i< maxLength; i++) {
            int v1 = i < version1Arr.length ? Integer.parseInt(version1Arr[i]) : 0;
            int v2 = i < version2Arr.length ? Integer.parseInt(version2Arr[i]) : 0;
            if (v1 > v2) {
                return 1;
            }
            if (v1 < v2) {
                return -1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int solution = new Solution165().solution("0.0.01.001.0", "0.0.1.1.001");
        System.out.println(solution);
    }

}
