import java.util.Scanner;

public class Search2DMatrix74 {
    public static boolean searchTarget(int[][] matrix , int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int low =0;
        int high = row*col -1;

        while (low<=high) {
            int mid = (low+high)/2;

            int row1 = mid/col;
            int col1 = mid%col;

            if (matrix[row1][col1] == target) {
                return true;
            }else if (matrix[row1][col1]<target) {
                low = mid +1;
            }else{
                high = mid-1;
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
        System.out.println("Enter the Matrix Element  = ");
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
