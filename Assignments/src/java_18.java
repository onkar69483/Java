
class BoxClass{
	private double length, breadth, height;

	public BoxClass(double length, double breadth, double height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	// Getters to get the values of the private variables
	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public double getHeight() {
		return height;
	}
	
	// Member function to print the values of the private variables
	public void display() { 
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
		System.out.println("Height: "+height);
	}
	
}


public class java_18 {
	public static void main(String[] args) {
		BoxClass box = new BoxClass(5.3, 2.6, 10.36);
		
		//printing values using getters
		double length = box.getLength();
		double breadth = box.getBreadth();
		double height = box.getHeight();
		
		System.out.println("Using Getters");
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
		System.out.println("Height: "+height);
		
		//printing values using display function
		System.out.println("\nUsing display function");
		box.display();
		
		
	}
}
