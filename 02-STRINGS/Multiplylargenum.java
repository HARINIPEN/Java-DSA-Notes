Approach:
Convert both input strings into BigInteger objects and use the
multiply() method to compute the product

import java.math.BigInteger;
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String num1=sc.next();
        String num2=sc.next();
        BigInteger a=new BigInteger(num1);
        BigInteger b=new BigInteger(num2);
        BigInteger  ans=a.multiply(b);
        System.out.print(ans.toString());
        
    }
}
/*
Problem    : Multiply Strings
Platform   : LeetCode 43
Topic      : Strings
Difficulty : Medium

Approach:
Simulate the multiplication process digit by digit, just like
manual multiplication. Store intermediate results in an integer
array and build the final answer while skipping leading zeros.

Time Complexity  : O(m × n)
Space Complexity : O(m + n)
*/

class Solution {
    public String multiply(String num1, String num2) {

        // If either number is 0
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] result = new int[m + n];

        // Multiply from right to left
        for (int i = m - 1; i >= 0; i--) {

            for (int j = n - 1; j >= 0; j--) {

                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');

                int sum = mul + result[i + j + 1];

                result[i + j + 1] = sum % 10;

                result[i + j] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();

        for (int num : result) {
            if (!(ans.length() == 0 && num == 0)) {
                ans.append(num);
            }
        }

        return ans.toString();
    }
} can we push?
