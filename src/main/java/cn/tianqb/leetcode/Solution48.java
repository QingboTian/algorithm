package cn.tianqb.leetcode;

/**
 * @author tianqingbo3
 * @version 1.0
 * @date 2021/12/1 22:20
 */
public class Solution48 {
    public void rotate(int[][] matrix) {

        // 求矩阵的转置矩阵
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // 矩阵
        int left = 0, right = matrix[0].length - 1;
        while (left < right) {
            for (int i = 0; i < matrix.length; i++) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
            }
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        new Solution48().rotate(arr);
    }
}
