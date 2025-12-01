import java.util.Arrays;
import java.util.Scanner;

public class BuildArray1920 {
    public static int[] buildArray(int[] nums){
        int n = nums.length;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Arrray's Size = ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the Array's Element ( less than n ) = ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = buildArray(nums);

        System.out.print("Build Array = " + Arrays.toString(result));
    }
}
