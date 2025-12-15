import java.util.Scanner;

public class MaximumSubArray53 {
    public static int maxSubarray(int[] nums){
        int n = nums.length;
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {
            currentSum = Math.max(nums[i], currentSum += nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the Elements of Array = ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubarray(nums);

        System.out.println("Maximum Sum Of Subarray = " + result);
    }
}
