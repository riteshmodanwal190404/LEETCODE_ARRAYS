import java.util.*;

public class SingleNumber136 {
    public static int singleNum(int[] nums){
        int n = nums.length;
        
        int[] fr = new int[n+1];

        for (int i = 0; i < n; i++) {
            fr[nums[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (fr[nums[i]] == 1) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        
        System.out.println("Enter the element of Array = ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = singleNum(nums);

        if (result == -1) {
            System.out.println("Here not a Single Number");
        }else{
            System.out.println("Single Element is = " + result);
        }
    }
}
