import java.util.Scanner;

public class Search2DMatrixII240 {
    public static boolean searchTarget(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int row1 = 0;
        int col1 = col-1;

        while (row1<row && col1>=0) {
            if (matrix[row1][col1] == target) {
                return true;
            }
            else if (matrix[row1][col1]>target) {
                col1--;
            }else{
                row1++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of row = ");
        int row = sc.nextInt();

        System.out.println("Enter the Length of Col = ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Target Number = ");
        int target = sc.nextInt();

        boolean result = searchTarget(matrix, target);
        System.out.println("Target Found ? = " + result);

    }
}
