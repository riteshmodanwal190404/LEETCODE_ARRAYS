import java.util.Scanner;

public class SearchInRotatedSortedArray33 {
    public static int seacrchRotateArray(int[] nums , int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;

        while (low<=high) {
            int mid = (low+high)/2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low]<=nums[mid]) {
                if (nums[low]<=target && target<nums[mid]) {
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            else{
                if (nums[mid]<target && target <= nums[high]) {
                    low = mid +1;
                }else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the Array's Element = ");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the Target Value = ");
        int target = sc.nextInt();

        int result = seacrchRotateArray(nums, target);

        System.out.println("Index of Target value is = " +result);
    }
}
