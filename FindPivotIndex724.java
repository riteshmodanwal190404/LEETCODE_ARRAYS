import java.util.Scanner;

public class FindPivotIndex724 {
    public static int pivotIndex(int[] nums){
        int n = nums.length;
        int totalSum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }

        for (int i = 0; i < n; i++) {
            rightSum = totalSum - leftSum - nums[i];

            if (rightSum == leftSum) {
                return i;

            }
            else{
                leftSum += nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the Element of Array = ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = pivotIndex(nums);

        System.out.println("Pivot Index Are = " + result);
    }
}
