import java.util.Scanner;

public class RemoveDuplicatesII80 {
    public static int removeDuplicateII(int[] nums){
        int n = nums.length;
        int i =2;
        if (n<=2) {
            return n;
        }

        for (int j = 2; j < n; j++) {
            if (nums[i-2] != nums[j]) {
                nums[i-2] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array's size = ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter the Array's Element = ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = removeDuplicateII(nums);

        System.out.println("Total Unique Element = " + result/2);
        
    }
}
