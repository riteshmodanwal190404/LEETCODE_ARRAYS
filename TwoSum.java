import java.util.Scanner;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array = ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the Array's Element = ");
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the Target number =  ");
        int target = sc.nextInt();

        TwoSum ts = new TwoSum();
        int[] ans = ts.twoSum(nums, target);

        System.out.println("Possible index = " );

        if (ans.length==0) {
            System.out.println("No pair found!");
        }
        else{
            System.out.println(ans[0]+" "+ ans[1]);
        }


    }
}
