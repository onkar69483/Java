class BoxClassNew{
	private double length, breadth, height;
	public BoxClassNew(double length, double breadth, double height) {
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
	
	public void displayVolume() {
		double volume = length*breadth*height;
		System.out.println("Volume of Box: "+volume+" m^3");
	}
	
}
public class java_19 {
	public static void main(String[] args) {
		BoxClassNew box = new BoxClassNew(5.3, 2.6, 10.36);
		
		//printing values using display function
		System.out.println("\nUsing display function");
		box.display();
		
		//Displaying Volume of Box - Assuming unit as meter(m)
		box.displayVolume();
	}
}
