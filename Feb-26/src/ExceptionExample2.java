import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0,num2 = 0;
		System.out.println("Enter Num1");
		num1 = sc.nextInt();
		try {
			System.out.println("Enter Num2");
			num2 = sc.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException Occured!");
		}
		System.out.println("num1: "+num1);
		System.out.println("num1: "+num2);
	}
}
