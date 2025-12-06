import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement27 {
    public static int removeElement(int[] nums, int val){
        int n = nums.length;

        if (n==0) {
            return 0;
        }
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array's Element = ");

        int n = sc.nextInt();

        System.out.println("Enter the Element which you want to remove = ");
        int val = sc.nextInt();

        System.out.print("enter the Araay's Element = ");

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = removeElement(nums, val);

        System.out.println("Total Unique Element = " + result);
        System.out.println("And After Array = " + Arrays.toString(nums));
    }
}
