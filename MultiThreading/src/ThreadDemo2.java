//
//public class ThreadDemo2 {
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("Starting main thread");
//		Thread1 t1= new Thread1();
//		t1.start();
//		
//		Thread2 t2 = new Thread2();
//		t2.start();
//		
//		t1.join();
//		t2.join();
//		
//		System.out.println("Status of t1: "+ t1.isAlive());
//		System.out.println("Status of t2: "+ t2.isAlive());
//		System.out.println("Exiting main thread");
//	}
//}
//
//class Thread1 extends Thread{
//	@Override
//	public void run() {
//		try {
//			for(int i=0; i<10; i++) {
//				System.out.println("Thread 1: "+i);
//				Thread.sleep(500);
//			}
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//	}
//}
//
//class Thread2 extends Thread{
//	@Override
//	public void run() {
//		try {
//			for(int i=0; i<10; i++) {
//				System.out.println("Thread 2: "+i);
//				Thread.sleep(500);
//			}
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//	}
//}
