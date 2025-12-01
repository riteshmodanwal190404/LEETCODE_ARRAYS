import java.util.Scanner;

public class FinalValueAfterOperations2011 {

    public static int finalvalue(String[] operations){
        int n = operations.length;
        int X = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].charAt(1) == '+') {
                X++;
            }
            else{
                --X;
            }
        }

        return X;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String Size = ");
        int n = sc.nextInt();

        String[] operations = new String[n];

        System.out.print("Enter the String's Element = ");

        for (int i = 0; i < operations.length; i++) {
            operations[i] = sc.next();
        }

        int result = finalvalue(operations);

        System.out.print("Final Value After Operation = " + result);

        
    }
}