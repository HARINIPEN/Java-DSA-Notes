/*
Problem    : Single Number
Platform   : LeetCode 136
Topic      : Bit Manipulation (HashMap Approach)
Difficulty : Easy

Approach:
Count the frequency of each number using a HashMap.
Return the element whose frequency is 1.

Time Complexity  : O(n)
Space Complexity : O(n)
*/

class Solution {
    public int singleNumber(int[] nums) {
        int a=0;
        for(int num:nums){
            a^=num;
        }
        return a;
    }
}