import java.util.Scanner;

public class java_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();
        
        int[] myArray = new int[arraySize];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to search: ");
        int searchElement = scanner.nextInt();
        
        int index = linearSearch(myArray, searchElement);
        
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
        
        scanner.close();
    }
    
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Return the index if the key is found
            }
        }
        return -1; // Return -1 if the key is not found
    }
}
