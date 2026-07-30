/*
Problem    : Factorial Trailing Zeroes
Platform   : LeetCode 172
Topic      : Math
Difficulty : Medium

Approach:
A trailing zero is formed by a pair of 2 and 5.
Since there are always more 2s than 5s in n!,
count the number of factors of 5.

Time Complexity  : O(log₅ n)
Space Complexity : O(1)
*/
class Solution {
    public int trailingZeroes(int n) {

        int count = 0;

        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}