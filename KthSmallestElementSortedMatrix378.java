import java.util.Scanner;

public class KthSmallestElementSortedMatrix378 {
   public static int smallestElement(int[][] matrix, int k){
    int row = matrix.length;
    int col = matrix[0].length;
    int low = matrix[0][0];
    int high = matrix[row-1][col-1];

    while (low<high) {
        int row1 = row -1;
        int col1 = 0;
        int count = 0;

        int mid = low + (high-low)/2;

        while (row1>=0 && col1<col) {
            if (matrix[row1][col1]<=mid) {
                count += row1 +1;
                col1++;
            }else{
                row1--;
            }
        }
        if (count<k) {
            low = mid +1;
        }else{
            high = mid;
        }
    }
    return low;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of row = ");
    int row = sc.nextInt();

    System.out.println("Enter the length of col = ");
    int col = sc.nextInt();

    int[][] matrix = new int[row][col];

    System.out.println("Enter the Elemnt of Matrix = ");
    for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }
    System.out.println("Enter the value of k = ");
    int k = sc.nextInt();
    int result = smallestElement(matrix, k);

    System.out.println("The "+k+"th Smallest number in Matrix is = " + result);
   }
}
