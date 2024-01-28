
class Cars{
	String name;
	String color;
	
//	Parameterized constructor
	public Cars(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
//	Copy Constructor
	public Cars(Cars obj) {
		this.name = obj.name;
		this.color = obj.color;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}
	
}

public class java_10 {
	public static void main(String[] args) {
		Cars Cars1 = new Cars("Innova", "Blue");
		Cars Cars2 = new Cars("Swift", "Red");
		
		System.out.println("Cars 1 Details: ");
		System.out.println("Name: "+Cars1.name);
		System.out.println("Color: "+Cars1.color);
		
		System.out.println("\nCars 2 Details: ");
		System.out.println("Name: "+Cars2.name);
		System.out.println("Color: "+Cars2.color);
		
//		Creating Cars3 with Cars1
		Cars Cars3 = new Cars(Cars1);
		System.out.println("\nCars 3 Details: ");
		System.out.println("Name: "+Cars3.name);
		System.out.println("Color: "+Cars3.color);
	}
}
