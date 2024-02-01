
class Vehicle{
	private String vehicle_type; //Car, truck, two wheeler etc
	private String vehicle_number;
	private String vehicle_brand;
	private int top_speed;
	private float speed;
	
	public Vehicle() {
		super();
		this.vehicle_type = "Car";
		this.vehicle_number = "1234";
		this.vehicle_brand = "Tesla";
		this.top_speed = 350;
	}

	public Vehicle(String vehicle_type, String vehicle_number, String vehicle_brand, int top_speed) {
		super();
		this.vehicle_type = vehicle_type;
		this.vehicle_number = vehicle_number;
		this.vehicle_brand = vehicle_brand;
		this.top_speed = top_speed;
	}

	public String getVehicle_type() {
		return vehicle_type;
	}

	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getVehicle_brand() {
		return vehicle_brand;
	}

	public void setVehicle_brand(String vehicle_brand) {
		this.vehicle_brand = vehicle_brand;
	}

	public int get_top_speed() {
		return top_speed;
	}

	public void set_top_speed(int top_speed) {
		this.top_speed = top_speed;
	}
	
//	Method for vehicle acceleration
	public void accelerate(float acceleration) {
		if(this.speed+acceleration<this.top_speed) {
			System.out.print("\nAcceleration Speed..... "+this.speed+" kmph");
			this.speed += acceleration;
			System.out.println(" --> "+this.speed+" kmph");
		}
		else {
			System.out.println("\n<ON TOP SPEED: "+this.top_speed+" kmph>");
		}
	}
	
// 	Method for vehicle deceleration
	public void decelerate(float deceleration) {
		System.out.print("\nDecelerating Speed..... "+this.speed+" kmph");
		this.speed -= deceleration;
		System.out.println(" --> "+this.speed+" kmph");
	}
	public void display_info() {
		System.out.println("\nVehicle Type: "+this.vehicle_type);
		System.out.println("Vehicle Brand: "+this.vehicle_brand);
		System.out.println("Vehicle Number: "+this.vehicle_number);
		System.out.println("Vehicle top_speed: "+this.top_speed);
	}
}

	

public class java_12 {
		public static void main(String[] args) {
			Vehicle default_vehicle = new Vehicle();
			Vehicle vehicle1 = new Vehicle("Car", "MH12-AB-XXXX", "TATA", 200);
			
//			Getting vehicles information
			System.out.println("Default Vehicle");
			default_vehicle.display_info();
			
			System.out.println("\nVehicle 1");
			vehicle1.display_info();
			
			vehicle1.accelerate(52);
			default_vehicle.accelerate(120);
			default_vehicle.decelerate(87);
			vehicle1.accelerate(180);
			
	}
}
