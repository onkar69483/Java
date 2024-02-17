
public class java_22 {
	public static void main(String[] args) {
		//Storing Values in their primitive data types
		int intVal = 5;
		char charVal = 'N';
		double doubleVal = 24.32;
		
		//Converting primitive data types into object of class
		Integer intObj = Integer.valueOf(intVal);
		Character charObj = Character.valueOf(charVal);
		Double doubleObj = Double.valueOf(doubleVal);
		
		//Displaying Primitive Data values
		System.out.println("Int Value: "+intVal);
		System.out.println("Char Value: "+charVal);
		System.out.println("Double Value: "+doubleVal);
		
		//Displaying Objects
		System.out.println("\nInteger Object: "+intObj);
		System.out.println("Character Object: "+charObj);
		System.out.println("Double Object: "+doubleObj);
		
	}
}
