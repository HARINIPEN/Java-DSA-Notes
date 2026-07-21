/*
Problem    : Largest Positive Integer That Exists With Its Negative
Platform   : LeetCode (2441)
Topic      : Arrays, HashSet
Difficulty : Easy

Approach   : Store all elements in a HashSet. For every positive number,
             check if its negative exists in the set.

Time Complexity  : O(n)
Space Complexity : O(n)
Date   : 21-07-2026
*/

import java.util.HashSet;

class Solution {
    public int findMaxK(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        int ans = -1;

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            if (num > 0 && set.contains(-num)) {
                ans = Math.max(ans, num);
            }
        }

        return ans;
    }
}