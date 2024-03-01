import java.util.Scanner;

class invalidAgeException extends Exception{
	String message;

	public invalidAgeException(String message) {
		super(message);
	}
}
  
public class ExceptionExample4 {
	
	static void checkAge(int a) throws invalidAgeException{
		if(a<18) {
			throw new invalidAgeException("Kal ana bhai");
		}else if (a>20){
			throw new invalidAgeException("Age jyada hai bhai");
		}else {
			System.out.println("aja bhai");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		try {
			checkAge(age);
		} catch (invalidAgeException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}