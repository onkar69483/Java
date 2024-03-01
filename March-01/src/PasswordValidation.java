import java.util.Scanner;

class WeakPasswordException extends Exception{
	String message;

	public WeakPasswordException(String message) {
		super(message);
	}
	
}

class LengthViolationException extends Exception{
	String message;

	public LengthViolationException(String message) {
		super(message);
	}
	
}


public class PasswordValidation {
	static void validatePassword(String password) throws WeakPasswordException, LengthViolationException{
		if(password.length() < 8) {
			throw new LengthViolationException("Length must be greater than 8 characters");
		}
		if(!password.matches(".*[A-Z].*")) {
			throw new WeakPasswordException("Weak Password! Must contain atleast one uppercase letter");
		}
		else {
			System.out.println("Strong Password");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = sc.next();
		try {
			validatePassword(password);
		} catch (WeakPasswordException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (LengthViolationException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
