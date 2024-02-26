import java.util.Scanner;

public class ExceptionExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number value: ");
		String input = sc.nextLine();
		int intValue = 0;
		try {
			intValue = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("NumberFormatException Occured!");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("INT value: "+intValue);
	}
}
