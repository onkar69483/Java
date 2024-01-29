//Used to convert any primitive data type to object
//u get wrapper classes for specific data type eg - int has wrapper class Integer and char has wrapper class Character
// Converting the primitive data type to class implicitly is called autoboxing
public class WrapperClass {
	public static void main(String[] args) {
		int a=32;
		Integer i = Integer.valueOf(a);
		Integer j = a; // autoboxing
		
		int x = j.intValue(); // not autounboxing
		int x1 = j;  //autounboxing
		
		
		float f = j.floatValue(); // Converting to float explicitly
		float f1 = j; //Compiler automatically converts to float implicitly also known as autounboxing 
		
		System.out.println(j.compareTo(i));
		
		
		
		System.out.println("i: "+i+"\nj: "+j+"\nx: "+x+"\nx1: "+x1+"\nf: "+f+"\nf1: "+f1);
		
//		When Sysout concatenates string , it converts any integer in sysout to string using autoboxing. else u can also do it
//		explicitly using String.valueOf(num).
	}
}
