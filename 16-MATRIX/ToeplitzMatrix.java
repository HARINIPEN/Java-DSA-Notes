/*
Problem    : Toeplitz Matrix
Platform   : LeetCode 766
Topic      : Matrix
Difficulty : Easy

Approach:
Compare every element with its bottom-right diagonal element.
If any pair differs, the matrix is not a Toeplitz matrix.

Time Complexity  : O(m × n)
Space Complexity : O(1)
*/

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}