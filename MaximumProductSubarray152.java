import java.util.Scanner;

public class MaximumProductSubarray152 {
    public static int maxProduct(int[] nums){
        int n = nums.length;
        int endMax = nums[0]; 
        int endMin = nums[0];
        int ans = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i]<0) {
                int temp = endMax;
                endMax = endMin;
                endMin = temp;
            }
            endMax = Math.max(nums[i], endMax*=nums[i]);
            endMin = Math.min(nums[i], endMin*nums[i]);

            ans = Math.max(ans, endMax);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lenght of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the Element of Array = ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxProduct(nums);

        System.out.println("Maximum Product of Subarray = " + result);
    }
}
