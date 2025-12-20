import java.util.Scanner;

public class KokoEatingBananas875 {
    public static int minTime(int[] piles, int h){
        int n = piles.length;
        int low =1;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i]>high) {
                high = piles[i];
            }
        }
        int ans = high;

        while (low<=high) {
            int mid = (low + high)/2;

            long totalHours = 0;

            for (int i = 0; i < piles.length; i++) {
                totalHours += (piles[i] + mid-1L)/mid;
            }
            if (totalHours <= h) {
                ans = mid;
                high = mid -1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numebers of Banana's piles = ");
        int n = sc.nextInt();

        int[] piles = new int[n];
        System.out.println("Enter the numbers of Bananas in each piles = ");
        
        for (int i = 0; i < piles.length; i++) {
            piles[i] = sc.nextInt();
        }
        System.out.println("Enter the maximum hours = ");
        int h = sc.nextInt();

        int result = minTime(piles, h);

        System.out.println("The maximum Speed = " + result + " bananas per hour");
    }
}
