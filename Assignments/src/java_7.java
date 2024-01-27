import java.util.*;

public class java_7 {
	public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        String[] student = new String[num];

        for (int i = 0; i < num; i++) {
            System.out.print("Enter name of student "+(i+1)+": ");
            student[i] = scanner.nextLine();
        }

        System.out.println("\nList of Students :");
        for (int i = 0; i < num; i++) {
            System.out.println(student[i]);
        }
    }
}
