import java.util.Scanner;

public class RmoveDuplicates26 {
    public static int removeDuplicate(int [] nums){
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        int i = 0;

        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array's Size = ");
        int n = sc.nextInt();
        
        System.out.print("Enter the Array's Elements = ");

        int [] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = removeDuplicate(nums);

        System.out.println("Arrays After Elemination = " + result);
    }
}
