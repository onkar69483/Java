
class Car{
	String color;
	int charges;
	
	public Car() {
		this.color = "White";
		this.charges = 0;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if(this.charges < 500) {
			System.out.println("Pay Coloring Charges First!");
		}
		else {
			this.color = color;
		}
	}

	public void setCharges(int charges) {
		this.charges = charges;
	}
}

public class java_9 {
	public static void main(String[] args) {
		//	By Default car color will be black, need to pay extra charges Rs500 for different color
		Car endeavor = new Car();
		System.out.println("Car Color: "+endeavor.getColor());
		endeavor.setColor("Blue");
		
		endeavor.setCharges(500);
		
		endeavor.setColor("Blue");
		System.out.println("Car Color: "+endeavor.getColor());
	}
}


