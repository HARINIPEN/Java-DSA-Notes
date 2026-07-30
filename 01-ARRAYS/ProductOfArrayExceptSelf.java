/*
Problem    : Product of Array Except Self
Platform   : LeetCode 238
Topic      : Arrays (Prefix & Suffix Products)
Difficulty : Medium

Approach:
Create a prefix product array and a suffix product array.
For each index, multiply the prefix product and suffix product
to get the product of all elements except the current one.

Time Complexity  : O(n)
Space Complexity : O(n)
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        int[] ans=new int[n];
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--)
        {
            right[i]=right[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}