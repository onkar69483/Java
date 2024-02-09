
interface Switchable{
	void turnOn();
	void turnOff();
}

class Fan implements Switchable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan is on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Fan is off");
	}
	
}

class Tv implements Switchable{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Tv is on");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Tv is off");
	}
	
}


public class InterfaceExample {
	public static void main(String[] args) {
		Fan fan = new Fan();
		fan.turnOn();
		
		Switchable fan1 = new Fan();
		fan1.turnOn();
		Switchable tv1 = new Tv();
		tv1.turnOn();
		
		fan1.turnOff();
		tv1.turnOff();
	}
}
