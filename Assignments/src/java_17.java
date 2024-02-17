
class Count{
	static int count;
	public Count() {
		count++;
	}
	public static int getCount() { //Static Block
		return count;
	}
}

public class java_17 {
	public static void main(String[] args) {
		Count obj1 = new Count();
		Count obj2 = new Count();
		System.out.println(Count.getCount());	
	}
}