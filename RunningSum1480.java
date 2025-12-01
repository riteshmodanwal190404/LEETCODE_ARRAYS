import java.util.Arrays;
import java.util.Scanner;

public class RunningSum1480 {
    public static  int[] runningSum(int[] nums){
        int n = nums.length;

        int sum = 0;

        for(int i = 0; i<n; i++){
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array = ");
        int n = sc.nextInt();

        System.out.print("Enter the Array's Elements = ");

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = runningSum(nums);

        System.out.print("Running sum = " + Arrays.toString(result));
    }
}
