import java.util.Scanner;

public class CountNegativeNumbersSortedMatrix1351 {
    public static int negativeNum(int[][] grid){
        int totalRow = grid.length;
        int totalCol = grid[0].length;
        int row = 0;
        int col = totalCol-1;
        int count = 0;

        while (row<totalRow && col>=0) {
            if (grid[row][col]<0) {
                count += totalRow -row;
                col--;
            }else{
                row++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of row = ");
        int totalRow = sc.nextInt();

        System.out.println("Enter the Length of col = ");
        int totalCol = sc.nextInt();

        int[][] grid = new int[totalRow][totalCol];

        System.out.println("Enter the Grid ELement = ");
        for (int i = 0; i < totalRow; i++) {
            for (int j = 0; j < totalCol; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int result = negativeNum(grid);

        System.out.println("Total Negative Number in Grid is = " + result);
    }
}
