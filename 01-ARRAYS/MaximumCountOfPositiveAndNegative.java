/*
Problem    : Maximum Count of Positive Integer and Negative Integer
Platform   : LeetCode
Difficulty : Easy
Topic      : Arrays

Time Complexity  : O(n)
Space Complexity : O(1)
*/

class Solution {
    public int maximumCount(int[] nums) {

        int positive = 0;
        int negative = 0;

        for (int num : nums) {
            if (num > 0)
                positive++;
            else if (num < 0)
                negative++;
        }

        return Math.max(positive, negative);
    }
}