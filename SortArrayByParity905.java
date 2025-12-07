import java.util.Arrays;
import java.util.Scanner;

public class SortArrayByParity905 {
    public static int[] sortArrayByParity(int[] nums){
        int n = nums.length;

        int left = 0;
        int right = n-1;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i]%2 == 0) {
                ans[left] = nums[i];
                left++;
            }
            else{
                ans[right] = nums[i];
                right--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array's Size = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter The Array's Element = ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = sortArrayByParity(nums);

        System.out.println("Sorted Array By Parity = " + Arrays.toString(result));
    }
}
