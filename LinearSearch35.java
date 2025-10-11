import java.util.Scanner;

public class LinearSearch35 {

    public static int searchInsertPosition(int[] nums, int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while (low<=high) {

            int mid = (low + high)/2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                low = mid +1;
            }

            else{
                high = mid -1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Arrays = ");
        int n = sc.nextInt();

        System.out.print("Enter the Sorted Array's Elements  = ");

        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Given Sorted Arrays = ");
        for (int x : nums) {
            System.out.print(x + " ");
        }

        System.out.println("Enter the target Element = ");
        int target = sc.nextInt();

        int result = searchInsertPosition(nums, target);

        System.out.println( "Index is  " + result);
    }
    
}