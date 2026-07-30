/*
Problem    : Maximum Subarray
Platform   : LeetCode 53 (Console Implementation)
Topic      : Arrays
Difficulty : Medium

Approach:
Use Kadane's Algorithm.
Keep a running sum of the current subarray.
If the running sum becomes negative, reset it to 0.
Track the maximum sum encountered.

Time Complexity  : O(n)
Space Complexity : O(1)
*/
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int sum=0;
            for(int j=0;j<n;j++){
                 sum+=arr[j];
             max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.print(max);
    }
    
    
}