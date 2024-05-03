//
//public class ThreadDemo1{
//	public static void main(String[] args) throws Exception{
//		System.out.println("Thread-ID: "+Thread.currentThread().getId());
//		int n=5; //number of threads
//		for(int i=0; i<n; i++) {
//			Thread1 obj = new Thread1();
//			obj.start();
//		}
//		System.out.println("Thread-ID: "+Thread.currentThread().getId());
//	}
//}
//
//
//class Thread1 extends Thread{
//	public void run() {
//		try {
//			System.out.println("Thread-ID: "+Thread.currentThread().getId());
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//	}
//}