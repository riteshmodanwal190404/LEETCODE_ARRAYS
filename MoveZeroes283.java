import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes283 {
    public static void moveZero(int[] nums){
        int n = nums.length;

        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
            System.out.println("Move Zeroes = " + Arrays.toString(nums));
            return;
    
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        System.out.print("Enter the Array's Element = ");

        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        moveZero(nums);
    }

}
