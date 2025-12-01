import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationOfArray1929 {
    public static int[] getConcatenation(int[] nums){
        int n = nums.length;

        int[] ans = new int[2*n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[n+i] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Array's Size = ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the Array's Element = ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = getConcatenation(nums);

        System.out.print("Concatennation Of Array = "+ Arrays.toString(result));
    }
}
