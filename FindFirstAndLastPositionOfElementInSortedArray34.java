import java.util.Arrays;
import java.util.Scanner;

public class FindFirstAndLastPositionOfElementInSortedArray34 {
    public static int[] position(int[] nums, int target){
        int n = nums.length;
        int low1 = 0;
        int high1 = n-1;
        int low2 =0;
        int high2 = n-1;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        if (n==0) {
            return ans;
        }

        while (low1<=high1) {
            int mid = (low1+high1)/2;

            if (nums[mid] == target) {
                ans[0] = mid;
                high1 = mid-1;
            }else if (target>nums[mid]) {
                low1 = mid+1;
            }else{
                high1 = mid-1;
            }
        }

        while (low2<=high2) {
            int mid = (low2+high2)/2;

            if (nums[mid] == target) {
                ans[1] = mid;
                low2 = mid+1;
            }else if (target>nums[mid]) {
                low2 = mid+1;
            }else{
                high2 = mid-1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the Array's Element = ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the Target Value = ");
        int target = sc.nextInt();

        int[] result = position(nums, target);

        System.out.println("First and Last Position = " + Arrays.toString(result));
    }
}
