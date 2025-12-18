import java.util.Scanner;

public class MinimumInRotatedSortedArray153 {
    public static int minimumElement(int[] nums){
        int n = nums.length;
        int low =0;
        int high = n-1;

        while (low<high) {
            int mid = (low + high)/2;

            if (nums[mid]<= nums[high]) {
                high = mid;
            }else if (nums[mid] > nums[high]) {
                low = mid +1;
            }
            if (low == high) {
                return nums[low];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the Elements of Rotated Array = ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = minimumElement(nums);

        System.out.println("The Minimum Element of Rotated Array is = " + result);
    }
}
