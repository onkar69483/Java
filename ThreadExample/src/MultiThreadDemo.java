
public class MultiThreadDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Main Thread ID - "+Thread.currentThread().getId());
		int n=5;
		for(int i=0; i<n; i++) {
			ThreadDemo obj = new ThreadDemo();
			obj.start();
			Thread.sleep(1000);
		}
		System.out.println("Main Thread ID - "+Thread.currentThread());
	}
}
