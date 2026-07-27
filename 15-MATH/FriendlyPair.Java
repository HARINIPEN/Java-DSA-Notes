/*
Problem    : Friendly Pair
Platform   : Basic Programming
Topic      : Math
Difficulty : Easy

Approach:
Find the sum of proper divisors of both numbers.
If the sum of divisors of the first number equals the second number
and vice versa, then they form a Friendly Pair.

Time Complexity  : O(n1 + n2)
Space Complexity : O(1)
*/

import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                sum1 += i;
            }
        }

        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                sum2 += i;
            }
        }

        if (sum1 == n2 && sum2 == n1) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not Friendly Pair");
        }

        sc.close();
    }
}