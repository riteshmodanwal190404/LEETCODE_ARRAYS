// 
// Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

// Example 1:

// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
// Example 2:

// Input: nums = [1,0,1,1,0,1]
// Output: 2

import java.util.Scanner;

public class MaxConsecutiveOnes485 {
    public static int maxone(int[] nums){
        int n = nums.length;
        int count = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                ans = Math.max(ans, count);
            } else {
                count = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arrays size = ");
        int n = sc.nextInt();

        System.out.print("Enter th Array's Element = ");
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxone(nums);

        System.out.println("Max Consecutive Ones = " + result);
    }
}
