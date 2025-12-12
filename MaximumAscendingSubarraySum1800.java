import java.util.Scanner;

public class MaximumAscendingSubarraySum1800 {
    public static int maxAscendingSum(int[] nums){
        int n = nums.length;
        
        int currentSum = nums[0];
        int max1 = currentSum;

        for(int i = 1; i<n; i++){
            if (nums[i-1]<nums[i]) {
                currentSum += nums[i];
            }else{
                currentSum = nums[i];
            }

            max1 = Math.max(max1, currentSum);
        }
        return max1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array's Size = ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the Array's Element = ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxAscendingSum(nums);

        System.out.println("Maximum Ascending Subarray Sum = " + result);
    }
}
