import java.util.Arrays;
import java.util.Scanner;

public class TransposeOfMatrix867{
    public static int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] result = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row = ");
        int row = sc.nextInt();

        System.out.println("Enter the length of Col = ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Enter the Element of Matrix = ");
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[][] result = transpose(matrix);

        System.out.println("Transpose matrix = " + Arrays.deepToString(result));


    }
}
