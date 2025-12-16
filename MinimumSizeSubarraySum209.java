import java.util.Scanner;

public class MinimumSizeSubarraySum209 {
    public static int minSizeSubarray(int[] nums, int target){
        int n = nums.length;
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum>=target) {
                minLen = Math.min(minLen, right -left +1);
                sum -= nums[left];
                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            return 0;
        }

        return minLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the Element of Array = ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] =sc.nextInt();
        }

        System.out.println("Enter the Target Value = ");
        int target = sc.nextInt();

        int result = minSizeSubarray(nums, target);

        System.out.println("Minimum Size of Subarray  = " + result);
    }
}
