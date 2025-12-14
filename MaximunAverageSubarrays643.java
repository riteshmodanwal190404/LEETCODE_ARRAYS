import java.util.Scanner;

public class MaximunAverageSubarrays643 {
    public static double maxAverage(int[] nums , int k){
        int n  = nums.length;

        int windowSum = 0;
        int maxSum = windowSum;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        
        for (int i = k; i < n; i++) {
            windowSum += nums[i];
            windowSum -= nums[i-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        double maxAvg = maxSum/(double)k;

        return maxAvg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Arrays = ");
        int n = sc.nextInt();

        System.out.println("Enter the size of Subarrays = ");
        int k = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the Array's Element = ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        double result = maxAverage(nums, k);

        System.out.println("Maximum Average of Subarrays = " + result);
    }
}
