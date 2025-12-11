import java.util.Arrays;
import java.util.Scanner;

public class PlusOne66 {
    public static int[] onePlus(int[] digits){
        int n = digits.length;

        for(int i = n-1; i>=0; i--){
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[n+1];
        ans[0] = 1;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        System.out.print("Enter the Arrays Elements = ");

        int[] digits = new int[n];

        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        int[] result = onePlus(digits);

        System.out.println("Array After Plus one = " + Arrays.toString(result));
    }
}
