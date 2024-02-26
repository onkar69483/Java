
public class ExceptionExample {
	public static void main(String[] args) {
		int []array = new int[2];
		array[0] = 1;
		array[1] = 2;
		try {
//			System.out.println(array[3]);
			int i=50;
			int c = i/0;
		} 
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occured");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException Occured");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Finally Block");
		}
		System.out.println(array[0]);
		System.out.println(array[1]);

	}
}
