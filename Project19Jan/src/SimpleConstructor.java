
public class SimpleConstructor {
	int a=10;
	public SimpleConstructor() {
		System.out.println("Default Constructor Called");
	}
	public SimpleConstructor(int a) {
		this.a = a;
	}
	public static void main(String[] args) {
	 SimpleConstructor simpleConstructor = new SimpleConstructor(5);
	 System.out.println(simpleConstructor.a);
	}
}
