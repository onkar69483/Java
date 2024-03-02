import java.util.Random;

public class java_29 {
    public static void main(String[] args) {
        // Creating a ragged array with random numbers
        int[][] raggedArray = {
            {11, 22, 33},
            {44, 55},
            {66, 77, 88, 99}
        };
        
        // Accessing and printing elements of the ragged array
        for (int i = 0; i < raggedArray.length; i++) {
            for (int j = 0; j < raggedArray[i].length; j++) {
                System.out.print(raggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
