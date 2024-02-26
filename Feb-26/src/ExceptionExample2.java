import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0,num2 = 0;
		double val=0;
		try {
			System.out.println("Enter Num1");
			num1 = sc.nextInt();
			System.out.println("Enter Num2");
			num2 = sc.nextInt();
			val=num1/num2;
		}
		catch (InputMismatchException e) {
			System.out.println("InputMismatchException Occured!");
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("ArithmeticException Occured!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error Occured!");
		}
		System.out.println("num1: "+num1);
		System.out.println("num1: "+num2);
		System.out.println("Value: "+val);
	}
}
