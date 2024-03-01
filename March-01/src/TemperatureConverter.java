import java.util.Scanner;

class InvalidTemperatureException extends Exception{
	String message;

	public InvalidTemperatureException(String message) {
		super(message);
	}
	
}

class OutOfRangeTemperatureException extends Exception{
	String message;

	public OutOfRangeTemperatureException(String message) {
		super(message);
	}
	
}


public class TemperatureConverter {
	static double calculateTemp(Double temp) throws InvalidTemperatureException, OutOfRangeTemperatureException{
		if(temp == 0) {
			throw new InvalidTemperatureException("Invalid Temperature");
		}
		
		if( temp > -28.8 && temp >43.3) {
			throw new OutOfRangeTemperatureException("Temperature must be between -28.8 to 43.3");
		}
		else {
			return ((temp*1.8)+32);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature: ");
		double temp = sc.nextDouble();
		try {
			calculateTemp(temp);
		} catch (InvalidTemperatureException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (OutOfRangeTemperatureException e) {
			// TODO: handle exception
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}

