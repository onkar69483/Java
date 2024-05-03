import java.util.Iterator;

public class TaskThreadDemo {
	public static void main(String[] args) {
		//Create tasks
		Runnable printA =  new PrintChar('a', 100);
		Runnable printB =  new PrintChar('b', 100);
		Runnable print100 =  new PrintNum(50);
		
		//Create threads
		Thread  thread1 = new Thread(printA);
		Thread  thread2 = new Thread(printB);
		Thread  thread3 = new Thread(print100);
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println(thread3.getPriority());
		//Start threads
		try {
			thread1.start();
			thread2.start();
			thread3.start();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}

class PrintChar implements Runnable{
	private char charToPrint;
	private int times;
	
	public PrintChar(char c, int t) {
		charToPrint = c;
		times = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<times; i++) {
			System.out.println(charToPrint);
		}
	}
}


class PrintNum implements Runnable{
	private int lastNum;
	
	public PrintNum(int n) {
		lastNum = n;
	}

	@Override
	public void run() {
		Thread thread4 = new Thread(new PrintChar('c',40));
		thread4.start();
		// TODO Auto-generated method stub
		try {
			for(int i=0; i<=lastNum; i++) {
				System.out.println(" "+i);
				if (i==50) thread4.join();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}