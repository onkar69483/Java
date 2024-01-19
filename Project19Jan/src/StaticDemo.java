class StaticDemon {
	static int count = 0;
	int a = 10;
	static int returnCount() {
		return count;
	}
	public StaticDemon(int a) {
		this.a = a;
		count++;
	}
}


public class StaticDemo {
	
	public static void main(String[] args) {
		StaticDemon s1 = new StaticDemon(10);
		System.out.println("New Object Created: "+StaticDemon.count);
		StaticDemon s2 = new StaticDemon(10);
		System.out.println("New Object Created: "+StaticDemon.count);
		StaticDemon s3= new StaticDemon(10);
		System.out.println("New Object Created: "+StaticDemon.count);
		StaticDemon s4 = new StaticDemon(10);
		System.out.println("New Object Created: "+StaticDemon.count);
	}
}
