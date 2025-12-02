import java.util.Arrays;
import java.util.Scanner;

public class ShuffleTheArray1470 {

    public static int[] shuffle(int[] nums, int n){
        n = nums.length/2;

        int[] ans = new int[2*n];

        for (int i = 0; i < ans.length; i++) {
            if (i%2 == 0) {
                ans[i] = nums[i/2];
                ans[i+1] = nums[(i/2)+n];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Value of n = ");
        int n = sc.nextInt();

        int[] nums = new int[2*n];

        System.out.print("Enter "+ 2*n+ " Array's Element = ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int[] result = shuffle(nums, n);

        System.out.println("Suffle Array = " + Arrays.toString(result));
    }
}