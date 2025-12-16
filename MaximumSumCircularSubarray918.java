import java.util.Scanner;

public class MaximumSumCircularSubarray918 {
    public static int maxCircularSum(int[] nums){
        int n = nums.length;
        int maxSum = nums[0];
        int minSum = nums[0];
        int maxCurrentSum = nums[0];
        int minCurrentSum = nums[0];
        int totalSum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
        }

        for (int i = 1; i < n; i++) {
            maxCurrentSum = Math.max(nums[i], maxCurrentSum += nums[i]);
            maxSum = Math.max(maxSum, maxCurrentSum);
        }

        for (int i = 1; i < n; i++) {
            minCurrentSum = Math.min(nums[i], minCurrentSum += nums[i]);
            minSum = Math.min(minSum, minCurrentSum);
        }

        if (maxSum<0) {
            return maxSum;
        }
        else{
            ans = Math.max(maxSum, totalSum-minSum);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the Array's Element = " );
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxCircularSum(nums);

        System.out.println("Maximum Sum of Circular Subarray = " + result);
    }
}
