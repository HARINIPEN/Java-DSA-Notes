/*
Problem    : Container With Most Water
Platform   : LeetCode 11
Topic      : Arrays (Two Pointers)
Difficulty : Medium

Approach:
Use two pointers, one at the beginning and one at the end.
Calculate the area formed by the two lines.
Move the pointer with the smaller height inward because
moving the taller one cannot increase the maximum area.

Time Complexity  : O(n)
Space Complexity : O(1)
*/
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;;
        int maxarea=0;
        while(left<right){
            int width=right-left;
             int h=Math.min(height[left],height[right]);
             int area=h*width;
             maxarea=Math.max(maxarea,area);
             if(height[left]<height[right]){
                left++;
             }
             else{
                right--;
             }
        }
        return maxarea;
        
    }
}