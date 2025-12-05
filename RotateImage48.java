import java.util.Arrays;
import java.util.Scanner;

public class RotateImage48 {
    public static void rotate(int[][] matrix){
        int n = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp; //transpose
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int left = 0, right = n-1;

            while (left<right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;  //reverse row Elements
                left++;
                right--;
            }
        }

        System.out.println("Rotated Image of Matrix = " + Arrays.deepToString(matrix));
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Square Matrix length = ");
        int n = sc.nextInt();

        System.out.print("Enter the Matrix's Elements = ");

        int[][] matrix = new int[n][n];

        for (int i = 0; i < matrix.length; i++) {
            for(int j =0; j<n; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        rotate(matrix);

    }
}
