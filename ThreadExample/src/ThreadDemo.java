
public class ThreadDemo extends Thread{
	public void run() {
	 try {
		 System.out.println("Thread ID - "+Thread.currentThread().getId());
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("Exception is caught!");
	}
	}
}
