import java.util.Arrays;
import java.util.Scanner;

public record HeightsChecker1051() {
    public static int checkHeights(int[] heights){
        int n = heights.length;
        int count = 0;

        int[] expected = new int[n];

        for(int i = 0; i<n; i++){
            expected[i] = heights[i];
        }

        Arrays.sort(expected);

        for (int i = 0; i < n; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numner of Students = ");
        int n  = sc.nextInt();

        int[] heights  = new int[n];

        System.out.print("Enter the Height of Each Student = ");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int result = checkHeights(heights);

        System.out.println("Number of Student which is not in a proper line = " + result);
    }
}
