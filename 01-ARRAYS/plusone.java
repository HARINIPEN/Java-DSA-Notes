/*
Problem    : Plus One
Platform   : LeetCode 66
Topic      : Arrays
Difficulty : Easy

Approach:
Traverse the array from right to left.
- If the current digit is less than 9, increment it and return.
- Otherwise, set it to 0 and continue.
- If all digits are 9, create a new array with a leading 1.

Time Complexity  : O(n)
Space Complexity : O(1)
*/
class Solution {
    public int[] plusOne(int[] digits) {
       int n=digits.length;
       for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
       }
       int[] newres=new int[n+1];
       newres[0]=1;
       return newres;

        }
    }