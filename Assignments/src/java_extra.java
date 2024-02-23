

public class java_extra {
	public static void main(String[] args) {

        Integer num1 = new Integer(10); // Using constructor
        Integer num2 = Integer.valueOf(20); // Using valueOf method
        
        int sum = num1.intValue() + num2.intValue(); 
        
        System.out.println("Sum of num1 and num2: " + sum);
        
        Integer num3 = 30; // Autoboxing  primitive int to Integer
        int num4 = num3; // Unboxing  Integer to primitive int
        
        System.out.println("Value of num3: " + num3);
        System.out.println("Value of num4: " + num4);
        
        Double d1 = Double.valueOf(3.14);
        Double d2 = 2.5; // Autoboxing
        
        double product = d1 * d2; // Unboxing
        
        System.out.println("Product of d1 and d2: " + product);
    }
}
