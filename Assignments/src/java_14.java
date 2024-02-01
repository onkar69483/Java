class MyObject {
    int value;

    MyObject(int value) {
        this.value = value;
    }
}

public class java_14{
	
	  // Method demonstrating call by value
    static void callByValue(int x) {
    	
        System.out.println("Inside callByValue - Before modification: " + x);
        
        x = 20;  // Modifying the value of the parameter
        
        System.out.println("Inside callByValue - After modification: " + x);
    }

    // Method demonstrating call by reference (passing an object)
    static void callByReference(MyObject obj) {
        System.out.println("Inside callByReference - Before modification: " + obj.value);
        
        obj.value = 30;  // Modifying the value of the object through its reference
        
        System.out.println("Inside callByReference - After modification: " + obj.value);
    }
	 public static void main(String[] args) {
	        // Demonstrate call by value
	        int num = 10;
	        System.out.println("Before callByValue: " + num);
	        callByValue(num);
	        System.out.println("After callByValue: " + num); // The original value remains unchanged

	        System.out.println();

	        // Demonstrate call by reference
	        MyObject myObj = new MyObject(25);
	        System.out.println("Before callByReference: " + myObj.value);
	        callByReference(myObj);
	        System.out.println("After callByReference: " + myObj.value); // The original object is modified
	    }
}
