import java.util.*;

public class SingleElementInSortedArray540 {
    public static int singleElement(int[] nums){
        int n = nums.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = low + (high - low)/2;

            if (low == high) {
                return nums[low];
            }
            if (mid % 2 != 0) {
                mid--;
            }

            if (nums[mid] == nums[mid +1]) {
                low = mid + 2;
            }else{
                high = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Odd Size of the Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the All Elements of Array = ");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleElement(nums);

        if (result == -1) {
            System.out.println("In this Array not a Single Nummber.");
        }else{
            System.out.println("Single Number is = " + result);
        }
    }
}
