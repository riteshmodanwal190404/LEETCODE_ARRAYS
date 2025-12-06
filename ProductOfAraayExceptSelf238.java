import java.util.Arrays;
import java.util.Scanner;

public class ProductOfAraayExceptSelf238 {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;

        int[] ans = new int[n];
        ans[0] = 1;

        for(int i =1; i<n; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }

        int right = 1;

        for (int i = n-1; i >= 0 ; i--) {
            ans[i] = ans[i]*right;
            right = right*nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arrays Size = ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the Array's Element = ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        System.out.println("After Array = " + Arrays.toString(result));
    }
}
