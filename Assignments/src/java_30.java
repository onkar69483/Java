import java.util.Scanner;

public class java_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        int[][] raggedArray = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int numCols = scanner.nextInt();

            raggedArray[i] = new int[numCols];

            System.out.print("Enter " + numCols + " elements for row " + (i + 1) + ": ");
            for (int j = 0; j < numCols; j++) {
                raggedArray[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The ragged array entered:");
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
