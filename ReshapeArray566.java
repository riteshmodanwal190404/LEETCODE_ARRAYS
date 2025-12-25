import java.util.Arrays;
import java.util.Scanner;

public class ReshapeArray566 {
    public static int[][] reshape(int[][] mat , int r, int c){
        int row = mat.length;
        int col = mat[0].length;

        if (row*col != r*c) {
            return mat;
        }

        int[][] ans = new int[r][c];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int newRow = index/c;
                int newCol = index%c;

                ans[newRow][newCol] = mat[i][j];
                index++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of row = ");
        int row = sc.nextInt();
        System.out.println("Enter the Length of Column = ");
        int col = sc.nextInt();

        int[][] mat = new int[row][col];
        
        System.out.println("Enter the All the The Element of Matrix = ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the Length of row of New Matrix = ");
        int r = sc.nextInt();

        System.out.println("Enter the Length of Column of New Matrix =  ");
        int c = sc.nextInt();

        int[][] result = reshape(mat, r, c);

        System.out.println("New Matrix = " + Arrays.deepToString(result));
    }
}
